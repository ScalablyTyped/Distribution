package typings.metricSuffix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def metricSuffix(value: Double): String = js.Dynamic.global.applyDynamic("metric_suffix")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def metricSuffix(value: Double, precision: Double): String = (js.Dynamic.global.applyDynamic("metric_suffix")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
}
