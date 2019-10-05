package typings.plottable.plottableMod.Utils

import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils.Color")
@js.native
object Color extends js.Object {
  def colorTest(colorTester: SimpleSelection[_], className: String): String = js.native
  def contrast(a: String, b: String): Double = js.native
  def lightenColor(color: String, factor: Double): String = js.native
}

