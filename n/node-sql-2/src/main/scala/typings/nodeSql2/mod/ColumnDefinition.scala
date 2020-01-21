package typings.nodeSql2.mod

import typings.nodeSql2.AnonCascade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition[Name /* <: String */, Type] extends Named[Name] {
  var dataType: String
  var defaultValue: js.UndefOr[Type] = js.undefined
  var jsType: js.UndefOr[Type] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var references: js.UndefOr[AnonCascade] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply[Name /* <: String */, Type](
    dataType: String,
    defaultValue: Type = null,
    jsType: Type = null,
    name: Name = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    references: AnonCascade = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): ColumnDefinition[Name, Type] = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (jsType != null) __obj.updateDynamic("jsType")(jsType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition[Name, Type]]
  }
}

