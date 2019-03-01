package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyUpdateConfig extends js.Object {
  var collate: js.UndefOr[java.lang.String] = js.undefined
  var custom: js.UndefOr[orientjsLib.Anon_Fields] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var linkedClass: js.UndefOr[java.lang.String] = js.undefined
  var linkedType: js.UndefOr[java.lang.String] = js.undefined
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var regexp: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
  var `type`: PropertyType
}

object PropertyUpdateConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: PropertyType,
    collate: java.lang.String = null,
    custom: orientjsLib.Anon_Fields = null,
    default: js.Any = null,
    linkedClass: java.lang.String = null,
    linkedType: java.lang.String = null,
    mandatory: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    regexp: stdLib.RegExp | java.lang.String = null
  ): PropertyUpdateConfig = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
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

