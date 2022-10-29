package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BatchRenderer")
@js.native
open class BatchRenderer protected ()
  extends typings.pixiCore.mod.BatchRenderer {
  /**
    * This will hook onto the renderer's `contextChange`
    * and `prerender` signals.
    * @param {PIXI.Renderer} renderer - The renderer this works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object BatchRenderer {
  
  @JSImport("pixi.js", "BatchRenderer")
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
  @JSImport("pixi.js", "BatchRenderer._drawCallPool")
  @js.native
  def _drawCallPool: js.Array[typings.pixiCore.libBatchBatchDrawCallMod.BatchDrawCall] = js.native
  inline def _drawCallPool_=(x: js.Array[typings.pixiCore.libBatchBatchDrawCallMod.BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_drawCallPool")(x.asInstanceOf[js.Any])
  
  /**
    * Pool of `BatchDrawCall` objects that `flush` used
    * to create "batches" of the objects being rendered.
    *
    * These are never re-allocated again.
    * Shared between all batch renderers because it can be only one "flush" working at the moment.
    * @member {PIXI.BatchTextureArray[]}
    */
  @JSImport("pixi.js", "BatchRenderer._textureArrayPool")
  @js.native
  def _textureArrayPool: js.Array[typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray] = js.native
  inline def _textureArrayPool_=(x: js.Array[typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureArrayPool")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("pixi.js", "BatchRenderer.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
