package typings.mdastBuilder

import typings.mdastBuilder.anon.Align
import typings.mdastBuilder.anon.Alt
import typings.mdastBuilder.mdastBuilderStrings.center
import typings.mdastBuilder.mdastBuilderStrings.left
import typings.mdastBuilder.mdastBuilderStrings.ordered
import typings.mdastBuilder.mdastBuilderStrings.right
import typings.mdastBuilder.mdastBuilderStrings.unordered
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import typings.unist.mod.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blockquote(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def blockquote(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def blockquote(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def blockquote(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  @JSImport("mdast-builder", "brk")
  @js.native
  val brk: Node[Data] = js.native
  
  inline def code(lang: String, value: String): typings.mdastBuilder.anon.Data = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(lang.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Data]
  
  inline def emphasis(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasis")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def emphasis(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasis")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def emphasis(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasis")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def emphasis(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasis")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def heading(depth: Double): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("heading")(depth.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def heading(depth: Double, kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("heading")(depth.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def heading(depth: Double, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("heading")(depth.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def heading(depth: Double, kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("heading")(depth.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def html(value: String): Node[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(value.asInstanceOf[js.Any]).asInstanceOf[Node[Data]]
  
  inline def image(url: String): Alt = ^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any]).asInstanceOf[Alt]
  inline def image(url: String, title: String): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: String): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: String, kids: js.Array[Node[Data]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: String, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: String, kids: Node[Data]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: Unit, kids: js.Array[Node[Data]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: Unit, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: String, alt: Unit, kids: Node[Data]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: String): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: String, kids: js.Array[Node[Data]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: String, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: String, kids: Node[Data]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: Unit, kids: js.Array[Node[Data]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: Unit, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  inline def image(url: String, title: Unit, alt: Unit, kids: Node[Data]): Alt = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], alt.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Alt]
  
  inline def inlineCode(value: String): Node[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(value.asInstanceOf[js.Any]).asInstanceOf[Node[Data]]
  
  inline def link(url: String): typings.mdastBuilder.anon.Children = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any]).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: String): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: String, kids: js.Array[Node[Data]]): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: String, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: String, kids: Node[Data]): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: Unit, kids: js.Array[Node[Data]]): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: Unit, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  inline def link(url: String, title: Unit, kids: Node[Data]): typings.mdastBuilder.anon.Children = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[typings.mdastBuilder.anon.Children]
  
  inline def list(ordered: ordered | unordered, kids: Children): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(ordered.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def listItem(kids: Children): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listItem")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def paragraph(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def paragraph(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def paragraph(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def paragraph(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("paragraph")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def root(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def root(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("root")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def root(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("root")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def root(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("root")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def rootWithTitle(depth: Double, title: Children): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rootWithTitle")(depth.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def rootWithTitle(depth: Double, title: Children, kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rootWithTitle")(depth.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def rootWithTitle(depth: Double, title: Children, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rootWithTitle")(depth.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def rootWithTitle(depth: Double, title: Children, kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rootWithTitle")(depth.asInstanceOf[js.Any], title.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  @JSImport("mdast-builder", "separator")
  @js.native
  val separator: Node[Data] = js.native
  
  inline def strike(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strike")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def strike(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strike")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def strike(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strike")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def strike(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strike")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def strong(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def strong(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def strong(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def strong(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("strong")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def table(): Align = ^.asInstanceOf[js.Dynamic].applyDynamic("table")().asInstanceOf[Align]
  inline def table(align: js.Array[left | right | center | Null]): Align = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any]).asInstanceOf[Align]
  inline def table(align: js.Array[left | right | center | Null], kids: js.Array[Node[Data]]): Align = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Align]
  inline def table(
    align: js.Array[left | right | center | Null],
    kids: js.Function0[Node[Data] | js.Array[Node[Data]]]
  ): Align = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Align]
  inline def table(align: js.Array[left | right | center | Null], kids: Node[Data]): Align = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Align]
  inline def table(align: Unit, kids: js.Array[Node[Data]]): Align = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Align]
  inline def table(align: Unit, kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Align = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Align]
  inline def table(align: Unit, kids: Node[Data]): Align = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(align.asInstanceOf[js.Any], kids.asInstanceOf[js.Any])).asInstanceOf[Align]
  
  inline def tableCell(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableCell")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def tableCell(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableCell")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def tableCell(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableCell")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def tableCell(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableCell")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def tableRow(): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableRow")().asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def tableRow(kids: js.Array[Node[Data]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableRow")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def tableRow(kids: js.Function0[Node[Data] | js.Array[Node[Data]]]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableRow")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  inline def tableRow(kids: Node[Data]): Parent[Node[Data], NodeData[Node[Data]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableRow")(kids.asInstanceOf[js.Any]).asInstanceOf[Parent[Node[Data], NodeData[Node[Data]]]]
  
  inline def text(value: String): Node[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(value.asInstanceOf[js.Any]).asInstanceOf[Node[Data]]
  
  type Children = Node[Data] | js.Array[Node[Data]] | (js.Function0[Node[Data] | js.Array[Node[Data]]])
}
