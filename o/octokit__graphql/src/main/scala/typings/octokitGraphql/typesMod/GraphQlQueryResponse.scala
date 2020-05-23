package typings.octokitGraphql.typesMod

import typings.octokitGraphql.anon.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQlQueryResponse[ResponseData] extends js.Object {
  var data: ResponseData
  var errors: js.UndefOr[js.Array[Extensions]] = js.undefined
}

object GraphQlQueryResponse {
  @scala.inline
  def apply[ResponseData](data: ResponseData, errors: js.Array[Extensions] = null): GraphQlQueryResponse[ResponseData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQlQueryResponse[ResponseData]]
  }
}

