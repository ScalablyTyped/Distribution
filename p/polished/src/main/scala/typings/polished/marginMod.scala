package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marginMod {
  
  @JSImport("polished/lib/shorthands/margin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
