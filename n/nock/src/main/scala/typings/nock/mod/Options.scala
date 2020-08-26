package typings.nock.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowUnmocked: js.UndefOr[Boolean] = js.native
  var badheaders: js.UndefOr[js.Array[String]] = js.native
  var encodedQueryParams: js.UndefOr[Boolean] = js.native
  var filteringScope: js.UndefOr[js.Function1[/* scope */ String, Boolean]] = js.native
  var reqheaders: js.UndefOr[Record[String, RequestHeaderMatcher]] = js.native
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
    def setAllowUnmocked(value: Boolean): Self = this.set("allowUnmocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUnmocked: Self = this.set("allowUnmocked", js.undefined)
    @scala.inline
    def setBadheadersVarargs(value: String*): Self = this.set("badheaders", js.Array(value :_*))
    @scala.inline
    def setBadheaders(value: js.Array[String]): Self = this.set("badheaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadheaders: Self = this.set("badheaders", js.undefined)
    @scala.inline
    def setEncodedQueryParams(value: Boolean): Self = this.set("encodedQueryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodedQueryParams: Self = this.set("encodedQueryParams", js.undefined)
    @scala.inline
    def setFilteringScope(value: /* scope */ String => Boolean): Self = this.set("filteringScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilteringScope: Self = this.set("filteringScope", js.undefined)
    @scala.inline
    def setReqheaders(value: Record[String, RequestHeaderMatcher]): Self = this.set("reqheaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqheaders: Self = this.set("reqheaders", js.undefined)
  }
  
}

