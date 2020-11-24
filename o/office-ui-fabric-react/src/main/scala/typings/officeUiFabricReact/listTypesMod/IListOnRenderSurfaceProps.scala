package typings.officeUiFabricReact.listTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IListOnRenderSurfaceProps[T] extends js.Object {
  
  /**
    * Props to apply to the list surface element.
    */
  var divProps: HTMLAttributes[HTMLDivElement] = js.native
  
  /**
    * The content to be rendered representing all active pages.
    */
  var pageElements: js.Array[Element] = js.native
  
  /**
    * The active pages to be rendered into the list.
    * These will have been rendered using `onRenderPage`.
    */
  var pages: js.Array[IPage[T]] = js.native
  
  /**
    * A ref to be applied to the surface element.
    * The `List` uses this element to track content size and focus.
    */
  var surfaceRef: Ref[HTMLDivElement] = js.native
}
object IListOnRenderSurfaceProps {
  
  @scala.inline
  def apply[T](
    divProps: HTMLAttributes[HTMLDivElement],
    pageElements: js.Array[Element],
    pages: js.Array[IPage[T]]
  ): IListOnRenderSurfaceProps[T] = {
    val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pageElements = pageElements.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOnRenderSurfaceProps[T]]
  }
  
  @scala.inline
  implicit class IListOnRenderSurfacePropsOps[Self <: IListOnRenderSurfaceProps[_], T] (val x: Self with IListOnRenderSurfaceProps[T]) extends AnyVal {
    
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
    def setDivProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("divProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageElementsVarargs(value: Element*): Self = this.set("pageElements", js.Array(value :_*))
    
    @scala.inline
    def setPageElements(value: js.Array[Element]): Self = this.set("pageElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: IPage[T]*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[IPage[T]]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("surfaceRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSurfaceRef(value: Ref[HTMLDivElement]): Self = this.set("surfaceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceRefNull: Self = this.set("surfaceRef", null)
  }
}
