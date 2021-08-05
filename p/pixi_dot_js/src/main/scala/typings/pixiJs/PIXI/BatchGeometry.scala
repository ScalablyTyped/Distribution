package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Geometry used to batch standard PIXI content (e.g. Mesh, Sprite, Graphics objects).
  *
  * @class
  * @memberof PIXI
  */
trait BatchGeometry extends StObject {
  
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  /* protected */ var _buffer: Buffer
  
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  /* protected */ var _indexBuffer: Buffer
}
object BatchGeometry {
  
  inline def apply(_buffer: Buffer, _indexBuffer: Buffer): BatchGeometry = {
    val __obj = js.Dynamic.literal(_buffer = _buffer.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGeometry]
  }
  
  extension [Self <: BatchGeometry](x: Self) {
    
    inline def set_buffer(value: Buffer): Self = StObject.set(x, "_buffer", value.asInstanceOf[js.Any])
    
    inline def set_indexBuffer(value: Buffer): Self = StObject.set(x, "_indexBuffer", value.asInstanceOf[js.Any])
  }
}
