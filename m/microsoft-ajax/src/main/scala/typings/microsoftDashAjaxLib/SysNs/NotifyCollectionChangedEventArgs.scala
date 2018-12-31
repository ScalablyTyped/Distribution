package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes how the collection was changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393665(v=vs.100).aspx}
  */
@JSGlobal("Sys.NotifyCollectionChangedEventArgs")
@js.native
class NotifyCollectionChangedEventArgs protected () extends EventArgs {
  //#region Constructors
  /**
    * Initializes a new instance of the CancelEventArgs class.
    * @param changes
    *           A CollectionChange object that contains an array of changes that were performed on the collection since the last event.
    */
  def this(changes: CollectionChange) = this()
  //#endregion
  //#region Properties
  /**
    * Gets an array of changes that were performed on the collection since the last event.
    * @return An array of CollectionChange objects that were performed on the collection since the last event.
    */
  def get_changes(): js.Array[CollectionChange] = js.native
}

