package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pixi/core", "BatchRenderer")
@js.native
open class BatchRenderer protected () extends AbstractBatchRenderer {
  /**
    * This will hook onto the renderer's `contextChange`
    * and `prerender` signals.
    * @param {PIXI.Renderer} renderer - The renderer this works for.
    */
  def this(renderer: Renderer) = this()
}
object BatchRenderer {
  
  @JSImport("@pixi/core", "BatchRenderer")
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
  @JSImport("@pixi/core", "BatchRenderer._drawCallPool")
  @js.native
  def drawCallPool: js.Array[BatchDrawCall] = js.native
  
  inline def drawCallPool_=(x: js.Array[BatchDrawCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_drawCallPool")(x.asInstanceOf[js.Any])
  
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
  def textureArrayPool: js.Array[BatchTextureArray] = js.native
  
  inline def textureArrayPool_=(x: js.Array[BatchTextureArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_textureArrayPool")(x.asInstanceOf[js.Any])
}
