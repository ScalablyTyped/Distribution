package typings.nivoRecompose

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMod {
  
  @JSImport("@nivo/recompose/dist/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pick(obj: Record[String, Any], keys: js.Array[String]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
}
