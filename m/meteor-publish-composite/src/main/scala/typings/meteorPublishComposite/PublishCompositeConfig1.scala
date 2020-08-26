package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfig1[InLevel1, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(arg1: InLevel1): Cursor[OutLevel] = js.native
}

object PublishCompositeConfig1 {
  @scala.inline
  def apply[InLevel1, OutLevel](find: InLevel1 => Cursor[OutLevel]): PublishCompositeConfig1[InLevel1, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PublishCompositeConfig1[InLevel1, OutLevel]]
  }
  @scala.inline
  implicit class PublishCompositeConfig1Ops[Self <: PublishCompositeConfig1[_, _], InLevel1, OutLevel] (val x: Self with (PublishCompositeConfig1[InLevel1, OutLevel])) extends AnyVal {
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
    def setFind(value: InLevel1 => Cursor[OutLevel]): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig2[InLevel1, OutLevel, js.Any])*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionName: Self = this.set("collectionName", js.undefined)
  }
  
}

