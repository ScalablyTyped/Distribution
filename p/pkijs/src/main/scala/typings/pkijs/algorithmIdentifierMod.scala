package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmIdentifierMod {
  
  @JSImport("pkijs/src/AlgorithmIdentifier", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AlgorithmIdentifier {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var algorithmId: String = js.native
    
    /* CompleteClass */
    var algorithmParams: js.Any = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Check that two "AlgorithmIdentifiers" are equal
      * @param {AlgorithmIdentifier} algorithmIdentifier
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/AlgorithmIdentifier", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait AlgorithmIdentifier extends StObject {
    
    var algorithmId: String
    
    var algorithmParams: js.Any
    
    def fromSchema(schema: js.Any): Unit
    
    /**
      * Check that two "AlgorithmIdentifiers" are equal
      * @param {AlgorithmIdentifier} algorithmIdentifier
      * @returns {boolean}
      */
    def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
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
