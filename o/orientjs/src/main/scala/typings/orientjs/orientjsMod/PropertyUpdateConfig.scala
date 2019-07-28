package typings.orientjs.orientjsMod

import typings.orientjs.Anon_Fields
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyUpdateConfig extends js.Object {
  var collate: js.UndefOr[String] = js.undefined
  var custom: js.UndefOr[Anon_Fields] = js.undefined
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
    custom: Anon_Fields = null,
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
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (collate != null) __obj.updateDynamic("collate")(collate)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (default != null) __obj.updateDynamic("default")(default)
    if (linkedClass != null) __obj.updateDynamic("linkedClass")(linkedClass)
    if (linkedType != null) __obj.updateDynamic("linkedType")(linkedType)
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyUpdateConfig]
  }
}

