package typings.objectKeys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(`object`: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("object-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shim(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shim")().asInstanceOf[js.Any]
}
