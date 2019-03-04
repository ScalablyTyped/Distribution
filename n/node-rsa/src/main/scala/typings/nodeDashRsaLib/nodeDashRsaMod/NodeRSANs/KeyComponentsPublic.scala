package typings
package nodeDashRsaLib.nodeDashRsaMod.NodeRSANs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyComponentsPublic extends _Key {
  var e: nodeLib.Buffer | scala.Double
  var n: nodeLib.Buffer
}

object KeyComponentsPublic {
  @scala.inline
  def apply(e: nodeLib.Buffer | scala.Double, n: nodeLib.Buffer): KeyComponentsPublic = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n)
  
    __obj.asInstanceOf[KeyComponentsPublic]
  }
}

