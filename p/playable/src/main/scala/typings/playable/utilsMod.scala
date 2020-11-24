package typings.playable

import typings.playable.anon.LengthNumber
import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/ui/core/element-queries/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def forEachMatch(string: String, pattern: RegExp, callback: js.Function1[/* match */ RegExpExecArray, Unit]): Unit = js.native
  
  def reduce(arrayLike: LengthNumber, callback: js.Function1[/* repeated */ js.Any, Unit], initialValue: js.Any): js.Any = js.native
}
