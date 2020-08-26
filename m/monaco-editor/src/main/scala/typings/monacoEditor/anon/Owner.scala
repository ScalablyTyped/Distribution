package typings.monacoEditor.anon

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Owner extends js.Object {
  var owner: js.UndefOr[String] = js.native
  var resource: js.UndefOr[Uri] = js.native
  var take: js.UndefOr[Double] = js.native
}

object Owner {
  @scala.inline
  def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  @scala.inline
  implicit class OwnerOps[Self <: Owner] (val x: Self) extends AnyVal {
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setResource(value: Uri): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setTake(value: Double): Self = this.set("take", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
  }
  
}

