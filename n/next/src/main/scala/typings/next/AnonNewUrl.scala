package typings.next

import typings.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewUrl extends js.Object {
  var newUrl: String
  var parsedDestination: UrlWithParsedQuery
}

object AnonNewUrl {
  @scala.inline
  def apply(newUrl: String, parsedDestination: UrlWithParsedQuery): AnonNewUrl = {
    val __obj = js.Dynamic.literal(newUrl = newUrl.asInstanceOf[js.Any], parsedDestination = parsedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewUrl]
  }
}

