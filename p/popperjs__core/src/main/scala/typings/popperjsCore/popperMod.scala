package typings.popperjsCore

import typings.popperjsCore.anon.PartialModifieranyany
import typings.popperjsCore.anon.PartialOptions
import typings.popperjsCore.arrowMod.Options
import typings.popperjsCore.createPopperMod.PopperGeneratorArgs
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

object popperMod {
  
  @JSImport("@popperjs/core/lib/popper", "applyStyles")
  @js.native
  val applyStyles: Modifier[typings.popperjsCore.popperjsCoreStrings.applyStyles, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "arrow")
  @js.native
  val arrow: Modifier[typings.popperjsCore.popperjsCoreStrings.arrow, Options] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "computeStyles")
  @js.native
  val computeStyles: Modifier[
    typings.popperjsCore.popperjsCoreStrings.computeStyles, 
    typings.popperjsCore.computeStylesMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/popper", "createPopper")
  @js.native
  def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib/popper", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/popper", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  @JSImport("@popperjs/core/lib/popper", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = js.native
  @JSImport("@popperjs/core/lib/popper", "createPopperLite")
  @js.native
  def createPopperLite[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = js.native
  
  @JSImport("@popperjs/core/lib/popper", "defaultModifiers")
  @js.native
  val defaultModifiers: js.Array[
    Modifier[
      typings.popperjsCore.popperjsCoreStrings.popperOffsets | typings.popperjsCore.popperjsCoreStrings.flip | typings.popperjsCore.popperjsCoreStrings.hide | typings.popperjsCore.popperjsCoreStrings.offset | typings.popperjsCore.popperjsCoreStrings.eventListeners | typings.popperjsCore.popperjsCoreStrings.computeStyles | typings.popperjsCore.popperjsCoreStrings.arrow | typings.popperjsCore.popperjsCoreStrings.preventOverflow | typings.popperjsCore.popperjsCoreStrings.applyStyles, 
      js.Object | typings.popperjsCore.flipMod.Options | typings.popperjsCore.offsetMod.Options | typings.popperjsCore.eventListenersMod.Options | typings.popperjsCore.computeStylesMod.Options | Options | typings.popperjsCore.preventOverflowMod.Options
    ]
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "detectOverflow")
  @js.native
  def detectOverflow(state: State): SideObject = js.native
  @JSImport("@popperjs/core/lib/popper", "detectOverflow")
  @js.native
  def detectOverflow(state: State, options: PartialOptions): SideObject = js.native
  
  @JSImport("@popperjs/core/lib/popper", "eventListeners")
  @js.native
  val eventListeners: Modifier[
    typings.popperjsCore.popperjsCoreStrings.eventListeners, 
    typings.popperjsCore.eventListenersMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "flip")
  @js.native
  val flip: Modifier[
    typings.popperjsCore.popperjsCoreStrings.flip, 
    typings.popperjsCore.flipMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "hide")
  @js.native
  val hide: Modifier[typings.popperjsCore.popperjsCoreStrings.hide, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "offset")
  @js.native
  val offset: Modifier[
    typings.popperjsCore.popperjsCoreStrings.offset, 
    typings.popperjsCore.offsetMod.Options
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "popperGenerator")
  @js.native
  def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  @JSImport("@popperjs/core/lib/popper", "popperGenerator")
  @js.native
  def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "popperOffsets")
  @js.native
  val popperOffsets: Modifier[typings.popperjsCore.popperjsCoreStrings.popperOffsets, js.Object] = js.native
  
  @JSImport("@popperjs/core/lib/popper", "preventOverflow")
  @js.native
  val preventOverflow: Modifier[
    typings.popperjsCore.popperjsCoreStrings.preventOverflow, 
    typings.popperjsCore.preventOverflowMod.Options
  ] = js.native
}
