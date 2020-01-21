package typings.mdast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.mdast.mdastStrings.left
    - typings.mdast.mdastStrings.right
    - typings.mdast.mdastStrings.center
    - scala.Null
  */
  type AlignType = typings.mdast.mod._AlignType | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typings.mdast.mod.TopLevelContent
    - typings.mdast.mod.ListContent
    - typings.mdast.mod.TableContent
    - typings.mdast.mod.RowContent
    - typings.mdast.mod.PhrasingContent
  */
  type Content = typings.mdast.mod._Content | typings.mdast.mod.ListContent | typings.mdast.mod.TableContent | typings.mdast.mod.RowContent | typings.mdast.mod.FrontmatterContent
  type FrontmatterContent = typings.mdast.mod.YAML
  type ListContent = typings.mdast.mod.ListItem
  type RowContent = typings.mdast.mod.TableCell
  type TableContent = typings.mdast.mod.TableRow
  /* Rewritten from type alias, can be one of: 
    - typings.mdast.mod.BlockContent
    - typings.mdast.mod.FrontmatterContent
    - typings.mdast.mod.DefinitionContent
  */
  type TopLevelContent = typings.mdast.mod._TopLevelContent | typings.mdast.mod.FrontmatterContent
}
