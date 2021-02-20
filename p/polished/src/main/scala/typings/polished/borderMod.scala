package typings.polished

import typings.polished.sideKeywordMod.SideKeyword
import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderMod {
  
  @JSImport("polished/lib/shorthands/border", JSImport.Default)
  @js.native
  def default(sideKeyword: String, values: (String | Double)*): Styles = js.native
  @JSImport("polished/lib/shorthands/border", JSImport.Default)
  @js.native
  def default(sideKeyword: Double, values: (String | Double)*): Styles = js.native
  @JSImport("polished/lib/shorthands/border", JSImport.Default)
  @js.native
  def default(sideKeyword: SideKeyword, values: (String | Double)*): Styles = js.native
}
