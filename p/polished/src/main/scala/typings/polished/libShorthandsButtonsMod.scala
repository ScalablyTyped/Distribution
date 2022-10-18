package typings.polished

import typings.polished.libTypesInteractionStateMod.InteractionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShorthandsButtonsMod {
  
  @JSImport("polished/lib/shorthands/buttons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(states: InteractionState*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(states.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
}
