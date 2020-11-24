package typings.node.workerThreadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLimits_ extends js.Object {
  
  /**
    * The size of a pre-allocated memory range used for generated code.
    */
  var codeRangeSizeMb: js.UndefOr[Double] = js.native
  
  /**
    * The maximum size of the main heap in MB.
    */
  var maxOldGenerationSizeMb: js.UndefOr[Double] = js.native
  
  /**
    * The maximum size of a heap space for recently created objects.
    */
  var maxYoungGenerationSizeMb: js.UndefOr[Double] = js.native
  
  /**
    * The default maximum stack size for the thread. Small values may lead to unusable Worker instances.
    * @default 4
    */
  var stackSizeMb: js.UndefOr[Double] = js.native
}
object ResourceLimits_ {
  
  @scala.inline
  def apply(): ResourceLimits_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLimits_]
  }
  
  @scala.inline
  implicit class ResourceLimits_Ops[Self <: ResourceLimits_] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setStackSizeMb(value: Double): Self = this.set("stackSizeMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSizeMb: Self = this.set("stackSizeMb", js.undefined)
  }
}
