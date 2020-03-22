package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig1[InLevel1, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(arg1: InLevel1): Cursor[OutLevel]
}

object PublishCompositeConfig1 {
  @scala.inline
  def apply[InLevel1, OutLevel](
    find: InLevel1 => Cursor[OutLevel],
    children: js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]] = null,
    collectionName: String = null
  ): PublishCompositeConfig1[InLevel1, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfig1[InLevel1, OutLevel]]
  }
}

