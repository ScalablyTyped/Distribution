package typings.neo4j.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CypherOptions extends js.Object {
  var commit: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var lean: js.UndefOr[js.Object] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[js.Object] = js.undefined
}

object CypherOptions {
  @scala.inline
  def apply(
    commit: js.Object = null,
    headers: js.Object = null,
    lean: js.Object = null,
    params: js.Object = null,
    query: js.Object = null
  ): CypherOptions = {
    val __obj = js.Dynamic.literal()
    if (commit != null) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (lean != null) __obj.updateDynamic("lean")(lean.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[CypherOptions]
  }
}

