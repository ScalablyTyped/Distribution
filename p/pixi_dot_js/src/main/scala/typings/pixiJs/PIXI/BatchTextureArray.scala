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
@JSGlobal("PIXI.BatchTextureArray")
@js.native
class BatchTextureArray () extends js.Object {
  /**
    * number of filled elements
    * @member {number} PIXI.BatchTextureArray#count
    */
  var count: Double = js.native
  /**
    * inside textures array
    * @member {PIXI.BaseTexture[]} PIXI.BatchTextureArray#elements
    */
  var elements: js.Array[BaseTexture] = js.native
  /**
    * Respective locations for textures
    * @member {number[]} PIXI.BatchTextureArray#ids
    */
  var ids: js.Array[Double] = js.native
}

