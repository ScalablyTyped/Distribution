package typings.parentModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parent-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[String]]
  inline def default(filePath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
