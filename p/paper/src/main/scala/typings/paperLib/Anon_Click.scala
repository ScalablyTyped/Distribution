package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Click extends js.Object {
  var click: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var doubleclick: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var frame: js.UndefOr[js.Function1[/* event */ paperLib.paperNs.IFrameEvent, scala.Unit]] = js.undefined
  var mousedown: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mousedrag: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mouseenter: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mouseleave: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mousemove: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
  var mouseup: js.UndefOr[
    js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean]
  ] = js.undefined
}

object Anon_Click {
  @scala.inline
  def apply(
    click: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    doubleclick: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    frame: js.Function1[/* event */ paperLib.paperNs.IFrameEvent, scala.Unit] = null,
    mousedown: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    mousedrag: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    mouseenter: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    mouseleave: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    mousemove: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null,
    mouseup: js.Function1[/* event */ paperLib.paperNs.MouseEvent, scala.Unit | scala.Boolean] = null
  ): Anon_Click = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    if (doubleclick != null) __obj.updateDynamic("doubleclick")(doubleclick)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (mousedown != null) __obj.updateDynamic("mousedown")(mousedown)
    if (mousedrag != null) __obj.updateDynamic("mousedrag")(mousedrag)
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(mouseenter)
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(mouseleave)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseup != null) __obj.updateDynamic("mouseup")(mouseup)
    __obj.asInstanceOf[Anon_Click]
  }
}

