package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BatchRenderer")
@js.native
open class BatchRenderer protected ()
  extends typings.pixiCore.libBatchBatchRendererMod.BatchRenderer {
  /**
    * This will hook onto the renderer's `contextChange`
    * and `prerender` signals.
    * @param {PIXI.Renderer} renderer - The renderer this works for.
    */
  def this(renderer: typings.pixiCore.libRendererMod.Renderer) = this()
}
/* static members */
object BatchRenderer {
  
  @JSImport("@pixi/core", "BatchRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/core", "BatchRenderer._canUploadSameBuffer")
  @js.native
  def _canUploadSameBuffer: Any = js.native
  inline def _canUploadSameBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_canUploadSameBuffer")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core", "BatchRenderer._defaultMaxTextures")
  @js.native
  def _defaultMaxTextures: Any = js.native
  inline def _defaultMaxTextures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultMaxTextures")(x.asInstanceOf[js.Any])
  
  /**
    * Pool of `BatchDrawCall` objects that `flush` used
    * to create "batches" of the objects being rendered.
    *
    * These are never re-allocated again.
    * Shared between all batch renderers because it can be only one "flush" working at the moment.
    * @member {PIXI.BatchDrawCall[]}
    */
  @JSImport("@pixi/core", "BatchRenderer._drawCallPool")
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
  @JSImport("@pixi/core", "BatchRenderer._textureArrayPool")
  @js.native
  def _textureArrayPool: js.Array[typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray] = js.native
  inline def _textureArrayPool_=(x: js.Array[typings.pixiCore.libBatchBatchTextureArrayMod.BatchTextureArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureArrayPool")(x.asInstanceOf[js.Any])
  
  /**
    * The default sprite batch size.
    *
    * The default aims to balance desktop and mobile devices.
    * @static
    */
  @JSImport("@pixi/core", "BatchRenderer.defaultBatchSize")
  @js.native
  def defaultBatchSize: Double = js.native
  inline def defaultBatchSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBatchSize")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core", "BatchRenderer.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
