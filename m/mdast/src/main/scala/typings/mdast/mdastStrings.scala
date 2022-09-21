package typings.mdast

import typings.mdast.mod.BlockContent
import typings.mdast.mod.Content
import typings.mdast.mod.DefinitionContent
import typings.mdast.mod.ListContent
import typings.mdast.mod.PhrasingContent
import typings.mdast.mod.ReferenceType
import typings.mdast.mod.RowContent
import typings.mdast.mod.StaticPhrasingContent
import typings.mdast.mod.TableContent
import typings.mdast.mod.TopLevelContent
import typings.mdast.mod._AlignType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mdastStrings {
  
  @js.native
  sealed trait align
    extends StObject
       with BlockContent
       with Content
       with TopLevelContent
  inline def align: align = "align".asInstanceOf[align]
  
  @js.native
  sealed trait blockquote extends StObject
  inline def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @js.native
  sealed trait break extends StObject
  inline def break: break = "break".asInstanceOf[break]
  
  @js.native
  sealed trait center
    extends StObject
       with _AlignType
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait checked
    extends StObject
       with Content
       with ListContent
  inline def checked: checked = "checked".asInstanceOf[checked]
  
  @js.native
  sealed trait children
    extends StObject
       with BlockContent
       with Content
       with DefinitionContent
       with ListContent
       with PhrasingContent
       with RowContent
       with StaticPhrasingContent
       with TableContent
       with TopLevelContent
  inline def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait code extends StObject
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait collapsed
    extends StObject
       with ReferenceType
  inline def collapsed: collapsed = "collapsed".asInstanceOf[collapsed]
  
  @js.native
  sealed trait definition extends StObject
  inline def definition: definition = "definition".asInstanceOf[definition]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait depth
    extends StObject
       with BlockContent
       with Content
       with TopLevelContent
  inline def depth: depth = "depth".asInstanceOf[depth]
  
  @js.native
  sealed trait emphasis extends StObject
  inline def emphasis: emphasis = "emphasis".asInstanceOf[emphasis]
  
  @js.native
  sealed trait footnote extends StObject
  inline def footnote: footnote = "footnote".asInstanceOf[footnote]
  
  @js.native
  sealed trait footnoteDefinition extends StObject
  inline def footnoteDefinition: footnoteDefinition = "footnoteDefinition".asInstanceOf[footnoteDefinition]
  
  @js.native
  sealed trait footnoteReference extends StObject
  inline def footnoteReference: footnoteReference = "footnoteReference".asInstanceOf[footnoteReference]
  
  @js.native
  sealed trait full
    extends StObject
       with ReferenceType
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait heading extends StObject
  inline def heading: heading = "heading".asInstanceOf[heading]
  
  @js.native
  sealed trait html extends StObject
  inline def html: html = "html".asInstanceOf[html]
  
  @js.native
  sealed trait image extends StObject
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait imageReference extends StObject
  inline def imageReference: imageReference = "imageReference".asInstanceOf[imageReference]
  
  @js.native
  sealed trait inlineCode extends StObject
  inline def inlineCode: inlineCode = "inlineCode".asInstanceOf[inlineCode]
  
  @js.native
  sealed trait lang
    extends StObject
       with BlockContent
       with Content
       with TopLevelContent
  inline def lang: lang = "lang".asInstanceOf[lang]
  
  @js.native
  sealed trait left
    extends StObject
       with _AlignType
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linkReference extends StObject
  inline def linkReference: linkReference = "linkReference".asInstanceOf[linkReference]
  
  @js.native
  sealed trait list extends StObject
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait listItem extends StObject
  inline def listItem: listItem = "listItem".asInstanceOf[listItem]
  
  @js.native
  sealed trait meta
    extends StObject
       with BlockContent
       with Content
       with TopLevelContent
  inline def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait ordered
    extends StObject
       with BlockContent
       with Content
       with TopLevelContent
  inline def ordered: ordered = "ordered".asInstanceOf[ordered]
  
  @js.native
  sealed trait paragraph extends StObject
  inline def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @js.native
  sealed trait right
    extends StObject
       with _AlignType
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait root extends StObject
  inline def root: root = "root".asInstanceOf[root]
  
  @js.native
  sealed trait shortcut
    extends StObject
       with ReferenceType
  inline def shortcut: shortcut = "shortcut".asInstanceOf[shortcut]
  
  @js.native
  sealed trait spread
    extends StObject
       with BlockContent
       with Content
       with ListContent
       with TopLevelContent
  inline def spread: spread = "spread".asInstanceOf[spread]
  
  @js.native
  sealed trait start
    extends StObject
       with BlockContent
       with Content
       with TopLevelContent
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait strong extends StObject
  inline def strong: strong = "strong".asInstanceOf[strong]
  
  @js.native
  sealed trait table extends StObject
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait tableCell extends StObject
  inline def tableCell: tableCell = "tableCell".asInstanceOf[tableCell]
  
  @js.native
  sealed trait tableRow extends StObject
  inline def tableRow: tableRow = "tableRow".asInstanceOf[tableRow]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait thematicBreak extends StObject
  inline def thematicBreak: thematicBreak = "thematicBreak".asInstanceOf[thematicBreak]
  
  @js.native
  sealed trait `type`
    extends StObject
       with BlockContent
       with Content
       with DefinitionContent
       with ListContent
       with PhrasingContent
       with RowContent
       with StaticPhrasingContent
       with TableContent
       with TopLevelContent
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait yaml extends StObject
  inline def yaml: yaml = "yaml".asInstanceOf[yaml]
}
