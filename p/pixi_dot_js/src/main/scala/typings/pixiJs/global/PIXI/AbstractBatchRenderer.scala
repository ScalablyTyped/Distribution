package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
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
object AbstractBatchRenderer {
  
  @JSGlobal("PIXI.AbstractBatchRenderer")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @JSGlobal("PIXI.AbstractBatchRenderer._drawCallPool")
  @js.native
  def drawCallPool: js.Array[typings.pixiJs.PIXI.BatchDrawCall] = js.native
  
  @scala.inline
  def drawCallPool_=(x: js.Array[typings.pixiJs.PIXI.BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_drawCallPool")(x.asInstanceOf[js.Any])
  
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
  /* static member */
  @JSGlobal("PIXI.AbstractBatchRenderer._textureArrayPool")
  @js.native
  def textureArrayPool: js.Array[typings.pixiJs.PIXI.BatchTextureArray] = js.native
  
  @scala.inline
  def textureArrayPool_=(x: js.Array[typings.pixiJs.PIXI.BatchTextureArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureArrayPool")(x.asInstanceOf[js.Any])
}
