package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientAppIndexMod {
  
  @JSImport("next/dist/client/app-index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    @JSGlobal("__webpack_require__")
    @js.native
    val webpackRequire: Any = js.native
  }
  
  inline def hydrate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")().asInstanceOf[Unit]
}
