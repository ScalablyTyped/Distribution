package typings.atPhosphorWidgets.libWidgetMod.Widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Flag extends js.Object

/**
  * An enum of widget bit flags.
  */
@JSImport("@phosphor/widgets/lib/widget", "Widget.Flag")
@js.native
object Flag extends js.Object {
  /**
    * A layout cannot be set on the widget.
    */
  @js.native
  sealed trait DisallowLayout extends Flag
  
  /**
    * The widget is attached to the DOM.
    */
  @js.native
  sealed trait IsAttached extends Flag
  
  /**
    * The widget has been disposed.
    */
  @js.native
  sealed trait IsDisposed extends Flag
  
  /**
    * The widget is hidden.
    */
  @js.native
  sealed trait IsHidden extends Flag
  
  /**
    * The widget is visible.
    */
  @js.native
  sealed trait IsVisible extends Flag
  
  /* 16 */ val DisallowLayout: typings.atPhosphorWidgets.libWidgetMod.Widget.Flag.DisallowLayout with Double = js.native
  /* 2 */ val IsAttached: typings.atPhosphorWidgets.libWidgetMod.Widget.Flag.IsAttached with Double = js.native
  /* 1 */ val IsDisposed: typings.atPhosphorWidgets.libWidgetMod.Widget.Flag.IsDisposed with Double = js.native
  /* 4 */ val IsHidden: typings.atPhosphorWidgets.libWidgetMod.Widget.Flag.IsHidden with Double = js.native
  /* 8 */ val IsVisible: typings.atPhosphorWidgets.libWidgetMod.Widget.Flag.IsVisible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Flag with Double] = js.native
}

