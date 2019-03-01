package typings
package meowLib.meowMod.meowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var argv: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var autoHelp: js.UndefOr[scala.Boolean] = js.undefined
  var autoVersion: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Caution: Explicitly specifying undefined for booleanDefault
    * has different meaning from omitting key itself.
    */
  var booleanDefault: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var description: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var flags: js.UndefOr[minimistDashOptionsLib.minimistDashOptionsMod.buildNs.Options] = js.undefined
  var help: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var inferType: js.UndefOr[scala.Boolean] = js.undefined
  var pkg: js.UndefOr[js.Any] = js.undefined
  var version: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    argv: js.Array[java.lang.String] = null,
    autoHelp: js.UndefOr[scala.Boolean] = js.undefined,
    autoVersion: js.UndefOr[scala.Boolean] = js.undefined,
    booleanDefault: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String | scala.Boolean = null,
    flags: minimistDashOptionsLib.minimistDashOptionsMod.buildNs.Options = null,
    help: java.lang.String | scala.Boolean = null,
    inferType: js.UndefOr[scala.Boolean] = js.undefined,
    pkg: js.Any = null,
    version: java.lang.String | scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv)
    if (!js.isUndefined(autoHelp)) __obj.updateDynamic("autoHelp")(autoHelp)
    if (!js.isUndefined(autoVersion)) __obj.updateDynamic("autoVersion")(autoVersion)
    if (!js.isUndefined(booleanDefault)) __obj.updateDynamic("booleanDefault")(booleanDefault)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(inferType)) __obj.updateDynamic("inferType")(inferType)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

