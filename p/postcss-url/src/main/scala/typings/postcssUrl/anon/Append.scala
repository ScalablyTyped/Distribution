package typings.postcssUrl.anon

import typings.postcssUrl.mod.CustomHashFunction
import typings.postcssUrl.postcssUrlStrings.xxhash32
import typings.postcssUrl.postcssUrlStrings.xxhash64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Append extends js.Object {
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

object Append {
  @scala.inline
  def apply(
    append: js.UndefOr[Boolean] = js.undefined,
    method: xxhash32 | xxhash64 | CustomHashFunction = null,
    shrink: js.UndefOr[Double] = js.undefined
  ): Append = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Append]
  }
}

