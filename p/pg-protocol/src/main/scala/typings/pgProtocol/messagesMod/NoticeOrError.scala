package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeOrError extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var column: js.UndefOr[String] = js.undefined
  var constraint: js.UndefOr[String] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var detail: js.UndefOr[String] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var hint: js.UndefOr[String] = js.undefined
  var internalPosition: js.UndefOr[String] = js.undefined
  var internalQuery: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var routine: js.UndefOr[String] = js.undefined
  var schema: js.UndefOr[String] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[String] = js.undefined
  var where: js.UndefOr[String] = js.undefined
}

object NoticeOrError {
  @scala.inline
  def apply(
    code: String = null,
    column: String = null,
    constraint: String = null,
    dataType: String = null,
    detail: String = null,
    file: String = null,
    hint: String = null,
    internalPosition: String = null,
    internalQuery: String = null,
    line: String = null,
    message: String = null,
    position: String = null,
    routine: String = null,
    schema: String = null,
    severity: String = null,
    table: String = null,
    where: String = null
  ): NoticeOrError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (internalPosition != null) __obj.updateDynamic("internalPosition")(internalPosition.asInstanceOf[js.Any])
    if (internalQuery != null) __obj.updateDynamic("internalQuery")(internalQuery.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (routine != null) __obj.updateDynamic("routine")(routine.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeOrError]
  }
}

