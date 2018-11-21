package typings
package mdastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mdastMod {
  type AlignType = mdastLib.mdastLibStrings.left | mdastLib.mdastLibStrings.right | mdastLib.mdastLibStrings.center | scala.Null
  type BlockContent = Paragraph | Heading | ThematicBreak | Blockquote | List | Table | HTML | Code
  type Content = TopLevelContent | ListContent | TableContent | RowContent | PhrasingContent
  type DefinitionContent = Definition | FootnoteDefinition
  type FrontmatterContent = YAML
  type ListContent = ListItem
  type PhrasingContent = StaticPhrasingContent | Link | LinkReference
  type ReferenceType = mdastLib.mdastLibStrings.shortcut | mdastLib.mdastLibStrings.collapsed | mdastLib.mdastLibStrings.full
  type RowContent = TableCell
  type StaticPhrasingContent = Text | Emphasis | Strong | Delete | HTML | InlineCode | Break | Image | ImageReference | Footnote | FootnoteReference
  type TableContent = TableRow
  type TopLevelContent = BlockContent | FrontmatterContent | DefinitionContent
}
