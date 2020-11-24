package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the batcher to draw batches.
  * Each one of these contains all information required to draw a bound geometry.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait BatchDrawCall extends js.Object {
  
  /**
    * data for uniforms or custom webgl state
    * @member {object} PIXI.BatchDrawCall#data
    */
  var data: js.Any = js.native
}
object BatchDrawCall {
  
  @scala.inline
  def apply(data: js.Any): BatchDrawCall = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDrawCall]
  }
  
  @scala.inline
  implicit class BatchDrawCallOps[Self <: BatchDrawCall] (val x: Self) extends AnyVal {
    
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
