package typings.popmotionPose

import typings.popmotionPose.libTypesMod.TransitionDefinition
import typings.poseCore.libTypesMod.TransitionMap
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIncDefaultTransitionsMod {
  
  @JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("popmotion-pose/lib/inc/default-transitions", JSImport.Default)
  @js.native
  val default: Map[
    String, 
    TransitionMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      TransitionDefinition
    ]
  ] = js.native
  
  inline def just(from: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(from.asInstanceOf[js.Any]).asInstanceOf[Any]
}
