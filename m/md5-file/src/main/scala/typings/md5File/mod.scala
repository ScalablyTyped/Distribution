package typings.md5File

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("md5-file", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(filename: String, cb: js.Function2[/* err */ Error, /* hash */ String, Unit]): Unit = js.native
  
  def sync(filename: String): String = js.native
}
