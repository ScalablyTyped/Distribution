package typings.mirada

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMiscMod {
  
  @JSImport("mirada/dist/src/util/misc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildError(e: Any): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("buildError")(e.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def msFrom(t0: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("msFrom")(t0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def resolveNodeModule(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNodeModule")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def timeFrom(t0: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFrom")(t0.asInstanceOf[js.Any]).asInstanceOf[String]
}
