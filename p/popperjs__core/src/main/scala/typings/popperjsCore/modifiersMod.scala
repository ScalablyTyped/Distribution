package typings.popperjsCore

import typings.popperjsCore.arrowMod.Options
import typings.popperjsCore.typesMod.Modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/modifiers", JSImport.Namespace)
@js.native
object modifiersMod extends js.Object {
  
  val applyStyles: Modifier[typings.popperjsCore.popperjsCoreStrings.applyStyles, js.Object] = js.native
  
  val arrow: Modifier[typings.popperjsCore.popperjsCoreStrings.arrow, Options] = js.native
  
  val computeStyles: Modifier[
    typings.popperjsCore.popperjsCoreStrings.computeStyles, 
    typings.popperjsCore.computeStylesMod.Options
  ] = js.native
  
  val eventListeners: Modifier[
    typings.popperjsCore.popperjsCoreStrings.eventListeners, 
    typings.popperjsCore.eventListenersMod.Options
  ] = js.native
  
  val flip: Modifier[
    typings.popperjsCore.popperjsCoreStrings.flip, 
    typings.popperjsCore.flipMod.Options
  ] = js.native
  
  val hide: Modifier[typings.popperjsCore.popperjsCoreStrings.hide, js.Object] = js.native
  
  val offset: Modifier[
    typings.popperjsCore.popperjsCoreStrings.offset, 
    typings.popperjsCore.offsetMod.Options
  ] = js.native
  
  val popperOffsets: Modifier[typings.popperjsCore.popperjsCoreStrings.popperOffsets, js.Object] = js.native
  
  val preventOverflow: Modifier[
    typings.popperjsCore.popperjsCoreStrings.preventOverflow, 
    typings.popperjsCore.preventOverflowMod.Options
  ] = js.native
}
