package typings.pkijs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateKeyUsagePeriodMod {
  
  @JSImport("pkijs/src/PrivateKeyUsagePeriod", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PrivateKeyUsagePeriod {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PrivateKeyUsagePeriod", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PrivateKeyUsagePeriod extends StObject {
    
    def fromSchema(schema: js.Any): Unit
    
    var notAfter: js.UndefOr[Date] = js.undefined
    
    var notBefore: js.UndefOr[Date] = js.undefined
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
  }
  object PrivateKeyUsagePeriod {
    
    @scala.inline
    def apply(fromSchema: js.Any => Unit, toJSON: () => js.Any, toSchema: () => js.Any): PrivateKeyUsagePeriod = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PrivateKeyUsagePeriod]
    }
    
    @scala.inline
    implicit class PrivateKeyUsagePeriodMutableBuilder[Self <: PrivateKeyUsagePeriod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotAfter(value: Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
      
      @scala.inline
      def setNotBefore(value: Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
