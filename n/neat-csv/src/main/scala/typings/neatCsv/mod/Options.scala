package typings.neatCsv.mod

import typings.neatCsv.anon.Header
import typings.neatCsv.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A configuration object to be passed to csv-parser. */
@js.native
trait Options extends js.Object {
  var escape: js.UndefOr[String] = js.native
  var headers: js.UndefOr[js.Array[String] | Boolean] = js.native
  var mapHeaders: js.UndefOr[js.Function1[/* args */ Header, String | Null]] = js.native
  var mapValues: js.UndefOr[js.Function1[/* args */ Index, _]] = js.native
  var maxRowBytes: js.UndefOr[Double] = js.native
  var newline: js.UndefOr[String] = js.native
  var quote: js.UndefOr[String] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
  var skipLines: js.UndefOr[Double] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String] | Boolean): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMapHeaders(value: /* args */ Header => String | Null): Self = this.set("mapHeaders", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapHeaders: Self = this.set("mapHeaders", js.undefined)
    @scala.inline
    def setMapValues(value: /* args */ Index => _): Self = this.set("mapValues", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapValues: Self = this.set("mapValues", js.undefined)
    @scala.inline
    def setMaxRowBytes(value: Double): Self = this.set("maxRowBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRowBytes: Self = this.set("maxRowBytes", js.undefined)
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setSkipLines(value: Double): Self = this.set("skipLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipLines: Self = this.set("skipLines", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

