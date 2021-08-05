package typings.pathIsAbsolute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("path-is-absolute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def posix(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("posix")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def win32(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
