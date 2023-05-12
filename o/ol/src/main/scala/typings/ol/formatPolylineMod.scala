package typings.ol

import typings.ol.formatFeatureMod.WriteOptions
import typings.ol.geomGeometryMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatPolylineMod {
  
  @JSImport("ol/format/Polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {Object} Options
    * @property {number} [factor=1e5] The factor by which the coordinates values will be scaled.
    * @property {import("../geom/Geometry.js").GeometryLayout} [geometryLayout='XY'] Layout of the
    * feature geometries created by the format reader.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the Encoded
    * Polyline Algorithm Format.
    *
    * When reading features, the coordinates are assumed to be in two dimensions
    * and in [latitude, longitude] order.
    *
    * As Polyline sources contain a single feature,
    * {@link module:ol/format/Polyline~Polyline#readFeatures} will return the
    * feature in an array.
    *
    * @api
    */
  @JSImport("ol/format/Polyline", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Optional configuration object.
    */
  open class default () extends Polyline {
    def this(options: Options) = this()
  }
  
  inline def decodeDeltas(encoded: String, stride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeDeltas")(encoded.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def decodeDeltas(encoded: String, stride: Double, factor: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeDeltas")(encoded.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def decodeFloats(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloats")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def decodeFloats(encoded: String, factor: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloats")(encoded.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def decodeSignedIntegers(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSignedIntegers")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def decodeUnsignedIntegers(encoded: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsignedIntegers")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def encodeDeltas(numbers: js.Array[Double], stride: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDeltas")(numbers.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeDeltas(numbers: js.Array[Double], stride: Double, factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDeltas")(numbers.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeFloats(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeFloats")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeFloats(numbers: js.Array[Double], factor: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFloats")(numbers.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeSignedIntegers(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSignedIntegers")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUnsignedInteger(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnsignedInteger")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeUnsignedIntegers(numbers: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnsignedIntegers")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * The factor by which the coordinates values will be scaled.
      */
    var factor: js.UndefOr[Double] = js.undefined
    
    /**
      * Layout of the
      * feature geometries created by the format reader.
      */
    var geometryLayout: js.UndefOr[GeometryLayout] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setGeometryLayout(value: GeometryLayout): Self = StObject.set(x, "geometryLayout", value.asInstanceOf[js.Any])
      
      inline def setGeometryLayoutUndefined: Self = StObject.set(x, "geometryLayout", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} [factor=1e5] The factor by which the coordinates values will be scaled.
    * @property {import("../geom/Geometry.js").GeometryLayout} [geometryLayout='XY'] Layout of the
    * feature geometries created by the format reader.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the Encoded
    * Polyline Algorithm Format.
    *
    * When reading features, the coordinates are assumed to be in two dimensions
    * and in [latitude, longitude] order.
    *
    * As Polyline sources contain a single feature,
    * {@link module:ol/format/Polyline~Polyline#readFeatures} will return the
    * feature in an array.
    *
    * @api
    */
  @js.native
  trait Polyline
    extends typings.ol.formatTextFeatureMod.default {
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_Polyline: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var factor_ : Any = js.native
    
    /**
      * @private
      * @type {import("../geom/Geometry.js").GeometryLayout}
      */
    /* private */ var geometryLayout_ : Any = js.native
    
    /**
      * @param {LineString} geometry Geometry.
      * @param {import("./Feature.js").WriteOptions} [options] Write options.
      * @protected
      * @return {string} Text.
      */
    /* protected */ def writeGeometryText(geometry: typings.ol.geomLineStringMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typings.ol.geomLineStringMod.default, options: WriteOptions): String = js.native
  }
}
