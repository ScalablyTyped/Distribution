package typings.nodeSsha256

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-ssha256", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(hash: String, pw: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(hash.asInstanceOf[js.Any], pw.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def create(pw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pw.asInstanceOf[js.Any]).asInstanceOf[String]
}
