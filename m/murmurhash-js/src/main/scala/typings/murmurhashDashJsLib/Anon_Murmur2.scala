package typings
package murmurhashDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Murmur2 extends js.Object {
  @JSName("murmur2")
  var murmur2_Original: js.Function2[/* str */ java.lang.String, /* seed */ js.UndefOr[scala.Double], scala.Double] = js.native
  @JSName("murmur3")
  var murmur3_Original: js.Function2[/* str */ java.lang.String, /* seed */ js.UndefOr[scala.Double], scala.Double] = js.native
  def murmur2(str: java.lang.String): scala.Double = js.native
  def murmur2(str: java.lang.String, seed: scala.Double): scala.Double = js.native
  def murmur3(str: java.lang.String): scala.Double = js.native
  def murmur3(str: java.lang.String, seed: scala.Double): scala.Double = js.native
}

