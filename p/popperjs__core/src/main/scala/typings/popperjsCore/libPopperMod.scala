package typings.popperjsCore

import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialOptions
import typings.popperjsCore.libCreatePopperMod.PopperGeneratorArgs
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

object libPopperMod {
  
  @JSImport("@popperjs/core/lib/popper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@popperjs/core/lib/popper", "applyStyles")
  @js.native
  val applyStyles: ApplyStylesModifier = js.native
  
  @JSImport("@popperjs/core/lib/popper", "arrow")
  @js.native
  val arrow: ArrowModifier = js.native
  
  @JSImport("@popperjs/core/lib/popper", "computeStyles")
  @js.native
  val computeStyles: ComputeStylesModifier = js.native
  
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopperLite")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("@popperjs/core/lib/popper", "defaultModifiers")
  @js.native
  val defaultModifiers: js.Array[
    PopperOffsetsModifier | FlipModifier | HideModifier | OffsetModifier | EventListenersModifier | ComputeStylesModifier | ArrowModifier | PreventOverflowModifier | ApplyStylesModifier
  ] = js.native
  
  inline def detectOverflow(state: State): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[SideObject]
  inline def detectOverflow(state: State, options: PartialOptions): SideObject = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideObject]
  
  @JSImport("@popperjs/core/lib/popper", "eventListeners")
  @js.native
  val eventListeners: EventListenersModifier = js.native
  
  @JSImport("@popperjs/core/lib/popper", "flip")
  @js.native
  val flip: FlipModifier = js.native
  
  @JSImport("@popperjs/core/lib/popper", "hide")
  @js.native
  val hide: HideModifier = js.native
  
  @JSImport("@popperjs/core/lib/popper", "offset")
  @js.native
  val offset: OffsetModifier = js.native
  
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
  
  @JSImport("@popperjs/core/lib/popper", "popperOffsets")
  @js.native
  val popperOffsets: PopperOffsetsModifier = js.native
  
  @JSImport("@popperjs/core/lib/popper", "preventOverflow")
  @js.native
  val preventOverflow: PreventOverflowModifier = js.native
}
