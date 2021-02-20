package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateKeyInfoMod {
  
  @JSImport("pkijs/src/PrivateKeyInfo", JSImport.Default)
  @js.native
  class default () extends PrivateKeyInfo {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PrivateKeyInfo", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/PrivateKeyInfo", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/PrivateKeyInfo", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait PrivateKeyInfo extends StObject {
    
    var attributes: js.UndefOr[js.Array[typings.pkijs.attributeMod.default]] = js.native
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var parsedKey: js.UndefOr[typings.pkijs.ecprivatekeyMod.default | typings.pkijs.rsaprivatekeyMod.default] = js.native
    
    var privateKey: OctetString = js.native
    
    var privateKeyAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var version: Double = js.native
  }
  object PrivateKeyInfo {
    
    @scala.inline
    def apply(
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      privateKey: OctetString,
      privateKeyAlgorithm: typings.pkijs.algorithmIdentifierMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): PrivateKeyInfo = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKeyInfo]
    }
    
    @scala.inline
    implicit class PrivateKeyInfoMutableBuilder[Self <: PrivateKeyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParsedKey(value: typings.pkijs.ecprivatekeyMod.default | typings.pkijs.rsaprivatekeyMod.default): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
