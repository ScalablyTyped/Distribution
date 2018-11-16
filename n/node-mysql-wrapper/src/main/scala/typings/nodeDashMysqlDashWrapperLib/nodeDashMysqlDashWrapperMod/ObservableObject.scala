package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "ObservableObject")
@js.native
class ObservableObject () extends js.Object {
  def this(obj: js.Any) = this()
  var propertyChangedListeners: js.Array[nodeDashMysqlDashWrapperLib.PropertyChangedCallback] = js.native
  /**Remove property changed listeners  */
  def _forget(): scala.Unit = js.native
  /** Make the obj observable. Used in constructor or extend this class and use it. */
  /* private */ def makeObservable(obj: js.Any): scala.Unit = js.native
  /** If developer wants manualy notify for property changed */
  def notifyPropertyChanged(propertyName: java.lang.String, oldValue: js.Any): scala.Unit = js.native
  /**Add a listener/observer to watch for changes in this object's properties */
  def onPropertyChanged(listener: nodeDashMysqlDashWrapperLib.PropertyChangedCallback): scala.Unit = js.native
  def toJSON(excludeProperties: java.lang.String*): js.Any = js.native
}

@JSImport("node-mysql-wrapper", "ObservableObject")
@js.native
object ObservableObject extends js.Object {
  /** Property names that your row couldn't have:
       * "propertyChangedListeners", "notifyPropertyChanged", "onPropertyChanged", "toJSON", "makeObservable", "_forget"
       */
  var RESERVED_PROPERTY_NAMES: js.Array[java.lang.String] = js.native
}

