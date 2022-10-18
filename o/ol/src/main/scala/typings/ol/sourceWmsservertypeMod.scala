package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWmsservertypeMod {
  
  @JSImport("ol/source/WMSServerType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMSServerType & String] = js.native
    
    /* "carmentaserver" */ val CARMENTA_SERVER: typings.ol.sourceWmsservertypeMod.WMSServerType.CARMENTA_SERVER & String = js.native
    
    /* "geoserver" */ val GEOSERVER: typings.ol.sourceWmsservertypeMod.WMSServerType.GEOSERVER & String = js.native
    
    /* "mapserver" */ val MAPSERVER: typings.ol.sourceWmsservertypeMod.WMSServerType.MAPSERVER & String = js.native
    
    /* "qgis" */ val QGIS: typings.ol.sourceWmsservertypeMod.WMSServerType.QGIS & String = js.native
  }
  
  @js.native
  sealed trait WMSServerType extends StObject
  @JSImport("ol/source/WMSServerType", "WMSServerType")
  @js.native
  object WMSServerType extends StObject {
    
    @js.native
    sealed trait CARMENTA_SERVER
      extends StObject
         with WMSServerType
    
    @js.native
    sealed trait GEOSERVER
      extends StObject
         with WMSServerType
    
    @js.native
    sealed trait MAPSERVER
      extends StObject
         with WMSServerType
    
    @js.native
    sealed trait QGIS
      extends StObject
         with WMSServerType
  }
}
