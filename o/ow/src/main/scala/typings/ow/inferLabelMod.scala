package typings.ow

import typings.callsites.mod.CallSite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inferLabelMod {
  
  @JSImport("ow/dist/source/utils/infer-label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def inferLabel(callsites: js.Array[CallSite]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("inferLabel")(callsites.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
