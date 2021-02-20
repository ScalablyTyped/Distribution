package typings.ol

import typings.ol.featureMod.WriteOptions
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("ol/format/Polyline", JSImport.Default)
  @js.native
  class default () extends Polyline {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/format/Polyline", "decodeDeltas")
  @js.native
  def decodeDeltas(encoded: String, stride: Double): js.Array[Double] = js.native
  @JSImport("ol/format/Polyline", "decodeDeltas")
  @js.native
  def decodeDeltas(encoded: String, stride: Double, opt_factor: Double): js.Array[Double] = js.native
  
  @JSImport("ol/format/Polyline", "decodeFloats")
  @js.native
  def decodeFloats(encoded: String): js.Array[Double] = js.native
  @JSImport("ol/format/Polyline", "decodeFloats")
  @js.native
  def decodeFloats(encoded: String, opt_factor: Double): js.Array[Double] = js.native
  
  @JSImport("ol/format/Polyline", "decodeSignedIntegers")
  @js.native
  def decodeSignedIntegers(encoded: String): js.Array[Double] = js.native
  
  @JSImport("ol/format/Polyline", "decodeUnsignedIntegers")
  @js.native
  def decodeUnsignedIntegers(encoded: String): js.Array[Double] = js.native
  
  @JSImport("ol/format/Polyline", "encodeDeltas")
  @js.native
  def encodeDeltas(numbers: js.Array[Double], stride: Double): String = js.native
  @JSImport("ol/format/Polyline", "encodeDeltas")
  @js.native
  def encodeDeltas(numbers: js.Array[Double], stride: Double, opt_factor: Double): String = js.native
  
  @JSImport("ol/format/Polyline", "encodeFloats")
  @js.native
  def encodeFloats(numbers: js.Array[Double]): String = js.native
  @JSImport("ol/format/Polyline", "encodeFloats")
  @js.native
  def encodeFloats(numbers: js.Array[Double], opt_factor: Double): String = js.native
  
  @JSImport("ol/format/Polyline", "encodeSignedIntegers")
  @js.native
  def encodeSignedIntegers(numbers: js.Array[Double]): String = js.native
  
  @JSImport("ol/format/Polyline", "encodeUnsignedInteger")
  @js.native
  def encodeUnsignedInteger(num: Double): String = js.native
  
  @JSImport("ol/format/Polyline", "encodeUnsignedIntegers")
  @js.native
  def encodeUnsignedIntegers(numbers: js.Array[Double]): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var factor: js.UndefOr[Double] = js.native
    
    var geometryLayout: js.UndefOr[GeometryLayout] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
    }
  }
  
  @js.native
  trait Polyline
    extends typings.ol.textFeatureMod.default {
    
    /* protected */ def writeGeometryText(geometry: typings.ol.lineStringMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.lineStringMod.default, opt_options: WriteOptions): String = js.native
  }
}
