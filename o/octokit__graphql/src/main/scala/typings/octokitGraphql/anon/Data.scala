package typings.octokitGraphql.anon

import typings.octokitGraphql.typesMod.GraphQlQueryResponse
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[ResponseData] extends js.Object {
  var data: Required[GraphQlQueryResponse[ResponseData]]
}

object Data {
  @scala.inline
  def apply[ResponseData](data: Required[GraphQlQueryResponse[ResponseData]]): Data[ResponseData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[ResponseData]]
  }
}

