package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(arg4: InLevel4, arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel]
}

object PublishCompositeConfig4 {
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](
    find: (InLevel4, InLevel3, InLevel2, InLevel1) => Cursor[OutLevel],
    children: js.Array[PublishCompositeConfigN] = null,
    collectionName: String = null
  ): PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction4(find))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
  }
}

