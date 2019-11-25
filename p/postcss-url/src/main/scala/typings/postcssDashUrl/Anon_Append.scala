package typings.postcssDashUrl

import typings.postcssDashUrl.postcssDashUrlMod.CustomHashFunction
import typings.postcssDashUrl.postcssDashUrlStrings.xxhash32
import typings.postcssDashUrl.postcssDashUrlStrings.xxhash64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Append extends js.Object {
  /**
    * Append the original filename in resulting filename.
    */
  var append: js.UndefOr[Boolean] = js.undefined
  /**
    * Hashing method or custom function.
    */
  var method: js.UndefOr[xxhash32 | xxhash64 | CustomHashFunction] = js.undefined
  /**
    * Shrink hast to certain length.
    */
  var shrink: js.UndefOr[Double] = js.undefined
}

object Anon_Append {
  @scala.inline
  def apply(
    append: js.UndefOr[Boolean] = js.undefined,
    method: xxhash32 | xxhash64 | CustomHashFunction = null,
    shrink: Int | Double = null
  ): Anon_Append = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Append]
  }
}

