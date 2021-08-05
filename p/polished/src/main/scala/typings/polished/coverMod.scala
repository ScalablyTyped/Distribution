package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coverMod {
  
  @JSImport("polished/lib/mixins/cover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Styles]
  inline def default(offset: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(offset.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def default(offset: Double): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(offset.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
