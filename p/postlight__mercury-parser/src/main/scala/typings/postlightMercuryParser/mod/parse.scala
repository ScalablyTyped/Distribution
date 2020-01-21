package typings.postlightMercuryParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@postlight/mercury-parser", "parse")
@js.native
object parse extends js.Object {
  def apply(url: String): js.Promise[ParseResult] = js.native
  def apply(url: String, options: ParseOptions): js.Promise[ParseResult] = js.native
}

