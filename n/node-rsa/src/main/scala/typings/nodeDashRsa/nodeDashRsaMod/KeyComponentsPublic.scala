package typings.nodeDashRsa.nodeDashRsaMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyComponentsPublic extends _Key {
  var e: Buffer | Double
  var n: Buffer
}

object KeyComponentsPublic {
  @scala.inline
  def apply(e: Buffer | Double, n: Buffer): KeyComponentsPublic = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyComponentsPublic]
  }
}

