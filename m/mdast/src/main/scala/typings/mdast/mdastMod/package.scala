package typings.mdast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mdastMod {
  /* Rewritten from type alias, can be one of: 
    - typings.mdast.mdastStrings.left
    - typings.mdast.mdastStrings.right
    - typings.mdast.mdastStrings.center
    - scala.Null
  */
  type AlignType = _AlignType | Null
  /* Rewritten from type alias, can be one of: 
    - typings.mdast.mdastMod.TopLevelContent
    - typings.mdast.mdastMod.ListContent
    - typings.mdast.mdastMod.TableContent
    - typings.mdast.mdastMod.RowContent
    - typings.mdast.mdastMod.PhrasingContent
  */
  type Content = _Content | ListContent | TableContent | RowContent | FrontmatterContent
  type FrontmatterContent = YAML
  type ListContent = ListItem
  type RowContent = TableCell
  type TableContent = TableRow
  /* Rewritten from type alias, can be one of: 
    - typings.mdast.mdastMod.BlockContent
    - typings.mdast.mdastMod.FrontmatterContent
    - typings.mdast.mdastMod.DefinitionContent
  */
  type TopLevelContent = _TopLevelContent | FrontmatterContent
}
