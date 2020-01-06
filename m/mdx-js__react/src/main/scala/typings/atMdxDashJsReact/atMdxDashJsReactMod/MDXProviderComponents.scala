package typings.atMdxDashJsReact.atMdxDashJsReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDXProviderComponents extends /**
  * Any other components we wish to define
  */
/* key */ StringDictionary[ReactNode] {
  /**
    * Link	<https://mdxjs.com> or [MDX](https://mdxjs.com)
    */
  var a: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Blockquote	>
    */
  var blockquote: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Code	`\code```
    */
  var code: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Delete	~~strikethrough~~
    */
  var delete: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Emphasis	_emphasis_
    */
  var em: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Heading 1	#
    */
  var h1: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Heading 2	##
    */
  var h2: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Heading 3	###
    */
  var h3: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Heading 4	####
    */
  var h4: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Heading 5	#####
    */
  var h5: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Heading 6	######
    */
  var h6: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Break	---
    */
  var hr: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Image	![alt](https://mdx-logo.now.sh)
    */
  var img: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * InlineCode	`inlineCode`
    */
  var inlineCode: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * List item
    */
  var li: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Ordered list	1.
    */
  var ol: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Paragraph
    */
  var p: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Pre
    */
  var pre: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Strong	**strong**
    */
  var strong: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Table
    */
  var table: js.UndefOr[ComponentType[_]] = js.undefined
  var td: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Table Cell
    */
  var th: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Thematic break	***
    */
  var thematicBreak: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * Table row
    */
  var tr: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * List	-
    */
  var ul: js.UndefOr[ComponentType[_]] = js.undefined
  /**
    * The wrapper component can be used to set the layout for the MDX document.
    * It’s often used to set container width, borders, background colors, etc.
    * However, it’s also unique because it has access to the children passed to
    * it.
    *
    * This means that you can do powerful things with the MDX document
    * elements.
    */
  var wrapper: js.UndefOr[ComponentType[_]] = js.undefined
}

object MDXProviderComponents {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Any other components we wish to define
    */
  /* key */ StringDictionary[ReactNode] = null,
    a: ComponentType[_] = null,
    blockquote: ComponentType[_] = null,
    code: ComponentType[_] = null,
    delete: ComponentType[_] = null,
    em: ComponentType[_] = null,
    h1: ComponentType[_] = null,
    h2: ComponentType[_] = null,
    h3: ComponentType[_] = null,
    h4: ComponentType[_] = null,
    h5: ComponentType[_] = null,
    h6: ComponentType[_] = null,
    hr: ComponentType[_] = null,
    img: ComponentType[_] = null,
    inlineCode: ComponentType[_] = null,
    li: ComponentType[_] = null,
    ol: ComponentType[_] = null,
    p: ComponentType[_] = null,
    pre: ComponentType[_] = null,
    strong: ComponentType[_] = null,
    table: ComponentType[_] = null,
    td: ComponentType[_] = null,
    th: ComponentType[_] = null,
    thematicBreak: ComponentType[_] = null,
    tr: ComponentType[_] = null,
    ul: ComponentType[_] = null,
    wrapper: ComponentType[_] = null
  ): MDXProviderComponents = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (blockquote != null) __obj.updateDynamic("blockquote")(blockquote.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (em != null) __obj.updateDynamic("em")(em.asInstanceOf[js.Any])
    if (h1 != null) __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    if (h2 != null) __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    if (h3 != null) __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    if (h4 != null) __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    if (h5 != null) __obj.updateDynamic("h5")(h5.asInstanceOf[js.Any])
    if (h6 != null) __obj.updateDynamic("h6")(h6.asInstanceOf[js.Any])
    if (hr != null) __obj.updateDynamic("hr")(hr.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (inlineCode != null) __obj.updateDynamic("inlineCode")(inlineCode.asInstanceOf[js.Any])
    if (li != null) __obj.updateDynamic("li")(li.asInstanceOf[js.Any])
    if (ol != null) __obj.updateDynamic("ol")(ol.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (td != null) __obj.updateDynamic("td")(td.asInstanceOf[js.Any])
    if (th != null) __obj.updateDynamic("th")(th.asInstanceOf[js.Any])
    if (thematicBreak != null) __obj.updateDynamic("thematicBreak")(thematicBreak.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDXProviderComponents]
  }
}

