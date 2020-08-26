package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfig[OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig1[OutLevel, _]]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(): Cursor[OutLevel] = js.native
}

object PublishCompositeConfig {
  @scala.inline
  def apply[OutLevel](find: () => Cursor[OutLevel]): PublishCompositeConfig[OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction0(find))
    __obj.asInstanceOf[PublishCompositeConfig[OutLevel]]
  }
  @scala.inline
  implicit class PublishCompositeConfigOps[Self <: PublishCompositeConfig[_], OutLevel] (val x: Self with PublishCompositeConfig[OutLevel]) extends AnyVal {
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
    def setFind(value: () => Cursor[OutLevel]): Self = this.set("find", js.Any.fromFunction0(value))
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig1[OutLevel, js.Any])*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig1[OutLevel, _]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionName: Self = this.set("collectionName", js.undefined)
  }
  
}

