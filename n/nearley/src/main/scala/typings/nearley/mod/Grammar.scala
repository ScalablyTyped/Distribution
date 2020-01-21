package typings.nearley.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nearley", "Grammar")
@js.native
class Grammar protected () extends js.Object {
  def this(rules: js.Array[Rule]) = this()
  var byName: StringDictionary[js.Array[Rule]] = js.native
  var lexer: js.UndefOr[Lexer] = js.native
  var rules: js.Array[Rule] = js.native
  var start: String = js.native
}

/* static members */
@JSImport("nearley", "Grammar")
@js.native
object Grammar extends js.Object {
  def fromCompiled(rules: CompiledRules): Grammar = js.native
}

