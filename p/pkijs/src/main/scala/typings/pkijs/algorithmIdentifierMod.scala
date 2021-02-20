package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmIdentifierMod {
  
  @JSImport("pkijs/src/AlgorithmIdentifier", JSImport.Default)
  @js.native
  class default () extends AlgorithmIdentifier {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/AlgorithmIdentifier", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/AlgorithmIdentifier", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/AlgorithmIdentifier", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/AlgorithmIdentifier", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait AlgorithmIdentifier extends StObject {
    
    var algorithmId: String = js.native
    
    var algorithmParams: js.Any = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Check that two "AlgorithmIdentifiers" are equal
      * @param {AlgorithmIdentifier} algorithmIdentifier
      * @returns {boolean}
      */
    def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object AlgorithmIdentifier {
    
    @scala.inline
    def apply(
      algorithmId: String,
      algorithmParams: js.Any,
      fromSchema: js.Any => Unit,
      isEqual: AlgorithmIdentifier => Boolean,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): AlgorithmIdentifier = {
      val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], algorithmParams = algorithmParams.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), isEqual = js.Any.fromFunction1(isEqual), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[AlgorithmIdentifier]
    }
    
    @scala.inline
    implicit class AlgorithmIdentifierMutableBuilder[Self <: AlgorithmIdentifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithmId(value: String): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmParams(value: js.Any): Self = StObject.set(x, "algorithmParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEqual(value: AlgorithmIdentifier => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
