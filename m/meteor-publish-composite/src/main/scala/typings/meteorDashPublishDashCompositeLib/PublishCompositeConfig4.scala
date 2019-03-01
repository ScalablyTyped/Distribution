package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  def find(arg4: InLevel4, arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): meteorLib.MongoNs.Cursor[OutLevel]
}

object PublishCompositeConfig4 {
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel](
    find: js.Function4[InLevel4, InLevel3, InLevel2, InLevel1, meteorLib.MongoNs.Cursor[OutLevel]],
    children: js.Array[PublishCompositeConfigN] = null,
    collectionName: java.lang.String = null
  ): PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(find)
    if (children != null) __obj.updateDynamic("children")(children)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    __obj.asInstanceOf[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, InLevel4, OutLevel]]
  }
}

