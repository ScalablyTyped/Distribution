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

