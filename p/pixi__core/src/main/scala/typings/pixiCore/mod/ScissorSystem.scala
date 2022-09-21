package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ScissorSystem")
@js.native
open class ScissorSystem protected ()
  extends StObject
     with AbstractMaskSystem {
  /**
    * @param {PIXI.Renderer} renderer - The renderer this System works for.
    */
  def this(renderer: Renderer) = this()
  
  /**
    * Setup renderer to use the current mask data.
    * @private
    */
  /* protected */ /* CompleteClass */
  override def _useCurrent(): Unit = js.native
  
  /**
    * evaluates _boundsTransformed, _scissorRect for MaskData
    * @param maskData
    */
  def calcScissorRect(maskData: MaskData): Unit = js.native
  
  /** Generic destroy methods to be overridden by the subclass */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /** Gets count of masks of certain type. */
  /* CompleteClass */
  override def getStackLength(): Double = js.native
  
  /**
    * Constant for gl.enable
    * @private
    */
  /* protected */ /* CompleteClass */
  var glConst: Double = js.native
  
  /**
    * The mask stack
    * @member {PIXI.MaskData[]}
    */
  /* protected */ /* CompleteClass */
  var maskStack: js.Array[MaskData] = js.native
  
  /**
    * This should be called after a mask is popped off the mask stack. It will rebind the scissor box to be latest with the
    * last mask in the stack.
    *
    * This can also be called when you directly modify the scissor box and want to restore PixiJS state.
    * @param maskData - The mask data.
    */
  def pop(): Unit = js.native
  def pop(maskData: MaskData): Unit = js.native
  
  /**
    * Applies the Mask and adds it to the current stencil stack.
    * @author alvin
    * @param maskData - The mask data.
    */
  def push(maskData: MaskData): Unit = js.native
  
  /* protected */ /* CompleteClass */
  var renderer: Renderer = js.native
  
  /* private */ var roundFrameToPixels: Any = js.native
  
  /**
    * Changes the mask stack that is used by this System.
    * @param {PIXI.MaskData[]} maskStack - The mask stack
    */
  /* CompleteClass */
  override def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
  
  /**
    * Test, whether the object can be scissor mask with current renderer projection.
    * Calls "calcScissorRect()" if its true.
    * @param maskData - mask data
    * @returns whether Whether the object can be scissor mask
    */
  def testScissor(maskData: MaskData): Boolean = js.native
}
/* static members */
object ScissorSystem {
  
  @JSImport("@pixi/core", "ScissorSystem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/core", "ScissorSystem.isMatrixRotated")
  @js.native
  def isMatrixRotated: Any = js.native
  inline def isMatrixRotated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatrixRotated")(x.asInstanceOf[js.Any])
}
