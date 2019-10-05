package typings.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "parse")
@js.native
object parse extends js.Object {
  def apply(urlStr: java.lang.String): UrlWithStringQuery = js.native
  def apply(urlStr: java.lang.String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  def apply(urlStr: java.lang.String, parseQueryString: Boolean): Url = js.native
  def apply(urlStr: java.lang.String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
}

