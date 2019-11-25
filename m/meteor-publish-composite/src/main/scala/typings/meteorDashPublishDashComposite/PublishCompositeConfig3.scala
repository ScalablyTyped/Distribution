package typings.meteorDashPublishDashComposite

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[String] = js.undefined
  def find(arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel]
}

object PublishCompositeConfig3 {
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, OutLevel](
    find: (InLevel3, InLevel2, InLevel1) => Cursor[OutLevel],
    children: js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]] = null,
    collectionName: String = null
  ): PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction3(find))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel]]
  }
}

