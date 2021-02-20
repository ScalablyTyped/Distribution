package typings.pkijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ocsprequestMod {
  
  @JSImport("pkijs/src/OCSPRequest", JSImport.Default)
  @js.native
  class default () extends OCSPRequest {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @JSImport("pkijs/src/OCSPRequest", "default.compareWithDefault")
    @js.native
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    
    @JSImport("pkijs/src/OCSPRequest", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/OCSPRequest", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/OCSPRequest", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OCSPRequest extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var optionalSignature: js.UndefOr[typings.pkijs.signatureMod.default] = js.native
    
    var tbsRequest: typings.pkijs.tbsrequestMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Convert current object to asn1js object and set correct values
      *
      * @param {boolean} [encodeFlag]
      * @returns {*}
      */
    def toSchema(): js.Any = js.native
    def toSchema(encodeFlag: Boolean): js.Any = js.native
  }
}
