package typings.octokitGraphql

import typings.octokitGraphql.typesMod.GraphQlQueryResponseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@octokit/graphql.@octokit/graphql/dist-types/types.GraphQlQueryResponse> */
trait RequiredGraphQlQueryRespo extends js.Object {
  var data: GraphQlQueryResponseData
  var errors: js.Array[AnonExtensions]
}

object RequiredGraphQlQueryRespo {
  @scala.inline
  def apply(errors: js.Array[AnonExtensions], data: GraphQlQueryResponseData = null): RequiredGraphQlQueryRespo = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredGraphQlQueryRespo]
  }
}

