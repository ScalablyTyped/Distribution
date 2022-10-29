package typings.pixiCore

import org.scalablytyped.runtime.NumberDictionary
import typings.pixiConstants.mod.BUFFER_TYPE
import typings.pixiCore.libGeometryBufferMod.Buffer
import typings.pixiCore.libGeometryGlbufferMod.GLBuffer
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryBufferSystemMod {
  
  @JSImport("@pixi/core/lib/geometry/BufferSystem", "BufferSystem")
  @js.native
  open class BufferSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param {PIXI.Renderer} renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    var CONTEXT_UID: Double = js.native
    
    /**
      * This binds specified buffer. On first run, it will create the webGL buffers for the context too
      * @param buffer - the buffer to bind to the renderer
      */
    def bind(buffer: Buffer): Unit = js.native
    
    /**
      * Binds an uniform buffer to at the given index.
      *
      * A cache is used so a buffer will not be bound again if already bound.
      * @param buffer - the buffer to bind
      * @param index - the base index to bind it to.
      */
    def bindBufferBase(buffer: Buffer, index: Double): Unit = js.native
    
    /**
      * Binds a buffer whilst also binding its range.
      * This will make the buffer start from the offset supplied rather than 0 when it is read.
      * @param buffer - the buffer to bind
      * @param index - the base index to bind at, defaults to 0
      * @param offset - the offset to bind at (this is blocks of 256). 0 = 0, 1 = 256, 2 = 512 etc
      */
    def bindBufferRange(buffer: Buffer): Unit = js.native
    def bindBufferRange(buffer: Buffer, index: Double): Unit = js.native
    def bindBufferRange(buffer: Buffer, index: Double, offset: Double): Unit = js.native
    def bindBufferRange(buffer: Buffer, index: Unit, offset: Double): Unit = js.native
    
    /** Cache keeping track of the base bound buffer bases */
    val boundBufferBases: NumberDictionary[Buffer] = js.native
    
    /** Sets up the renderer context and necessary buffers. */
    /* protected */ def contextChange(): Unit = js.native
    
    /**
      * creates and attaches a GLBuffer object tied to the current context.
      * @param buffer
      * @protected
      */
    /* protected */ def createGLBuffer(buffer: Buffer): GLBuffer = js.native
    
    /**
      * @ignore
      */
    @JSName("destroy")
    def destroy_MBufferSystem(): Unit = js.native
    
    /**
      * Disposes buffer
      * @param {PIXI.Buffer} buffer - buffer with data
      * @param {boolean} [contextLost=false] - If context was lost, we suppress deleteVertexArray
      */
    def dispose(buffer: Buffer): Unit = js.native
    def dispose(buffer: Buffer, contextLost: Boolean): Unit = js.native
    
    /**
      * dispose all WebGL resources of all managed buffers
      * @param {boolean} [contextLost=false] - If context was lost, we suppress `gl.delete` calls
      */
    def disposeAll(): Unit = js.native
    def disposeAll(contextLost: Boolean): Unit = js.native
    
    var gl: IRenderingContext = js.native
    
    /** Cache for all buffers by id, used in case renderer gets destroyed or for profiling */
    val managedBuffers: NumberDictionary[Buffer] = js.native
    
    /* private */ var renderer: Any = js.native
    
    def unbind(`type`: BUFFER_TYPE): Unit = js.native
    
    /**
      * Will ensure the data in the buffer is uploaded to the GPU.
      * @param {PIXI.Buffer} buffer - the buffer to update
      */
    def update(buffer: Buffer): Unit = js.native
  }
  /* static members */
  object BufferSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/geometry/BufferSystem", "BufferSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
