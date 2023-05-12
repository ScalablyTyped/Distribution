package typings.pixiUtils

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSettings.libIcanvasrenderingcontext2dMod.ICanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaCanvasRenderTargetMod {
  
  @JSImport("@pixi/utils/lib/media/CanvasRenderTarget", "CanvasRenderTarget")
  @js.native
  open class CanvasRenderTarget protected () extends StObject {
    /**
      * @param width - the width for the newly created canvas
      * @param height - the height for the newly created canvas
      * @param {number} [resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the canvas
      */
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, resolution: Double) = this()
    
    /* protected */ var _canvas: ICanvas | Null = js.native
    
    /* private */ var _checkDestroyed: Any = js.native
    
    /* protected */ var _context: ICanvasRenderingContext2D | Null = js.native
    
    /** The Canvas object that belongs to this CanvasRenderTarget. */
    def canvas: ICanvas = js.native
    
    /**
      * Clears the canvas that was created by the CanvasRenderTarget class.
      * @private
      */
    def clear(): Unit = js.native
    
    /** A CanvasRenderingContext2D object representing a two-dimensional rendering context. */
    def context: ICanvasRenderingContext2D = js.native
    
    /** Destroys this canvas. */
    def destroy(): Unit = js.native
    
    /**
      * The height of the canvas buffer in pixels.
      * @member {number}
      */
    def height: Double = js.native
    def height_=(`val`: Double): Unit = js.native
    
    /**
      * Resizes the canvas to the specified width and height.
      * @param desiredWidth - the desired width of the canvas
      * @param desiredHeight - the desired height of the canvas
      */
    def resize(desiredWidth: Double, desiredHeight: Double): Unit = js.native
    
    /**
      * The resolution / device pixel ratio of the canvas
      * @default 1
      */
    var resolution: Double = js.native
    
    /**
      * The width of the canvas buffer in pixels.
      * @member {number}
      */
    def width: Double = js.native
    def width_=(`val`: Double): Unit = js.native
  }
}
