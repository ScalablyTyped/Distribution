package typings.mdurl

import typings.mdurl.mod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdurl/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  def apply(input: String): Url = js.native
  def apply(input: String, slashesDenoteHost: Boolean): Url = js.native
}

