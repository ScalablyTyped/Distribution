package typings.modularScale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModularScaleOptions extends js.Object {
  /** The base font size (in pixels) to use for the type scale. Defaults to 16 */
  var base: js.UndefOr[Double | String] = js.native
  /** The ratio to use in the generated type scale function. Defaults to ModularScaleRatio.goldenSection */
  var ratio: js.UndefOr[Double] = js.native
}

object ModularScaleOptions {
  @scala.inline
  def apply(): ModularScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModularScaleOptions]
  }
  @scala.inline
  implicit class ModularScaleOptionsOps[Self <: ModularScaleOptions] (val x: Self) extends AnyVal {
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
    def setBase(value: Double | String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
  
}

