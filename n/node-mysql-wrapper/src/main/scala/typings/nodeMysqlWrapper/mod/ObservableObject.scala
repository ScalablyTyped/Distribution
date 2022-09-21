package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "ObservableObject")
@js.native
open class ObservableObject () extends StObject {
  def this(obj: Any) = this()
  
  /**Remove property changed listeners  */
  def _forget(): Unit = js.native
  
  /** Make the obj observable. Used in constructor or extend this class and use it. */
  /* private */ def makeObservable(obj: Any): Unit = js.native
  
  /** If developer wants manualy notify for property changed */
  def notifyPropertyChanged(propertyName: String, oldValue: Any): Unit = js.native
  
  /**Add a listener/observer to watch for changes in this object's properties */
  def onPropertyChanged(listener: PropertyChangedCallback): Unit = js.native
  
  /* private */ var propertyChangedListeners: js.Array[PropertyChangedCallback] = js.native
  
  def toJSON(excludeProperties: String*): Any = js.native
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
  inline def RESERVED_PROPERTY_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESERVED_PROPERTY_NAMES")(x.asInstanceOf[js.Any])
}
