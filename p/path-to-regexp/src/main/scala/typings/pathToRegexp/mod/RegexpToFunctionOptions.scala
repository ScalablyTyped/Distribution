package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexpToFunctionOptions extends js.Object {
  /**
    * Function for decoding strings for params.
    */
  var decode: js.UndefOr[js.Function2[/* value */ String, /* token */ Key, String]] = js.native
}

object RegexpToFunctionOptions {
  @scala.inline
  def apply(): RegexpToFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexpToFunctionOptions]
  }
  @scala.inline
  implicit class RegexpToFunctionOptionsOps[Self <: RegexpToFunctionOptions] (val x: Self) extends AnyVal {
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
    def setDecode(value: (/* value */ String, /* token */ Key) => String): Self = this.set("decode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
  }
  
}

