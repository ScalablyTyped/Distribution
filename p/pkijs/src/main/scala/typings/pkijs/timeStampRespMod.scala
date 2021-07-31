package typings.pkijs

import typings.pkijs.signedDataMod.VerifyParams
import typings.pkijs.signedDataMod.VerifyResult
import typings.std.ArrayBuffer
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeStampRespMod {
  
  @JSImport("pkijs/src/TimeStampResp", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with TimeStampResp {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/TimeStampResp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    @scala.inline
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    @scala.inline
    def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @js.native
  trait TimeStampResp extends StObject {
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    /**
      * Sign current TSP Response
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
      * @returns {Promise}
      */
    def sign(privateKey: CryptoKey): js.Thenable[ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[ArrayBuffer] = js.native
    
    var status: typings.pkijs.pkistatusinfoMod.default = js.native
    
    var timeStampToken: js.UndefOr[typings.pkijs.contentInfoMod.default] = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    /**
      * Verify current TSP Response
      * @param {VerifyParams} verificationParameters Input parameters for verification
      * @returns {Promise}
      */
    def verify(verificationParameters: VerifyParams): js.Thenable[VerifyResult] = js.native
  }
}
