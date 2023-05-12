package typings.ol

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGpxMod {
  
  /**
    * @typedef {Object} Options
    * @property {function(Feature, Node):void} [readExtensions] Callback function
    * to process `extensions` nodes. To prevent memory leaks, this callback function must
    * not store any references to the node. Note that the `extensions`
    * node is not allowed in GPX 1.0. Moreover, only `extensions`
    * nodes from `wpt`, `rte` and `trk` can be processed, as those are
    * directly mapped to a feature.
    */
  /**
    * @typedef {Object} LayoutOptions
    * @property {boolean} [hasZ] HasZ.
    * @property {boolean} [hasM] HasM.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the GPX format.
    *
    * Note that {@link module:ol/format/GPX~GPX#readFeature} only reads the first
    * feature of the source.
    *
    * When reading, routes (`<rte>`) are converted into LineString geometries, and
    * tracks (`<trk>`) into MultiLineString. Any properties on route and track
    * waypoints are ignored.
    *
    * When writing, LineString geometries are output as routes (`<rte>`), and
    * MultiLineString as tracks (`<trk>`).
    *
    * @api
    */
  @JSImport("ol/format/GPX", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends GPX {
    def this(options: Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {function(Feature, Node):void} [readExtensions] Callback function
    * to process `extensions` nodes. To prevent memory leaks, this callback function must
    * not store any references to the node. Note that the `extensions`
    * node is not allowed in GPX 1.0. Moreover, only `extensions`
    * nodes from `wpt`, `rte` and `trk` can be processed, as those are
    * directly mapped to a feature.
    */
  /**
    * @typedef {Object} LayoutOptions
    * @property {boolean} [hasZ] HasZ.
    * @property {boolean} [hasM] HasM.
    */
  /**
    * @classdesc
    * Feature format for reading and writing data in the GPX format.
    *
    * Note that {@link module:ol/format/GPX~GPX#readFeature} only reads the first
    * feature of the source.
    *
    * When reading, routes (`<rte>`) are converted into LineString geometries, and
    * tracks (`<trk>`) into MultiLineString. Any properties on route and track
    * waypoints are ignored.
    *
    * When writing, LineString geometries are output as routes (`<rte>`), and
    * MultiLineString as tracks (`<trk>`).
    *
    * @api
    */
  @js.native
  trait GPX
    extends typings.ol.formatXmlfeatureMod.default {
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_GPX: typings.ol.projProjectionMod.default = js.native
    
    /**
      * @param {Array<Feature>} features List of features.
      * @private
      */
    /* private */ var handleReadExtensions_ : Any = js.native
    
    /**
      * @type {function(Feature, Node): void|undefined}
      * @private
      */
    /* private */ var readExtensions_ : Any = js.native
  }
  
  trait LayoutOptions extends StObject {
    
    /**
      * HasM.
      */
    var hasM: js.UndefOr[Boolean] = js.undefined
    
    /**
      * HasZ.
      */
    var hasZ: js.UndefOr[Boolean] = js.undefined
  }
  object LayoutOptions {
    
    inline def apply(): LayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutOptions] (val x: Self) extends AnyVal {
      
      inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
      
      inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Callback function
      * to process `extensions` nodes. To prevent memory leaks, this callback function must
      * not store any references to the node. Note that the `extensions`
      * node is not allowed in GPX 1.0. Moreover, only `extensions`
      * nodes from `wpt`, `rte` and `trk` can be processed, as those are
      * directly mapped to a feature.
      */
    var readExtensions: js.UndefOr[
        js.Function2[
          /* arg0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], 
          /* arg1 */ Node, 
          Unit
        ]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setReadExtensions(
        value: (/* arg0 */ typings.ol.featureMod.default[typings.ol.geomGeometryMod.default], /* arg1 */ Node) => Unit
      ): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2(value))
      
      inline def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
    }
  }
}
