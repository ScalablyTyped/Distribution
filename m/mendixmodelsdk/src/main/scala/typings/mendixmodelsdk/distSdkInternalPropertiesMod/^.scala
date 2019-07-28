package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import typings.mendixmodelsdk.Anon_ToRawChangeValue
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference.INamedElement */ Boolean = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

