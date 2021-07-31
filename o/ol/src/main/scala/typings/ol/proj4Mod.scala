package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proj4Mod {
  
  @JSImport("ol/proj/proj4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def register(proj4: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(proj4.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
