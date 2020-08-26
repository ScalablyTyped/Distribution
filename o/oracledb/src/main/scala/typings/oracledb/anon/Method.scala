package typings.oracledb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  /**
    * Method used to compute version values for objects when they are inserted into a collection or replaced.
    *
    * @default SHA256
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Name of the column that stores the document version.
    *
    * @default VERSION
    */
  var name: js.UndefOr[String] = js.native
}

object Method {
  @scala.inline
  def apply(): Method = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Method]
  }
  @scala.inline
  implicit class MethodOps[Self <: Method] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

