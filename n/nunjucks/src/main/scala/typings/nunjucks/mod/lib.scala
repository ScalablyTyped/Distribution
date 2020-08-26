package typings.nunjucks.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "lib")
@js.native
object lib extends js.Object {
  @js.native
  class TemplateError protected () extends Error {
    def this(message: String, lineno: Double, colno: Double) = this()
    var cause: js.UndefOr[Error] = js.native
    var colno: Double = js.native
    var lineno: Double = js.native
    @JSName("stack")
    var stack_TemplateError: String = js.native
  }
  
}

