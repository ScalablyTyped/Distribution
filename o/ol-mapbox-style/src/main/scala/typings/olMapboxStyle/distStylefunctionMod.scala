package typings.olMapboxStyle

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStylefunctionMod {
  
  @JSImport("ol-mapbox-style/dist/stylefunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _getValue(layer: Any, layoutOrPaint: String, property: String, zoom: Double, feature: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def _getValue(
    layer: Any,
    layoutOrPaint: String,
    property: String,
    zoom: Double,
    feature: Any,
    functionCache: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], functionCache.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def _getValue(
    layer: Any,
    layoutOrPaint: String,
    property: String,
    zoom: Double,
    feature: Any,
    functionCache: Any,
    featureState: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], functionCache.asInstanceOf[js.Any], featureState.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def _getValue(
    layer: Any,
    layoutOrPaint: String,
    property: String,
    zoom: Double,
    feature: Any,
    functionCache: Unit,
    featureState: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], functionCache.asInstanceOf[js.Any], featureState.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * @private
    * @param {?} color Color.
    * @param {number} [opacity] Opacity.
    * @return {string} Color.
    */
  inline def colorWithOpacity(color: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_colorWithOpacity")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def colorWithOpacity(color: Any, opacity: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_colorWithOpacity")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @private
    * @param {string} layerId Layer id.
    * @param {?} filter Filter.
    * @param {Object} feature Feature.
    * @param {number} zoom Zoom.
    * @param {Object} [filterCache] Filter cache.
    * @return {boolean} Filter result.
    */
  inline def evaluateFilter(layerId: String, filter: Any, feature: Any, zoom: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_evaluateFilter")(layerId.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def evaluateFilter(layerId: String, filter: Any, feature: Any, zoom: Double, filterCache: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_evaluateFilter")(layerId.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], filterCache.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @private
    * @param {string} text Text.
    * @param {Object} properties Properties.
    * @return {string} Text.
    */
  inline def fromTemplate(text: String, properties: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromTemplate")(text.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStyleForLayer(
    feature: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Feature.default */ Any,
    resolution: Double,
    olLayer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_layer.VectorTile */ Any,
    layerId: String
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_style.Style */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleForLayer")(feature.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], olLayer.asInstanceOf[js.Any], layerId.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_style.Style */ Any
  ]]
  
  inline def getValue(layer: Any, layoutOrPaint: String, property: String, zoom: Double, feature: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getValue(
    layer: Any,
    layoutOrPaint: String,
    property: String,
    zoom: Double,
    feature: Any,
    functionCache: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], functionCache.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getValue(
    layer: Any,
    layoutOrPaint: String,
    property: String,
    zoom: Double,
    feature: Any,
    functionCache: Any,
    featureState: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], functionCache.asInstanceOf[js.Any], featureState.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getValue(
    layer: Any,
    layoutOrPaint: String,
    property: String,
    zoom: Double,
    feature: Any,
    functionCache: Unit,
    featureState: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(layer.asInstanceOf[js.Any], layoutOrPaint.asInstanceOf[js.Any], property.asInstanceOf[js.Any], zoom.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], functionCache.asInstanceOf[js.Any], featureState.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def recordStyleLayer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("recordStyleLayer")().asInstanceOf[Unit]
  inline def recordStyleLayer(record: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("recordStyleLayer")(record.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderTransparent(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTransparent")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stylefunction(
    olLayer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any) | VectorTileLayer,
    glStyle: String | Any,
    sourceOrLayers: String | js.Array[String],
    resolutions: js.UndefOr[js.Array[Double]],
    spriteData: js.UndefOr[Any],
    spriteImageUrl: js.UndefOr[String],
    getFonts: js.UndefOr[
      js.Function2[/* arg0 */ js.Array[String], /* arg1 */ js.UndefOr[String], js.Array[String]]
    ],
    getImage: js.UndefOr[
      js.Function2[
        /* arg0 */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any) | VectorTileLayer, 
        /* arg1 */ String, 
        js.UndefOr[HTMLImageElement | HTMLCanvasElement | String]
      ]
    ],
    args: Any*
  ): StyleFunction_ = (^.asInstanceOf[js.Dynamic].applyDynamic("stylefunction")((scala.List(olLayer.asInstanceOf[js.Any], glStyle.asInstanceOf[js.Any], sourceOrLayers.asInstanceOf[js.Any], resolutions.asInstanceOf[js.Any], spriteData.asInstanceOf[js.Any], spriteImageUrl.asInstanceOf[js.Any], getFonts.asInstanceOf[js.Any], getImage.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[StyleFunction_]
  
  type StyleFunction_ = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Style.StyleFunction */ Any
  
  type VectorLayer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Vector.default<any> */ Any
  
  type VectorTileLayer = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_VectorTile.default */ Any
}
