package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyQualifierInfoMod {
  
  @JSImport("pkijs/src/PolicyQualifierInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PolicyQualifierInfo {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var policyQualifierId: String = js.native
    
    /* CompleteClass */
    var qualifier: js.Any = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyQualifierInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PolicyQualifierInfo extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var policyQualifierId: String
    
    var qualifier: js.Any
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PolicyQualifierInfo {
    
    inline def apply(
      fromSchema: js.Any => Unit,
      policyQualifierId: String,
      qualifier: js.Any,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyQualifierInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), policyQualifierId = policyQualifierId.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyQualifierInfo]
    }
    
    extension [Self <: PolicyQualifierInfo](x: Self) {
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setPolicyQualifierId(value: String): Self = StObject.set(x, "policyQualifierId", value.asInstanceOf[js.Any])
      
      inline def setQualifier(value: js.Any): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
