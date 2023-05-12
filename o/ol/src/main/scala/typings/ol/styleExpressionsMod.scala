package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.colorMod.Color
import typings.ol.olStrings.u_paletteTextures
import typings.ol.webglPaletteTextureMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleExpressionsMod {
  
  @JSImport("ol/style/expressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/style/expressions", "PALETTE_TEXTURE_ARRAY")
  @js.native
  val PALETTE_TEXTURE_ARRAY: u_paletteTextures = js.native
  
  object ValueTypes {
    
    @JSImport("ol/style/expressions", "ValueTypes.ANY")
    @js.native
    val ANY: Double = js.native
    
    @JSImport("ol/style/expressions", "ValueTypes.BOOLEAN")
    @js.native
    val BOOLEAN: Double = js.native
    
    @JSImport("ol/style/expressions", "ValueTypes.COLOR")
    @js.native
    val COLOR: Double = js.native
    
    @JSImport("ol/style/expressions", "ValueTypes.NONE")
    @js.native
    val NONE: Double = js.native
    
    @JSImport("ol/style/expressions", "ValueTypes.NUMBER")
    @js.native
    val NUMBER: Double = js.native
    
    @JSImport("ol/style/expressions", "ValueTypes.NUMBER_ARRAY")
    @js.native
    val NUMBER_ARRAY: Double = js.native
    
    @JSImport("ol/style/expressions", "ValueTypes.STRING")
    @js.native
    val STRING: Double = js.native
  }
  type ValueTypes = Double
  
  inline def arrayToGlsl(array: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToGlsl")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def colorToGlsl(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToGlsl")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def colorToGlsl(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToGlsl")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def expressionToGlsl(context: ParsingContext, value: ExpressionValue): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToGlsl")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def expressionToGlsl(context: ParsingContext, value: ExpressionValue, typeHint: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToGlsl")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], typeHint.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStringNumberEquivalent(context: ParsingContext, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringNumberEquivalent")(context.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getValueType(value: ExpressionValue): ValueTypes | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(value.asInstanceOf[js.Any]).asInstanceOf[ValueTypes | Double]
  
  inline def isTypeUnique(valueType: Double | ValueTypes): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeUnique")(valueType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def numberToGlsl(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToGlsl")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToGlsl(context: ParsingContext, string: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToGlsl")(context.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def uniformNameForVariable(variableName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uniformNameForVariable")(variableName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ExpressionValue = js.Array[Any] | Color | String | Double | Boolean
  
  @js.native
  trait Operator extends StObject {
    
    /**
      * Returns one or several types
      */
    def getReturnType(arg0: js.Array[ExpressionValue]): ValueTypes | Double = js.native
    
    /**
      * Returns a GLSL-compatible string
      * Note: takes in an optional type hint as 3rd parameter
      */
    def toGlsl(arg0: ParsingContext, arg1: js.Array[ExpressionValue]): String = js.native
    def toGlsl(arg0: ParsingContext, arg1: js.Array[ExpressionValue], arg2: ValueTypes): String = js.native
  }
  
  trait ParsingContext extends StObject {
    
    /**
      * List of attributes used in the expression; contains **unprefixed names**
      */
    var attributes: js.Array[String]
    
    /**
      * Number of bands per pixel.
      */
    var bandCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Lookup of functions used by the style.
      */
    var functions: StringDictionary[String]
    
    /**
      * If false, means the expression output should be made for a vertex shader
      */
    var inFragmentShader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * List of palettes used by the style.
      */
    var paletteTextures: js.UndefOr[js.Array[default]] = js.undefined
    
    /**
      * This object maps all encountered string values to a number
      */
    var stringLiteralsMap: StringDictionary[Double]
    
    /**
      * List of variables used in the expression; contains **unprefixed names**
      */
    var variables: js.Array[String]
  }
  object ParsingContext {
    
    inline def apply(
      attributes: js.Array[String],
      functions: StringDictionary[String],
      stringLiteralsMap: StringDictionary[Double],
      variables: js.Array[String]
    ): ParsingContext = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], stringLiteralsMap = stringLiteralsMap.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsingContext] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setBandCount(value: Double): Self = StObject.set(x, "bandCount", value.asInstanceOf[js.Any])
      
      inline def setBandCountUndefined: Self = StObject.set(x, "bandCount", js.undefined)
      
      inline def setFunctions(value: StringDictionary[String]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setInFragmentShader(value: Boolean): Self = StObject.set(x, "inFragmentShader", value.asInstanceOf[js.Any])
      
      inline def setInFragmentShaderUndefined: Self = StObject.set(x, "inFragmentShader", js.undefined)
      
      inline def setPaletteTextures(value: js.Array[default]): Self = StObject.set(x, "paletteTextures", value.asInstanceOf[js.Any])
      
      inline def setPaletteTexturesUndefined: Self = StObject.set(x, "paletteTextures", js.undefined)
      
      inline def setPaletteTexturesVarargs(value: default*): Self = StObject.set(x, "paletteTextures", js.Array(value*))
      
      inline def setStringLiteralsMap(value: StringDictionary[Double]): Self = StObject.set(x, "stringLiteralsMap", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: js.Array[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
}
