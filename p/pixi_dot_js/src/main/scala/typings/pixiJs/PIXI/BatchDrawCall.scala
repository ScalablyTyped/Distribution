package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
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
trait BatchDrawCall extends StObject {
  
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
  implicit class BatchDrawCallMutableBuilder[Self <: BatchDrawCall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
