package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MixBlend extends StObject
@JSImport("@pixi-spine/base", "MixBlend")
@js.native
object MixBlend extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MixBlend & Double] = js.native
  
  /** Transitions from the current value to the current value plus the timeline value. No change is made before the first key
    * (the current value is kept until the first key).
    *
    * `add` is intended for animations layered on top of others, not for the first animations applied. Properties
    * keyed by additive animations must be set manually or by another animation before applying the additive animations, else
    * the property values will increase continually. */
  @js.native
  sealed trait add
    extends StObject
       with MixBlend
  /* 3 */ val add: typings.pixiSpineBase.mod.MixBlend.add & Double = js.native
  
  /** Transitions from the current value to the timeline value. Before the first key, transitions from the current value to
    * the setup value. Timelines which perform instant transitions, such as DrawOrderTimeline or
    * AttachmentTimeline, use the setup value before the first key.
    *
    * `first` is intended for the first animations applied, not for animations layered on top of those. */
  @js.native
  sealed trait first
    extends StObject
       with MixBlend
  /* 1 */ val first: typings.pixiSpineBase.mod.MixBlend.first & Double = js.native
  
  /** Transitions from the current value to the timeline value. No change is made before the first key (the current value is
    * kept until the first key).
    *
    * `replace` is intended for animations layered on top of others, not for the first animations applied. */
  @js.native
  sealed trait replace
    extends StObject
       with MixBlend
  /* 2 */ val replace: typings.pixiSpineBase.mod.MixBlend.replace & Double = js.native
  
  /** Transitions from the setup value to the timeline value (the current value is not used). Before the first key, the setup
    * value is set. */
  @js.native
  sealed trait setup
    extends StObject
       with MixBlend
  /* 0 */ val setup: typings.pixiSpineBase.mod.MixBlend.setup & Double = js.native
}
