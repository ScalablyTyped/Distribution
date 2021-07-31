package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transperentizeColorMod {
  
  @JSImport("playable/dist/src/modules/ui/core/theme/utils/transperentizeColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(color: String, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
}
