package typings.micromark

import typings.micromark.libSharedTypesMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPostprocessMod {
  
  @JSImport("micromark/lib/postprocess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(events: js.Array[Event]): js.Array[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(events.asInstanceOf[js.Any]).asInstanceOf[js.Array[Event]]
}
