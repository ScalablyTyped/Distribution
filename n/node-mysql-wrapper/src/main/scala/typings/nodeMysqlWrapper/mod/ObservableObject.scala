package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "ObservableObject")
@js.native
class ObservableObject () extends js.Object {
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
/* static members */
@JSImport("node-mysql-wrapper", "ObservableObject")
@js.native
object ObservableObject extends js.Object {
  
  /** Property names that your row couldn't have:
    * "propertyChangedListeners", "notifyPropertyChanged", "onPropertyChanged", "toJSON", "makeObservable", "_forget"
    */
  var RESERVED_PROPERTY_NAMES: js.Array[String] = js.native
}
