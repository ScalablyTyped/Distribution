package typings.pixiCore

import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libShaderShaderMod.Shader
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.libTransformFeedbackTransformFeedbackMod.TransformFeedback
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformFeedbackTransformFeedbackSystemMod {
  
  @JSImport("@pixi/core/lib/transformFeedback/TransformFeedbackSystem", "TransformFeedbackSystem")
  @js.native
  open class TransformFeedbackSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    var CONTEXT_UID: Double = js.native
    
    /**
      * Begin TransformFeedback
      * @param drawMode - DrawMode for TransformFeedback
      * @param shader - A Shader used by TransformFeedback. Current bound shader will be used if not provided.
      */
    def beginTransformFeedback(drawMode: DRAW_MODES): Unit = js.native
    def beginTransformFeedback(drawMode: DRAW_MODES, shader: Shader): Unit = js.native
    
    /**
      * Bind TransformFeedback and buffers
      * @param transformFeedback - TransformFeedback to bind
      */
    def bind(transformFeedback: TransformFeedback): Unit = js.native
    
    /** Sets up the renderer context and necessary buffers. */
    /* protected */ def contextChange(): Unit = js.native
    
    /**
      * Create TransformFeedback and bind buffers
      * @param tf - TransformFeedback
      * @returns WebGLTransformFeedback
      */
    /* protected */ def createGLTransformFeedback(tf: TransformFeedback): WebGLTransformFeedback = js.native
    
    @JSName("destroy")
    def destroy_MTransformFeedbackSystem(): Unit = js.native
    
    /**
      * Disposes TransfromFeedback
      * @param {PIXI.TransformFeedback} tf - TransformFeedback
      * @param {boolean} [contextLost=false] - If context was lost, we suppress delete TransformFeedback
      */
    def disposeTransformFeedback(tf: TransformFeedback): Unit = js.native
    def disposeTransformFeedback(tf: TransformFeedback, contextLost: Boolean): Unit = js.native
    
    /** End TransformFeedback */
    def endTransformFeedback(): Unit = js.native
    
    var gl: IRenderingContext = js.native
    
    /* private */ var renderer: Any = js.native
    
    /** Unbind TransformFeedback */
    def unbind(): Unit = js.native
  }
  /* static members */
  object TransformFeedbackSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/transformFeedback/TransformFeedbackSystem", "TransformFeedbackSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
