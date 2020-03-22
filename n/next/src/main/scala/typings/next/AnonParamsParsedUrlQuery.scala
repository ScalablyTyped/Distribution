package typings.next

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsParsedUrlQuery extends js.Object {
  var params: ParsedUrlQuery
}

object AnonParamsParsedUrlQuery {
  @scala.inline
  def apply(params: ParsedUrlQuery): AnonParamsParsedUrlQuery = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsParsedUrlQuery]
  }
}

