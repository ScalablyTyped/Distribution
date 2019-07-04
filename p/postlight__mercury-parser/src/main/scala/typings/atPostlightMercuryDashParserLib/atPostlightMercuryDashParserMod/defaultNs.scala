package typings
package atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@postlight/mercury-parser", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  def fetchResource(url: java.lang.String): js.Promise[java.lang.String] = js.native
  def parse(url: java.lang.String): js.Promise[
    atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod.MercuryNs.ParseResult
  ] = js.native
  def parse(
    url: java.lang.String,
    options: atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod.MercuryNs.ParseOptions
  ): js.Promise[
    atPostlightMercuryDashParserLib.atPostlightMercuryDashParserMod.MercuryNs.ParseResult
  ] = js.native
}

