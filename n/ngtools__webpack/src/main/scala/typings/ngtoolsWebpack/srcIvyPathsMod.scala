package typings.ngtoolsWebpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvyPathsMod {
  
  @JSImport("@ngtools/webpack/src/ivy/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def externalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("externalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
