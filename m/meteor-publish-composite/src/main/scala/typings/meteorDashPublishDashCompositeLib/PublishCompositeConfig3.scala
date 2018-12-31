package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  def find(arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): meteorLib.MongoNs.Cursor[OutLevel]
}

