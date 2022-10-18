package typings.polished

import typings.polished.libTypesStyleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersImportantMod {
  
  @JSImport("polished/lib/helpers/important", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(styleBlock: Styles): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styleBlock.asInstanceOf[js.Any]).asInstanceOf[Styles]
  inline def default(styleBlock: Styles, rules: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styleBlock.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def default(styleBlock: Styles, rules: js.Array[String]): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styleBlock.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Styles]
}
