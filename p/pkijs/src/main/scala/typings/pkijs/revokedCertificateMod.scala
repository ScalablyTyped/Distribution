package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revokedCertificateMod {
  
  @JSImport("pkijs/src/RevokedCertificate", JSImport.Default)
  @js.native
  class default () extends RevokedCertificate {
    def this(params: js.Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RevokedCertificate", "default.defaultValues")
    @js.native
    def defaultValues(memberName: String): js.Any = js.native
    
    @JSImport("pkijs/src/RevokedCertificate", "default.schema")
    @js.native
    def schema(): js.Any = js.native
    @JSImport("pkijs/src/RevokedCertificate", "default.schema")
    @js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
  @js.native
  trait RevokedCertificate extends StObject {
    
    var crlEntryExtensions: typings.pkijs.extensionsMod.default = js.native
    
    def fromSchema(schema: js.Any): Unit = js.native
    
    var revocationDate: typings.pkijs.timeMod.default = js.native
    
    def toJSON(): js.Any = js.native
    
    def toSchema(): js.Any = js.native
    
    var userCertificate: Integer = js.native
  }
  object RevokedCertificate {
    
    @scala.inline
    def apply(
      crlEntryExtensions: typings.pkijs.extensionsMod.default,
      fromSchema: js.Any => Unit,
      revocationDate: typings.pkijs.timeMod.default,
      toJSON: () => js.Any,
      toSchema: () => js.Any,
      userCertificate: Integer
    ): RevokedCertificate = {
      val __obj = js.Dynamic.literal(crlEntryExtensions = crlEntryExtensions.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), revocationDate = revocationDate.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), userCertificate = userCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[RevokedCertificate]
    }
    
    @scala.inline
    implicit class RevokedCertificateMutableBuilder[Self <: RevokedCertificate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrlEntryExtensions(value: typings.pkijs.extensionsMod.default): Self = StObject.set(x, "crlEntryExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRevocationDate(value: typings.pkijs.timeMod.default): Self = StObject.set(x, "revocationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUserCertificate(value: Integer): Self = StObject.set(x, "userCertificate", value.asInstanceOf[js.Any])
    }
  }
}
