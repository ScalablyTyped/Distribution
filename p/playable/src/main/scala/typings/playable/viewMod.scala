package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("playable/dist/src/modules/ui/core/view", JSImport.Default)
  @js.native
  class default[TStyles] () extends View[TStyles]
  
  @js.native
  trait View[TStyles]
    extends typings.playable.stylableMod.default[TStyles]
}
