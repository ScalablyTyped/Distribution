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

