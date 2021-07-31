package typings.polished

import typings.polished.sideKeywordMod.SideKeyword
import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderMod {
  
  @JSImport("polished/lib/shorthands/border", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(sideKeyword: String, values: (String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sideKeyword.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
  @scala.inline
  def default(sideKeyword: Double, values: (String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sideKeyword.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
  @scala.inline
  def default(sideKeyword: SideKeyword, values: (String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sideKeyword.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
}
