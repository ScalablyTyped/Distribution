package typings.popmotionPose

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.poseCore.typesMod.ActiveActions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("popmotion-pose/lib/dom/events", JSImport.Default)
  @js.native
  def default(
    element: Element,
    activeActions: ActiveActions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _
    ],
    poser: DomPopmotionPoser,
    hasProps: DomPopmotionConfig
  ): Unit = js.native
}
