package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeMod {
  
  @JSImport("ol/size", "buffer")
  @js.native
  def buffer(size: Size, num: Double): Size = js.native
  @JSImport("ol/size", "buffer")
  @js.native
  def buffer(size: Size, num: Double, opt_size: Size): Size = js.native
  
  @JSImport("ol/size", "hasArea")
  @js.native
  def hasArea(size: Size): Boolean = js.native
  
  @JSImport("ol/size", "scale")
  @js.native
  def scale(size: Size, ratio: Double): Size = js.native
  @JSImport("ol/size", "scale")
  @js.native
  def scale(size: Size, ratio: Double, opt_size: Size): Size = js.native
  
  @JSImport("ol/size", "toSize")
  @js.native
  def toSize(size: Double): Size = js.native
  @JSImport("ol/size", "toSize")
  @js.native
  def toSize(size: Double, opt_size: Size): Size = js.native
  @JSImport("ol/size", "toSize")
  @js.native
  def toSize(size: Size): Size = js.native
  @JSImport("ol/size", "toSize")
  @js.native
  def toSize(size: Size, opt_size: Size): Size = js.native
  
  type Size = js.Tuple2[Double, Double]
}
