package typings.pathIsAbsolute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(path: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("path-is-absolute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def posix(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("posix")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def win32(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("win32")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
