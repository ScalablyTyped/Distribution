package typings.nanoid

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomBrowserMod {
  
  inline def apply(bytes: Double): js.Promise[Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8Array]]
  
  @JSImport("nanoid/async/random-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
