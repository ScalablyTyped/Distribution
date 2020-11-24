package typings.md5File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("md5-file/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  
  def apply(filename: String): js.Promise[String] = js.native
  
  def sync(filename: String): String = js.native
}
