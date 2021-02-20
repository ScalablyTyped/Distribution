package typings.pkijs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateKeyUsagePeriodMod {
  
  @JSImport("pkijs/src/PrivateKeyUsagePeriod", JSImport.Default)
  @js.native
  class default () extends PrivateKeyUsagePeriod {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PrivateKeyUsagePeriod", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PrivateKeyUsagePeriod", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PrivateKeyUsagePeriod", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PrivateKeyUsagePeriod extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var notAfter: js.UndefOr[Date] = js.native
    
    var notBefore: js.UndefOr[Date] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
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
