package typings.officeUiFabricReact.listTypesMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IListOnRenderSurfaceProps[T] extends js.Object {
  /**
    * Props to apply to the list surface element.
    */
  var divProps: HTMLAttributes[HTMLDivElement]
  /**
    * The content to be rendered representing all active pages.
    */
  var pageElements: js.Array[Element]
  /**
    * The active pages to be rendered into the list.
    * These will have been rendered using `onRenderPage`.
    */
  var pages: js.Array[IPage[T]]
  /**
    * A ref to be applied to the surface element.
    * The `List` uses this element to track content size and focus.
    */
  var surfaceRef: Ref[HTMLDivElement]
}

object IListOnRenderSurfaceProps {
  @scala.inline
  def apply[T](
    divProps: HTMLAttributes[HTMLDivElement],
    pageElements: js.Array[Element],
    pages: js.Array[IPage[T]],
    surfaceRef: Ref[HTMLDivElement] = null
  ): IListOnRenderSurfaceProps[T] = {
    val __obj = js.Dynamic.literal(divProps = divProps.asInstanceOf[js.Any], pageElements = pageElements.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    if (surfaceRef != null) __obj.updateDynamic("surfaceRef")(surfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListOnRenderSurfaceProps[T]]
  }
}

