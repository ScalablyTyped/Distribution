package typings.oembedDashParser.oembedDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oembed-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def extract(url: String): js.Promise[OembedData] = js.native
  def hasProvider(url: String): Boolean = js.native
}

