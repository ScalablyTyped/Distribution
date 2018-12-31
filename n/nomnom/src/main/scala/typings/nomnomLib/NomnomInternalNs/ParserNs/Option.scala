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

