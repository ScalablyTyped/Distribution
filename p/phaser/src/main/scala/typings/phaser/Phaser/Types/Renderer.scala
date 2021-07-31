package typings.phaser.Phaser.Types

import typings.phaser.Phaser.Display.Color
import typings.phaser.integer
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Renderer {
  
  object Snapshot {
    
    type SnapshotCallback = js.Function1[/* snapshot */ Color | HTMLImageElement, Unit]
    
    trait SnapshotState extends StObject {
      
      /**
        * The height of the frame buffer, if a frame buffer grab.
        */
      var bufferHeight: js.UndefOr[integer] = js.undefined
      
      /**
        * The width of the frame buffer, if a frame buffer grab.
        */
      var bufferWidth: js.UndefOr[integer] = js.undefined
      
      /**
        * The function to call after the snapshot is taken.
        */
      def callback(snapshot: Color): Unit
      def callback(snapshot: HTMLImageElement): Unit
      /**
        * The function to call after the snapshot is taken.
        */
      @JSName("callback")
      var callback_Original: SnapshotCallback
      
      /**
        * The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`.
        */
      var encoderOptions: js.UndefOr[Double] = js.undefined
      
      /**
        * Is this a snapshot to get a single pixel, or an area?
        */
      var getPixel: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The height of the snapshot.
        */
      var height: js.UndefOr[integer] = js.undefined
      
      /**
        * Is this snapshot grabbing from a frame buffer or a canvas?
        */
      var isFramebuffer: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The format of the image to create, usually `image/png` or `image/jpeg`.
        */
      var `type`: js.UndefOr[String] = js.undefined
      
      /**
        * The width of the snapshot.
        */
      var width: js.UndefOr[integer] = js.undefined
      
      /**
        * The x coordinate to start the snapshot from.
        */
      var x: js.UndefOr[integer] = js.undefined
      
      /**
        * The y coordinate to start the snapshot from.
        */
      var y: js.UndefOr[integer] = js.undefined
    }
    object SnapshotState {
      
      @scala.inline
      def apply(callback: /* snapshot */ Color | HTMLImageElement => Unit): SnapshotState = {
        val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
        __obj.asInstanceOf[SnapshotState]
      }
      
      @scala.inline
      implicit class SnapshotStateMutableBuilder[Self <: SnapshotState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBufferHeight(value: integer): Self = StObject.set(x, "bufferHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBufferHeightUndefined: Self = StObject.set(x, "bufferHeight", js.undefined)
        
        @scala.inline
        def setBufferWidth(value: integer): Self = StObject.set(x, "bufferWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBufferWidthUndefined: Self = StObject.set(x, "bufferWidth", js.undefined)
        
        @scala.inline
        def setCallback(value: /* snapshot */ Color | HTMLImageElement => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEncoderOptions(value: Double): Self = StObject.set(x, "encoderOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEncoderOptionsUndefined: Self = StObject.set(x, "encoderOptions", js.undefined)
        
        @scala.inline
        def setGetPixel(value: Boolean): Self = StObject.set(x, "getPixel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetPixelUndefined: Self = StObject.set(x, "getPixel", js.undefined)
        
        @scala.inline
        def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setIsFramebuffer(value: Boolean): Self = StObject.set(x, "isFramebuffer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsFramebufferUndefined: Self = StObject.set(x, "isFramebuffer", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        @scala.inline
        def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
  }
}
