package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.popperjsCoreStrings.popperOffsets
import typings.popperjsCore.typesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperOffsetsMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/popperOffsets", JSImport.Default)
  @js.native
  val default: Modifier[popperOffsets, js.Object] = js.native
  
  type PopperOffsetsModifier = Modifier[popperOffsets, js.Object]
  
  type _To = Modifier[popperOffsets, js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `popperOffsetsMod.foo` */
  override def _to: Modifier[popperOffsets, js.Object] = default
}
