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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperjsCoreStrings {
  
  @js.native
  sealed trait `[object Window]` extends StObject
  @scala.inline
  def `[object Window]`: `[object Window]` = ("[object Window]").asInstanceOf[`[object Window]`]
  
  @js.native
  sealed trait absolute
    extends StObject
       with PositioningStrategy
  @scala.inline
  def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait afterMain
    extends StObject
       with ModifierPhases_
  @scala.inline
  def afterMain: afterMain = "afterMain".asInstanceOf[afterMain]
  
  @js.native
  sealed trait afterRead
    extends StObject
       with ModifierPhases_
  @scala.inline
  def afterRead: afterRead = "afterRead".asInstanceOf[afterRead]
  
  @js.native
  sealed trait afterWrite
    extends StObject
       with ModifierPhases_
  @scala.inline
  def afterWrite: afterWrite = "afterWrite".asInstanceOf[afterWrite]
  
  @js.native
  sealed trait applyStyles extends StObject
  @scala.inline
  def applyStyles: applyStyles = "applyStyles".asInstanceOf[applyStyles]
  
  @js.native
  sealed trait arrow extends StObject
  @scala.inline
  def arrow: arrow = "arrow".asInstanceOf[arrow]
  
  @js.native
  sealed trait auto
    extends StObject
       with AutoPlacement
       with Placement
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait `auto-end`
    extends StObject
       with AutoPlacement
       with Placement
  @scala.inline
  def `auto-end`: `auto-end` = "auto-end".asInstanceOf[`auto-end`]
  
  @js.native
  sealed trait `auto-start`
    extends StObject
       with AutoPlacement
       with Placement
  @scala.inline
  def `auto-start`: `auto-start` = "auto-start".asInstanceOf[`auto-start`]
  
  @js.native
  sealed trait beforeMain
    extends StObject
       with ModifierPhases_
  @scala.inline
  def beforeMain: beforeMain = "beforeMain".asInstanceOf[beforeMain]
  
  @js.native
  sealed trait beforeRead
    extends StObject
       with ModifierPhases_
  @scala.inline
  def beforeRead: beforeRead = "beforeRead".asInstanceOf[beforeRead]
  
  @js.native
  sealed trait beforeWrite
    extends StObject
       with ModifierPhases_
  @scala.inline
  def beforeWrite: beforeWrite = "beforeWrite".asInstanceOf[beforeWrite]
  
  @js.native
  sealed trait bottom
    extends StObject
       with BasePlacement
       with ComputedPlacement
       with Placement
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-end`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `bottom-end`: `bottom-end` = "bottom-end".asInstanceOf[`bottom-end`]
  
  @js.native
  sealed trait `bottom-start`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `bottom-start`: `bottom-start` = "bottom-start".asInstanceOf[`bottom-start`]
  
  @js.native
  sealed trait clippingParents extends StObject
  @scala.inline
  def clippingParents: clippingParents = "clippingParents".asInstanceOf[clippingParents]
  
  @js.native
  sealed trait computeStyles extends StObject
  @scala.inline
  def computeStyles: computeStyles = "computeStyles".asInstanceOf[computeStyles]
  
  @js.native
  sealed trait document
    extends StObject
       with RootBoundary
  @scala.inline
  def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait end
    extends StObject
       with Variation
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait eventListeners extends StObject
  @scala.inline
  def eventListeners: eventListeners = "eventListeners".asInstanceOf[eventListeners]
  
  @js.native
  sealed trait fixed
    extends StObject
       with PositioningStrategy
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait flip extends StObject
  @scala.inline
  def flip: flip = "flip".asInstanceOf[flip]
  
  @js.native
  sealed trait height extends StObject
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait hide extends StObject
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait left
    extends StObject
       with BasePlacement
       with ComputedPlacement
       with Placement
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left-end`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `left-end`: `left-end` = "left-end".asInstanceOf[`left-end`]
  
  @js.native
  sealed trait `left-start`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `left-start`: `left-start` = "left-start".asInstanceOf[`left-start`]
  
  @js.native
  sealed trait main
    extends StObject
       with ModifierPhases_
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait offset extends StObject
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
  
  @js.native
  sealed trait popper
    extends StObject
       with Context
  @scala.inline
  def popper: popper = "popper".asInstanceOf[popper]
  
  @js.native
  sealed trait popperOffsets extends StObject
  @scala.inline
  def popperOffsets: popperOffsets = "popperOffsets".asInstanceOf[popperOffsets]
  
  @js.native
  sealed trait preventOverflow extends StObject
  @scala.inline
  def preventOverflow: preventOverflow = "preventOverflow".asInstanceOf[preventOverflow]
  
  @js.native
  sealed trait read
    extends StObject
       with ModifierPhases_
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait reference
    extends StObject
       with Context
  @scala.inline
  def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait right
    extends StObject
       with BasePlacement
       with ComputedPlacement
       with Placement
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right-end`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `right-end`: `right-end` = "right-end".asInstanceOf[`right-end`]
  
  @js.native
  sealed trait `right-start`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `right-start`: `right-start` = "right-start".asInstanceOf[`right-start`]
  
  @js.native
  sealed trait start
    extends StObject
       with Variation
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait top
    extends StObject
       with BasePlacement
       with ComputedPlacement
       with Placement
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-end`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `top-end`: `top-end` = "top-end".asInstanceOf[`top-end`]
  
  @js.native
  sealed trait `top-start`
    extends StObject
       with ComputedPlacement
       with Placement
       with VariationPlacement
  @scala.inline
  def `top-start`: `top-start` = "top-start".asInstanceOf[`top-start`]
  
  @js.native
  sealed trait viewport
    extends StObject
       with RootBoundary
  @scala.inline
  def viewport: viewport = "viewport".asInstanceOf[viewport]
  
  @js.native
  sealed trait width extends StObject
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait write
    extends StObject
       with ModifierPhases_
  @scala.inline
  def write: write = "write".asInstanceOf[write]
  
  @js.native
  sealed trait x extends StObject
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  @scala.inline
  def y: y = "y".asInstanceOf[y]
}
