package typings.ol

import typings.ol.featureMod.WriteOptions
import typings.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polylineMod {
  
  @JSImport("ol/format/Polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format/Polyline", JSImport.Default)
  @js.native
  open class default () extends Polyline {
    def this(opt_options: Options) = this()
  }
  
  inline def decodeDeltas(encoded: String, stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeDeltas")(encoded.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def decodeDeltas(encoded: String, stride: Double, opt_factor: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeDeltas")(encoded.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def decodeFloats(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloats")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def decodeFloats(encoded: String, opt_factor: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloats")(encoded.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def decodeSignedIntegers(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSignedIntegers")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def decodeUnsignedIntegers(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsignedIntegers")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def encodeDeltas(numbers: js.Array[Double], stride: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDeltas")(numbers.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeDeltas(numbers: js.Array[Double], stride: Double, opt_factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDeltas")(numbers.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeFloats(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeFloats")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeFloats(numbers: js.Array[Double], opt_factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFloats")(numbers.asInstanceOf[js.Any], opt_factor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeSignedIntegers(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSignedIntegers")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUnsignedInteger(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnsignedInteger")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUnsignedIntegers(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnsignedIntegers")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
      
      inline def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
    }
  }
  
  @js.native
  trait Polyline
    extends typings.ol.textFeatureMod.default {
    
    /* protected */ def writeGeometryText(geometry: typings.ol.lineStringMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.lineStringMod.default, opt_options: WriteOptions): String = js.native
  }
}
