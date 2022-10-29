package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataPow2Mod {
  
  @JSImport("@pixi/utils/lib/data/pow2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPow2(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPow2")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def log2(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nextPow2(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextPow2")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
}
