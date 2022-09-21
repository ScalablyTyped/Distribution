package typings.playable

import typings.playable.anon.LengthNumber
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("playable/dist/src/modules/ui/core/element-queries/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forEachMatch(string: String, pattern: js.RegExp, callback: js.Function1[/* match */ RegExpExecArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachMatch")(string.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reduce(arrayLike: LengthNumber, callback: js.Function1[/* repeated */ Any, Unit], initialValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arrayLike.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[Any]
}
