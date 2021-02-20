package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "ObservableObject")
@js.native
class ObservableObject () extends StObject {
  def this(obj: js.Any) = this()
  
  /**Remove property changed listeners  */
  def _forget(): Unit = js.native
  
  /** Make the obj observable. Used in constructor or extend this class and use it. */
  /* private */ def makeObservable(obj: js.Any): Unit = js.native
  
  /** If developer wants manualy notify for property changed */
  def notifyPropertyChanged(propertyName: String, oldValue: js.Any): Unit = js.native
  
  /**Add a listener/observer to watch for changes in this object's properties */
  def onPropertyChanged(listener: PropertyChangedCallback): Unit = js.native
  
  var propertyChangedListeners: js.Array[PropertyChangedCallback] = js.native
  
  def toJSON(excludeProperties: String*): js.Any = js.native
}
object ObservableObject {
  
  @JSImport("node-mysql-wrapper", "ObservableObject")
  @js.native
  val ^ : js.Any = js.native
  
  /** Property names that your row couldn't have:
    * "propertyChangedListeners", "notifyPropertyChanged", "onPropertyChanged", "toJSON", "makeObservable", "_forget"
    */
  /* static member */
  @JSImport("node-mysql-wrapper", "ObservableObject.RESERVED_PROPERTY_NAMES")
  @js.native
  def RESERVED_PROPERTY_NAMES: js.Array[String] = js.native
  @scala.inline
  def RESERVED_PROPERTY_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED_PROPERTY_NAMES")(x.asInstanceOf[js.Any])
}
