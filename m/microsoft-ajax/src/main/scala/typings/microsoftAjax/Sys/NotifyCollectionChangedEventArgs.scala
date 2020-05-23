package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes how the collection was changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393665(v=vs.100).aspx}
  */
trait NotifyCollectionChangedEventArgs extends EventArgs {
  //#endregion
  //#region Properties
  /**
    * Gets an array of changes that were performed on the collection since the last event.
    * @return An array of CollectionChange objects that were performed on the collection since the last event.
    */
  def get_changes(): js.Array[CollectionChange]
}

object NotifyCollectionChangedEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_changes: () => js.Array[CollectionChange]): NotifyCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_changes = js.Any.fromFunction0(get_changes))
    __obj.asInstanceOf[NotifyCollectionChangedEventArgs]
  }
}

