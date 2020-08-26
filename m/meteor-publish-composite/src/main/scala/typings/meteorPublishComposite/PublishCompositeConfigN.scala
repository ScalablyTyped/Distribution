package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishCompositeConfigN extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.native
  var collectionName: js.UndefOr[String] = js.native
  def find(args: js.Any*): Cursor[_] = js.native
}

object PublishCompositeConfigN {
  @scala.inline
  def apply(find: /* repeated */ js.Any => Cursor[_]): PublishCompositeConfigN = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[PublishCompositeConfigN]
  }
  @scala.inline
  implicit class PublishCompositeConfigNOps[Self <: PublishCompositeConfigN] (val x: Self) extends AnyVal {
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
    def setFind(value: /* repeated */ js.Any => Cursor[_]): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setChildrenVarargs(value: PublishCompositeConfigN*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfigN]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCollectionName(value: String): Self = this.set("collectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionName: Self = this.set("collectionName", js.undefined)
  }
  
}

