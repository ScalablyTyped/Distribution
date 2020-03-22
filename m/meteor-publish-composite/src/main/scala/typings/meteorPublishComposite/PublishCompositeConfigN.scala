package typings.meteorPublishComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfigN extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(args: js.Any*): Cursor[_]
}

object PublishCompositeConfigN {
  @scala.inline
  def apply(
    find: /* repeated */ js.Any => Cursor[_],
    children: js.Array[PublishCompositeConfigN] = null,
    collectionName: String = null
  ): PublishCompositeConfigN = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfigN]
  }
}

