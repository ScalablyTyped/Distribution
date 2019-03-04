package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig[OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig1[OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  def find(): meteorLib.MongoNs.Cursor[OutLevel]
}

object PublishCompositeConfig {
  @scala.inline
  def apply[OutLevel](
    find: js.Function0[meteorLib.MongoNs.Cursor[OutLevel]],
    children: js.Array[PublishCompositeConfig1[OutLevel, _]] = null,
    collectionName: java.lang.String = null
  ): PublishCompositeConfig[OutLevel] = {
    val __obj = js.Dynamic.literal(find = find)
    if (children != null) __obj.updateDynamic("children")(children)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    __obj.asInstanceOf[PublishCompositeConfig[OutLevel]]
  }
}

