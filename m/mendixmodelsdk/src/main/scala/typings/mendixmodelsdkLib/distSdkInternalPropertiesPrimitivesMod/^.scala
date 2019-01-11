package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def sendListChangeDeltas[T, P](
    property: (mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[P]]) with mendixmodelsdkLib.Anon_ToRawChangeValue[P],
    change: mobxLib.libTypesObservablearrayMod.IArrayWillChange[P]
  ): scala.Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[P]]) with mendixmodelsdkLib.Anon_ToRawChangeValue[P],
    change: mobxLib.libTypesObservablearrayMod.IArrayWillSplice[P]
  ): scala.Unit = js.native
}

