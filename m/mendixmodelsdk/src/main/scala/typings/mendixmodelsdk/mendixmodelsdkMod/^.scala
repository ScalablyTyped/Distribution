package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.Anon_ToRawChangeValue
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MAX_METAMODEL_VERSION: String = js.native
  val SDK_VERSION: String = js.native
  def createElementFromJSON(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: IAbstractElementJson
  ): typings.mendixmodelsdk.distSdkInternalElementsMod.Element = js.native
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

