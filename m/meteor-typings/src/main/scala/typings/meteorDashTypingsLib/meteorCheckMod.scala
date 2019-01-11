package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/check", JSImport.Namespace)
@js.native
object meteorCheckMod extends js.Object {
  def check(value: js.Any, pattern: js.Any): scala.Unit = js.native
  @JSName("Match")
  @js.native
  object MatchNs extends js.Object {
    var Any: js.Any = js.native
    var Boolean: js.Any = js.native
    var Integer: js.Any = js.native
    var Object: js.Any = js.native
    var String: js.Any = js.native
    var undefined: js.Any = js.native
    def Maybe(pattern: js.Any): scala.Boolean = js.native
    def ObjectIncluding(dico: js.Any): scala.Boolean = js.native
    def OneOf(patterns: js.Any*): js.Any = js.native
    def Optional(pattern: js.Any): scala.Boolean = js.native
    def Where(condition: js.Any): js.Any = js.native
    def test(value: js.Any, pattern: js.Any): scala.Boolean = js.native
  }
  
}

