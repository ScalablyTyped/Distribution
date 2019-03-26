package typings
package mdastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mdastMod {
  /* Rewritten from type alias, can be one of: 
    - mdastLib.mdastLibStrings.left
    - mdastLib.mdastLibStrings.right
    - mdastLib.mdastLibStrings.center
    - scala.Null
  */
  type AlignType = _AlignType | scala.Null
  /* Rewritten from type alias, can be one of: 
    - TopLevelContent
    - ListContent
    - TableContent
    - RowContent
    - PhrasingContent
  */
  type Content = _Content | ListContent | TableContent | RowContent | FrontmatterContent
  type FrontmatterContent = YAML
  type ListContent = ListItem
  type RowContent = TableCell
  type TableContent = TableRow
  /* Rewritten from type alias, can be one of: 
    - BlockContent
    - FrontmatterContent
    - DefinitionContent
  */
  type TopLevelContent = _TopLevelContent | FrontmatterContent
}
