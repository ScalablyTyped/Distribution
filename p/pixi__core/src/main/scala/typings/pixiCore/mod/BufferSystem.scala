package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System plugin to the renderer to manage buffers.
  *
  * WebGL uses Buffers as a way to store objects to the GPU.
  * This system makes working with them a lot easier.
  *
  * Buffers are used in three main places in WebGL
  * - geometry information
  * - Uniform information (via uniform buffer objects - a WebGL 2 only feature)
  * - Transform feedback information. (WebGL 2 only feature)
  *
  * This system will handle the binding of buffers to the GPU as well as uploading
  * them. With this system, you never need to work directly with GPU buffers, but instead work with
  * the PIXI.Buffer class.
  * @class
  * @memberof PIXI
  */
@js.native
trait BufferSystem
  extends StObject
     with ISystem {
  
  var CONTEXT_UID: Double = js.native
  
  /**
    * This binds specified buffer. On first run, it will create the webGL buffers for the context too
    * @param buffer - the buffer to bind to the renderer
    */
  def bind(buffer: Buffer2): Unit = js.native
  
  /**
    * Binds an uniform buffer to at the given index.
    *
    * A cache is used so a buffer will not be bound again if already bound.
    * @param buffer - the buffer to bind
    * @param index - the base index to bind it to.
    */
  def bindBufferBase(buffer: Buffer2, index: Double): Unit = js.native
  
  /**
    * Binds a buffer whilst also binding its range.
    * This will make the buffer start from the offset supplied rather than 0 when it is read.
    * @param buffer - the buffer to bind
    * @param index - the base index to bind at, defaults to 0
    * @param offset - the offset to bind at (this is blocks of 256). 0 = 0, 1 = 256, 2 = 512 etc
    */
  def bindBufferRange(buffer: Buffer2): Unit = js.native
  def bindBufferRange(buffer: Buffer2, index: Double): Unit = js.native
  def bindBufferRange(buffer: Buffer2, index: Double, offset: Double): Unit = js.native
  def bindBufferRange(buffer: Buffer2, index: Unit, offset: Double): Unit = js.native
  
  /** Cache keeping track of the base bound buffer bases */
  val boundBufferBases: NumberDictionary[Buffer2] = js.native
  
  /** Sets up the renderer context and necessary buffers. */
  /* protected */ def contextChange(): Unit = js.native
  
  /**
    * creates and attaches a GLBuffer object tied to the current context.
    * @param buffer
    * @protected
    */
  /* protected */ def createGLBuffer(buffer: Buffer2): GLBuffer = js.native
  
  /**
    * Disposes buffer
    * @param {PIXI.Buffer} buffer - buffer with data
    * @param {boolean} [contextLost=false] - If context was lost, we suppress deleteVertexArray
    */
  def dispose(buffer: Buffer2): Unit = js.native
  def dispose(buffer: Buffer2, contextLost: Boolean): Unit = js.native
  
  /**
    * dispose all WebGL resources of all managed buffers
    * @param {boolean} [contextLost=false] - If context was lost, we suppress `gl.delete` calls
    */
  def disposeAll(): Unit = js.native
  def disposeAll(contextLost: Boolean): Unit = js.native
  
  var gl: IRenderingContext = js.native
  
  /** Cache for all buffers by id, used in case renderer gets destroyed or for profiling */
  val managedBuffers: NumberDictionary[Buffer2] = js.native
  
  /* private */ var renderer: Any = js.native
  
  /**
    * Will ensure the data in the buffer is uploaded to the GPU.
    * @param {PIXI.Buffer} buffer - the buffer to update
    */
  def update(buffer: Buffer2): Unit = js.native
}
