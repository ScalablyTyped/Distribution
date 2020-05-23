package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the batcher to draw batches.
  * Each one of these contains all information required to draw a bound geometry.
  *
  * @class
  * @memberof PIXI
  */
trait BatchDrawCall extends js.Object {
  /**
    * data for uniforms or custom webgl state
    * @member {object} PIXI.BatchDrawCall#data
    */
  var data: js.Any
}

object BatchDrawCall {
  @scala.inline
  def apply(data: js.Any): BatchDrawCall = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDrawCall]
  }
}

