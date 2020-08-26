package typings.officeUiFabricReact.listTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListOnRenderRootProps[T] extends js.Object {
  /**
    * Props to apply to the list root element.
    */
  var divProps: HTMLAttributes[HTMLDivElement] = js.native
  /**
    * The active pages to be rendered into the list.
    * These will have been rendered using `onRenderPage`.
    */
  var pages: js.Array[IPage[T]] = js.native
  /**
    * The ref to be applied to the list root.
    * The `List` uses this element to track scroll position and sizing.
    */
  var rootRef: Ref[HTMLDivElement] = js.native
  /**
    * The content to be rendered as the list surface element.
    * This will have been rendered using `onRenderSurface`.
    */
  var surfaceElement: Element | Null = js.native
}

object IListOnRenderRootProps {
  @scala.inline
  def apply[T](divProps: HTMLAttributes[HTMLDivElement], pages: js.Array[IPage[T]]): IListOnRenderRootProps[T] = {
    val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOnRenderRootProps[T]]
  }
  @scala.inline
  implicit class IListOnRenderRootPropsOps[Self <: IListOnRenderRootProps[_], T] (val x: Self with IListOnRenderRootProps[T]) extends AnyVal {
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
    def setPagesVarargs(value: IPage[T]*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[IPage[T]]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = this.set("rootRef", js.Any.fromFunction1(value))
    @scala.inline
    def setRootRef(value: Ref[HTMLDivElement]): Self = this.set("rootRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootRefNull: Self = this.set("rootRef", null)
    @scala.inline
    def setSurfaceElement(value: Element): Self = this.set("surfaceElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurfaceElementNull: Self = this.set("surfaceElement", null)
  }
  
}

