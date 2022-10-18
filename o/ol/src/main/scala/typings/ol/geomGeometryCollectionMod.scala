package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomGeometryCollectionMod {
  
  @JSImport("ol/geom/GeometryCollection", JSImport.Default)
  @js.native
  open class default () extends GeometryCollection {
    def this(opt_geometries: js.Array[typings.ol.geomGeometryMod.default]) = this()
  }
  
  @js.native
  trait GeometryCollection
    extends typings.ol.geomGeometryMod.default {
    
    /**
      * Return the geometries that make up this geometry collection.
      */
    def getGeometries(): js.Array[typings.ol.geomGeometryMod.default] = js.native
    
    def getGeometriesArray(): js.Array[typings.ol.geomGeometryMod.default] = js.native
    
    def getGeometriesArrayRecursive(): js.Array[typings.ol.geomGeometryMod.default] = js.native
    
    def isEmpty(): Boolean = js.native
    
    /**
      * Set the geometries that make up this geometry collection.
      */
    def setGeometries(geometries: js.Array[typings.ol.geomGeometryMod.default]): Unit = js.native
    
    def setGeometriesArray(geometries: js.Array[typings.ol.geomGeometryMod.default]): Unit = js.native
  }
}
