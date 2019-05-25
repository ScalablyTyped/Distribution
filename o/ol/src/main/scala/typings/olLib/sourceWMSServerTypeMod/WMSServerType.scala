package typings
package olLib.sourceWMSServerTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WMSServerType extends js.Object

@JSImport("ol/source/WMSServerType", "WMSServerType")
@js.native
object WMSServerType extends js.Object {
  @js.native
  sealed trait CARMENTA_SERVER
    extends olLib.sourceWMSServerTypeMod.WMSServerType
  
  @js.native
  sealed trait GEOSERVER
    extends olLib.sourceWMSServerTypeMod.WMSServerType
  
  @js.native
  sealed trait MAPSERVER
    extends olLib.sourceWMSServerTypeMod.WMSServerType
  
  @js.native
  sealed trait QGIS
    extends olLib.sourceWMSServerTypeMod.WMSServerType
  
}

