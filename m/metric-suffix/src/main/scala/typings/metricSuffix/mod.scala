package typings.metricSuffix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("metric-suffix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
