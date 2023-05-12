package typings.ol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.geomGeometryMod.Type
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.olStrings.changeColongeometry
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.styleStyleMod.StyleLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureMod {
  
  @JSImport("ol/Feature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @typedef {typeof Feature|typeof import("./render/Feature.js").default} FeatureClass
    */
  /**
    * @typedef {Feature|import("./render/Feature.js").default} FeatureLike
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<import("./ObjectEventType").Types|'change:geometry', import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types
    *     |'change:geometry', Return>} FeatureOnSignature
    */
  /***
    * @template Geometry
    * @typedef {Object<string, *> & { geometry?: Geometry }} ObjectWithGeometry
    */
  /**
    * @classdesc
    * A vector object for geographic features with a geometry and other
    * attribute properties, similar to the features in vector file formats like
    * GeoJSON.
    *
    * Features can be styled individually with `setStyle`; otherwise they use the
    * style of their vector layer.
    *
    * Note that attribute properties are set as {@link module:ol/Object~BaseObject} properties on
    * the feature object, so they are observable, and have get/set accessors.
    *
    * Typically, a feature has a single geometry property. You can set the
    * geometry using the `setGeometry` method and get it with `getGeometry`.
    * It is possible to store more than one geometry on a feature using attribute
    * properties. By default, the geometry used for rendering is identified by
    * the property name `geometry`. If you want to use another geometry property
    * for rendering, use the `setGeometryName` method to change the attribute
    * property associated with the geometry for the feature.  For example:
    *
    * ```js
    *
    * import Feature from 'ol/Feature.js';
    * import Polygon from 'ol/geom/Polygon.js';
    * import Point from 'ol/geom/Point.js';
    *
    * const feature = new Feature({
    *   geometry: new Polygon(polyCoords),
    *   labelPoint: new Point(labelCoords),
    *   name: 'My Polygon',
    * });
    *
    * // get the polygon geometry
    * const poly = feature.getGeometry();
    *
    * // Render the feature as a point using the coordinates from labelPoint
    * feature.setGeometryName('labelPoint');
    *
    * // get the point geometry
    * const point = feature.getGeometry();
    * ```
    *
    * @api
    * @template {import("./geom/Geometry.js").default} [Geometry=import("./geom/Geometry.js").default]
    */
  @JSImport("ol/Feature", JSImport.Default)
  @js.native
  /**
    * @param {Geometry|ObjectWithGeometry<Geometry>} [geometryOrProperties]
    *     You may pass a Geometry object directly, or an object literal containing
    *     properties. If you pass an object literal, you may include a Geometry
    *     associated with a `geometry` key.
    */
  open class default[Geometry /* <: typings.ol.geomGeometryMod.default */] () extends Feature[Geometry] {
    def this(geometryOrProperties: Geometry) = this()
    def this(geometryOrProperties: ObjectWithGeometry[Geometry]) = this()
  }
  
  inline def createStyleFunction(obj: js.Array[typings.ol.styleStyleMod.default]): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  inline def createStyleFunction(obj: StyleFunction): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  inline def createStyleFunction(obj: typings.ol.styleStyleMod.default): StyleFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[StyleFunction]
  
  /**
    * @typedef {typeof Feature|typeof import("./render/Feature.js").default} FeatureClass
    */
  /**
    * @typedef {Feature|import("./render/Feature.js").default} FeatureLike
    */
  /***
    * @template Return
    * @typedef {import("./Observable").OnSignature<import("./Observable").EventTypes, import("./events/Event.js").default, Return> &
    *   import("./Observable").OnSignature<import("./ObjectEventType").Types|'change:geometry', import("./Object").ObjectEvent, Return> &
    *   import("./Observable").CombinedOnSignature<import("./Observable").EventTypes|import("./ObjectEventType").Types
    *     |'change:geometry', Return>} FeatureOnSignature
    */
  /***
    * @template Geometry
    * @typedef {Object<string, *> & { geometry?: Geometry }} ObjectWithGeometry
    */
  /**
    * @classdesc
    * A vector object for geographic features with a geometry and other
    * attribute properties, similar to the features in vector file formats like
    * GeoJSON.
    *
    * Features can be styled individually with `setStyle`; otherwise they use the
    * style of their vector layer.
    *
    * Note that attribute properties are set as {@link module:ol/Object~BaseObject} properties on
    * the feature object, so they are observable, and have get/set accessors.
    *
    * Typically, a feature has a single geometry property. You can set the
    * geometry using the `setGeometry` method and get it with `getGeometry`.
    * It is possible to store more than one geometry on a feature using attribute
    * properties. By default, the geometry used for rendering is identified by
    * the property name `geometry`. If you want to use another geometry property
    * for rendering, use the `setGeometryName` method to change the attribute
    * property associated with the geometry for the feature.  For example:
    *
    * ```js
    *
    * import Feature from 'ol/Feature.js';
    * import Polygon from 'ol/geom/Polygon.js';
    * import Point from 'ol/geom/Point.js';
    *
    * const feature = new Feature({
    *   geometry: new Polygon(polyCoords),
    *   labelPoint: new Point(labelCoords),
    *   name: 'My Polygon',
    * });
    *
    * // get the polygon geometry
    * const poly = feature.getGeometry();
    *
    * // Render the feature as a point using the coordinates from labelPoint
    * feature.setGeometryName('labelPoint');
    *
    * // get the point geometry
    * const point = feature.getGeometry();
    * ```
    *
    * @api
    * @template {import("./geom/Geometry.js").default} [Geometry=import("./geom/Geometry.js").default]
    */
  @js.native
  trait Feature[Geometry /* <: typings.ol.geomGeometryMod.default */]
    extends typings.ol.objectMod.default {
    
    /**
      * @private
      * @type {?import("./events.js").EventsKey}
      */
    /* private */ var geometryChangeKey_ : Any = js.native
    
    /**
      * @type {string}
      * @private
      */
    /* private */ var geometryName_ : Any = js.native
    
    /**
      * Get the feature's default geometry.  A feature may have any number of named
      * geometries.  The "default" geometry (the one that is rendered by default) is
      * set when calling {@link module:ol/Feature~Feature#setGeometry}.
      * @return {Geometry|undefined} The default geometry for the feature.
      * @api
      * @observable
      */
    def getGeometry(): js.UndefOr[Geometry] = js.native
    
    /**
      * Get the name of the feature's default geometry.  By default, the default
      * geometry is named `geometry`.
      * @return {string} Get the property name associated with the default geometry
      *     for this feature.
      * @api
      */
    def getGeometryName(): String = js.native
    
    /**
      * Get the feature identifier.  This is a stable identifier for the feature and
      * is either set when reading data from a remote source or set explicitly by
      * calling {@link module:ol/Feature~Feature#setId}.
      * @return {number|string|undefined} Id.
      * @api
      */
    def getId(): js.UndefOr[Double | String] = js.native
    
    /**
      * Get the feature's style. Will return what was provided to the
      * {@link module:ol/Feature~Feature#setStyle} method.
      * @return {import("./style/Style.js").StyleLike|undefined} The feature style.
      * @api
      */
    def getStyle(): js.UndefOr[StyleLike] = js.native
    
    /**
      * Get the feature's style function.
      * @return {import("./style/Style.js").StyleFunction|undefined} Return a function
      * representing the current style of this feature.
      * @api
      */
    def getStyleFunction(): js.UndefOr[StyleFunction] = js.native
    
    /**
      * @private
      */
    /* private */ var handleGeometryChange_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var handleGeometryChanged_ : Any = js.native
    
    /**
      * @private
      * @type {number|string|undefined}
      */
    /* private */ var id_ : Any = js.native
    
    /***
      * @type {FeatureOnSignature<import("./events").EventsKey>}
      */
    @JSName("on")
    var on_Feature: FeatureOnSignature[EventsKey] = js.native
    
    /***
      * @type {FeatureOnSignature<import("./events").EventsKey>}
      */
    @JSName("once")
    var once_Feature: FeatureOnSignature[EventsKey] = js.native
    
    /**
      * Set the default geometry for the feature.  This will update the property
      * with the name returned by {@link module:ol/Feature~Feature#getGeometryName}.
      * @param {Geometry|undefined} geometry The new geometry.
      * @api
      * @observable
      */
    def setGeometry(): Unit = js.native
    def setGeometry(geometry: Geometry): Unit = js.native
    
    /**
      * Set the property name to be used when getting the feature's default geometry.
      * When calling {@link module:ol/Feature~Feature#getGeometry}, the value of the property with
      * this name will be returned.
      * @param {string} name The property name of the default geometry.
      * @api
      */
    def setGeometryName(name: String): Unit = js.native
    
    /**
      * Set the feature id.  The feature id is considered stable and may be used when
      * requesting features or comparing identifiers returned from a remote source.
      * The feature id can be used with the
      * {@link module:ol/source/Vector~VectorSource#getFeatureById} method.
      * @param {number|string|undefined} id The feature id.
      * @api
      * @fires module:ol/events/Event~BaseEvent#event:change
      */
    def setId(): Unit = js.native
    def setId(id: String): Unit = js.native
    def setId(id: Double): Unit = js.native
    
    /**
      * Set the style for the feature to override the layer style.  This can be a
      * single style object, an array of styles, or a function that takes a
      * resolution and returns an array of styles. To unset the feature style, call
      * `setStyle()` without arguments or a falsey value.
      * @param {import("./style/Style.js").StyleLike} [style] Style for this feature.
      * @api
      * @fires module:ol/events/Event~BaseEvent#event:change
      */
    def setStyle(): Unit = js.native
    def setStyle(style: StyleLike): Unit = js.native
    
    /**
      * @private
      * @type {import("./style/Style.js").StyleFunction|undefined}
      */
    /* private */ var styleFunction_ : Any = js.native
    
    /**
      * User provided style.
      * @private
      * @type {import("./style/Style.js").StyleLike}
      */
    /* private */ var style_ : Any = js.native
    
    /***
      * @type {FeatureOnSignature<void>}
      */
    @JSName("un")
    var un_Feature: FeatureOnSignature[Unit] = js.native
  }
  
  type FeatureClass = (Instantiable1[
    /* geometryOrProperties */ js.UndefOr[
      (/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any) | (ObjectWithGeometry[/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any])
    ], 
    Feature[typings.ol.geomGeometryMod.default]
  ]) | ((Instantiable5[
    /* type */ Type, 
    /* flatCoordinates */ js.Array[Double], 
    /* ends */ js.Array[js.Array[Double] | Double], 
    /* properties */ StringDictionary[Any], 
    /* id */ js.UndefOr[Double | String], 
    typings.ol.renderFeatureMod.default
  ]) & (Instantiable1[
    /* geometryOrProperties */ js.UndefOr[
      (/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any) | (ObjectWithGeometry[/* import warning: RewrittenClass.unapply cls was tparam Geometry */ Any])
    ], 
    default[typings.ol.geomGeometryMod.default]
  ]) & Instantiable0[typings.ol.formatFeatureMod.default])
  
  type FeatureLike = Feature[typings.ol.geomGeometryMod.default] | typings.ol.renderFeatureMod.default
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait FeatureOnSignature[Return]
    extends OnSignature[
          changeColongeometry | EventTypes | Types, 
          ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait ObjectWithGeometry[Geometry]
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var geometry: js.UndefOr[Geometry] = js.undefined
  }
  object ObjectWithGeometry {
    
    inline def apply[Geometry](): ObjectWithGeometry[Geometry] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectWithGeometry[Geometry]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectWithGeometry[?], Geometry] (val x: Self & ObjectWithGeometry[Geometry]) extends AnyVal {
      
      inline def setGeometry(value: Geometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    }
  }
}
