package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWmsMod {
  
  @JSImport("ol/source/wms", "DEFAULT_VERSION")
  @js.native
  val DEFAULT_VERSION: String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.carmentaserver
    - typings.ol.olStrings.geoserver
    - typings.ol.olStrings.mapserver
    - typings.ol.olStrings.qgis
  */
  trait ServerType extends StObject
  object ServerType {
    
    inline def carmentaserver: typings.ol.olStrings.carmentaserver = "carmentaserver".asInstanceOf[typings.ol.olStrings.carmentaserver]
    
    inline def geoserver: typings.ol.olStrings.geoserver = "geoserver".asInstanceOf[typings.ol.olStrings.geoserver]
    
    inline def mapserver: typings.ol.olStrings.mapserver = "mapserver".asInstanceOf[typings.ol.olStrings.mapserver]
    
    inline def qgis: typings.ol.olStrings.qgis = "qgis".asInstanceOf[typings.ol.olStrings.qgis]
  }
}
