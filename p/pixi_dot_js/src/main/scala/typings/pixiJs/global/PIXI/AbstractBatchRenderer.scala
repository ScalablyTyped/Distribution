package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renderer dedicated to drawing and batching sprites.
  *
  * This is the default batch renderer. It buffers objects
  * with texture-based geometries and renders them in
  * batches. It uploads multiple textures to the GPU to
  * reduce to the number of draw calls.
  *
  * @class
  * @protected
  * @memberof PIXI
  * @extends PIXI.ObjectRenderer
  */
@JSGlobal("PIXI.AbstractBatchRenderer")
@js.native
class AbstractBatchRenderer protected ()
  extends typings.pixiJs.PIXI.AbstractBatchRenderer {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
}
/* static members */
@JSGlobal("PIXI.AbstractBatchRenderer")
@js.native
object AbstractBatchRenderer extends js.Object {
  
  /**
    * Pool of `BatchDrawCall` objects that `flush` used
    * to create "batches" of the objects being rendered.
    *
    * These are never re-allocated again.
    * Shared between all batch renderers because it can be only one "flush" working at the moment.
    *
    * @static
    * @member {PIXI.BatchDrawCall[]}
    */
  var _drawCallPool: js.Array[typings.pixiJs.PIXI.BatchDrawCall] = js.native
  
  /**
    * Pool of `BatchDrawCall` objects that `flush` used
    * to create "batches" of the objects being rendered.
    *
    * These are never re-allocated again.
    * Shared between all batch renderers because it can be only one "flush" working at the moment.
    *
    * @static
    * @member {PIXI.BatchTextureArray[]}
    */
  var _textureArrayPool: js.Array[typings.pixiJs.PIXI.BatchTextureArray] = js.native
}
