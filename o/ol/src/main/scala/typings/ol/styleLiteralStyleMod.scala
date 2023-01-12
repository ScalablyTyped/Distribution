package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleLiteralStyleMod {
  
  @js.native
  sealed trait SymbolType extends StObject
  @JSImport("ol/style/LiteralStyle", "SymbolType")
  @js.native
  object SymbolType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SymbolType & String] = js.native
    
    @js.native
    sealed trait CIRCLE
      extends StObject
         with SymbolType
    /* "circle" */ val CIRCLE: typings.ol.styleLiteralStyleMod.SymbolType.CIRCLE & String = js.native
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with SymbolType
    /* "image" */ val IMAGE: typings.ol.styleLiteralStyleMod.SymbolType.IMAGE & String = js.native
    
    @js.native
    sealed trait SQUARE
      extends StObject
         with SymbolType
    /* "square" */ val SQUARE: typings.ol.styleLiteralStyleMod.SymbolType.SQUARE & String = js.native
    
    @js.native
    sealed trait TRIANGLE
      extends StObject
         with SymbolType
    /* "triangle" */ val TRIANGLE: typings.ol.styleLiteralStyleMod.SymbolType.TRIANGLE & String = js.native
  }
  
  type ExpressionValue = typings.ol.styleExpressionsMod.ExpressionValue
  
  trait LiteralStyle extends StObject {
    
    var filter: js.UndefOr[ExpressionValue] = js.undefined
    
    var symbol: js.UndefOr[LiteralSymbolStyle] = js.undefined
    
    var variables: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object LiteralStyle {
    
    inline def apply(): LiteralStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiteralStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiteralStyle] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: ExpressionValue): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: (Any | Double)*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setSymbol(value: LiteralSymbolStyle): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setVariables(value: StringDictionary[Double]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait LiteralSymbolStyle extends StObject {
    
    var color: js.UndefOr[Color | js.Array[ExpressionValue] | String] = js.undefined
    
    var offset: js.UndefOr[js.Array[ExpressionValue]] = js.undefined
    
    var opacity: js.UndefOr[ExpressionValue] = js.undefined
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[ExpressionValue] = js.undefined
    
    var size: ExpressionValue | js.Array[ExpressionValue]
    
    var src: js.UndefOr[String] = js.undefined
    
    var symbolType: SymbolType
    
    var textureCoord: js.UndefOr[js.Array[ExpressionValue]] = js.undefined
  }
  object LiteralSymbolStyle {
    
    inline def apply(size: ExpressionValue | js.Array[ExpressionValue], symbolType: SymbolType): LiteralSymbolStyle = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralSymbolStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiteralSymbolStyle] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color | js.Array[ExpressionValue] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: (Double | ExpressionValue)*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setOffset(value: js.Array[ExpressionValue]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: ExpressionValue*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOpacity(value: ExpressionValue): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(value: (Any | Double)*): Self = StObject.set(x, "opacity", js.Array(value*))
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: ExpressionValue): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setRotationVarargs(value: (Any | Double)*): Self = StObject.set(x, "rotation", js.Array(value*))
      
      inline def setSize(value: ExpressionValue | js.Array[ExpressionValue]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeVarargs(value: (Any | Double | ExpressionValue)*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSymbolType(value: SymbolType): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      inline def setTextureCoord(value: js.Array[ExpressionValue]): Self = StObject.set(x, "textureCoord", value.asInstanceOf[js.Any])
      
      inline def setTextureCoordUndefined: Self = StObject.set(x, "textureCoord", js.undefined)
      
      inline def setTextureCoordVarargs(value: ExpressionValue*): Self = StObject.set(x, "textureCoord", js.Array(value*))
    }
  }
}
