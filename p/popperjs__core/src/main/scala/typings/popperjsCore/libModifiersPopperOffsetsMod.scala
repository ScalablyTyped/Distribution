package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.libTypesMod.Modifier
import typings.popperjsCore.popperjsCoreStrings.popperOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModifiersPopperOffsetsMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/popperOffsets", JSImport.Default)
  @js.native
  val default: PopperOffsetsModifier = js.native
  
  type PopperOffsetsModifier = Modifier[popperOffsets, js.Object]
  
  type _To = PopperOffsetsModifier
  
  /* This means you don't have to write `default`, but can instead just say `libModifiersPopperOffsetsMod.foo` */
  override def _to: PopperOffsetsModifier = default
}
