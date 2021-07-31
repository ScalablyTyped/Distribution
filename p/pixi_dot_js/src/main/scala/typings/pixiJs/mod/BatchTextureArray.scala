package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with typings.pixiJs.PIXI.BatchTextureArray {
  
  /**
    * number of filled elements
    * @member {number} PIXI.BatchTextureArray#count
    */
  /* CompleteClass */
  var count: Double = js.native
  
  /**
    * inside textures array
    * @member {PIXI.BaseTexture[]} PIXI.BatchTextureArray#elements
    */
  /* CompleteClass */
  var elements: js.Array[typings.pixiJs.PIXI.BaseTexture] = js.native
  
  /**
    * Respective locations for textures
    * @member {number[]} PIXI.BatchTextureArray#ids
    */
  /* CompleteClass */
  var ids: js.Array[Double] = js.native
}
