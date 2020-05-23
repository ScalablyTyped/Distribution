package typings.momentJalaali.mod.momentAugmentingMod

import typings.momentJalaali.momentJalaaliStrings.`persian-modern`
import typings.momentJalaali.momentJalaaliStrings.persian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPersianOptions extends js.Object {
  /**
    * use dialect option to change usePersian dialect, available options are:
    *      persian: default dialect(امرداد، آدینه، ...)
    *      persian-modern: modern dialect(مرداد، جمعه، ...)
    */
  var dialect: js.UndefOr[persian | `persian-modern`] = js.undefined
  /**
    * Use persian digits as decribed by unicode
    */
  var usePersianDigits: js.UndefOr[Boolean] = js.undefined
}

object LoadPersianOptions {
  @scala.inline
  def apply(dialect: persian | `persian-modern` = null, usePersianDigits: js.UndefOr[Boolean] = js.undefined): LoadPersianOptions = {
    val __obj = js.Dynamic.literal()
    if (dialect != null) __obj.updateDynamic("dialect")(dialect.asInstanceOf[js.Any])
    if (!js.isUndefined(usePersianDigits)) __obj.updateDynamic("usePersianDigits")(usePersianDigits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPersianOptions]
  }
}

