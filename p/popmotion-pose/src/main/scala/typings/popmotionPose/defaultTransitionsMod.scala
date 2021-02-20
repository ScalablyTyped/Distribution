package typings.popmotionPose

import org.scalablytyped.runtime.Shortcut
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.poseCore.typesMod.TransitionMap
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTransitionsMod extends Shortcut {
  
  @JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Default)
  @js.native
  val default: Map[
    String, 
    TransitionMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TransitionDefinition
    ]
  ] = js.native
  
  @JSImport("popmotion-pose/lib/inc/default-transitions", "just")
  @js.native
  def just(from: js.Any): js.Any = js.native
  
  type _To = Map[
    String, 
    TransitionMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TransitionDefinition
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `defaultTransitionsMod.foo` */
  override def _to: Map[
    String, 
    TransitionMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      TransitionDefinition
    ]
  ] = default
}
