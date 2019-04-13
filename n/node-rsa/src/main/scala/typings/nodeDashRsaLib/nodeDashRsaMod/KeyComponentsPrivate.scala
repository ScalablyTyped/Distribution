package typings
package nodeDashRsaLib.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyComponentsPrivate extends _Key {
  var coeff: nodeLib.Buffer
  var d: nodeLib.Buffer
  var dmp1: nodeLib.Buffer
  var dmq1: nodeLib.Buffer
  var e: nodeLib.Buffer | scala.Double
  var n: nodeLib.Buffer
  var p: nodeLib.Buffer
  var q: nodeLib.Buffer
}

object KeyComponentsPrivate {
  @scala.inline
  def apply(
    coeff: nodeLib.Buffer,
    d: nodeLib.Buffer,
    dmp1: nodeLib.Buffer,
    dmq1: nodeLib.Buffer,
    e: nodeLib.Buffer | scala.Double,
    n: nodeLib.Buffer,
    p: nodeLib.Buffer,
    q: nodeLib.Buffer
  ): KeyComponentsPrivate = {
    val __obj = js.Dynamic.literal(coeff = coeff, d = d, dmp1 = dmp1, dmq1 = dmq1, e = e.asInstanceOf[js.Any], n = n, p = p, q = q)
  
    __obj.asInstanceOf[KeyComponentsPrivate]
  }
}

