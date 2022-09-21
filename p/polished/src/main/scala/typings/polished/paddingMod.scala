package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingMod {
  
  @JSImport("polished/lib/shorthands/padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Styles]
}
