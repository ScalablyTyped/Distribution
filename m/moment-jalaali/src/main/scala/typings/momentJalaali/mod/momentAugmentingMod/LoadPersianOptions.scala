package typings.momentJalaali.mod.momentAugmentingMod

import typings.momentJalaali.momentJalaaliStrings.`persian-modern`
import typings.momentJalaali.momentJalaaliStrings.persian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPersianOptions extends js.Object {
  /**
    * use dialect option to change usePersian dialect, available options are:
    *      persian: default dialect(امرداد، آدینه، ...)
    *      persian-modern: modern dialect(مرداد، جمعه، ...)
    */
  var dialect: js.UndefOr[persian | `persian-modern`] = js.native
  /**
    * Use persian digits as decribed by unicode
    */
  var usePersianDigits: js.UndefOr[Boolean] = js.native
}

object LoadPersianOptions {
  @scala.inline
  def apply(): LoadPersianOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPersianOptions]
  }
  @scala.inline
  implicit class LoadPersianOptionsOps[Self <: LoadPersianOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDialect(value: persian | `persian-modern`): Self = this.set("dialect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialect: Self = this.set("dialect", js.undefined)
    @scala.inline
    def setUsePersianDigits(value: Boolean): Self = this.set("usePersianDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePersianDigits: Self = this.set("usePersianDigits", js.undefined)
  }
  
}

