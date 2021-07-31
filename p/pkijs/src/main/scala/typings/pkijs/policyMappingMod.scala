package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyMappingMod {
  
  @JSImport("pkijs/src/PolicyMapping", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PolicyMapping {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var issuerDomainPolicy: String = js.native
    
    /* CompleteClass */
    var subjectDomainPolicy: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PolicyMapping", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PolicyMapping extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var issuerDomainPolicy: String
    
    var subjectDomainPolicy: String
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PolicyMapping {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      issuerDomainPolicy: String,
      subjectDomainPolicy: String,
      toJSON: () => js.Any,
      toSchema: () => js.Any
    ): PolicyMapping = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), issuerDomainPolicy = issuerDomainPolicy.asInstanceOf[js.Any], subjectDomainPolicy = subjectDomainPolicy.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PolicyMapping]
    }
    
    @scala.inline
    implicit class PolicyMappingMutableBuilder[Self <: PolicyMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIssuerDomainPolicy(value: String): Self = StObject.set(x, "issuerDomainPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectDomainPolicy(value: String): Self = StObject.set(x, "subjectDomainPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
