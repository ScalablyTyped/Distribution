package typings.mu2.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mu2", "compile")
@js.native
object compile extends js.Object {
  
  def apply(filename: String, callback: js.Function2[/* err */ Error, /* parsed */ IParsed, Unit]): Unit = js.native
}
