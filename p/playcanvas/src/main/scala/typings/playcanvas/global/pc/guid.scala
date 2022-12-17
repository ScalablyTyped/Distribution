package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guid {
  
  @JSGlobal("pc.guid")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[String]
}
