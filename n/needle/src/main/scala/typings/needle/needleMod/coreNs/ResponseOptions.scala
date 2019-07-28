package typings.needle.needleMod.coreNs

import typings.needle.needleStrings.json
import typings.needle.needleStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseOptions extends js.Object {
  /**
    * Alias for decode_response
    */
  var decode: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to decode the text responses to UTF-8,
    * if Content-Type header shows a different charset. Defaults to true.
    */
  var decode_response: js.UndefOr[Boolean] = js.undefined
  /**
    * Dump response output to file.
    * This occurs after parsing and charset decoding is done.
    */
  var output: js.UndefOr[String] = js.undefined
  /**
    * Alias for parse_response
    */
  var parse: js.UndefOr[Boolean | json | xml] = js.undefined
  /**
    * Whether to parse response’s Set-Cookie header.
    * Defaults to true.
    * If parsed, response cookies will be available at resp.cookies.
    */
  var parse_cookies: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to parse XML or JSON response bodies automagically.
    * Defaults to true.
    * You can also set this to 'xml' or 'json' in which case Needle
    * will only parse the response if the content type matches.
    */
  var parse_response: js.UndefOr[Boolean | json | xml] = js.undefined
}

object ResponseOptions {
  @scala.inline
  def apply(
    decode: js.UndefOr[Boolean] = js.undefined,
    decode_response: js.UndefOr[Boolean] = js.undefined,
    output: String = null,
    parse: Boolean | json | xml = null,
    parse_cookies: js.UndefOr[Boolean] = js.undefined,
    parse_response: Boolean | json | xml = null
  ): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decode)) __obj.updateDynamic("decode")(decode)
    if (!js.isUndefined(decode_response)) __obj.updateDynamic("decode_response")(decode_response)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (!js.isUndefined(parse_cookies)) __obj.updateDynamic("parse_cookies")(parse_cookies)
    if (parse_response != null) __obj.updateDynamic("parse_response")(parse_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseOptions]
  }
}

