package typings.oauthDotJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OAuth.percentEncode")
@js.native
object percentEncode extends js.Object {
  /**
    * Encode text value according to OAuth Percent Encoding.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target text value.
    */
  def apply(s: String): String = js.native
  /**
    * Encode text values according to OAuth Percent Encoding.
    * Encoded values are joined with an ampersand character (&) in between them.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.6}
    * @param s Target text values.
    */
  def apply(s: js.Array[String]): String = js.native
}

