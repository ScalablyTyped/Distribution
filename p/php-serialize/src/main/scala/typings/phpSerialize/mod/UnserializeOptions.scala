package typings.phpSerialize.mod

import typings.phpSerialize.phpSerializeStrings.binary
import typings.phpSerialize.phpSerializeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnserializeOptions extends js.Object {
  /** @default 'utf8' */
  val encoding: js.UndefOr[utf8 | binary] = js.undefined
  /** @default true' */
  val strict: js.UndefOr[Boolean] = js.undefined
}

object UnserializeOptions {
  @scala.inline
  def apply(encoding: utf8 | binary = null, strict: js.UndefOr[Boolean] = js.undefined): UnserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnserializeOptions]
  }
}

