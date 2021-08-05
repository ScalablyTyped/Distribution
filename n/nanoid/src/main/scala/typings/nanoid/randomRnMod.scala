package typings.nanoid

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randomRnMod {
  
  inline def apply(bytes: Double): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("nanoid/async/random-rn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
