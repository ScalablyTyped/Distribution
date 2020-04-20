package typings.nodeRsa.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyComponentsPrivate extends _Key {
  var coeff: Buffer
  var d: Buffer
  var dmp1: Buffer
  var dmq1: Buffer
  var e: Buffer | Double
  var n: Buffer
  var p: Buffer
  var q: Buffer
}

object KeyComponentsPrivate {
  @scala.inline
  def apply(
    coeff: Buffer,
    d: Buffer,
    dmp1: Buffer,
    dmq1: Buffer,
    e: Buffer | Double,
    n: Buffer,
    p: Buffer,
    q: Buffer
  ): KeyComponentsPrivate = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dmp1 = dmp1.asInstanceOf[js.Any], dmq1 = dmq1.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyComponentsPrivate]
  }
}

