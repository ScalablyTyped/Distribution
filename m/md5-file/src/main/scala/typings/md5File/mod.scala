package typings.md5File

import org.scalablytyped.runtime.Shortcut
import typings.md5File.anon.Sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("md5-file", JSImport.Namespace)
  @js.native
  val ^ : (js.Function1[/* path */ String, js.Promise[String]]) & Sync = js.native
  
  type _To = (js.Function1[/* path */ String, js.Promise[String]]) & Sync
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* path */ String, js.Promise[String]]) & Sync = ^
}
