package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait N3Parser[Q /* <: BaseQuad */] extends js.Object {
  def parse(input: java.lang.String, callback: ParseCallback[Q]): scala.Unit
}

