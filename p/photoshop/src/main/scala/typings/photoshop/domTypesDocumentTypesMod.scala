package typings.photoshop

import typings.photoshop.domConstantsMod.DocumentFill
import typings.photoshop.domConstantsMod.NewDocumentMode
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTypesDocumentTypesMod {
  
  trait DocumentCreateOptions extends StObject {
    
    /**
      * Bit depth
      * @minVersion 22.5
      * @default 8
      * @range [8,16,32]
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Fill color of the document.
      * @minVersion 22.5
      */
    var fill: js.UndefOr[DocumentFill] = js.undefined
    
    /**
      * Custom fill color of the document.
      * @minVersion 23.0
      */
    var fillColor: js.UndefOr[SolidColor] = js.undefined
    
    /**
      * Height of image in pixels.
      * @minVersion 22.5
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * ImageMode class.
      * @minVersion 22.5
      */
    var mode: js.UndefOr[NewDocumentMode] = js.undefined
    
    /**
      * The name to give the new document.
      * @minVersion 22.5
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Pixel Scale Factor.
      * @minVersion 22.5
      */
    var pixelScaleFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Preset.
      * @minVersion 22.5
      */
    var preset: js.UndefOr[String] = js.undefined
    
    /**
      * JSON Preset, requires JSONified string.
      * @minVersion 22.5
      */
    var presetJSON: js.UndefOr[String] = js.undefined
    
    /**
      * Color Profile using profile name.
      * @minVersion 22.5
      */
    var profile: js.UndefOr[String] = js.undefined
    
    /**
      * Resolution of image.
      * @minVersion 22.5
      */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of image in pixels.
      * @minVersion 22.5
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object DocumentCreateOptions {
    
    inline def apply(): DocumentCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFill(value: DocumentFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillColor(value: SolidColor): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMode(value: NewDocumentMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPixelScaleFactor(value: Double): Self = StObject.set(x, "pixelScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setPixelScaleFactorUndefined: Self = StObject.set(x, "pixelScaleFactor", js.undefined)
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetJSON(value: String): Self = StObject.set(x, "presetJSON", value.asInstanceOf[js.Any])
      
      inline def setPresetJSONUndefined: Self = StObject.set(x, "presetJSON", js.undefined)
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
