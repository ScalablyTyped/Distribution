package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignReturn extends js.Object {
  var data: Buffer
   // the data passed into the sign function
  var mac: Buffer
}

object SignReturn {
  @scala.inline
  def apply(data: Buffer, mac: Buffer): SignReturn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignReturn]
  }
}

