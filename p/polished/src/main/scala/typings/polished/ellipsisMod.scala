package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsisMod {
  
  @JSImport("polished/lib/mixins/ellipsis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Styles]
  inline def default(width: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(width.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def default(width: Double): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(width.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
