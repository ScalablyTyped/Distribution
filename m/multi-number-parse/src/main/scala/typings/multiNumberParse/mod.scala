package typings.multiNumberParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multi-number-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(input: String, standardDecSep: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], standardDecSep.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(input: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(input: Double, standardDecSep: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], standardDecSep.asInstanceOf[js.Any])).asInstanceOf[Double]
}
