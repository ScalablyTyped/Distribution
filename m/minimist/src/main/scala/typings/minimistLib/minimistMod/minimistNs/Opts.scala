package typings
package minimistLib.minimistMod.minimistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /**
    * When true, populate argv._ with everything before the -- and argv['--'] with everything after the --.
    * Note that with -- set, parsing for arguments still stops after the `--`.
    */
  var `--`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object mapping string names to strings or arrays of string argument names to use as aliases
    */
  var alias: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  /**
    * A boolean, string or array of strings to always treat as booleans. If true will treat
    * all double hyphenated arguments without equals signs as boolean (e.g. affects `--foo`, not `-f` or `--foo=bar`)
    */
  var boolean: js.UndefOr[scala.Boolean | java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * An object mapping string argument names to default values
    */
  var default: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * When true, populate argv._ with everything after the first non-option
    */
  var stopEarly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A string or array of strings argument names to always treat as strings         
    */ 
  var string: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * A function which is invoked with a command line parameter not defined in the opts 
    * configuration object. If the function returns false, the unknown option is not added to argv         
    */
  var unknown: js.UndefOr[js.Function1[/* arg */ java.lang.String, scala.Boolean]] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    `--`: js.UndefOr[scala.Boolean] = js.undefined,
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    boolean: scala.Boolean | java.lang.String | js.Array[java.lang.String] = null,
    default: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    stopEarly: js.UndefOr[scala.Boolean] = js.undefined,
    string: java.lang.String | js.Array[java.lang.String] = null,
    unknown: /* arg */ java.lang.String => scala.Boolean = null
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly)
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[Opts]
  }
}

