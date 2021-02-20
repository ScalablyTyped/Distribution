package typings.md5File

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("md5-file/promise", JSImport.Namespace)
  @js.native
  def apply(filename: String): js.Promise[String] = js.native
  
  @JSImport("md5-file/promise", "sync")
  @js.native
  def sync(filename: String): String = js.native
}
