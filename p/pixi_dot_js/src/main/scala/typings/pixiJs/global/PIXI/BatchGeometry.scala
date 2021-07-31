package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Geometry used to batch standard PIXI content (e.g. Mesh, Sprite, Graphics objects).
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.BatchGeometry")
@js.native
class BatchGeometry ()
  extends StObject
     with typings.pixiJs.PIXI.BatchGeometry {
  def this(_static: Boolean) = this()
  
  /**
    * Buffer used for position, color, texture IDs
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_buffer
    * @protected
    */
  /* CompleteClass */
  var _buffer: typings.pixiJs.PIXI.Buffer = js.native
  
  /**
    * Index buffer data
    *
    * @member {PIXI.Buffer} PIXI.BatchGeometry#_indexBuffer
    * @protected
    */
  /* CompleteClass */
  var _indexBuffer: typings.pixiJs.PIXI.Buffer = js.native
}
