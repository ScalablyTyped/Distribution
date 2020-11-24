package typings.next.libUtilsMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/next-server/lib/utils.RenderPageResult & {  styles :std.Array<react.react.ReactElement> | react.react.ReactFragment | undefined} */
@js.native
trait DocumentInitialProps extends js.Object {
  
  var head: js.UndefOr[js.Array[Element | Null]] = js.native
  
  var html: String = js.native
  
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
}
object DocumentInitialProps {
  
  @scala.inline
  def apply(html: String): DocumentInitialProps = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInitialProps]
  }
  
  @scala.inline
  implicit class DocumentInitialPropsOps[Self <: DocumentInitialProps] (val x: Self) extends AnyVal {
    
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadVarargs(value: (Element | Null)*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[Element | Null]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: ReactElement*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
