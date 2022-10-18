package typings.popperjsCore

import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialOptions
import typings.popperjsCore.libCreatePopperMod.PopperGeneratorArgs
import typings.popperjsCore.libEnumsMod.BasePlacement
import typings.popperjsCore.libEnumsMod.ModifierPhases_
import typings.popperjsCore.libEnumsMod.Placement
import typings.popperjsCore.libEnumsMod.VariationPlacement
import typings.popperjsCore.libModifiersApplyStylesMod.ApplyStylesModifier
import typings.popperjsCore.libModifiersArrowMod.ArrowModifier
import typings.popperjsCore.libModifiersComputeStylesMod.ComputeStylesModifier
import typings.popperjsCore.libModifiersEventListenersMod.EventListenersModifier
import typings.popperjsCore.libModifiersFlipMod.FlipModifier
import typings.popperjsCore.libModifiersHideMod.HideModifier
import typings.popperjsCore.libModifiersOffsetMod.OffsetModifier
import typings.popperjsCore.libModifiersPopperOffsetsMod.PopperOffsetsModifier
import typings.popperjsCore.libModifiersPreventOverflowMod.PreventOverflowModifier
import typings.popperjsCore.libTypesMod.Instance
import typings.popperjsCore.libTypesMod.OptionsGeneric
import typings.popperjsCore.libTypesMod.SideObject
import typings.popperjsCore.libTypesMod.State
import typings.popperjsCore.libTypesMod.VirtualElement
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@popperjs/core/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  val applyStyles: ApplyStylesModifier = js.native
  
  @JSImport("@popperjs/core/lib", "arrow")
  @js.native
  val arrow: ArrowModifier = js.native
  
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
  val computeStyles: ComputeStylesModifier = js.native
  
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperBase")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperBase")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperBase")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperBase[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperBase")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def detectOverflow(state: State): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[SideObject]
  inline def detectOverflow(state: State, options: PartialOptions): SideObject = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideObject]
  
  @JSImport("@popperjs/core/lib", "end")
  @js.native
  val end: typings.popperjsCore.popperjsCoreStrings.end = js.native
  
  @JSImport("@popperjs/core/lib", "eventListeners")
  @js.native
  val eventListeners: EventListenersModifier = js.native
  
  @JSImport("@popperjs/core/lib", "flip")
  @js.native
  val flip: FlipModifier = js.native
  
  @JSImport("@popperjs/core/lib", "hide")
  @js.native
  val hide: HideModifier = js.native
  
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
  val offset: OffsetModifier = js.native
  
  @JSImport("@popperjs/core/lib", "placements")
  @js.native
  val placements: js.Array[Placement] = js.native
  
  @JSImport("@popperjs/core/lib", "popper")
  @js.native
  val popper: typings.popperjsCore.popperjsCoreStrings.popper = js.native
  
  inline def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("popperGenerator")().asInstanceOf[js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ]]
  inline def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("popperGenerator")(generatorOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ]]
  
  @JSImport("@popperjs/core/lib", "popperOffsets")
  @js.native
  val popperOffsets: PopperOffsetsModifier = js.native
  
  @JSImport("@popperjs/core/lib", "preventOverflow")
  @js.native
  val preventOverflow: PreventOverflowModifier = js.native
  
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
