package typings
package atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@postlight/mercury-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fetchResource(url: java.lang.String): js.Promise[java.lang.String] = js.native
  def parse(url: java.lang.String): js.Promise[ParseResult] = js.native
  def parse(url: java.lang.String, options: ParseOptions): js.Promise[ParseResult] = js.native
}

