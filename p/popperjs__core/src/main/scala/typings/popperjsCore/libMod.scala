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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  
  val afterMain: typings.popperjsCore.popperjsCoreStrings.afterMain = js.native
  
  val afterRead: typings.popperjsCore.popperjsCoreStrings.afterRead = js.native
  
  val afterWrite: typings.popperjsCore.popperjsCoreStrings.afterWrite = js.native
  
  val applyStyles: Modifier[typings.popperjsCore.popperjsCoreStrings.applyStyles, js.Object] = js.native
  
  val arrow: Modifier[typings.popperjsCore.popperjsCoreStrings.arrow, Options] = js.native
  
  val auto: typings.popperjsCore.popperjsCoreStrings.auto = js.native
  
  val basePlacements: js.Array[BasePlacement] = js.native
  
  val beforeMain: typings.popperjsCore.popperjsCoreStrings.beforeMain = js.native
  
  val beforeRead: typings.popperjsCore.popperjsCoreStrings.beforeRead = js.native
  
  val beforeWrite: typings.popperjsCore.popperjsCoreStrings.beforeWrite = js.native
  
  val bottom: typings.popperjsCore.popperjsCoreStrings.bottom = js.native
  
  val clippingParents: typings.popperjsCore.popperjsCoreStrings.clippingParents = js.native
  
  val computeStyles: Modifier[
    typings.popperjsCore.popperjsCoreStrings.computeStyles, 
    typings.popperjsCore.computeStylesMod.Options
  ] = js.native
  
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  def detectOverflow(state: State): SideObject = js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  val end: typings.popperjsCore.popperjsCoreStrings.end = js.native
  
  val eventListeners: Modifier[
    typings.popperjsCore.popperjsCoreStrings.eventListeners, 
    typings.popperjsCore.eventListenersMod.Options
  ] = js.native
  
  val flip: Modifier[
    typings.popperjsCore.popperjsCoreStrings.flip, 
    typings.popperjsCore.flipMod.Options
  ] = js.native
  
  val hide: Modifier[typings.popperjsCore.popperjsCoreStrings.hide, js.Object] = js.native
  
  val left: typings.popperjsCore.popperjsCoreStrings.left = js.native
  
  val main: typings.popperjsCore.popperjsCoreStrings.main = js.native
  
  val modifierPhases: js.Array[ModifierPhases_] = js.native
  
  val offset: Modifier[
    typings.popperjsCore.popperjsCoreStrings.offset, 
    typings.popperjsCore.offsetMod.Options
  ] = js.native
  
  val placements: js.Array[Placement] = js.native
  
  val popper: typings.popperjsCore.popperjsCoreStrings.popper = js.native
  
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  
  val popperOffsets: Modifier[typings.popperjsCore.popperjsCoreStrings.popperOffsets, js.Object] = js.native
  
  val preventOverflow: Modifier[
    typings.popperjsCore.popperjsCoreStrings.preventOverflow, 
    typings.popperjsCore.preventOverflowMod.Options
  ] = js.native
  
  val read: typings.popperjsCore.popperjsCoreStrings.read = js.native
  
  val reference: typings.popperjsCore.popperjsCoreStrings.reference = js.native
  
  val right: typings.popperjsCore.popperjsCoreStrings.right = js.native
  
  val start: typings.popperjsCore.popperjsCoreStrings.start = js.native
  
  val top: typings.popperjsCore.popperjsCoreStrings.top = js.native
  
  val variationPlacements: js.Array[VariationPlacement] = js.native
  
  val viewport: typings.popperjsCore.popperjsCoreStrings.viewport = js.native
  
  val write: typings.popperjsCore.popperjsCoreStrings.write = js.native
}
