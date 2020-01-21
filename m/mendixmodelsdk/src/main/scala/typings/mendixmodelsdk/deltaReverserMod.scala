package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/DeltaReverser", JSImport.Namespace)
@js.native
object deltaReverserMod extends js.Object {
  @js.native
  class DeltaReverser protected () extends js.Object {
    def this(model: AbstractModel) = this()
    var getUnit: js.Any = js.native
    var model: AbstractModel = js.native
    var reverseAttachElementDelta: js.Any = js.native
    var reverseCreateElementTreeDelta: js.Any = js.native
    var reverseCreateUnitTreeDelta: js.Any = js.native
    var reverseDeleteElementDelta: js.Any = js.native
    var reverseDeleteUnitDelta: js.Any = js.native
    var reverseDetachElementDelta: js.Any = js.native
    var reverseUpdatePropertyValueDelta: js.Any = js.native
    def reverse(delta: Delta): Delta = js.native
  }
  
}

