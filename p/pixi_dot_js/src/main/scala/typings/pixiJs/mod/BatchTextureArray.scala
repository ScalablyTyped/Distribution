package typings.pixiJs.mod

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
@JSImport("pixi.js", "BatchTextureArray")
@js.native
class BatchTextureArray ()
  extends typings.pixiJs.PIXI.BatchTextureArray {
  /**
    * number of filled elements
    * @member {number} PIXI.BatchTextureArray#count
    */
  /* CompleteClass */
  override var count: Double = js.native
  /**
    * inside textures array
    * @member {PIXI.BaseTexture[]} PIXI.BatchTextureArray#elements
    */
  /* CompleteClass */
  override var elements: js.Array[typings.pixiJs.PIXI.BaseTexture] = js.native
  /**
    * Respective locations for textures
    * @member {number[]} PIXI.BatchTextureArray#ids
    */
  /* CompleteClass */
  override var ids: js.Array[Double] = js.native
}

