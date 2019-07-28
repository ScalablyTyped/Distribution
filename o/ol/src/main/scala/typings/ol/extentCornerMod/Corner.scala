package typings.ol.extentCornerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Corner extends js.Object

@JSImport("ol/extent/Corner", "Corner")
@js.native
object Corner extends js.Object {
  @js.native
  sealed trait BOTTOM_LEFT extends Corner
  
  @js.native
  sealed trait BOTTOM_RIGHT extends Corner
  
  @js.native
  sealed trait TOP_LEFT extends Corner
  
  @js.native
  sealed trait TOP_RIGHT extends Corner
  
}

