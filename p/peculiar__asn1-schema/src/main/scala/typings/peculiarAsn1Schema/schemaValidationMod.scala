package typings.peculiarAsn1Schema

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaValidationMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/errors/schema_validation", "AsnSchemaValidationError")
  @js.native
  open class AsnSchemaValidationError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var schemas: js.Array[String] = js.native
  }
}
