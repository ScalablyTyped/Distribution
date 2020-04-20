package typings.officeUiFabricReact.listTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOnRenderRootProps[T] extends js.Object {
  /**
    * Props to apply to the list root element.
    */
  var divProps: HTMLAttributes[HTMLDivElement]
  /**
    * The active pages to be rendered into the list.
    * These will have been rendered using `onRenderPage`.
    */
  var pages: js.Array[IPage[T]]
  /**
    * The ref to be applied to the list root.
    * The `List` uses this element to track scroll position and sizing.
    */
  var rootRef: Ref[HTMLDivElement]
  /**
    * The content to be rendered as the list surface element.
    * This will have been rendered using `onRenderSurface`.
    */
  var surfaceElement: Element | Null
}

object IListOnRenderRootProps {
  @scala.inline
  def apply[T](
    divProps: HTMLAttributes[HTMLDivElement],
    pages: js.Array[IPage[T]],
    rootRef: Ref[HTMLDivElement] = null,
    surfaceElement: Element = null
  ): IListOnRenderRootProps[T] = {
    val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    if (rootRef != null) __obj.updateDynamic("rootRef")(rootRef.asInstanceOf[js.Any])
    if (surfaceElement != null) __obj.updateDynamic("surfaceElement")(surfaceElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOnRenderRootProps[T]]
  }
}

