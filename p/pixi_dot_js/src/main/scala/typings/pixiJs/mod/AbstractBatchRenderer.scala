package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "AbstractBatchRenderer")
@js.native
open class AbstractBatchRenderer protected ()
  extends typings.pixiCore.mod.AbstractBatchRenderer {
  /**
    * This will hook onto the renderer's `contextChange`
    * and `prerender` signals.
    * @param {PIXI.Renderer} renderer - The renderer this works for.
    */
  def this(renderer: typings.pixiCore.mod.Renderer) = this()
}
/* static members */
object AbstractBatchRenderer {
  
  @JSImport("pixi.js", "AbstractBatchRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Pool of `BatchDrawCall` objects that `flush` used
    * to create "batches" of the objects being rendered.
    *
    * These are never re-allocated again.
    * Shared between all batch renderers because it can be only one "flush" working at the moment.
    * @member {PIXI.BatchDrawCall[]}
    */
  @JSImport("pixi.js", "AbstractBatchRenderer._drawCallPool")
  @js.native
  def _drawCallPool: js.Array[typings.pixiCore.mod.BatchDrawCall] = js.native
  inline def _drawCallPool_=(x: js.Array[typings.pixiCore.mod.BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_drawCallPool")(x.asInstanceOf[js.Any])
  
  /**
    * Pool of `BatchDrawCall` objects that `flush` used
    * to create "batches" of the objects being rendered.
    *
    * These are never re-allocated again.
    * Shared between all batch renderers because it can be only one "flush" working at the moment.
    * @member {PIXI.BatchTextureArray[]}
    */
  @JSImport("pixi.js", "AbstractBatchRenderer._textureArrayPool")
  @js.native
  def _textureArrayPool: js.Array[typings.pixiCore.mod.BatchTextureArray] = js.native
  inline def _textureArrayPool_=(x: js.Array[typings.pixiCore.mod.BatchTextureArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureArrayPool")(x.asInstanceOf[js.Any])
}
