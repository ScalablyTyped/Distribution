package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ViewHint", JSImport.Namespace)
@js.native
object viewHintMod extends js.Object {
  @js.native
  sealed trait ViewHint extends js.Object
  
  @js.native
  object ViewHint extends js.Object {
    @js.native
    sealed trait ANIMATING extends ViewHint
    
    @js.native
    sealed trait INTERACTING extends ViewHint
    
  }
  
  @js.native
  object default extends js.Object {
    /* 0 */ val ANIMATING: typings.ol.viewHintMod.ViewHint.ANIMATING with Double = js.native
    /* 1 */ val INTERACTING: typings.ol.viewHintMod.ViewHint.INTERACTING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ViewHint with Double] = js.native
  }
  
}

