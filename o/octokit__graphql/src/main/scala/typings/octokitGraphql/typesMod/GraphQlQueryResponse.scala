package typings.octokitGraphql.typesMod

import typings.octokitGraphql.AnonExtensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQlQueryResponse extends js.Object {
  var data: GraphQlQueryResponseData
  var errors: js.UndefOr[js.Array[AnonExtensions]] = js.undefined
}

object GraphQlQueryResponse {
  @scala.inline
  def apply(data: GraphQlQueryResponseData = null, errors: js.Array[AnonExtensions] = null): GraphQlQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQlQueryResponse]
  }
}

