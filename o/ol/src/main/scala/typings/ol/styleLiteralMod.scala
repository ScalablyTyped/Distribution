package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleLiteralMod {
  
  object SymbolType {
    
    @JSImport("ol/style/literal", "SymbolType.CIRCLE")
    @js.native
    val CIRCLE: String = js.native
    
    @JSImport("ol/style/literal", "SymbolType.IMAGE")
    @js.native
    val IMAGE: String = js.native
    
    @JSImport("ol/style/literal", "SymbolType.SQUARE")
    @js.native
    val SQUARE: String = js.native
    
    @JSImport("ol/style/literal", "SymbolType.TRIANGLE")
    @js.native
    val TRIANGLE: String = js.native
  }
  type SymbolType = String
  
  type ExpressionValue = typings.ol.styleExpressionsMod.ExpressionValue
  
  trait LiteralStyle extends StObject {
    
    /**
      * Filter expression. If it resolves to a number strictly greater than 0, the
      * point will be displayed. If undefined, all points will show.
      */
    var filter: js.UndefOr[typings.ol.styleExpressionsMod.ExpressionValue] = js.undefined
    
    /**
      * Symbol representation.
      */
    var symbol: js.UndefOr[LiteralSymbolStyle] = js.undefined
    
    /**
      * Style variables; each variable must hold a number.
      * Note: **this object is meant to be mutated**: changes to the values will immediately be visible on the rendered features
      */
    var variables: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object LiteralStyle {
    
    inline def apply(): LiteralStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiteralStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiteralStyle] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: typings.ol.styleExpressionsMod.ExpressionValue): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: (Any | Double)*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setSymbol(value: LiteralSymbolStyle): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setVariables(value: StringDictionary[Double]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait LiteralSymbolStyle extends StObject {
    
    /**
      * Color used for the representation (either fill, line or symbol).
      */
    var color: js.UndefOr[String | Color | js.Array[typings.ol.styleExpressionsMod.ExpressionValue]] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loading `src`.
      */
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    /**
      * Offset on X and Y axis for symbols. If not specified, the symbol will be centered.
      */
    var offset: js.UndefOr[js.Array[typings.ol.styleExpressionsMod.ExpressionValue]] = js.undefined
    
    /**
      * Opacity.
      */
    var opacity: js.UndefOr[typings.ol.styleExpressionsMod.ExpressionValue] = js.undefined
    
    /**
      * Specify whether the symbol must rotate with the view or stay upwards.
      */
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Symbol rotation in radians.
      */
    var rotation: js.UndefOr[typings.ol.styleExpressionsMod.ExpressionValue] = js.undefined
    
    /**
      * Size, mandatory.
      */
    var size: ExpressionValue | js.Array[ExpressionValue]
    
    /**
      * Path to the image to be used for the symbol. Only required with `symbolType: 'image'`.
      */
    var src: js.UndefOr[String] = js.undefined
    
    /**
      * Symbol type to use, either a regular shape or an image.
      */
    var symbolType: SymbolType
    
    /**
      * Texture coordinates. If not specified, the whole texture will be used (range for 0 to 1 on both axes).
      */
    var textureCoord: js.UndefOr[js.Array[typings.ol.styleExpressionsMod.ExpressionValue]] = js.undefined
  }
  object LiteralSymbolStyle {
    
    inline def apply(size: ExpressionValue | js.Array[ExpressionValue], symbolType: SymbolType): LiteralSymbolStyle = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralSymbolStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiteralSymbolStyle] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String | Color | js.Array[typings.ol.styleExpressionsMod.ExpressionValue]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: (Double | typings.ol.styleExpressionsMod.ExpressionValue)*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setOffset(value: js.Array[typings.ol.styleExpressionsMod.ExpressionValue]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: typings.ol.styleExpressionsMod.ExpressionValue*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOpacity(value: typings.ol.styleExpressionsMod.ExpressionValue): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(value: (Any | Double)*): Self = StObject.set(x, "opacity", js.Array(value*))
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: typings.ol.styleExpressionsMod.ExpressionValue): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setRotationVarargs(value: (Any | Double)*): Self = StObject.set(x, "rotation", js.Array(value*))
      
      inline def setSize(value: ExpressionValue | js.Array[ExpressionValue]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeVarargs(value: (Any | Double | ExpressionValue)*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSymbolType(value: SymbolType): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      inline def setTextureCoord(value: js.Array[typings.ol.styleExpressionsMod.ExpressionValue]): Self = StObject.set(x, "textureCoord", value.asInstanceOf[js.Any])
      
      inline def setTextureCoordUndefined: Self = StObject.set(x, "textureCoord", js.undefined)
      
      inline def setTextureCoordVarargs(value: typings.ol.styleExpressionsMod.ExpressionValue*): Self = StObject.set(x, "textureCoord", js.Array(value*))
    }
  }
}
