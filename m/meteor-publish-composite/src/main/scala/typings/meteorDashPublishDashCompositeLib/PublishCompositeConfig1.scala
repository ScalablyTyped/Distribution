package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig1[InLevel1, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  def find(arg1: InLevel1): meteorLib.MongoNs.Cursor[OutLevel]
}

object PublishCompositeConfig1 {
  @scala.inline
  def apply[InLevel1, OutLevel](
    find: js.Function1[InLevel1, meteorLib.MongoNs.Cursor[OutLevel]],
    children: js.Array[PublishCompositeConfig2[InLevel1, OutLevel, _]] = null,
    collectionName: java.lang.String = null
  ): PublishCompositeConfig1[InLevel1, OutLevel] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(find)
    if (children != null) __obj.updateDynamic("children")(children)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    __obj.asInstanceOf[PublishCompositeConfig1[InLevel1, OutLevel]]
  }
}

