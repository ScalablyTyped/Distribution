package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamParserConstructor
  extends ScalablyTyped.runtime.Instantiable0[N3StreamParser[BaseQuad]]
     with ScalablyTyped.runtime.Instantiable1[/* options */ ParserOptions, N3StreamParser[BaseQuad]] {
  def apply[Q /* <: BaseQuad */](): N3StreamParser[Q] = js.native
  def apply[Q /* <: BaseQuad */](options: ParserOptions): N3StreamParser[Q] = js.native
}

