package typings.next.anon

import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewUrl extends js.Object {
  var newUrl: String
  var parsedDestination: UrlWithParsedQuery
}

object NewUrl {
  @scala.inline
  def apply(newUrl: String, parsedDestination: UrlWithParsedQuery): NewUrl = {
    val __obj = js.Dynamic.literal(newUrl = newUrl.asInstanceOf[js.Any], parsedDestination = parsedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewUrl]
  }
}

