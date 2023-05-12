package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompareTextMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/compareText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareText(actual: String, expected: String, options: CompareTextOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareText")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareTexts(actual: String, expected: String, options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareTexts(actual: String, expected: js.Array[String], options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareTexts(actual: js.Array[String], expected: String, options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareTexts(actual: js.Array[String], expected: js.Array[String], options: CompareTextsOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTexts")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait BaseCompareOptions extends StObject {
    
    var negate: js.UndefOr[Boolean] = js.undefined
  }
  object BaseCompareOptions {
    
    inline def apply(): BaseCompareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseCompareOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseCompareOptions] (val x: Self) extends AnyVal {
      
      inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
      
      inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
    }
  }
  
  trait CompareOptions
    extends StObject
       with CompareWithMultiplicityOptionsConcrete
       with BaseCompareOptions
  object CompareOptions {
    
    inline def apply(): CompareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompareOptions]
    }
  }
  
  trait CompareTextOptions
    extends StObject
       with BaseCompareOptions {
    
    var asCode: js.UndefOr[Boolean] = js.undefined
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    var verb: js.UndefOr[TextCompareMode] = js.undefined
  }
  object CompareTextOptions {
    
    inline def apply(): CompareTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompareTextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompareTextOptions] (val x: Self) extends AnyVal {
      
      inline def setAsCode(value: Boolean): Self = StObject.set(x, "asCode", value.asInstanceOf[js.Any])
      
      inline def setAsCodeUndefined: Self = StObject.set(x, "asCode", js.undefined)
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setVerb(value: TextCompareMode): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
      
      inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
    }
  }
  
  trait CompareTextsOptions
    extends StObject
       with CompareTextOptions
       with CompareWithMultiplicityOptionsConcrete
  object CompareTextsOptions {
    
    inline def apply(): CompareTextsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompareTextsOptions]
    }
  }
  
  trait CompareWithMultiplicityOptionsConcrete extends StObject {
    
    var multiplicity: js.UndefOr[Multiplicity] = js.undefined
  }
  object CompareWithMultiplicityOptionsConcrete {
    
    inline def apply(): CompareWithMultiplicityOptionsConcrete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompareWithMultiplicityOptionsConcrete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompareWithMultiplicityOptionsConcrete] (val x: Self) extends AnyVal {
      
      inline def setMultiplicity(value: Multiplicity): Self = StObject.set(x, "multiplicity", value.asInstanceOf[js.Any])
      
      inline def setMultiplicityUndefined: Self = StObject.set(x, "multiplicity", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.anyOf
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.allOf
  */
  trait Multiplicity extends StObject
  object Multiplicity {
    
    inline def allOf: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.allOf = "allOf".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.allOf]
    
    inline def anyOf: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.anyOf = "anyOf".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.anyOf]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.contains
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.contained
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.equals
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.startsWith
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.endsWith
  */
  trait TextCompareMode extends StObject
  object TextCompareMode {
    
    inline def contained: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.contained = "contained".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.contained]
    
    inline def contains: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.contains = "contains".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.contains]
    
    inline def endsWith: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.endsWith = "endsWith".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.endsWith]
    
    inline def equals: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.equals = "equals".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.equals]
    
    inline def startsWith: typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.startsWith = "startsWith".asInstanceOf[typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings.startsWith]
  }
}
