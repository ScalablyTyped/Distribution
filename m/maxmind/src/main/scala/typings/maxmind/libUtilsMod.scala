package typings.maxmind

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  object default {
    
    @JSImport("maxmind/lib/utils", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def concat2(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("concat2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def concat3(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("concat3")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def concat4(a: Double, b: Double, c: Double, d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("concat4")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("maxmind/lib/utils", "default.legacyErrorMessage")
    @js.native
    def legacyErrorMessage: String = js.native
    inline def legacyErrorMessage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legacyErrorMessage")(x.asInstanceOf[js.Any])
  }
}
