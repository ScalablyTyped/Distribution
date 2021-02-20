package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionsMod {
  
  @js.native
  sealed trait ValueTypes extends StObject
  @JSImport("ol/style/expressions", "ValueTypes")
  @js.native
  object ValueTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueTypes with Double] = js.native
    
    @js.native
    sealed trait ANY extends ValueTypes
    /* 31 */ val ANY: typings.ol.expressionsMod.ValueTypes.ANY with Double = js.native
    
    @js.native
    sealed trait BOOLEAN extends ValueTypes
    /* 8 */ val BOOLEAN: typings.ol.expressionsMod.ValueTypes.BOOLEAN with Double = js.native
    
    @js.native
    sealed trait COLOR extends ValueTypes
    /* 4 */ val COLOR: typings.ol.expressionsMod.ValueTypes.COLOR with Double = js.native
    
    @js.native
    sealed trait NONE extends ValueTypes
    /* 0 */ val NONE: typings.ol.expressionsMod.ValueTypes.NONE with Double = js.native
    
    @js.native
    sealed trait NUMBER extends ValueTypes
    /* 1 */ val NUMBER: typings.ol.expressionsMod.ValueTypes.NUMBER with Double = js.native
    
    @js.native
    sealed trait NUMBER_ARRAY extends ValueTypes
    /* 16 */ val NUMBER_ARRAY: typings.ol.expressionsMod.ValueTypes.NUMBER_ARRAY with Double = js.native
    
    @js.native
    sealed trait STRING extends ValueTypes
    /* 2 */ val STRING: typings.ol.expressionsMod.ValueTypes.STRING with Double = js.native
  }
  
  @JSImport("ol/style/expressions", "arrayToGlsl")
  @js.native
  def arrayToGlsl(array: js.Array[Double]): String = js.native
  
  @JSImport("ol/style/expressions", "colorToGlsl")
  @js.native
  def colorToGlsl(color: String): String = js.native
  @JSImport("ol/style/expressions", "colorToGlsl")
  @js.native
  def colorToGlsl(color: Color): String = js.native
  
  @JSImport("ol/style/expressions", "expressionToGlsl")
  @js.native
  def expressionToGlsl(context: ParsingContext, value: ExpressionValue): String = js.native
  @JSImport("ol/style/expressions", "expressionToGlsl")
  @js.native
  def expressionToGlsl(context: ParsingContext, value: ExpressionValue, typeHint: Double): String = js.native
  @JSImport("ol/style/expressions", "expressionToGlsl")
  @js.native
  def expressionToGlsl(context: ParsingContext, value: ExpressionValue, typeHint: ValueTypes): String = js.native
  
  @JSImport("ol/style/expressions", "getStringNumberEquivalent")
  @js.native
  def getStringNumberEquivalent(context: ParsingContext, string: String): Double = js.native
  
  @JSImport("ol/style/expressions", "getValueType")
  @js.native
  def getValueType(value: ExpressionValue): ValueTypes | Double = js.native
  
  @JSImport("ol/style/expressions", "isTypeUnique")
  @js.native
  def isTypeUnique(valueType: Double): Boolean = js.native
  @JSImport("ol/style/expressions", "isTypeUnique")
  @js.native
  def isTypeUnique(valueType: ValueTypes): Boolean = js.native
  
  @JSImport("ol/style/expressions", "numberToGlsl")
  @js.native
  def numberToGlsl(v: Double): String = js.native
  
  @JSImport("ol/style/expressions", "stringToGlsl")
  @js.native
  def stringToGlsl(context: ParsingContext, string: String): String = js.native
  
  type ExpressionValue = js.Array[js.Any] | Color | String | Double | Boolean
  
  @js.native
  trait Operator extends StObject {
    
    def getReturnType(p0: js.Array[ExpressionValue]): ValueTypes | Double = js.native
    
    def toGlsl(p0: ParsingContext, p1: js.Array[ExpressionValue]): String = js.native
    def toGlsl(p0: ParsingContext, p1: js.Array[ExpressionValue], p2: ValueTypes): String = js.native
  }
  
  @js.native
  trait ParsingContext extends StObject {
    
    var attributes: js.Array[String] = js.native
    
    var inFragmentShader: js.UndefOr[Boolean] = js.native
    
    var stringLiteralsMap: StringDictionary[Double] = js.native
    
    var variables: js.Array[String] = js.native
  }
  object ParsingContext {
    
    @scala.inline
    def apply(
      attributes: js.Array[String],
      stringLiteralsMap: StringDictionary[Double],
      variables: js.Array[String]
    ): ParsingContext = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], stringLiteralsMap = stringLiteralsMap.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingContext]
    }
    
    @scala.inline
    implicit class ParsingContextMutableBuilder[Self <: ParsingContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setInFragmentShader(value: Boolean): Self = StObject.set(x, "inFragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFragmentShaderUndefined: Self = StObject.set(x, "inFragmentShader", js.undefined)
      
      @scala.inline
      def setStringLiteralsMap(value: StringDictionary[Double]): Self = StObject.set(x, "stringLiteralsMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariables(value: js.Array[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
}
