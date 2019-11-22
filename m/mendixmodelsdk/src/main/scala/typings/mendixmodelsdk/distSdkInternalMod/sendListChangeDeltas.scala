package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.Anon_ToRawChangeValue
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "sendListChangeDeltas")
@js.native
object sendListChangeDeltas extends js.Object {
  def apply[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def apply[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

