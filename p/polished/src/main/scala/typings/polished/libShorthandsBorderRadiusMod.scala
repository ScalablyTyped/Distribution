package typings.polished

import typings.polished.libTypesStyleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShorthandsBorderRadiusMod {
  
  @JSImport("polished/lib/shorthands/borderRadius", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(side: String, radius: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(side.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def default(side: String, radius: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(side.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Styles]
}
