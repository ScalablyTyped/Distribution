package typings.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimits extends js.Object {
  var codeRangeSizeMb: js.UndefOr[Double] = js.native
  var maxOldGenerationSizeMb: js.UndefOr[Double] = js.native
  var maxYoungGenerationSizeMb: js.UndefOr[Double] = js.native
}

object ResourceLimits {
  @scala.inline
  def apply(): ResourceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimits]
  }
  @scala.inline
  implicit class ResourceLimitsOps[Self <: ResourceLimits] (val x: Self) extends AnyVal {
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
    def setCodeRangeSizeMb(value: Double): Self = this.set("codeRangeSizeMb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeRangeSizeMb: Self = this.set("codeRangeSizeMb", js.undefined)
    @scala.inline
    def setMaxOldGenerationSizeMb(value: Double): Self = this.set("maxOldGenerationSizeMb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxOldGenerationSizeMb: Self = this.set("maxOldGenerationSizeMb", js.undefined)
    @scala.inline
    def setMaxYoungGenerationSizeMb(value: Double): Self = this.set("maxYoungGenerationSizeMb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxYoungGenerationSizeMb: Self = this.set("maxYoungGenerationSizeMb", js.undefined)
  }
  
}

