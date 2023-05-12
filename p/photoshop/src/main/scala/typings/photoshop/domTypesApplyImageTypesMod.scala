package typings.photoshop

import typings.photoshop.domConstantsMod.ApplyImageBlendMode
import typings.photoshop.domDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTypesApplyImageTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.domChannelMod.Channel
    - typings.photoshop.domConstantsMod.ApplyImageChannel.RGB
    - typings.photoshop.domConstantsMod.ApplyImageChannel.CMYK
    - typings.photoshop.domConstantsMod.ApplyImageChannel.LAB
    - typings.photoshop.domConstantsMod.ApplyImageChannel.SELECTION
    - typings.photoshop.domConstantsMod.ApplyImageChannel.TRANSPARENCY
  */
  trait ApplyImageChannelType extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.domLayerMod.Layer
    - typings.photoshop.domConstantsMod.ApplyImageLayer.MERGED
  */
  trait ApplyImageLayerType extends StObject
  
  trait ApplyImageOptions extends StObject {
    
    /**
      * The blend mode used to apply the source to the active layer.
      * @default MULTIPLY
      * @minVersion 24.5
      */
    var blending: js.UndefOr[ApplyImageBlendMode] = js.undefined
    
    /**
      * The Mask reference to be used in the Apply Image operation.
      * @minVersion 24.5
      */
    var mask: js.UndefOr[ApplyImageSource] = js.undefined
    
    /**
      * The opacity used while applying the source to the active layer.
      * @range 0..100
      * @default 100
      * @minVersion 24.5
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to preserve the original transparency of the active layer.
      * @default false
      * @minVersion 24.5
      */
    var preserveTransparency: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The source reference to be used in the Apply Image operation.
      * @minVersion 24.5
      */
    var source: ApplyImageSource
  }
  object ApplyImageOptions {
    
    inline def apply(source: ApplyImageSource): ApplyImageOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyImageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyImageOptions] (val x: Self) extends AnyVal {
      
      inline def setBlending(value: ApplyImageBlendMode): Self = StObject.set(x, "blending", value.asInstanceOf[js.Any])
      
      inline def setBlendingUndefined: Self = StObject.set(x, "blending", js.undefined)
      
      inline def setMask(value: ApplyImageSource): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreserveTransparency(value: Boolean): Self = StObject.set(x, "preserveTransparency", value.asInstanceOf[js.Any])
      
      inline def setPreserveTransparencyUndefined: Self = StObject.set(x, "preserveTransparency", js.undefined)
      
      inline def setSource(value: ApplyImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait ApplyImageSource extends StObject {
    
    /**
      * The channel used as a source
      * @minVersion 24.5
      */
    var channel: ApplyImageChannelType
    
    /**
      * The document used as a source
      * @minVersion 24.5
      */
    var document: Document
    
    /**
      * Whether to invert the source or not
      * @minVersion 24.5
      * @default false
      */
    var invert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The layer used as a source
      * @minVersion 24.5
      */
    var layer: ApplyImageLayerType
  }
  object ApplyImageSource {
    
    inline def apply(channel: ApplyImageChannelType, document: Document, layer: ApplyImageLayerType): ApplyImageSource = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyImageSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyImageSource] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: ApplyImageChannelType): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setLayer(value: ApplyImageLayerType): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
}
