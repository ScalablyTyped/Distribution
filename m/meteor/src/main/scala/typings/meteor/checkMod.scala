package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/check", JSImport.Namespace)
@js.native
object checkMod extends js.Object {
  def check(value: js.Any, pattern: js.Any): Unit = js.native
  @JSName("Match")
  @js.native
  object MatchNs extends js.Object {
    var Any: js.Any = js.native
    var Boolean: js.Any = js.native
    var Integer: js.Any = js.native
    var Object: js.Any = js.native
    var String: js.Any = js.native
    var undefined: js.Any = js.native
    def Maybe(pattern: js.Any): Boolean = js.native
    def ObjectIncluding(dico: js.Any): Boolean = js.native
    def OneOf(patterns: js.Any*): js.Any = js.native
    def Optional(pattern: js.Any): Boolean = js.native
    def Where(condition: js.Any): js.Any = js.native
    def test(value: js.Any, pattern: js.Any): Boolean = js.native
  }
  
}

