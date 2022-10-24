package typings.next

import typings.next.anon.AmpFirst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibAmpModeMod {
  
  @JSImport("next/dist/shared/lib/amp-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInAmpMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInAmpMode")().asInstanceOf[Boolean]
  inline def isInAmpMode(param0: AmpFirst): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInAmpMode")(param0.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
