package typings.polished

import typings.polished.interactionStateMod.InteractionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonsMod {
  
  @JSImport("polished/lib/shorthands/buttons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(states: InteractionState*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(states.asInstanceOf[js.Any]).asInstanceOf[String]
}
