package typings.pkgVersions

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pkg-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(packageName: String): js.Promise[Set[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Set[String]]]
}
