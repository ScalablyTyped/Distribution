package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a base class for classes that are used by event sources to pass event argument information.
  * The EventArgs class is a base class and not intended to be used directly. Override this constructor to provide specific functionality.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383795(v=vs.100).aspx}
  */
@js.native
trait EventArgs extends js.Object {
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  var Empty: EventArgs = js.native
}

object EventArgs {
  @scala.inline
  def apply(Empty: EventArgs): EventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
  @scala.inline
  implicit class EventArgsOps[Self <: EventArgs] (val x: Self) extends AnyVal {
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
    def setEmpty(value: EventArgs): Self = this.set("Empty", value.asInstanceOf[js.Any])
  }
  
}

