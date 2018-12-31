package typings
package needleLib.needleMod.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptions extends js.Object {
  /**
    * Alias for decode_response
    */
  var decode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to decode the text responses to UTF-8,
    * if Content-Type header shows a different charset. Defaults to true.
    */
  var decode_response: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Dump response output to file.
    * This occurs after parsing and charset decoding is done.
    */
  var output: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Alias for parse_response
    */
  var parse: js.UndefOr[scala.Boolean | needleLib.needleLibStrings.json | needleLib.needleLibStrings.xml] = js.undefined
  /**
    * Whether to parse response’s Set-Cookie header.
    * Defaults to true.
    * If parsed, response cookies will be available at resp.cookies.
    */
  var parse_cookies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to parse XML or JSON response bodies automagically.
    * Defaults to true.
    * You can also set this to 'xml' or 'json' in which case Needle
    * will only parse the response if the content type matches.
    */
  var parse_response: js.UndefOr[scala.Boolean | needleLib.needleLibStrings.json | needleLib.needleLibStrings.xml] = js.undefined
}

