package typings.ol

import typings.ol.anon.FnCall
import typings.ol.projProjectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projProj4Mod {
  
  @JSImport("ol/proj/proj4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEPSGCode(code: String): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSGCode")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  inline def fromEPSGCode(code: Double): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSGCode")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  inline def getEPSGLookup(): js.Function1[/* arg0 */ Double, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEPSGLookup")().asInstanceOf[js.Function1[/* arg0 */ Double, js.Promise[String]]]
  
  inline def isRegistered(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegistered")().asInstanceOf[Boolean]
  
  inline def register(proj4: FnCall): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(proj4.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setEPSGLookup(func: js.Function1[/* arg0 */ Double, js.Promise[String]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEPSGLookup")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregister(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")().asInstanceOf[Unit]
}
