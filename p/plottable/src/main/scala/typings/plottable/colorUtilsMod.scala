package typings.plottable

import typings.plottable.interfacesMod.SimpleSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorUtilsMod {
  
  @JSImport("plottable/build/src/utils/colorUtils", "colorTest")
  @js.native
  def colorTest(colorTester: SimpleSelection[_], className: String): String = js.native
  
  @JSImport("plottable/build/src/utils/colorUtils", "contrast")
  @js.native
  def contrast(a: String, b: String): Double = js.native
  
  @JSImport("plottable/build/src/utils/colorUtils", "lightenColor")
  @js.native
  def lightenColor(color: String, factor: Double): String = js.native
}
