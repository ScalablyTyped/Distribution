package typings.n3.n3Mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParserConstructor
  extends Instantiable0[N3Parser[BaseQuad]]
     with Instantiable1[/* options */ ParserOptions, N3Parser[BaseQuad]] {
  def apply[Q /* <: BaseQuad */](): N3Parser[Q] = js.native
  def apply[Q /* <: BaseQuad */](options: ParserOptions): N3Parser[Q] = js.native
}

