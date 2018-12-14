package typings
package nearleyLib.nearleyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nearley", "Grammar")
@js.native
class Grammar protected () extends js.Object {
  def this(rules: js.Array[Rule]) = this()
  var byName: org.scalablytyped.runtime.StringDictionary[js.Array[Rule]] = js.native
  var lexer: js.UndefOr[Lexer] = js.native
  var rules: js.Array[Rule] = js.native
  var start: java.lang.String = js.native
}

@JSImport("nearley", "Grammar")
@js.native
object Grammar extends js.Object {
  def fromCompiled(rules: nearleyLib.nearleyMod.CompiledRules): nearleyLib.nearleyMod.Grammar = js.native
}

