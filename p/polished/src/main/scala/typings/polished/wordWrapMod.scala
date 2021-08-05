package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordWrapMod {
  
  @JSImport("polished/lib/mixins/wordWrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Styles]
  inline def default(wrap: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wrap.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
