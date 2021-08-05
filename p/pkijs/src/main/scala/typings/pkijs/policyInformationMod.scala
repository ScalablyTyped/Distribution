package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyInformationMod {
  
  @JSImport("pkijs/src/PolicyInformation", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PolicyInformation {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var policyIdentifier: String = js.native
    
    /**
      * Value of the TIME class
      */
    /* CompleteClass */
    var policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default] = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyInformation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PolicyInformation extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var policyIdentifier: String
    
    /**
      * Value of the TIME class
      */
    var policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default]
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PolicyInformation {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      policyIdentifier: String,
      policyQualifiers: js.Array[typings.pkijs.policyQualifierInfoMod.default],
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyInformation = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyIdentifier = policyIdentifier.asInstanceOf[js.Any], policyQualifiers = policyQualifiers.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyInformation]
    }
    
    extension [Self <: PolicyInformation](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setPolicyIdentifier(value: String): Self = StObject.set(x, "policyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPolicyQualifiers(value: js.Array[typings.pkijs.policyQualifierInfoMod.default]): Self = StObject.set(x, "policyQualifiers", value.asInstanceOf[js.Any])
      
      inline def setPolicyQualifiersVarargs(value: typings.pkijs.policyQualifierInfoMod.default*): Self = StObject.set(x, "policyQualifiers", js.Array(value :_*))
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
