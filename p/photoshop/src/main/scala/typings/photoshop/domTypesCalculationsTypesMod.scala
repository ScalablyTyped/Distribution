package typings.photoshop

import typings.photoshop.domConstantsMod.CalculationsBlendMode
import typings.photoshop.domConstantsMod.CalculationsResult
import typings.photoshop.domDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTypesCalculationsTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.domChannelMod.Channel
    - typings.photoshop.domConstantsMod.CalculationsChannel.GRAY
    - typings.photoshop.domConstantsMod.CalculationsChannel.TRANSPARENCY
    - typings.photoshop.domConstantsMod.CalculationsChannel.SELECTION
  */
  trait CalculationsChannelType extends StObject
  
  /**
    * Type for the Layer choice in [[CalculationsSource]]
    * @targetfolder objects/options
    * @optionobject
    * @minVersion 24.5
    */
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.domLayerMod.Layer
    - typings.photoshop.domConstantsMod.CalculationsLayer.MERGED
  */
  trait CalculationsLayerType extends StObject
  
  trait CalculationsOptions extends StObject {
    
    /**
      * The blend mode used to merge "Source 1" and "Source 2" together. "Source 1" will be rendered above "Source 2"
      * @default MULTIPLY
      * @minVersion 24.5
      */
    var blending: js.UndefOr[CalculationsBlendMode] = js.undefined
    
    /**
      * The Mask reference to be used in the Calculations operation
      * @minVersion 24.5
      */
    var mask: js.UndefOr[CalculationsSource] = js.undefined
    
    /**
      * The opacity used for "Source 1" when merged with "Source 2".
      * @range 0..100
      * @default 100
      * @minVersion 24.5
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Where to output the result of the Calculations operation
      * @minVersion 24.5
      */
    var result: CalculationsResult
    
    /**
      * The "Source 1" reference to be used in the Calculations operation. "Source 1" will be rendered above "Source 2"
      * @minVersion 24.5
      */
    var source1: CalculationsSource
    
    /**
      * The "Source 2" reference to be used in the Calculations operation
      * @minVersion 24.5
      */
    var source2: CalculationsSource
  }
  object CalculationsOptions {
    
    inline def apply(result: CalculationsResult, source1: CalculationsSource, source2: CalculationsSource): CalculationsOptions = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], source1 = source1.asInstanceOf[js.Any], source2 = source2.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculationsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculationsOptions] (val x: Self) extends AnyVal {
      
      inline def setBlending(value: CalculationsBlendMode): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
      
      inline def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
      
      inline def setMask(value: CalculationsSource): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setResult(value: CalculationsResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSource1(value: CalculationsSource): Self = StObject.set(x, "source1", value.asInstanceOf[js.Any])
      
      inline def setSource2(value: CalculationsSource): Self = StObject.set(x, "source2", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalculationsSource extends StObject {
    
    /**
      * The channel used as a source: either a Channel instance or
      * one of the Constants.CalculationsChannel values.
      * @minVersion 24.5
      */
    var channel: CalculationsChannelType
    
    /**
      * The document used as a source
      * @minVersion 24.5
      */
    var document: Document
    
    /**
      * Whether to invert the source or not
      * @default false
      * @minVersion 24.5
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Either a layer or the pseudo-layer that represents the merged result of all layers,
      * the constant Constants.CalculationsLayer.MERGED.
      * @minVersion 24.5
      */
    var layer: CalculationsLayerType
  }
  object CalculationsSource {
    
    inline def apply(channel: CalculationsChannelType, document: Document, layer: CalculationsLayerType): CalculationsSource = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculationsSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculationsSource] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: CalculationsChannelType): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setLayer(value: CalculationsLayerType): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
}
