package typings
package postcssDashUrlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Append extends js.Object {
  /**
    * Append the original filename in resulting filename.
    */
  var append: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hashing method or custom function.
    */
  var method: js.UndefOr[
    postcssDashUrlLib.postcssDashUrlLibStrings.xxhash32 | postcssDashUrlLib.postcssDashUrlLibStrings.xxhash64 | postcssDashUrlLib.postcssDashUrlMod.urlNs.CustomHashFunction
  ] = js.undefined
  /**
    * Shrink hast to certain length.
    */
  var shrink: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Append {
  @scala.inline
  def apply(
    append: js.UndefOr[scala.Boolean] = js.undefined,
    method: postcssDashUrlLib.postcssDashUrlLibStrings.xxhash32 | postcssDashUrlLib.postcssDashUrlLibStrings.xxhash64 | postcssDashUrlLib.postcssDashUrlMod.urlNs.CustomHashFunction = null,
    shrink: scala.Int | scala.Double = null
  ): Anon_Append = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Append]
  }
}

