package typings.needle.mod.core

import typings.needle.needleStrings.json
import typings.needle.needleStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseOptions extends js.Object {
  /**
    * Alias for decode_response
    */
  var decode: js.UndefOr[Boolean] = js.native
  /**
    * Whether to decode the text responses to UTF-8,
    * if Content-Type header shows a different charset. Defaults to true.
    */
  var decode_response: js.UndefOr[Boolean] = js.native
  /**
    * Dump response output to file.
    * This occurs after parsing and charset decoding is done.
    */
  var output: js.UndefOr[String] = js.native
  /**
    * Alias for parse_response
    */
  var parse: js.UndefOr[Boolean | json | xml] = js.native
  /**
    * Whether to parse response’s Set-Cookie header.
    * Defaults to true.
    * If parsed, response cookies will be available at resp.cookies.
    */
  var parse_cookies: js.UndefOr[Boolean] = js.native
  /**
    * Whether to parse XML or JSON response bodies automagically.
    * Defaults to true.
    * You can also set this to 'xml' or 'json' in which case Needle
    * will only parse the response if the content type matches.
    */
  var parse_response: js.UndefOr[Boolean | json | xml] = js.native
}

object ResponseOptions {
  @scala.inline
  def apply(): ResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseOptions]
  }
  @scala.inline
  implicit class ResponseOptionsOps[Self <: ResponseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecode(value: Boolean): Self = this.set("decode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    @scala.inline
    def setDecode_response(value: Boolean): Self = this.set("decode_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecode_response: Self = this.set("decode_response", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setParse(value: Boolean | json | xml): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setParse_cookies(value: Boolean): Self = this.set("parse_cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse_cookies: Self = this.set("parse_cookies", js.undefined)
    @scala.inline
    def setParse_response(value: Boolean | json | xml): Self = this.set("parse_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse_response: Self = this.set("parse_response", js.undefined)
  }
  
}

