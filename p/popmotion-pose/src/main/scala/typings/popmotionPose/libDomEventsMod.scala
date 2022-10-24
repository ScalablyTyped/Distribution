package typings.popmotionPose

import typings.popmotionPose.libTypesMod.DomPopmotionConfig
import typings.popmotionPose.libTypesMod.DomPopmotionPoser
import typings.poseCore.libTypesMod.ActiveActions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomEventsMod {
  
  @JSImport("popmotion-pose/lib/dom/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    element: Element,
    activeActions: ActiveActions[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any
    ],
    poser: DomPopmotionPoser,
    param3: DomPopmotionConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], activeActions.asInstanceOf[js.Any], poser.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
