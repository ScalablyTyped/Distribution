package typings.micromarkUtilResolveAll

import typings.micromarkUtilResolveAll.anon.ResolveAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-resolve-all", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAll(
    constructs: js.Array[ResolveAll],
    events: js.Array[typings.micromarkUtilTypes.mod.Event],
    context: TokenizeContext
  ): js.Array[typings.micromarkUtilTypes.mod.Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAll")(constructs.asInstanceOf[js.Any], events.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.micromarkUtilTypes.mod.Event]]
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  type Resolver = typings.micromarkUtilTypes.mod.Resolver
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
}
