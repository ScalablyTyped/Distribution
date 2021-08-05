package typings.polished

import typings.polished.linearGradientConfigurationMod.LinearGradientConfiguration
import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearGradientMod {
  
  @JSImport("polished/lib/mixins/linearGradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasColorStopsFallbackToDirection: LinearGradientConfiguration): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasColorStopsFallbackToDirection.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
