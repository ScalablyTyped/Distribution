package typings.minimist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  /**
    * When true, populate argv._ with everything before the -- and argv['--'] with everything after the --.
    * Note that with -- set, parsing for arguments still stops after the `--`.
    */
  var `--`: js.UndefOr[Boolean] = js.undefined
  /**
    * An object mapping string names to strings or arrays of string argument names to use as aliases
    */
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  /**
    * A boolean, string or array of strings to always treat as booleans. If true will treat
    * all double hyphenated arguments without equals signs as boolean (e.g. affects `--foo`, not `-f` or `--foo=bar`)
    */
  var boolean: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  /**
    * An object mapping string argument names to default values
    */
  var default: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * When true, populate argv._ with everything after the first non-option
    */
  var stopEarly: js.UndefOr[Boolean] = js.undefined
  /**
    * A string or array of strings argument names to always treat as strings         
    */ 
  var string: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * A function which is invoked with a command line parameter not defined in the opts 
    * configuration object. If the function returns false, the unknown option is not added to argv         
    */
  var unknown: js.UndefOr[js.Function1[/* arg */ String, Boolean]] = js.undefined
}

object Opts {
  @scala.inline
  def apply(
    `--`: js.UndefOr[Boolean] = js.undefined,
    alias: StringDictionary[String | js.Array[String]] = null,
    boolean: Boolean | String | js.Array[String] = null,
    default: StringDictionary[js.Any] = null,
    stopEarly: js.UndefOr[Boolean] = js.undefined,
    string: String | js.Array[String] = null,
    unknown: /* arg */ String => Boolean = null
  ): Opts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[Opts]
  }
}

