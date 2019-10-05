package typings.node.punycodeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ucs2 extends js.Object {
  def decode(string: java.lang.String): js.Array[Double]
  def encode(codePoints: js.Array[Double]): java.lang.String
}

@JSImport("punycode", "ucs2")
@js.native
object ucs2 extends TopLevel[ucs2]

