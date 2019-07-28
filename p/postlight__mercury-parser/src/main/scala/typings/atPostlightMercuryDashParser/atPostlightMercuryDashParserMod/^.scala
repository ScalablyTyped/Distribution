package typings.atPostlightMercuryDashParser.atPostlightMercuryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@postlight/mercury-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fetchResource(url: String): js.Promise[String] = js.native
  def parse(url: String): js.Promise[ParseResult] = js.native
  def parse(url: String, options: ParseOptions): js.Promise[ParseResult] = js.native
}

