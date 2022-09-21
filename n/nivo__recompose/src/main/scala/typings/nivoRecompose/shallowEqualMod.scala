package typings.nivoRecompose

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowEqualMod {
  
  @JSImport("@nivo/recompose/dist/types/shallowEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shallowEqual(objA: Record[String, Any], objB: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
