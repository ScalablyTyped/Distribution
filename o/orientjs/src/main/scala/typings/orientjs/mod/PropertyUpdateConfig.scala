package typings.orientjs.mod

import typings.orientjs.AnonFields
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyUpdateConfig extends js.Object {
  var collate: js.UndefOr[String] = js.undefined
  var custom: js.UndefOr[AnonFields] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var linkedClass: js.UndefOr[String] = js.undefined
  var linkedType: js.UndefOr[String] = js.undefined
  var mandatory: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: String
  var notNull: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var regexp: js.UndefOr[RegExp | String] = js.undefined
  var `type`: PropertyType
}

object PropertyUpdateConfig {
  @scala.inline
  def apply(
    name: String,
    `type`: PropertyType,
    collate: String = null,
    custom: AnonFields = null,
    default: js.Any = null,
    linkedClass: String = null,
    linkedType: String = null,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    regexp: RegExp | String = null
  ): PropertyUpdateConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (collate != null) __obj.updateDynamic("collate")(collate.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (linkedClass != null) __obj.updateDynamic("linkedClass")(linkedClass.asInstanceOf[js.Any])
    if (linkedType != null) __obj.updateDynamic("linkedType")(linkedType.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdateConfig]
  }
}

