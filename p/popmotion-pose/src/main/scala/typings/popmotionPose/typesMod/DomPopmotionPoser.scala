package typings.popmotionPose.typesMod

import typings.poseCore.typesMod.Poser
import typings.poseCore.typesMod.PoserConfig
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomPopmotionPoser
  extends StObject
     with Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ js.Any, 
      DomPopmotionPoser
    ] {
  
  def addChild(element: Element, config: PoserConfig[Value]): DomPopmotionPoser = js.native
  
  def flip(op: js.Function): js.Promise[js.Any] = js.native
  
  def measure(): BoundingBox = js.native
}
