package typings.pkijs

import typings.asn1js.mod.Integer
import typings.std.BufferSource
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tstinfoMod {
  
  @JSImport("pkijs/src/TSTInfo", JSImport.Default)
  @js.native
  class default () extends TSTInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/TSTInfo", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/TSTInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/TSTInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/TSTInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TSTInfo extends StObject {
    
    var accuracy: js.UndefOr[typings.pkijs.accuracyMod.default] = js.native
    
    var extensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var genTime: Date = js.native
    
    var messageImprint: typings.pkijs.messageImprintMod.default = js.native
    
    var nonce: js.UndefOr[Integer] = js.native
    
    var ordering: js.UndefOr[Boolean] = js.native
    
    var policy: String = js.native
    
    var serialNumber: Integer = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var tsa: js.UndefOr[typings.pkijs.generalNameMod.default] = js.native
    
    def verify(params: VerifyParams): js.Thenable[Boolean] = js.native
    
    var version: Double = js.native
  }
  object TSTInfo {
    
    @scala.inline
    def apply(
      fromSchema: js.Any => Unit,
      genTime: Date,
      messageImprint: typings.pkijs.messageImprintMod.default,
      policy: String,
      serialNumber: Integer,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      verify: VerifyParams => js.Thenable[Boolean],
      version: Double
    ): TSTInfo = {
      val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), verify = js.Any.fromFunction1(verify), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSTInfo]
    }
    
    @scala.inline
    implicit class TSTInfoMutableBuilder[Self <: TSTInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: typings.pkijs.accuracyMod.default): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[typings.pkijs.extensionMod.default]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: typings.pkijs.extensionMod.default*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenTime(value: Date): Self = StObject.set(x, "genTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageImprint(value: typings.pkijs.messageImprintMod.default): Self = StObject.set(x, "messageImprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: Integer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOrdering(value: Boolean): Self = StObject.set(x, "ordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderingUndefined: Self = StObject.set(x, "ordering", js.undefined)
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialNumber(value: Integer): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTsa(value: typings.pkijs.generalNameMod.default): Self = StObject.set(x, "tsa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsaUndefined: Self = StObject.set(x, "tsa", js.undefined)
      
      @scala.inline
      def setVerify(value: VerifyParams => js.Thenable[Boolean]): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VerifyParams extends StObject {
    
    var data: BufferSource = js.native
    
    var notAfter: js.UndefOr[Date] = js.native
    
    var notBefore: js.UndefOr[Date] = js.native
  }
  object VerifyParams {
    
    @scala.inline
    def apply(data: BufferSource): VerifyParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyParams]
    }
    
    @scala.inline
    implicit class VerifyParamsMutableBuilder[Self <: VerifyParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: BufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfter(value: Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
      
      @scala.inline
      def setNotBefore(value: Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    }
  }
}
