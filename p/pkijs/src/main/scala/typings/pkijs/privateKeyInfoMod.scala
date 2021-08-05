package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateKeyInfoMod {
  
  @JSImport("pkijs/src/PrivateKeyInfo", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PrivateKeyInfo {
    def this(params: js.Any) = this()
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    /* CompleteClass */
    override def fromJSON(json: JsonWebKey): Unit = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var privateKey: OctetString = js.native
    
    /* CompleteClass */
    var privateKeyAlgorithm: typings.pkijs.algorithmIdentifierMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var version: Double = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/PrivateKeyInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait PrivateKeyInfo extends StObject {
    
    var attributes: js.UndefOr[js.Array[typings.pkijs.attributeMod.default]] = js.undefined
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit
    
    def fromSchema(schema: js.Any): Unit
    
    var parsedKey: js.UndefOr[typings.pkijs.ecprivatekeyMod.default | typings.pkijs.rsaprivatekeyMod.default] = js.undefined
    
    var privateKey: OctetString
    
    var privateKeyAlgorithm: typings.pkijs.algorithmIdentifierMod.default
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var version: Double
  }
  object PrivateKeyInfo {
    
    inline def apply(
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
    
    extension [Self <: PrivateKeyInfo](x: Self) {
      
      inline def setAttributes(value: js.Array[typings.pkijs.attributeMod.default]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.pkijs.attributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setParsedKey(value: typings.pkijs.ecprivatekeyMod.default | typings.pkijs.rsaprivatekeyMod.default): Self = StObject.set(x, "parsedKey", value.asInstanceOf[js.Any])
      
      inline def setParsedKeyUndefined: Self = StObject.set(x, "parsedKey", js.undefined)
      
      inline def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyAlgorithm(value: typings.pkijs.algorithmIdentifierMod.default): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
