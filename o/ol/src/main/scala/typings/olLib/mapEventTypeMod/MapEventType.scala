package typings
package olLib.mapEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapEventType extends js.Object

@JSImport("ol/MapEventType", "MapEventType")
@js.native
object MapEventType extends js.Object {
  @js.native
  sealed trait MOVEEND
    extends olLib.mapEventTypeMod.MapEventType
  
  @js.native
  sealed trait MOVESTART
    extends olLib.mapEventTypeMod.MapEventType
  
  @js.native
  sealed trait POSTRENDER
    extends olLib.mapEventTypeMod.MapEventType
  
}

