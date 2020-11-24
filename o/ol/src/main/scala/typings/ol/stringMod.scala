package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  
  def compareVersions(v1: String, v2: String): Double = js.native
  def compareVersions(v1: String, v2: Double): Double = js.native
  def compareVersions(v1: Double, v2: String): Double = js.native
  def compareVersions(v1: Double, v2: Double): Double = js.native
  
  def padNumber(number: Double, width: Double): String = js.native
  def padNumber(number: Double, width: Double, opt_precision: Double): String = js.native
}
