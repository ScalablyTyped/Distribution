package typings.pixiJs.PIXI

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
trait BatchTextureArray extends StObject {
  
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
  
  inline def apply(count: Double, elements: js.Array[BaseTexture], ids: js.Array[Double]): BatchTextureArray = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchTextureArray]
  }
  
  extension [Self <: BatchTextureArray](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setElements(value: js.Array[BaseTexture]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: BaseTexture*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
