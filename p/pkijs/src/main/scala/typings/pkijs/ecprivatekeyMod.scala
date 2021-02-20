package typings.pkijs

import typings.asn1js.mod.OctetString
import typings.std.JsonWebKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecprivatekeyMod {
  
  @JSImport("pkijs/src/ECPrivateKey", JSImport.Default)
  @js.native
  class default () extends ECPrivateKey {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/ECPrivateKey", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/ECPrivateKey", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/ECPrivateKey", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/ECPrivateKey", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait ECPrivateKey extends StObject {
    
    /**
      * Convert JSON value into current object
      * @param {JsonWebKey} json
      */
    def fromJSON(json: JsonWebKey): Unit = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var namedCurve: js.UndefOr[String] = js.native
    
    var privateKey: OctetString = js.native
    
    var publicKey: js.UndefOr[typings.pkijs.ecpublickeyMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var version: Double = js.native
  }
  object ECPrivateKey {
    
    @scala.inline
    def apply(
      fromJSON: JsonWebKey => Unit,
      fromSchema: js.Any => Unit,
      privateKey: OctetString,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      version: Double
    ): ECPrivateKey = {
      val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECPrivateKey]
    }
    
    @scala.inline
    implicit class ECPrivateKeyMutableBuilder[Self <: ECPrivateKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromJSON(value: JsonWebKey => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedCurveUndefined: Self = StObject.set(x, "namedCurve", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKey(value: typings.pkijs.ecpublickeyMod.default): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
