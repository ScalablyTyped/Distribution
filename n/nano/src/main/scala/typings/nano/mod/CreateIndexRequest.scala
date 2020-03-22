package typings.nano.mod

import typings.nano.AnonFields
import typings.nano.nanoStrings.json
import typings.nano.nanoStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#db-index
trait CreateIndexRequest extends js.Object {
  // Name of the design document in which the index will be created.
  var ddoc: js.UndefOr[String] = js.undefined
  // JSON object describing the index to create
  var index: AnonFields
  // Name of the index. If no name is provided, a name will be generated automatically.
  var name: js.UndefOr[String] = js.undefined
  // This field sets whether the created index will be a partitioned or global index.
  var partitioned: js.UndefOr[Boolean] = js.undefined
  // Can be "json" or "text". Defaults to json.
  var `type`: js.UndefOr[json | text] = js.undefined
}

object CreateIndexRequest {
  @scala.inline
  def apply(
    index: AnonFields,
    ddoc: String = null,
    name: String = null,
    partitioned: js.UndefOr[Boolean] = js.undefined,
    `type`: json | text = null
  ): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (ddoc != null) __obj.updateDynamic("ddoc")(ddoc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
}

