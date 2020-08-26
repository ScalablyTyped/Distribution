package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILinksList extends js.Object {
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  var links: js.Array[ILink] = js.native
}

object ILinksList {
  @scala.inline
  def apply(links: js.Array[ILink]): ILinksList = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinksList]
  }
  @scala.inline
  implicit class ILinksListOps[Self <: ILinksList] (val x: Self) extends AnyVal {
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
    def setLinksVarargs(value: ILink*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[ILink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
  }
  
}

