package typings.mu2.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mu2", "compileText")
@js.native
object compileText extends js.Object {
  
  def apply(name: String, template: String): IParsed = js.native
  def apply(
    name: String,
    template: String,
    callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]
  ): Unit = js.native
  def apply(template: String): IParsed = js.native
}
