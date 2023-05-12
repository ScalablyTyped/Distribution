package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.featureMod.FeatureLike
import typings.ol.renderMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleStyleMod {
  
  @JSImport("ol/style/Style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A function that takes an {@link module:ol/Feature~Feature} and a `{number}`
    * representing the view's resolution. The function should return a
    * {@link module:ol/style/Style~Style} or an array of them. This way e.g. a
    * vector layer can be styled. If the function returns `undefined`, the
    * feature will not be rendered.
    *
    * @typedef {function(import("../Feature.js").FeatureLike, number):(Style|Array<Style>|void)} StyleFunction
    */
  /**
    * A {@link Style}, an array of {@link Style}, or a {@link StyleFunction}.
    * @typedef {Style|Array<Style>|StyleFunction} StyleLike
    */
  /**
    * A function that takes an {@link module:ol/Feature~Feature} as argument and returns an
    * {@link module:ol/geom/Geometry~Geometry} that will be rendered and styled for the feature.
    *
    * @typedef {function(import("../Feature.js").FeatureLike):
    *     (import("../geom/Geometry.js").default|import("../render/Feature.js").default|undefined)} GeometryFunction
    */
  /**
    * Custom renderer function. Takes two arguments:
    *
    * 1. The pixel coordinates of the geometry in GeoJSON notation.
    * 2. The {@link module:ol/render~State} of the layer renderer.
    *
    * @typedef {function((import("../coordinate.js").Coordinate|Array<import("../coordinate.js").Coordinate>|Array<Array<import("../coordinate.js").Coordinate>>),import("../render.js").State): void} RenderFunction
    */
  /**
    * @typedef {Object} Options
    * @property {string|import("../geom/Geometry.js").default|GeometryFunction} [geometry] Feature property or geometry
    * or function returning a geometry to render for this style.
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {import("./Image.js").default} [image] Image style.
    * @property {RenderFunction} [renderer] Custom renderer. When configured, `fill`, `stroke` and `image` will be
    * ignored, and the provided function will be called with each render frame for each geometry.
    * @property {RenderFunction} [hitDetectionRenderer] Custom renderer for hit detection. If provided will be used
    * in hit detection rendering.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {import("./Text.js").default} [text] Text style.
    * @property {number} [zIndex] Z index.
    */
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * ## Feature styles
    *
    * If no style is defined, the following default style is used:
    * ```js
    *  import {Circle, Fill, Stroke, Style} from 'ol/style.js';
    *
    *  const fill = new Fill({
    *    color: 'rgba(255,255,255,0.4)',
    *  });
    *  const stroke = new Stroke({
    *    color: '#3399CC',
    *    width: 1.25,
    *  });
    *  const styles = [
    *    new Style({
    *      image: new Circle({
    *        fill: fill,
    *        stroke: stroke,
    *        radius: 5,
    *      }),
    *      fill: fill,
    *      stroke: stroke,
    *    }),
    *  ];
    * ```
    *
    * A separate editing style has the following defaults:
    * ```js
    *  import {Circle, Fill, Stroke, Style} from 'ol/style.js';
    *
    *  const styles = {};
    *  const white = [255, 255, 255, 1];
    *  const blue = [0, 153, 255, 1];
    *  const width = 3;
    *  styles['Polygon'] = [
    *    new Style({
    *      fill: new Fill({
    *        color: [255, 255, 255, 0.5],
    *      }),
    *    }),
    *  ];
    *  styles['MultiPolygon'] =
    *      styles['Polygon'];
    *  styles['LineString'] = [
    *    new Style({
    *      stroke: new Stroke({
    *        color: white,
    *        width: width + 2,
    *      }),
    *    }),
    *    new Style({
    *      stroke: new Stroke({
    *        color: blue,
    *        width: width,
    *      }),
    *    }),
    *  ];
    *  styles['MultiLineString'] = styles['LineString'];
    *
    *  styles['Circle'] = styles['Polygon'].concat(
    *    styles['LineString']
    *  );
    *
    *  styles['Point'] = [
    *    new Style({
    *      image: new Circle({
    *        radius: width * 2,
    *        fill: new Fill({
    *          color: blue,
    *        }),
    *        stroke: new Stroke({
    *          color: white,
    *          width: width / 2,
    *        }),
    *      }),
    *      zIndex: Infinity,
    *    }),
    *  ];
    *  styles['MultiPoint'] =
    *      styles['Point'];
    *  styles['GeometryCollection'] =
    *      styles['Polygon'].concat(
    *          styles['LineString'],
    *          styles['Point']
    *      );
    * ```
    *
    * @api
    */
  @JSImport("ol/style/Style", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Style options.
    */
  open class default ()
    extends StObject
       with Style {
    def this(options: Options) = this()
  }
  
  inline def createDefaultStyle(feature: FeatureLike, resolution: Double): js.Array[Style] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultStyle")(feature.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Style]]
  
  inline def createEditingStyle(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditingStyle")().asInstanceOf[Any]
  
  inline def toFunction(obj: js.Array[Style]): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  inline def toFunction(obj: Style): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  inline def toFunction(obj: StyleFunction): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("toFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  
  type GeometryFunction = js.Function1[
    /* arg0 */ FeatureLike, 
    js.UndefOr[typings.ol.geomGeometryMod.default | typings.ol.renderFeatureMod.default]
  ]
  
  trait Options extends StObject {
    
    /**
      * Fill style.
      */
    var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    /**
      * Feature property or geometry
      * or function returning a geometry to render for this style.
      */
    var geometry: js.UndefOr[String | typings.ol.geomGeometryMod.default | GeometryFunction] = js.undefined
    
    /**
      * Custom renderer for hit detection. If provided will be used
      * in hit detection rendering.
      */
    var hitDetectionRenderer: js.UndefOr[RenderFunction] = js.undefined
    
    /**
      * Image style.
      */
    var image: js.UndefOr[typings.ol.styleImageMod.default] = js.undefined
    
    /**
      * Custom renderer. When configured, `fill`, `stroke` and `image` will be
      * ignored, and the provided function will be called with each render frame for each geometry.
      */
    var renderer: js.UndefOr[RenderFunction] = js.undefined
    
    /**
      * Stroke style.
      */
    var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
    
    /**
      * Text style.
      */
    var text: js.UndefOr[typings.ol.styleTextMod.default] = js.undefined
    
    /**
      * Z index.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGeometry(value: String | typings.ol.geomGeometryMod.default | GeometryFunction): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryFunction1(
        value: /* arg0 */ FeatureLike => js.UndefOr[typings.ol.geomGeometryMod.default | typings.ol.renderFeatureMod.default]
      ): Self = StObject.set(x, "geometry", js.Any.fromFunction1(value))
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setHitDetectionRenderer(
        value: (/* arg0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* arg1 */ State) => Unit
      ): Self = StObject.set(x, "hitDetectionRenderer", js.Any.fromFunction2(value))
      
      inline def setHitDetectionRendererUndefined: Self = StObject.set(x, "hitDetectionRenderer", js.undefined)
      
      inline def setImage(value: typings.ol.styleImageMod.default): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setRenderer(
        value: (/* arg0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), /* arg1 */ State) => Unit
      ): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setText(value: typings.ol.styleTextMod.default): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function2[
    /* arg0 */ Coordinate | (js.Array[js.Array[Coordinate] | Coordinate]), 
    /* arg1 */ State, 
    Unit
  ]
  
  /**
    * A function that takes an {@link module:ol/Feature~Feature} and a `{number}`
    * representing the view's resolution. The function should return a
    * {@link module:ol/style/Style~Style} or an array of them. This way e.g. a
    * vector layer can be styled. If the function returns `undefined`, the
    * feature will not be rendered.
    *
    * @typedef {function(import("../Feature.js").FeatureLike, number):(Style|Array<Style>|void)} StyleFunction
    */
  /**
    * A {@link Style}, an array of {@link Style}, or a {@link StyleFunction}.
    * @typedef {Style|Array<Style>|StyleFunction} StyleLike
    */
  /**
    * A function that takes an {@link module:ol/Feature~Feature} as argument and returns an
    * {@link module:ol/geom/Geometry~Geometry} that will be rendered and styled for the feature.
    *
    * @typedef {function(import("../Feature.js").FeatureLike):
    *     (import("../geom/Geometry.js").default|import("../render/Feature.js").default|undefined)} GeometryFunction
    */
  /**
    * Custom renderer function. Takes two arguments:
    *
    * 1. The pixel coordinates of the geometry in GeoJSON notation.
    * 2. The {@link module:ol/render~State} of the layer renderer.
    *
    * @typedef {function((import("../coordinate.js").Coordinate|Array<import("../coordinate.js").Coordinate>|Array<Array<import("../coordinate.js").Coordinate>>),import("../render.js").State): void} RenderFunction
    */
  /**
    * @typedef {Object} Options
    * @property {string|import("../geom/Geometry.js").default|GeometryFunction} [geometry] Feature property or geometry
    * or function returning a geometry to render for this style.
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {import("./Image.js").default} [image] Image style.
    * @property {RenderFunction} [renderer] Custom renderer. When configured, `fill`, `stroke` and `image` will be
    * ignored, and the provided function will be called with each render frame for each geometry.
    * @property {RenderFunction} [hitDetectionRenderer] Custom renderer for hit detection. If provided will be used
    * in hit detection rendering.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {import("./Text.js").default} [text] Text style.
    * @property {number} [zIndex] Z index.
    */
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * ## Feature styles
    *
    * If no style is defined, the following default style is used:
    * ```js
    *  import {Circle, Fill, Stroke, Style} from 'ol/style.js';
    *
    *  const fill = new Fill({
    *    color: 'rgba(255,255,255,0.4)',
    *  });
    *  const stroke = new Stroke({
    *    color: '#3399CC',
    *    width: 1.25,
    *  });
    *  const styles = [
    *    new Style({
    *      image: new Circle({
    *        fill: fill,
    *        stroke: stroke,
    *        radius: 5,
    *      }),
    *      fill: fill,
    *      stroke: stroke,
    *    }),
    *  ];
    * ```
    *
    * A separate editing style has the following defaults:
    * ```js
    *  import {Circle, Fill, Stroke, Style} from 'ol/style.js';
    *
    *  const styles = {};
    *  const white = [255, 255, 255, 1];
    *  const blue = [0, 153, 255, 1];
    *  const width = 3;
    *  styles['Polygon'] = [
    *    new Style({
    *      fill: new Fill({
    *        color: [255, 255, 255, 0.5],
    *      }),
    *    }),
    *  ];
    *  styles['MultiPolygon'] =
    *      styles['Polygon'];
    *  styles['LineString'] = [
    *    new Style({
    *      stroke: new Stroke({
    *        color: white,
    *        width: width + 2,
    *      }),
    *    }),
    *    new Style({
    *      stroke: new Stroke({
    *        color: blue,
    *        width: width,
    *      }),
    *    }),
    *  ];
    *  styles['MultiLineString'] = styles['LineString'];
    *
    *  styles['Circle'] = styles['Polygon'].concat(
    *    styles['LineString']
    *  );
    *
    *  styles['Point'] = [
    *    new Style({
    *      image: new Circle({
    *        radius: width * 2,
    *        fill: new Fill({
    *          color: blue,
    *        }),
    *        stroke: new Stroke({
    *          color: white,
    *          width: width / 2,
    *        }),
    *      }),
    *      zIndex: Infinity,
    *    }),
    *  ];
    *  styles['MultiPoint'] =
    *      styles['Point'];
    *  styles['GeometryCollection'] =
    *      styles['Polygon'].concat(
    *          styles['LineString'],
    *          styles['Point']
    *      );
    * ```
    *
    * @api
    */
  @js.native
  trait Style extends StObject {
    
    /**
      * @private
      * @type {import("./Fill.js").default}
      */
    /* private */ var fill_ : Any = js.native
    
    /**
      * @private
      * @type {!GeometryFunction}
      */
    /* private */ var geometryFunction_ : Any = js.native
    
    /**
      * @private
      * @type {string|import("../geom/Geometry.js").default|GeometryFunction}
      */
    /* private */ var geometry_ : Any = js.native
    
    /**
      * Get the fill style.
      * @return {import("./Fill.js").default} Fill style.
      * @api
      */
    def getFill(): typings.ol.styleFillMod.default = js.native
    
    /**
      * Get the geometry to be rendered.
      * @return {string|import("../geom/Geometry.js").default|GeometryFunction}
      * Feature property or geometry or function that returns the geometry that will
      * be rendered with this style.
      * @api
      */
    def getGeometry(): String | typings.ol.geomGeometryMod.default | GeometryFunction = js.native
    
    /**
      * Get the function used to generate a geometry for rendering.
      * @return {!GeometryFunction} Function that is called with a feature
      * and returns the geometry to render instead of the feature's geometry.
      * @api
      */
    def getGeometryFunction(): GeometryFunction = js.native
    
    /**
      * Get the custom renderer function that was configured with
      * {@link #setHitDetectionRenderer} or the `hitDetectionRenderer` constructor option.
      * @return {RenderFunction|null} Custom renderer function.
      * @api
      */
    def getHitDetectionRenderer(): RenderFunction | Null = js.native
    
    /**
      * Get the image style.
      * @return {import("./Image.js").default} Image style.
      * @api
      */
    def getImage(): typings.ol.styleImageMod.default = js.native
    
    /**
      * Get the custom renderer function that was configured with
      * {@link #setRenderer} or the `renderer` constructor option.
      * @return {RenderFunction|null} Custom renderer function.
      * @api
      */
    def getRenderer(): RenderFunction | Null = js.native
    
    /**
      * Get the stroke style.
      * @return {import("./Stroke.js").default} Stroke style.
      * @api
      */
    def getStroke(): typings.ol.styleStrokeMod.default = js.native
    
    /**
      * Get the text style.
      * @return {import("./Text.js").default} Text style.
      * @api
      */
    def getText(): typings.ol.styleTextMod.default = js.native
    
    /**
      * Get the z-index for the style.
      * @return {number|undefined} ZIndex.
      * @api
      */
    def getZIndex(): js.UndefOr[Double] = js.native
    
    /**
      * @private
      * @type {RenderFunction|null}
      */
    /* private */ var hitDetectionRenderer_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Image.js").default}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @private
      * @type {RenderFunction|null}
      */
    /* private */ var renderer_ : Any = js.native
    
    /**
      * Set the fill style.
      * @param {import("./Fill.js").default} fill Fill style.
      * @api
      */
    def setFill(fill: typings.ol.styleFillMod.default): Unit = js.native
    
    /**
      * Set a geometry that is rendered instead of the feature's geometry.
      *
      * @param {string|import("../geom/Geometry.js").default|GeometryFunction} geometry
      *     Feature property or geometry or function returning a geometry to render
      *     for this style.
      * @api
      */
    def setGeometry(geometry: String): Unit = js.native
    def setGeometry(geometry: typings.ol.geomGeometryMod.default): Unit = js.native
    def setGeometry(geometry: GeometryFunction): Unit = js.native
    
    /**
      * Sets a custom renderer function for this style used
      * in hit detection.
      * @param {RenderFunction|null} renderer Custom renderer function.
      * @api
      */
    def setHitDetectionRenderer(): Unit = js.native
    def setHitDetectionRenderer(renderer: RenderFunction): Unit = js.native
    
    /**
      * Set the image style.
      * @param {import("./Image.js").default} image Image style.
      * @api
      */
    def setImage(image: typings.ol.styleImageMod.default): Unit = js.native
    
    /**
      * Sets a custom renderer function for this style. When set, `fill`, `stroke`
      * and `image` options of the style will be ignored.
      * @param {RenderFunction|null} renderer Custom renderer function.
      * @api
      */
    def setRenderer(): Unit = js.native
    def setRenderer(renderer: RenderFunction): Unit = js.native
    
    /**
      * Set the stroke style.
      * @param {import("./Stroke.js").default} stroke Stroke style.
      * @api
      */
    def setStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
    
    /**
      * Set the text style.
      * @param {import("./Text.js").default} text Text style.
      * @api
      */
    def setText(text: typings.ol.styleTextMod.default): Unit = js.native
    
    /**
      * Set the z-index.
      *
      * @param {number|undefined} zIndex ZIndex.
      * @api
      */
    def setZIndex(): Unit = js.native
    def setZIndex(zIndex: Double): Unit = js.native
    
    /**
      * @private
      * @type {import("./Stroke.js").default}
      */
    /* private */ var stroke_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Text.js").default}
      */
    /* private */ var text_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var zIndex_ : Any = js.native
  }
  
  type StyleFunction = js.Function2[/* arg0 */ FeatureLike, /* arg1 */ Double, Style | js.Array[Style] | Unit]
  
  type StyleLike = Style | js.Array[Style] | StyleFunction
}
