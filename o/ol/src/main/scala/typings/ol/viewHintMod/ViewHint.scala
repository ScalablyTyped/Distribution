package typings.ol.viewHintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewHint extends js.Object

@JSImport("ol/ViewHint", "ViewHint")
@js.native
object ViewHint extends js.Object {
  @js.native
  sealed trait ANIMATING extends ViewHint
  
  @js.native
  sealed trait INTERACTING extends ViewHint
  
}

