package typings.ol

import typings.ol.eventsMod.EventsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomGeometryCollectionMod {
  
  /**
    * @classdesc
    * An array of {@link module:ol/geom/Geometry~Geometry} objects.
    *
    * @api
    */
  @JSImport("ol/geom/GeometryCollection", JSImport.Default)
  @js.native
  /**
    * @param {Array<Geometry>} [geometries] Geometries.
    */
  open class default () extends GeometryCollection {
    def this(geometries: js.Array[typings.ol.geomGeometryMod.default]) = this()
  }
  
  /**
    * @classdesc
    * An array of {@link module:ol/geom/Geometry~Geometry} objects.
    *
    * @api
    */
  @js.native
  trait GeometryCollection
    extends typings.ol.geomGeometryMod.default {
    
    /**
      * @type {Array<import("../events.js").EventsKey>}
      */
    var changeEventsKeys_ : js.Array[EventsKey] = js.native
    
    /**
      * @private
      * @type {Array<Geometry>}
      */
    /* private */ var geometries_ : Any = js.native
    
    /**
      * Return the geometries that make up this geometry collection.
      * @return {Array<Geometry>} Geometries.
      * @api
      */
    def getGeometries(): js.Array[typings.ol.geomGeometryMod.default] = js.native
    
    /**
      * @return {Array<Geometry>} Geometries.
      */
    def getGeometriesArray(): js.Array[typings.ol.geomGeometryMod.default] = js.native
    
    /**
      * @return {Array<Geometry>} Geometries.
      */
    def getGeometriesArrayRecursive(): js.Array[typings.ol.geomGeometryMod.default] = js.native
    
    /**
      * @return {boolean} Is empty.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @private
      */
    /* private */ var listenGeometriesChange_ : Any = js.native
    
    /**
      * Set the geometries that make up this geometry collection.
      * @param {Array<Geometry>} geometries Geometries.
      * @api
      */
    def setGeometries(geometries: js.Array[typings.ol.geomGeometryMod.default]): Unit = js.native
    
    /**
      * @param {Array<Geometry>} geometries Geometries.
      */
    def setGeometriesArray(geometries: js.Array[typings.ol.geomGeometryMod.default]): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var unlistenGeometriesChange_ : Any = js.native
  }
}
