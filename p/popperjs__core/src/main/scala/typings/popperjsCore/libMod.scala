package typings.popperjsCore

import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialOptions
import typings.popperjsCore.arrowMod.Options
import typings.popperjsCore.createPopperMod.PopperGeneratorArgs
import typings.popperjsCore.enumsMod.BasePlacement
import typings.popperjsCore.enumsMod.ModifierPhases_
import typings.popperjsCore.enumsMod.Placement
import typings.popperjsCore.enumsMod.VariationPlacement
import typings.popperjsCore.typesMod.Instance
import typings.popperjsCore.typesMod.Modifier
import typings.popperjsCore.typesMod.OptionsGeneric
import typings.popperjsCore.typesMod.SideObject
import typings.popperjsCore.typesMod.State
import typings.popperjsCore.typesMod.VirtualElement
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@popperjs/core/lib", "afterMain")
  @js.native
  val afterMain: typings.popperjsCore.popperjsCoreStrings.afterMain = js.native
  
  @JSImport("@popperjs/core/lib", "afterRead")
  @js.native
  val afterRead: typings.popperjsCore.popperjsCoreStrings.afterRead = js.native
  
  @JSImport("@popperjs/core/lib", "afterWrite")
  @js.native
  val afterWrite: typings.popperjsCore.popperjsCoreStrings.afterWrite = js.native
  
  @JSImport("@popperjs/core/lib", "applyStyles")
  @js.native
  val applyStyles: Modifier[typings.popperjsCore.popperjsCoreStrings.applyStyles, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib", "arrow")
  @js.native
  val arrow: Modifier[typings.popperjsCore.popperjsCoreStrings.arrow, Options] = js.native
  
  @JSImport("@popperjs/core/lib", "auto")
  @js.native
  val auto: typings.popperjsCore.popperjsCoreStrings.auto = js.native
  
  @JSImport("@popperjs/core/lib", "basePlacements")
  @js.native
  val basePlacements: js.Array[BasePlacement] = js.native
  
  @JSImport("@popperjs/core/lib", "beforeMain")
  @js.native
  val beforeMain: typings.popperjsCore.popperjsCoreStrings.beforeMain = js.native
  
  @JSImport("@popperjs/core/lib", "beforeRead")
  @js.native
  val beforeRead: typings.popperjsCore.popperjsCoreStrings.beforeRead = js.native
  
  @JSImport("@popperjs/core/lib", "beforeWrite")
  @js.native
  val beforeWrite: typings.popperjsCore.popperjsCoreStrings.beforeWrite = js.native
  
  @JSImport("@popperjs/core/lib", "bottom")
  @js.native
  val bottom: typings.popperjsCore.popperjsCoreStrings.bottom = js.native
  
  @JSImport("@popperjs/core/lib", "clippingParents")
  @js.native
  val clippingParents: typings.popperjsCore.popperjsCoreStrings.clippingParents = js.native
  
  @JSImport("@popperjs/core/lib", "computeStyles")
  @js.native
  val computeStyles: Modifier[
    typings.popperjsCore.popperjsCoreStrings.computeStyles, 
    typings.popperjsCore.computeStylesMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperBase")
  @js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib", "detectOverflow")
  @js.native
  def detectOverflow(state: State): SideObject = js.native
  @JSImport("@popperjs/core/lib", "detectOverflow")
  @js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  @JSImport("@popperjs/core/lib", "end")
  @js.native
  val end: typings.popperjsCore.popperjsCoreStrings.end = js.native
  
  @JSImport("@popperjs/core/lib", "eventListeners")
  @js.native
  val eventListeners: Modifier[
    typings.popperjsCore.popperjsCoreStrings.eventListeners, 
    typings.popperjsCore.eventListenersMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "flip")
  @js.native
  val flip: Modifier[
    typings.popperjsCore.popperjsCoreStrings.flip, 
    typings.popperjsCore.flipMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "hide")
  @js.native
  val hide: Modifier[typings.popperjsCore.popperjsCoreStrings.hide, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib", "left")
  @js.native
  val left: typings.popperjsCore.popperjsCoreStrings.left = js.native
  
  @JSImport("@popperjs/core/lib", "main")
  @js.native
  val main: typings.popperjsCore.popperjsCoreStrings.main = js.native
  
  @JSImport("@popperjs/core/lib", "modifierPhases")
  @js.native
  val modifierPhases: js.Array[ModifierPhases_] = js.native
  
  @JSImport("@popperjs/core/lib", "offset")
  @js.native
  val offset: Modifier[
    typings.popperjsCore.popperjsCoreStrings.offset, 
    typings.popperjsCore.offsetMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
  
  @JSImport("@popperjs/core/lib", "popper")
  @js.native
  val popper: typings.popperjsCore.popperjsCoreStrings.popper = js.native
  
  @JSImport("@popperjs/core/lib", "popperGenerator")
  @js.native
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  @JSImport("@popperjs/core/lib", "popperGenerator")
  @js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "popperOffsets")
  @js.native
  val popperOffsets: Modifier[typings.popperjsCore.popperjsCoreStrings.popperOffsets, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib", "preventOverflow")
  @js.native
  val preventOverflow: Modifier[
    typings.popperjsCore.popperjsCoreStrings.preventOverflow, 
    typings.popperjsCore.preventOverflowMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib", "read")
  @js.native
  val read: typings.popperjsCore.popperjsCoreStrings.read = js.native
  
  @JSImport("@popperjs/core/lib", "reference")
  @js.native
  val reference: typings.popperjsCore.popperjsCoreStrings.reference = js.native
  
  @JSImport("@popperjs/core/lib", "right")
  @js.native
  val right: typings.popperjsCore.popperjsCoreStrings.right = js.native
  
  @JSImport("@popperjs/core/lib", "start")
  @js.native
  val start: typings.popperjsCore.popperjsCoreStrings.start = js.native
  
  @JSImport("@popperjs/core/lib", "top")
  @js.native
  val top: typings.popperjsCore.popperjsCoreStrings.top = js.native
  
  @JSImport("@popperjs/core/lib", "variationPlacements")
  @js.native
  val variationPlacements: js.Array[VariationPlacement] = js.native
  
  @JSImport("@popperjs/core/lib", "viewport")
  @js.native
  val viewport: typings.popperjsCore.popperjsCoreStrings.viewport = js.native
  
  @JSImport("@popperjs/core/lib", "write")
  @js.native
  val write: typings.popperjsCore.popperjsCoreStrings.write = js.native
}
