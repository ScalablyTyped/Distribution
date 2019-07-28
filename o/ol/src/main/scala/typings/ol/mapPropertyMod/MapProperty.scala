package typings.ol.mapPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapProperty extends js.Object

@JSImport("ol/MapProperty", "MapProperty")
@js.native
object MapProperty extends js.Object {
  @js.native
  sealed trait LAYERGROUP extends MapProperty
  
  @js.native
  sealed trait SIZE extends MapProperty
  
  @js.native
  sealed trait TARGET extends MapProperty
  
  @js.native
  sealed trait VIEW extends MapProperty
  
}

