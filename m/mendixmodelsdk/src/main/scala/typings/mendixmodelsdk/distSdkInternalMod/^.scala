package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.Anon_ToRawChangeValue
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.IVersionRange
import typings.mobx.libTypesObservablearrayMod.IArrayWillChange
import typings.mobx.libTypesObservablearrayMod.IArrayWillSplice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def contains(range: IVersionRange, version: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.Version): Boolean = js.native
  def createElementFromJSON(
    model: typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: IAbstractElementJson
  ): typings.mendixmodelsdk.distSdkInternalElementsMod.Element = js.native
  def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = js.native
  def isAtLeast(versionString: String, model: IAbstractModel): Boolean = js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference.INamedElement */ Boolean = js.native
  def parseAsNormalizedVersion(versionString: String): typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.Version = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillChange[P]
  ): Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], IList[P]]) with Anon_ToRawChangeValue[P],
    change: IArrayWillSplice[P]
  ): Unit = js.native
}

