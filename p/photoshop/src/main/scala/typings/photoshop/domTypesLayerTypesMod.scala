package typings.photoshop

import typings.photoshop.anon.X
import typings.photoshop.domConstantsMod.BlendMode
import typings.photoshop.domConstantsMod.LabelColors
import typings.photoshop.domLayerMod.Layer
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTypesLayerTypesMod {
  
  trait GroupLayerCreateOptions
    extends StObject
       with LayerCreateOptionsBase
       with LayerCreateOptions {
    
    /**
      * Layer(s) to populate the newly created group.
      * @minVersion 22.5
      */
    var fromLayers: js.UndefOr[Layer | js.Array[Layer]] = js.undefined
  }
  object GroupLayerCreateOptions {
    
    inline def apply(): GroupLayerCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupLayerCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupLayerCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setFromLayers(value: Layer | js.Array[Layer]): Self = StObject.set(x, "fromLayers", value.asInstanceOf[js.Any])
      
      inline def setFromLayersUndefined: Self = StObject.set(x, "fromLayers", js.undefined)
      
      inline def setFromLayersVarargs(value: Layer*): Self = StObject.set(x, "fromLayers", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.domTypesLayerTypesMod.PixelLayerCreateOptions
    - typings.photoshop.domTypesLayerTypesMod.GroupLayerCreateOptions
  */
  trait LayerCreateOptions extends StObject
  object LayerCreateOptions {
    
    inline def GroupLayerCreateOptions(): typings.photoshop.domTypesLayerTypesMod.GroupLayerCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.photoshop.domTypesLayerTypesMod.GroupLayerCreateOptions]
    }
    
    inline def PixelLayerCreateOptions(): typings.photoshop.domTypesLayerTypesMod.PixelLayerCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.photoshop.domTypesLayerTypesMod.PixelLayerCreateOptions]
    }
  }
  
  trait LayerCreateOptionsBase extends StObject {
    
    /**
      * Blend mode of the newly created layer or group.
      * @default NORMAL
      * @minVersion 22.5
      */
    var blendMode: js.UndefOr[BlendMode] = js.undefined
    
    /**
      * Label color of the newly created layer or group.
      * @default NONE
      * @minVersion 22.5
      */
    var color: js.UndefOr[LabelColors] = js.undefined
    
    /**
      * Whether to use previous layer to create clipping mask.
      *
      * @default false
      * @minVersion 22.5
      */
    var group: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Deprecated, please use `blendMode` above as it will override this value.
      *
      * @default NORMAL
      * @minVersion 22.5
      * @deprecated
      */
    var mode: js.UndefOr[BlendMode] = js.undefined
    
    /**
      * Name of the newly created layer. If no value is provided,
      * then a name will be generated following the template, "Layer #".
      * @default -
      * @minVersion 22.5
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Opacity of the newly created layer or group.
      *
      * @default 100
      * @minVersion 22.5
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object LayerCreateOptionsBase {
    
    inline def apply(): LayerCreateOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerCreateOptionsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerCreateOptionsBase] (val x: Self) extends AnyVal {
      
      inline def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
      
      inline def setColor(value: LabelColors): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setMode(value: BlendMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait PixelLayerCreateOptions
    extends StObject
       with LayerCreateOptionsBase
       with LayerCreateOptions {
    
    /**
      * Whether to fill the layer with a neutral color when applying Blend Mode.
      *
      * @default false
      * @minVersion 22.5
      */
    var fillNeutral: js.UndefOr[Boolean] = js.undefined
  }
  object PixelLayerCreateOptions {
    
    inline def apply(): PixelLayerCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PixelLayerCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PixelLayerCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setFillNeutral(value: Boolean): Self = StObject.set(x, "fillNeutral", value.asInstanceOf[js.Any])
      
      inline def setFillNeutralUndefined: Self = StObject.set(x, "fillNeutral", js.undefined)
    }
  }
  
  trait TextLayerCreateOptions
    extends StObject
       with LayerCreateOptionsBase {
    
    /**
      * Text content of the newly created text layer.
      * @default "Lorem Ipsum"
      * @minVersion 24.2
      */
    var contents: js.UndefOr[String] = js.undefined
    
    /**
      * Font PostScript name of the newly created text layer.
      * @default "MyriadPro-Regular"
      * @minVersion 24.2
      */
    var fontName: js.UndefOr[String] = js.undefined
    
    /**
      * Font size of the newly created text layer in pixels.
      * @default 12px
      * @minVersion 24.2
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Insertion coordinates of the newly created text layer, in pixels
      * @default document center.
      * @minVersion 24.2
      */
    var position: js.UndefOr[X] = js.undefined
    
    /**
      * Text color of the newly created text layer.
      * @default black
      * @minVersion 24.2
      */
    var textColor: js.UndefOr[SolidColor] = js.undefined
  }
  object TextLayerCreateOptions {
    
    inline def apply(): TextLayerCreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextLayerCreateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextLayerCreateOptions] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTextColor(value: SolidColor): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
