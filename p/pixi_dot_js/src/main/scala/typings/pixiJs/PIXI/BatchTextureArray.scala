package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the batcher to build texture batches.
  * Holds list of textures and their respective locations.
  *
  * @class
  * @memberof PIXI
  */
trait BatchTextureArray extends js.Object {
  /**
    * number of filled elements
    * @member {number} PIXI.BatchTextureArray#count
    */
  var count: Double
  /**
    * inside textures array
    * @member {PIXI.BaseTexture[]} PIXI.BatchTextureArray#elements
    */
  var elements: js.Array[BaseTexture]
  /**
    * Respective locations for textures
    * @member {number[]} PIXI.BatchTextureArray#ids
    */
  var ids: js.Array[Double]
}

object BatchTextureArray {
  @scala.inline
  def apply(count: Double, elements: js.Array[BaseTexture], ids: js.Array[Double]): BatchTextureArray = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTextureArray]
  }
}

