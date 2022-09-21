package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionsMod {
  
  @JSImport("ol/style/expressions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ValueTypes extends StObject
  @JSImport("ol/style/expressions", "ValueTypes")
  @js.native
  object ValueTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueTypes & Double] = js.native
    
    @js.native
    sealed trait ANY
      extends StObject
         with ValueTypes
    /* 31 */ val ANY: typings.ol.expressionsMod.ValueTypes.ANY & Double = js.native
    
    @js.native
    sealed trait BOOLEAN
      extends StObject
         with ValueTypes
    /* 8 */ val BOOLEAN: typings.ol.expressionsMod.ValueTypes.BOOLEAN & Double = js.native
    
    @js.native
    sealed trait COLOR
      extends StObject
         with ValueTypes
    /* 4 */ val COLOR: typings.ol.expressionsMod.ValueTypes.COLOR & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with ValueTypes
    /* 0 */ val NONE: typings.ol.expressionsMod.ValueTypes.NONE & Double = js.native
    
    @js.native
    sealed trait NUMBER
      extends StObject
         with ValueTypes
    /* 1 */ val NUMBER: typings.ol.expressionsMod.ValueTypes.NUMBER & Double = js.native
    
    @js.native
    sealed trait NUMBER_ARRAY
      extends StObject
         with ValueTypes
    /* 16 */ val NUMBER_ARRAY: typings.ol.expressionsMod.ValueTypes.NUMBER_ARRAY & Double = js.native
    
    @js.native
    sealed trait STRING
      extends StObject
         with ValueTypes
    /* 2 */ val STRING: typings.ol.expressionsMod.ValueTypes.STRING & Double = js.native
  }
  
  inline def arrayToGlsl(array: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToGlsl")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def colorToGlsl(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToGlsl")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def colorToGlsl(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToGlsl")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def expressionToGlsl(context: ParsingContext, value: ExpressionValue): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToGlsl")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def expressionToGlsl(context: ParsingContext, value: ExpressionValue, typeHint: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToGlsl")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], typeHint.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def expressionToGlsl(context: ParsingContext, value: ExpressionValue, typeHint: ValueTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expressionToGlsl")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], typeHint.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStringNumberEquivalent(context: ParsingContext, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringNumberEquivalent")(context.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getValueType(value: ExpressionValue): ValueTypes | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(value.asInstanceOf[js.Any]).asInstanceOf[ValueTypes | Double]
  
  inline def isTypeUnique(valueType: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeUnique")(valueType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTypeUnique(valueType: ValueTypes): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeUnique")(valueType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def numberToGlsl(v: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToGlsl")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToGlsl(context: ParsingContext, string: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToGlsl")(context.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type ExpressionValue = js.Array[Any] | Color | String | Double | Boolean
  
  @js.native
  trait Operator extends StObject {
    
    def getReturnType(p0: js.Array[ExpressionValue]): ValueTypes | Double = js.native
    
    def toGlsl(p0: ParsingContext, p1: js.Array[ExpressionValue]): String = js.native
    def toGlsl(p0: ParsingContext, p1: js.Array[ExpressionValue], p2: ValueTypes): String = js.native
  }
  
  trait ParsingContext extends StObject {
    
    var attributes: js.Array[String]
    
    var inFragmentShader: js.UndefOr[Boolean] = js.undefined
    
    var stringLiteralsMap: StringDictionary[Double]
    
    var variables: js.Array[String]
  }
  object ParsingContext {
    
    inline def apply(
      attributes: js.Array[String],
      stringLiteralsMap: StringDictionary[Double],
      variables: js.Array[String]
    ): ParsingContext = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], stringLiteralsMap = stringLiteralsMap.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingContext]
    }
    
    extension [Self <: ParsingContext](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setInFragmentShader(value: Boolean): Self = StObject.set(x, "inFragmentShader", value.asInstanceOf[js.Any])
      
      inline def setInFragmentShaderUndefined: Self = StObject.set(x, "inFragmentShader", js.undefined)
      
      inline def setStringLiteralsMap(value: StringDictionary[Double]): Self = StObject.set(x, "stringLiteralsMap", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: js.Array[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
}
