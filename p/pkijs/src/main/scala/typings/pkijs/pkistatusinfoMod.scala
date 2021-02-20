package typings.pkijs

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Utf8String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkistatusinfoMod {
  
  @JSImport("pkijs/src/PKIStatusInfo", JSImport.Default)
  @js.native
  class default () extends PKIStatusInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/PKIStatusInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/PKIStatusInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PKIStatusInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PKIStatusInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PKIStatusInfo extends StObject {
    
    var failInfo: js.UndefOr[BitString] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var status: Double = js.native
    
    var statusStrings: js.UndefOr[Utf8String] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
  }
  object PKIStatusInfo {
    
    @scala.inline
    def apply(fromSchema: js.Any => Unit, status: Double, toJSON: () => js.Any, toSchema: () => js.Any): PKIStatusInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), status = status.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
      __obj.asInstanceOf[PKIStatusInfo]
    }
    
    @scala.inline
    implicit class PKIStatusInfoMutableBuilder[Self <: PKIStatusInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailInfo(value: BitString): Self = StObject.set(x, "failInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailInfoUndefined: Self = StObject.set(x, "failInfo", js.undefined)
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusStrings(value: Utf8String): Self = StObject.set(x, "statusStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusStringsUndefined: Self = StObject.set(x, "statusStrings", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
    }
  }
}
