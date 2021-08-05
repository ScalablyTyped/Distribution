package typings.pkijs

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revokedCertificateMod {
  
  @JSImport("pkijs/src/RevokedCertificate", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RevokedCertificate {
    def this(params: js.Any) = this()
    
    /* CompleteClass */
    var crlEntryExtensions: typings.pkijs.extensionsMod.default = js.native
    
    /* CompleteClass */
    override def fromSchema(schema: js.Any): Unit = js.native
    
    /* CompleteClass */
    var revocationDate: typings.pkijs.timeMod.default = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
    
    /* CompleteClass */
    override def toSchema(): js.Any = js.native
    
    /* CompleteClass */
    var userCertificate: Integer = js.native
  }
  /* static members */
  object default {
    
    @JSImport("pkijs/src/RevokedCertificate", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultValues(memberName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def schema(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[js.Any]
    inline def schema(parameters: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait RevokedCertificate extends StObject {
    
    var crlEntryExtensions: typings.pkijs.extensionsMod.default
    
    def fromSchema(schema: js.Any): Unit
    
    var revocationDate: typings.pkijs.timeMod.default
    
    def toJSON(): js.Any
    
    def toSchema(): js.Any
    
    var userCertificate: Integer
  }
  object RevokedCertificate {
    
    inline def apply(
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
    
    extension [Self <: RevokedCertificate](x: Self) {
      
      inline def setCrlEntryExtensions(value: typings.pkijs.extensionsMod.default): Self = StObject.set(x, "crlEntryExtensions", value.asInstanceOf[js.Any])
      
      inline def setFromSchema(value: js.Any => Unit): Self = StObject.set(x, "fromSchema", js.Any.fromFunction1(value))
      
      inline def setRevocationDate(value: typings.pkijs.timeMod.default): Self = StObject.set(x, "revocationDate", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToSchema(value: () => js.Any): Self = StObject.set(x, "toSchema", js.Any.fromFunction0(value))
      
      inline def setUserCertificate(value: Integer): Self = StObject.set(x, "userCertificate", value.asInstanceOf[js.Any])
    }
  }
}
