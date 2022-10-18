package typings.polished

import typings.polished.libTypesStyleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShorthandsBackgroundsMod {
  
  @JSImport("polished/lib/shorthands/backgrounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(properties: String*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(properties.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
}
