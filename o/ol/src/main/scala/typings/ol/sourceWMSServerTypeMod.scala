package typings.ol

import typings.ol.sourceWMSServerTypeMod.WMSServerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/WMSServerType", JSImport.Namespace)
@js.native
object sourceWMSServerTypeMod extends js.Object {
  @js.native
  sealed trait WMSServerType extends js.Object
  
  @js.native
  object WMSServerType extends js.Object {
    @js.native
    sealed trait CARMENTA_SERVER extends WMSServerType
    
    @js.native
    sealed trait GEOSERVER extends WMSServerType
    
    @js.native
    sealed trait MAPSERVER extends WMSServerType
    
    @js.native
    sealed trait QGIS extends WMSServerType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "carmentaserver" */ val CARMENTA_SERVER: typings.ol.sourceWMSServerTypeMod.WMSServerType.CARMENTA_SERVER with String = js.native
    /* "geoserver" */ val GEOSERVER: typings.ol.sourceWMSServerTypeMod.WMSServerType.GEOSERVER with String = js.native
    /* "mapserver" */ val MAPSERVER: typings.ol.sourceWMSServerTypeMod.WMSServerType.MAPSERVER with String = js.native
    /* "qgis" */ val QGIS: typings.ol.sourceWMSServerTypeMod.WMSServerType.QGIS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WMSServerType with String] = js.native
  }
  
}

