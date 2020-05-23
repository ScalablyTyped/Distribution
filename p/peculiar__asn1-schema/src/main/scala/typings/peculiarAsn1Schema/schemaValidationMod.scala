package typings.peculiarAsn1Schema

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/errors/schema_validation", JSImport.Namespace)
@js.native
object schemaValidationMod extends js.Object {
  @js.native
  class AsnSchemaValidationError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var schemas: js.Array[String] = js.native
  }
  
}

