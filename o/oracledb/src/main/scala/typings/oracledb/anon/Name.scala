package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  /**
    * Name of the column that stores the media type of the document. A media type column is needed if
    * the collection is to be heterogeneous, that is, it can store documents other than
    * JavaScript Object Notation (JSON).
    */
  var name: js.UndefOr[String] = js.native
}

object Name {
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

