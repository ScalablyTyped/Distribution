package typings.parents

import typings.parents.anon.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
  inline def apply(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(dir: String, opts: Platform): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(dir: Unit, opts: Platform): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("parents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
