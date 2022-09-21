package typings.micromarkUtilSubtokenize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-subtokenize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subtokenize(events: js.Array[typings.micromarkUtilTypes.mod.Event]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("subtokenize")(events.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Chunk = typings.micromarkUtilTypes.mod.Chunk
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  type Token = typings.micromarkUtilTypes.mod.Token
}
