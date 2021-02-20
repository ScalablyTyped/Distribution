package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nvd3TooltipStatic extends StObject {
  
  //todo sort out use on nv.tooltip.
  def cleanup(): Unit = js.native
  
  def show(leftTop: js.Tuple2[Double, Double], content: String): Unit = js.native
  def show(leftTop: js.Tuple2[Double, Double], content: String, gravity: String): Unit = js.native
}
