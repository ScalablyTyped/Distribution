package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes how the collection was changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393665(v=vs.100).aspx}
  */
@js.native
trait NotifyCollectionChangedEventArgs extends EventArgs {
  //#endregion
  //#region Properties
  /**
    * Gets an array of changes that were performed on the collection since the last event.
    * @return An array of CollectionChange objects that were performed on the collection since the last event.
    */
  def get_changes(): js.Array[CollectionChange] = js.native
}

object NotifyCollectionChangedEventArgs {
  @scala.inline
  def apply(Empty: EventArgs, get_changes: () => js.Array[CollectionChange]): NotifyCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_changes = js.Any.fromFunction0(get_changes))
    __obj.asInstanceOf[NotifyCollectionChangedEventArgs]
  }
  @scala.inline
  implicit class NotifyCollectionChangedEventArgsOps[Self <: NotifyCollectionChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet_changes(value: () => js.Array[CollectionChange]): Self = this.set("get_changes", js.Any.fromFunction0(value))
  }
  
}

