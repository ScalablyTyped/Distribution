package typings.mjmlValidator

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mjmlCore.mod.Component
import typings.mjmlCore.mod.MJMLJsonObject
import typings.mjmlCore.mod.MJMLParseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mjml-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignDependencies(target: MJMLDependenciesObject, sources: MJMLDependenciesObject*): MJMLDependenciesObject = ^.asInstanceOf[js.Dynamic].applyDynamic("assignDependencies")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[MJMLDependenciesObject]
  
  @JSImport("mjml-validator", "dependencies")
  @js.native
  val dependencies: MJMLDependenciesObject = js.native
  
  inline def formatValidationError(message: String, element: MJMLJsonObject): MJMLParseError = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValidationError")(message.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[MJMLParseError]
  
  inline def registerDependencies(source: MJMLDependenciesObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDependencies")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerRule(rule: MJMLValidationRule): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRule")(rule.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def registerRule(rule: MJMLValidationRule, name: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerRule")(rule.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  type MJMLDependenciesObject = StringDictionary[js.Array[String | js.RegExp]]
  
  type MJMLInitializeType = js.Function1[/* spec */ String, MJMLTypeChecker]
  
  trait MJMLType extends StObject {
    
    def getErrorMessage(): js.UndefOr[String]
    
    def getValue(): String
    
    def isValid(): Boolean
  }
  object MJMLType {
    
    inline def apply(getErrorMessage: () => js.UndefOr[String], getValue: () => String, isValid: () => Boolean): MJMLType = {
      val __obj = js.Dynamic.literal(getErrorMessage = js.Any.fromFunction0(getErrorMessage), getValue = js.Any.fromFunction0(getValue), isValid = js.Any.fromFunction0(isValid))
      __obj.asInstanceOf[MJMLType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MJMLType] (val x: Self) extends AnyVal {
      
      inline def setGetErrorMessage(value: () => js.UndefOr[String]): Self = StObject.set(x, "getErrorMessage", js.Any.fromFunction0(value))
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    }
  }
  
  type MJMLTypeChecker = Instantiable1[/* value */ String, MJMLType]
  
  type MJMLValidationRule = js.Function2[
    /* element */ MJMLJsonObject, 
    /* options */ MJMLValidatorOptions, 
    js.UndefOr[MJMLParseError | js.Array[MJMLParseError] | Unit]
  ]
  
  trait MJMLValidatorOptions extends StObject {
    
    var components: StringDictionary[js.UndefOr[Component]]
    
    var dependencies: MJMLDependenciesObject
    
    def initializeType(spec: String): MJMLTypeChecker
    @JSName("initializeType")
    var initializeType_Original: MJMLInitializeType
    
    var skipElements: js.Array[String]
  }
  object MJMLValidatorOptions {
    
    inline def apply(
      components: StringDictionary[js.UndefOr[Component]],
      dependencies: MJMLDependenciesObject,
      initializeType: /* spec */ String => MJMLTypeChecker,
      skipElements: js.Array[String]
    ): MJMLValidatorOptions = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], initializeType = js.Any.fromFunction1(initializeType), skipElements = skipElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[MJMLValidatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MJMLValidatorOptions] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: StringDictionary[js.UndefOr[Component]]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: MJMLDependenciesObject): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setInitializeType(value: /* spec */ String => MJMLTypeChecker): Self = StObject.set(x, "initializeType", js.Any.fromFunction1(value))
      
      inline def setSkipElements(value: js.Array[String]): Self = StObject.set(x, "skipElements", value.asInstanceOf[js.Any])
      
      inline def setSkipElementsVarargs(value: String*): Self = StObject.set(x, "skipElements", js.Array(value*))
    }
  }
}
