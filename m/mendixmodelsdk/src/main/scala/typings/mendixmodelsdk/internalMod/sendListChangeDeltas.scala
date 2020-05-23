package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.anon.ToRawChangeValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mobx.observablearrayMod.IArrayWillChange
import typings.mobx.observablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "sendListChangeDeltas")
@js.native
object sendListChangeDeltas extends js.Object {
  def apply[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def apply[T, P](
    property: (typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

