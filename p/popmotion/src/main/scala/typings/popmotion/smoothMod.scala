package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothMod {
  
  @JSImport("popmotion/lib/utils/smooth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def smooth(): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")().asInstanceOf[js.Function1[/* v */ Double, Double]]
  @scala.inline
  def smooth(strength: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(strength.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
}
