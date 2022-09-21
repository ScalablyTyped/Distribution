package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Focus
  extends StObject
     with Nvd3Element {
  
  def brushExtent(): js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])] = js.native
  def brushExtent(value: js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]): this.type = js.native
  
  def color(func: js.Function2[/* d */ Any, /* i */ Double, String]): this.type = js.native
  def color(value: js.Array[String]): this.type = js.native
  
  def duration(): Double = js.native
  def duration(value: Double): this.type = js.native
  
  def height(): Double = js.native
  def height(value: Double): this.type = js.native
  
  def interpolate(): String = js.native
  def interpolate(value: String): this.type = js.native
  
  def margin(): Margin = js.native
  def margin(value: Margin): this.type = js.native
  
  def rightAlignYAxis(): Boolean = js.native
  def rightAlignYAxis(value: Boolean): this.type = js.native
  
  def showXAxis(): Boolean = js.native
  def showXAxis(value: Boolean): this.type = js.native
  
  def showYAxis(): Boolean = js.native
  def showYAxis(value: Boolean): this.type = js.native
  
  def syncBrushing(): Boolean = js.native
  def syncBrushing(value: Boolean): this.type = js.native
  
  def width(): Double = js.native
  def width(value: Double): this.type = js.native
  
  def x(): js.Function1[/* d */ Any, Any] = js.native
  def x(func: js.Function1[/* d */ Any, Any]): this.type = js.native
  
  def xTickFormat(): js.Function1[/* d */ Any, String] = js.native
  def xTickFormat(format: String): this.type = js.native
  def xTickFormat(format: js.Function1[/* t */ Any, String]): this.type = js.native
  def xTickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
  
  def y(): js.Function1[/* d */ Any, Double] = js.native
  def y(func: js.Function1[/* d */ Any, Double]): this.type = js.native
  
  def yTickFormat(): js.Function1[/* d */ Any, String] = js.native
  def yTickFormat(format: String): this.type = js.native
  def yTickFormat(format: js.Function1[/* t */ Any, String]): this.type = js.native
  def yTickFormat(format: js.Function2[/* d */ Any, /* i */ Any, String]): this.type = js.native
}
