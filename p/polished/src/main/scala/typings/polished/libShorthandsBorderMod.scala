package typings.polished

import typings.polished.libTypesSideKeywordMod.SideKeyword
import typings.polished.libTypesStyleMod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polished/lib/shorthands/border", JSImport.Namespace)
@js.native
object libShorthandsBorderMod extends js.Object {
  def default(sideKeyword: String, values: (String | Double)*): Styles = js.native
  def default(sideKeyword: Double, values: (String | Double)*): Styles = js.native
  def default(sideKeyword: SideKeyword, values: (String | Double)*): Styles = js.native
}

