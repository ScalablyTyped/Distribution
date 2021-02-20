package typings.md5File

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("md5-file", JSImport.Namespace)
  @js.native
  def apply(filename: String, cb: js.Function2[/* err */ Error, /* hash */ String, Unit]): Unit = js.native
  
  @JSImport("md5-file", "sync")
  @js.native
  def sync(filename: String): String = js.native
}
