package typings.meteorDashPublishDashComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig[OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig1[OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(): Cursor[OutLevel]
}

object PublishCompositeConfig {
  @scala.inline
  def apply[OutLevel](
    find: () => Cursor[OutLevel],
    children: js.Array[PublishCompositeConfig1[OutLevel, _]] = null,
    collectionName: String = null
  ): PublishCompositeConfig[OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction0(find))
    if (children != null) __obj.updateDynamic("children")(children)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    __obj.asInstanceOf[PublishCompositeConfig[OutLevel]]
  }
}

