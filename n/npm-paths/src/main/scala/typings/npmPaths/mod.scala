package typings.npmPaths

import typings.npmPaths.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(cwd: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(cwd: Cwd): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("npm-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
