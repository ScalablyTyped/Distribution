package typings.mdnDashBrowserDashCompatDashData

import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.preference
import typings.mdnDashBrowserDashCompatDashData.mdnDashBrowserDashCompatDashDataStrings.runtime_flag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
    * A `string` representing the flag or preference to modify.
    */
  var name: String
  /**
    * An enum that indicates the flag type:
    * - `preference` a flag the user can set (like in `about:config` in Firefox).
    * - `runtime_flag` a flag to be set before starting the browser.
    */
  var `type`: preference | runtime_flag
  /**
    * Property representing the actual value to set the flag to.
    *
    * It is a string, that may be converted to the right type
    * (that is `true` or `false` for a `boolean` value, or `4` for a `number` value).
    *
    * It doesn't need to be enclosed in `<code>` tags.
    */
  var value_to_set: js.UndefOr[String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String, `type`: preference | runtime_flag, value_to_set: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value_to_set != null) __obj.updateDynamic("value_to_set")(value_to_set)
    __obj.asInstanceOf[Anon_Name]
  }
}

