package typings.node.urlMod

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlWithParsedQuery extends Url {
  @JSName("query")
  var query_UrlWithParsedQuery: ParsedUrlQuery = js.native
}

object UrlWithParsedQuery {
  @scala.inline
  def apply(href: String, query: ParsedUrlQuery): UrlWithParsedQuery = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlWithParsedQuery]
  }
  @scala.inline
  implicit class UrlWithParsedQueryOps[Self <: UrlWithParsedQuery] (val x: Self) extends AnyVal {
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
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

