package typings.popmotionPose

import typings.popmotionPose.typesMod.TransitionDefinition
import typings.poseCore.typesMod.TransitionMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Namespace)
@js.native
object defaultTransitionsMod extends js.Object {
  
  val default: Map[
    String, 
    TransitionMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TransitionDefinition
    ]
  ] = js.native
  
  def just(from: js.Any): js.Any = js.native
}
