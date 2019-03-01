package typings
package mdastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mdastMod {
  type AlignType = _AlignType | scala.Null
  type Content = _Content | ListContent | TableContent | RowContent
  type FrontmatterContent = YAML
  type ListContent = ListItem
  type RowContent = TableCell
  type TableContent = TableRow
  type TopLevelContent = _TopLevelContent | FrontmatterContent
}
