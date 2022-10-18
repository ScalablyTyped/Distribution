package typings.plottable

import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsColorUtilsMod {
  
  @JSImport("plottable/build/src/utils/colorUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def colorTest(colorTester: SimpleSelection[Any], className: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorTest")(colorTester.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def contrast(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lightenColor(color: String, factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lightenColor")(color.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[String]
}
