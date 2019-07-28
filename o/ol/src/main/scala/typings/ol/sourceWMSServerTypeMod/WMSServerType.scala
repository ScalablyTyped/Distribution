package typings.ol.sourceWMSServerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WMSServerType extends js.Object

@JSImport("ol/source/WMSServerType", "WMSServerType")
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

