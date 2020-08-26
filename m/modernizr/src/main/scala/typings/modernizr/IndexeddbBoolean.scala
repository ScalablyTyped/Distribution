package typings.modernizr

import typings.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexeddbBoolean extends Boolean {
  var deletedatabase: scala.Boolean = js.native
}

object IndexeddbBoolean {
  @scala.inline
  def apply(deletedatabase: scala.Boolean): IndexeddbBoolean = {
    val __obj = js.Dynamic.literal(deletedatabase = deletedatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexeddbBoolean]
  }
  @scala.inline
  implicit class IndexeddbBooleanOps[Self <: IndexeddbBoolean] (val x: Self) extends AnyVal {
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
    def setDeletedatabase(value: scala.Boolean): Self = this.set("deletedatabase", value.asInstanceOf[js.Any])
  }
  
}

