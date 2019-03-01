package typings
package nomnomLib.NomnomInternalNs.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * The abbreviated name of the option.
    */
  var abbr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A callback for the option.
    */
  var callback: js.UndefOr[js.Function1[/* option */ js.Any, java.lang.String]] = js.undefined
  /**
    * The choices for the option.
    */
  var choices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The default value of the option.
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the option is a flag.
    */
  var flag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The full name of the option.
    */
  var full: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A help string for the option.
    */
  var help: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the option is hidden.
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the option is a list.
    */
  var list: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string to be used in the usage printout.
    */
  var metavar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The position of the option if it's a positional argument.
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the option is required.
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A shorthand for abbr, full, and metavar.
    */
  var string: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If you don't want the option JSON-parsed, specify type "string".
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    abbr: java.lang.String = null,
    callback: js.Function1[/* option */ js.Any, java.lang.String] = null,
    choices: js.Array[java.lang.String] = null,
    default: js.Any = null,
    flag: js.UndefOr[scala.Boolean] = js.undefined,
    full: java.lang.String = null,
    help: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    list: js.UndefOr[scala.Boolean] = js.undefined,
    metavar: java.lang.String = null,
    position: scala.Int | scala.Double = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    string: java.lang.String = null,
    `type`: java.lang.String = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (abbr != null) __obj.updateDynamic("abbr")(abbr)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(flag)) __obj.updateDynamic("flag")(flag)
    if (full != null) __obj.updateDynamic("full")(full)
    if (help != null) __obj.updateDynamic("help")(help)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list)
    if (metavar != null) __obj.updateDynamic("metavar")(metavar)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (string != null) __obj.updateDynamic("string")(string)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Option]
  }
}

