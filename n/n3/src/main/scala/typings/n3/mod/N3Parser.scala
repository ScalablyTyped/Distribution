package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3Parser[Q /* <: BaseQuad */] extends js.Object {
  def parse(input: String): js.Array[Q] = js.native
  def parse(input: String, callback: ParseCallback[Q]): Unit = js.native
}

