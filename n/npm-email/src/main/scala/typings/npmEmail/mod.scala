package typings.npmEmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(username: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
