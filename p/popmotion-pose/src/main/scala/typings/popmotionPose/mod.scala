package typings.popmotionPose

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popmotion-pose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(element: Element, config: DomPopmotionConfig): DomPopmotionPoser = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[DomPopmotionPoser]
}
