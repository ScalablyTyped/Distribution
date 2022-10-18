package typings.micromark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibPostprocessMod {
  
  @JSImport("micromark/dev/lib/postprocess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postprocess(events: js.Array[typings.micromarkUtilTypes.mod.Event]): js.Array[typings.micromarkUtilTypes.mod.Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("postprocess")(events.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.micromarkUtilTypes.mod.Event]]
  
  type Event = typings.micromarkUtilTypes.mod.Event
}
