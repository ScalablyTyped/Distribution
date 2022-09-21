package typings.popperjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@popperjs/core/lib/utils/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def max(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def min(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def round(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
