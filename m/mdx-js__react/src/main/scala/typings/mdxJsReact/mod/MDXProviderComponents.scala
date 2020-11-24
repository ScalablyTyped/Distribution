package typings.mdxJsReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDXProviderComponents extends /**
  * Any other components we wish to define
  */
/* key */ StringDictionary[ReactNode] {
  
  /**
    * Link    <https://mdxjs.com> or [MDX](https://mdxjs.com)
    */
  var a: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Blockquote    >
    */
  var blockquote: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Code    `\code```
    */
  var code: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Delete    ~~strikethrough~~
    */
  var delete: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Emphasis    _emphasis_
    */
  var em: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Heading 1    #
    */
  var h1: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Heading 2    ##
    */
  var h2: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Heading 3    ###
    */
  var h3: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Heading 4    ####
    */
  var h4: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Heading 5    #####
    */
  var h5: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Heading 6    ######
    */
  var h6: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Break    ---
    */
  var hr: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Image    ![alt](https://mdx-logo.now.sh)
    */
  var img: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * InlineCode    `inlineCode`
    */
  var inlineCode: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * List item
    */
  var li: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Ordered list    1.
    */
  var ol: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Paragraph
    */
  var p: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Pre
    */
  var pre: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Strong    **strong**
    */
  var strong: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Table
    */
  var table: js.UndefOr[ComponentType[_]] = js.native
  
  var td: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Table Cell
    */
  var th: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Thematic break    ***
    */
  var thematicBreak: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * Table row
    */
  var tr: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * List    -
    */
  var ul: js.UndefOr[ComponentType[_]] = js.native
  
  /**
    * The wrapper component can be used to set the layout for the MDX document.
    * It’s often used to set container width, borders, background colors, etc.
    * However, it’s also unique because it has access to the children passed to
    * it.
    *
    * This means that you can do powerful things with the MDX document
    * elements.
    */
  var wrapper: js.UndefOr[ComponentType[_]] = js.native
}
object MDXProviderComponents {
  
  @scala.inline
  def apply(): MDXProviderComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDXProviderComponents]
  }
  
  @scala.inline
  implicit class MDXProviderComponentsOps[Self <: MDXProviderComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setA(value: ComponentType[_]): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    
    @scala.inline
    def setBlockquote(value: ComponentType[_]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockquote: Self = this.set("blockquote", js.undefined)
    
    @scala.inline
    def setCode(value: ComponentType[_]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDelete(value: ComponentType[_]): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setEm(value: ComponentType[_]): Self = this.set("em", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEm: Self = this.set("em", js.undefined)
    
    @scala.inline
    def setH1(value: ComponentType[_]): Self = this.set("h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH1: Self = this.set("h1", js.undefined)
    
    @scala.inline
    def setH2(value: ComponentType[_]): Self = this.set("h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH2: Self = this.set("h2", js.undefined)
    
    @scala.inline
    def setH3(value: ComponentType[_]): Self = this.set("h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH3: Self = this.set("h3", js.undefined)
    
    @scala.inline
    def setH4(value: ComponentType[_]): Self = this.set("h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH4: Self = this.set("h4", js.undefined)
    
    @scala.inline
    def setH5(value: ComponentType[_]): Self = this.set("h5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH5: Self = this.set("h5", js.undefined)
    
    @scala.inline
    def setH6(value: ComponentType[_]): Self = this.set("h6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH6: Self = this.set("h6", js.undefined)
    
    @scala.inline
    def setHr(value: ComponentType[_]): Self = this.set("hr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHr: Self = this.set("hr", js.undefined)
    
    @scala.inline
    def setImg(value: ComponentType[_]): Self = this.set("img", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    
    @scala.inline
    def setInlineCode(value: ComponentType[_]): Self = this.set("inlineCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineCode: Self = this.set("inlineCode", js.undefined)
    
    @scala.inline
    def setLi(value: ComponentType[_]): Self = this.set("li", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLi: Self = this.set("li", js.undefined)
    
    @scala.inline
    def setOl(value: ComponentType[_]): Self = this.set("ol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOl: Self = this.set("ol", js.undefined)
    
    @scala.inline
    def setP(value: ComponentType[_]): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    
    @scala.inline
    def setPre(value: ComponentType[_]): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    
    @scala.inline
    def setStrong(value: ComponentType[_]): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    
    @scala.inline
    def setTable(value: ComponentType[_]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    
    @scala.inline
    def setTd(value: ComponentType[_]): Self = this.set("td", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTd: Self = this.set("td", js.undefined)
    
    @scala.inline
    def setTh(value: ComponentType[_]): Self = this.set("th", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTh: Self = this.set("th", js.undefined)
    
    @scala.inline
    def setThematicBreak(value: ComponentType[_]): Self = this.set("thematicBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThematicBreak: Self = this.set("thematicBreak", js.undefined)
    
    @scala.inline
    def setTr(value: ComponentType[_]): Self = this.set("tr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
    
    @scala.inline
    def setUl(value: ComponentType[_]): Self = this.set("ul", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
    
    @scala.inline
    def setWrapper(value: ComponentType[_]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
