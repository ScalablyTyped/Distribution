package typings.nomnom.NomnomInternal.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  /**
    * The abbreviated name of the option.
    */
  var abbr: js.UndefOr[String] = js.undefined
  /**
    * A callback for the option.
    */
  var callback: js.UndefOr[js.Function1[/* option */ js.Any, String]] = js.undefined
  /**
    * The choices for the option.
    */
  var choices: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The default value of the option.
    */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the option is a flag.
    */
  var flag: js.UndefOr[Boolean] = js.undefined
  /**
    * The full name of the option.
    */
  var full: js.UndefOr[String] = js.undefined
  /**
    * A help string for the option.
    */
  var help: js.UndefOr[String] = js.undefined
  /**
    * Whether the option is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the option is a list.
    */
  var list: js.UndefOr[Boolean] = js.undefined
  /**
    * A string to be used in the usage printout.
    */
  var metavar: js.UndefOr[String] = js.undefined
  /**
    * The position of the option if it's a positional argument.
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    * Whether the option is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * A shorthand for abbr, full, and metavar.
    */
  var string: js.UndefOr[String] = js.undefined
  /**
    * If you don't want the option JSON-parsed, specify type "string".
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    abbr: String = null,
    callback: /* option */ js.Any => String = null,
    choices: js.Array[String] = null,
    default: js.Any = null,
    flag: js.UndefOr[Boolean] = js.undefined,
    full: String = null,
    help: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    list: js.UndefOr[Boolean] = js.undefined,
    metavar: String = null,
    position: Int | Double = null,
    required: js.UndefOr[Boolean] = js.undefined,
    string: String = null,
    `type`: String = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (abbr != null) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(flag)) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(list)) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (metavar != null) __obj.updateDynamic("metavar")(metavar.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

