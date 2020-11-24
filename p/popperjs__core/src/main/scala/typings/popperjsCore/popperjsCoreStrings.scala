package typings.popperjsCore

import typings.popperjsCore.enumsMod.AutoPlacement
import typings.popperjsCore.enumsMod.BasePlacement
import typings.popperjsCore.enumsMod.ComputedPlacement
import typings.popperjsCore.enumsMod.Context
import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.RootBoundary
import typings.popperjsCore.enumsMod.Variation
import typings.popperjsCore.enumsMod.VariationPlacement
import typings.popperjsCore.typesMod.PositioningStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperjsCoreStrings {
  
  @scala.inline
  def `[object Window]`: `[object Window]` = ("[object Window]").asInstanceOf[`[object Window]`]
  
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @scala.inline
  def afterMain: afterMain = "afterMain".asInstanceOf[afterMain]
  
  @scala.inline
  def afterRead: afterRead = "afterRead".asInstanceOf[afterRead]
  
  @scala.inline
  def afterWrite: afterWrite = "afterWrite".asInstanceOf[afterWrite]
  
  @scala.inline
  def applyStyles: applyStyles = "applyStyles".asInstanceOf[applyStyles]
  
  @scala.inline
  def arrow: arrow = "arrow".asInstanceOf[arrow]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def `auto-end`: `auto-end` = "auto-end".asInstanceOf[`auto-end`]
  
  @scala.inline
  def `auto-start`: `auto-start` = "auto-start".asInstanceOf[`auto-start`]
  
  @scala.inline
  def beforeMain: beforeMain = "beforeMain".asInstanceOf[beforeMain]
  
  @scala.inline
  def beforeRead: beforeRead = "beforeRead".asInstanceOf[beforeRead]
  
  @scala.inline
  def beforeWrite: beforeWrite = "beforeWrite".asInstanceOf[beforeWrite]
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def `bottom-end`: `bottom-end` = "bottom-end".asInstanceOf[`bottom-end`]
  
  @scala.inline
  def `bottom-start`: `bottom-start` = "bottom-start".asInstanceOf[`bottom-start`]
  
  @scala.inline
  def clippingParents: clippingParents = "clippingParents".asInstanceOf[clippingParents]
  
  @scala.inline
  def computeStyles: computeStyles = "computeStyles".asInstanceOf[computeStyles]
  
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def eventListeners: eventListeners = "eventListeners".asInstanceOf[eventListeners]
  
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def `left-end`: `left-end` = "left-end".asInstanceOf[`left-end`]
  
  @scala.inline
  def `left-start`: `left-start` = "left-start".asInstanceOf[`left-start`]
  
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
  
  @scala.inline
  def popper: popper = "popper".asInstanceOf[popper]
  
  @scala.inline
  def popperOffsets: popperOffsets = "popperOffsets".asInstanceOf[popperOffsets]
  
  @scala.inline
  def preventOverflow: preventOverflow = "preventOverflow".asInstanceOf[preventOverflow]
  
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @scala.inline
  def reference: reference = "reference".asInstanceOf[reference]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def `right-end`: `right-end` = "right-end".asInstanceOf[`right-end`]
  
  @scala.inline
  def `right-start`: `right-start` = "right-start".asInstanceOf[`right-start`]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def `top-end`: `top-end` = "top-end".asInstanceOf[`top-end`]
  
  @scala.inline
  def `top-start`: `top-start` = "top-start".asInstanceOf[`top-start`]
  
  @scala.inline
  def viewport: viewport = "viewport".asInstanceOf[viewport]
  
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  
  @scala.inline
  def write: write = "write".asInstanceOf[write]
  
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait `[object Window]` extends js.Object
  
  @js.native
  sealed trait absolute extends PositioningStrategy
  
  @js.native
  sealed trait afterMain extends ModifierPhases_
  
  @js.native
  sealed trait afterRead extends ModifierPhases_
  
  @js.native
  sealed trait afterWrite extends ModifierPhases_
  
  @js.native
  sealed trait applyStyles extends js.Object
  
  @js.native
  sealed trait arrow extends js.Object
  
  @js.native
  sealed trait auto
    extends AutoPlacement
       with Placement
  
  @js.native
  sealed trait `auto-end`
    extends AutoPlacement
       with Placement
  
  @js.native
  sealed trait `auto-start`
    extends AutoPlacement
       with Placement
  
  @js.native
  sealed trait beforeMain extends ModifierPhases_
  
  @js.native
  sealed trait beforeRead extends ModifierPhases_
  
  @js.native
  sealed trait beforeWrite extends ModifierPhases_
  
  @js.native
  sealed trait bottom
    extends BasePlacement
       with ComputedPlacement
       with Placement
  
  @js.native
  sealed trait `bottom-end`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait `bottom-start`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait clippingParents extends js.Object
  
  @js.native
  sealed trait computeStyles extends js.Object
  
  @js.native
  sealed trait document extends RootBoundary
  
  @js.native
  sealed trait end extends Variation
  
  @js.native
  sealed trait eventListeners extends js.Object
  
  @js.native
  sealed trait fixed extends PositioningStrategy
  
  @js.native
  sealed trait flip extends js.Object
  
  @js.native
  sealed trait height extends js.Object
  
  @js.native
  sealed trait hide extends js.Object
  
  @js.native
  sealed trait left
    extends BasePlacement
       with ComputedPlacement
       with Placement
  
  @js.native
  sealed trait `left-end`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait `left-start`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait main extends ModifierPhases_
  
  @js.native
  sealed trait offset extends js.Object
  
  @js.native
  sealed trait popper extends Context
  
  @js.native
  sealed trait popperOffsets extends js.Object
  
  @js.native
  sealed trait preventOverflow extends js.Object
  
  @js.native
  sealed trait read extends ModifierPhases_
  
  @js.native
  sealed trait reference extends Context
  
  @js.native
  sealed trait right
    extends BasePlacement
       with ComputedPlacement
       with Placement
  
  @js.native
  sealed trait `right-end`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait `right-start`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait start extends Variation
  
  @js.native
  sealed trait top
    extends BasePlacement
       with ComputedPlacement
       with Placement
  
  @js.native
  sealed trait `top-end`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait `top-start`
    extends ComputedPlacement
       with Placement
       with VariationPlacement
  
  @js.native
  sealed trait viewport extends RootBoundary
  
  @js.native
  sealed trait width extends js.Object
  
  @js.native
  sealed trait write extends ModifierPhases_
  
  @js.native
  sealed trait x extends js.Object
  
  @js.native
  sealed trait y extends js.Object
}
