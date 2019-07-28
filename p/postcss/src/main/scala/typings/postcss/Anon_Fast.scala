package typings.postcss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fast extends js.Object {
  /**
    * Used to narrow down values and speed up the regexp search. Searching
    * every single value with a regexp can be slow. If you pass a fast
    * string, PostCSS will first check whether the value contains the fast
    * string; and only if it does will PostCSS check that value against
    * regexp. For example, instead of just checking for /\d+rem/ on all
    * values, set fast: 'rem' to first check whether a value has the rem
    * unit, and only if it does perform the regexp check.
    */
  var fast: js.UndefOr[String] = js.undefined
  /**
    * Property names. The method will only search for values that match
    * regexp  within declarations of listed properties.
    */
  var props: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Fast {
  @scala.inline
  def apply(fast: String = null, props: js.Array[String] = null): Anon_Fast = {
    val __obj = js.Dynamic.literal()
    if (fast != null) __obj.updateDynamic("fast")(fast)
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Anon_Fast]
  }
}

