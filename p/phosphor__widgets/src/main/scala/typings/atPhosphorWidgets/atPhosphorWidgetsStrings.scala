package typings.atPhosphorWidgets

import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayout.Alignment
import typings.atPhosphorWidgets.libBoxlayoutMod.BoxLayout.Direction
import typings.atPhosphorWidgets.libDocklayoutMod.DockLayout.InsertMode
import typings.atPhosphorWidgets.libDockpanelMod.DockPanel.Mode
import typings.atPhosphorWidgets.libLayoutMod.Layout.FitPolicy
import typings.atPhosphorWidgets.libLayoutMod.Layout.HorizontalAlignment
import typings.atPhosphorWidgets.libLayoutMod.Layout.VerticalAlignment
import typings.atPhosphorWidgets.libMenuMod.Menu.ItemType
import typings.atPhosphorWidgets.libTabbarMod.TabBar.InsertBehavior
import typings.atPhosphorWidgets.libTabbarMod.TabBar.Orientation
import typings.atPhosphorWidgets.libTabbarMod.TabBar.RemoveBehavior
import typings.atPhosphorWidgets.libTabpanelMod.TabPanel.TabPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPhosphorWidgetsStrings {
  @js.native
  sealed trait bottom
    extends TabPlacement
       with VerticalAlignment
  
  @js.native
  sealed trait `bottom-to-top` extends Direction
  
  @js.native
  sealed trait center
    extends Alignment
       with typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.Alignment
       with HorizontalAlignment
       with VerticalAlignment
  
  @js.native
  sealed trait command extends ItemType
  
  @js.native
  sealed trait decrement extends js.Object
  
  @js.native
  sealed trait end
    extends Alignment
       with typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.Alignment
  
  @js.native
  sealed trait horizontal
    extends Orientation
       with typings.atPhosphorWidgets.libScrollbarMod.ScrollBar.Orientation
       with typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.Orientation
  
  @js.native
  sealed trait increment extends js.Object
  
  @js.native
  sealed trait justify
    extends Alignment
       with typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.Alignment
  
  @js.native
  sealed trait left
    extends HorizontalAlignment
       with TabPlacement
  
  @js.native
  sealed trait `left-to-right` extends Direction
  
  @js.native
  sealed trait `multiple-document` extends Mode
  
  @js.native
  sealed trait next extends js.Object
  
  @js.native
  sealed trait none
    extends InsertBehavior
       with RemoveBehavior
  
  @js.native
  sealed trait previous extends js.Object
  
  @js.native
  sealed trait right
    extends HorizontalAlignment
       with TabPlacement
  
  @js.native
  sealed trait `right-to-left` extends Direction
  
  @js.native
  sealed trait `select-previous-tab` extends RemoveBehavior
  
  @js.native
  sealed trait `select-tab` extends InsertBehavior
  
  @js.native
  sealed trait `select-tab-after` extends RemoveBehavior
  
  @js.native
  sealed trait `select-tab-before` extends RemoveBehavior
  
  @js.native
  sealed trait `select-tab-if-needed` extends InsertBehavior
  
  @js.native
  sealed trait separator extends ItemType
  
  @js.native
  sealed trait `set-min-size` extends FitPolicy
  
  @js.native
  sealed trait `set-no-constraint` extends FitPolicy
  
  @js.native
  sealed trait `single-document` extends Mode
  
  @js.native
  sealed trait `split-area` extends js.Object
  
  @js.native
  sealed trait `split-bottom` extends InsertMode
  
  @js.native
  sealed trait `split-left` extends InsertMode
  
  @js.native
  sealed trait `split-right` extends InsertMode
  
  @js.native
  sealed trait `split-top` extends InsertMode
  
  @js.native
  sealed trait start
    extends Alignment
       with typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.Alignment
  
  @js.native
  sealed trait submenu extends ItemType
  
  @js.native
  sealed trait `tab-after` extends InsertMode
  
  @js.native
  sealed trait `tab-area` extends js.Object
  
  @js.native
  sealed trait `tab-before` extends InsertMode
  
  @js.native
  sealed trait top
    extends TabPlacement
       with VerticalAlignment
  
  @js.native
  sealed trait `top-to-bottom` extends Direction
  
  @js.native
  sealed trait vertical
    extends Orientation
       with typings.atPhosphorWidgets.libScrollbarMod.ScrollBar.Orientation
       with typings.atPhosphorWidgets.libSplitlayoutMod.SplitLayout.Orientation
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `bottom-to-top`: `bottom-to-top` = "bottom-to-top".asInstanceOf[`bottom-to-top`]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def command: command = "command".asInstanceOf[command]
  @scala.inline
  def decrement: decrement = "decrement".asInstanceOf[decrement]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def increment: increment = "increment".asInstanceOf[increment]
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `left-to-right`: `left-to-right` = "left-to-right".asInstanceOf[`left-to-right`]
  @scala.inline
  def `multiple-document`: `multiple-document` = "multiple-document".asInstanceOf[`multiple-document`]
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def `right-to-left`: `right-to-left` = "right-to-left".asInstanceOf[`right-to-left`]
  @scala.inline
  def `select-previous-tab`: `select-previous-tab` = "select-previous-tab".asInstanceOf[`select-previous-tab`]
  @scala.inline
  def `select-tab`: `select-tab` = "select-tab".asInstanceOf[`select-tab`]
  @scala.inline
  def `select-tab-after`: `select-tab-after` = "select-tab-after".asInstanceOf[`select-tab-after`]
  @scala.inline
  def `select-tab-before`: `select-tab-before` = "select-tab-before".asInstanceOf[`select-tab-before`]
  @scala.inline
  def `select-tab-if-needed`: `select-tab-if-needed` = "select-tab-if-needed".asInstanceOf[`select-tab-if-needed`]
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  @scala.inline
  def `set-min-size`: `set-min-size` = "set-min-size".asInstanceOf[`set-min-size`]
  @scala.inline
  def `set-no-constraint`: `set-no-constraint` = "set-no-constraint".asInstanceOf[`set-no-constraint`]
  @scala.inline
  def `single-document`: `single-document` = "single-document".asInstanceOf[`single-document`]
  @scala.inline
  def `split-area`: `split-area` = "split-area".asInstanceOf[`split-area`]
  @scala.inline
  def `split-bottom`: `split-bottom` = "split-bottom".asInstanceOf[`split-bottom`]
  @scala.inline
  def `split-left`: `split-left` = "split-left".asInstanceOf[`split-left`]
  @scala.inline
  def `split-right`: `split-right` = "split-right".asInstanceOf[`split-right`]
  @scala.inline
  def `split-top`: `split-top` = "split-top".asInstanceOf[`split-top`]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def submenu: submenu = "submenu".asInstanceOf[submenu]
  @scala.inline
  def `tab-after`: `tab-after` = "tab-after".asInstanceOf[`tab-after`]
  @scala.inline
  def `tab-area`: `tab-area` = "tab-area".asInstanceOf[`tab-area`]
  @scala.inline
  def `tab-before`: `tab-before` = "tab-before".asInstanceOf[`tab-before`]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def `top-to-bottom`: `top-to-bottom` = "top-to-bottom".asInstanceOf[`top-to-bottom`]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

