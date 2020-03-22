package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel]
}

object PublishCompositeConfig2 {
  @scala.inline
  def apply[InLevel1, InLevel2, OutLevel](
    find: (InLevel2, InLevel1) => Cursor[OutLevel],
    children: js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]] = null,
    collectionName: String = null
  ): PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfig2[InLevel1, InLevel2, OutLevel]]
  }
}

