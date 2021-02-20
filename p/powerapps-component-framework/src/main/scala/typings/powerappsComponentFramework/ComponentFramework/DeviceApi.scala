package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.anon.Accuracy
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of Device API interface
  */
object DeviceApi {
  
  /**
    * Interface of input argument 'options' in context.device.captureImage
    */
  @js.native
  trait CaptureImageOptions extends StObject {
    
    /**
      * Indicates whether to edit the image before saving.
      */
    var allowEdit: Boolean = js.native
    
    /**
      * Height of the image to capture.
      */
    var height: Double = js.native
    
    /**
      * Indicates whether to capture image using the front camera of the device.
      */
    var preferFrontCamera: Boolean = js.native
    
    /**
      * Quality of the image file in percentage.
      */
    var quality: Double = js.native
    
    /**
      * Width of the image to capture.
      */
    var width: Double = js.native
  }
  object CaptureImageOptions {
    
    @scala.inline
    def apply(allowEdit: Boolean, height: Double, preferFrontCamera: Boolean, quality: Double, width: Double): CaptureImageOptions = {
      val __obj = js.Dynamic.literal(allowEdit = allowEdit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preferFrontCamera = preferFrontCamera.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureImageOptions]
    }
    
    @scala.inline
    implicit class CaptureImageOptionsMutableBuilder[Self <: CaptureImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEdit(value: Boolean): Self = StObject.set(x, "allowEdit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferFrontCamera(value: Boolean): Self = StObject.set(x, "preferFrontCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface of input argument 'pickupFileOption' in context.device.pickupFile
    */
  @js.native
  trait PickFileOptions extends StObject {
    
    /**
      * Image file types to select. Valid values are "audio", "video", or "image".
      */
    var accept: String = js.native
    
    /**
      * Indicates whether to allow selecting multiple files.
      */
    var allowMultipleFiles: Boolean = js.native
    
    /**
      * Maximum size of the files(s) to be selected.
      */
    var maximumAllowedFileSize: Double = js.native
  }
  object PickFileOptions {
    
    @scala.inline
    def apply(accept: String, allowMultipleFiles: Boolean, maximumAllowedFileSize: Double): PickFileOptions = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], allowMultipleFiles = allowMultipleFiles.asInstanceOf[js.Any], maximumAllowedFileSize = maximumAllowedFileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickFileOptions]
    }
    
    @scala.inline
    implicit class PickFileOptionsMutableBuilder[Self <: PickFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleFiles(value: Boolean): Self = StObject.set(x, "allowMultipleFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumAllowedFileSize(value: Double): Self = StObject.set(x, "maximumAllowedFileSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface of return geological information in context.device.getCurrentPosition
    */
  @js.native
  trait Position extends StObject {
    
    /**
      * Contains a set of geographic coordinates along with associated accuracy as well as a set of other optional attributes such as altitude and speed.
      */
    var coords: Accuracy = js.native
    
    /**
      * Represents the time when the object was acquired and is represented as DOMTimeStamp.
      */
    var timestamp: Date = js.native
  }
  object Position {
    
    @scala.inline
    def apply(coords: Accuracy, timestamp: Date): Position = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoords(value: Accuracy): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
