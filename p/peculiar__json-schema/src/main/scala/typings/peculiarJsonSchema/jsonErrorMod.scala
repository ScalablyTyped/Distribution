package typings.peculiarJsonSchema

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/errors/json_error", JSImport.Namespace)
@js.native
object jsonErrorMod extends js.Object {
  @js.native
  class JsonError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, innerError: Error) = this()
    var innerError: js.UndefOr[Error] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

