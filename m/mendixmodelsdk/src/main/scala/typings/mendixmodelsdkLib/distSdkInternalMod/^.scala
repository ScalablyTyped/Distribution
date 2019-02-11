package typings
package mendixmodelsdkLib.distSdkInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def contains(
    range: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.IVersionRange,
    version: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version
  ): scala.Boolean = js.native
  def createElementFromJSON(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel,
    json: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson
  ): mendixmodelsdkLib.distSdkInternalElementsMod.Element = js.native
  def createInVersionCheck(
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    structureTypeName: java.lang.String,
    versionRange: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.IVersionRange
  ): scala.Unit = js.native
  def isAtLeast(
    versionString: java.lang.String,
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel
  ): scala.Boolean = js.native
  def isNamedElement(element: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference.INamedElement */ scala.Boolean = js.native
  def parseAsNormalizedVersion(versionString: java.lang.String): mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.Version = js.native
  def sendListChangeDeltas[T, P](
    property: (mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[P]]) with mendixmodelsdkLib.Anon_ToRawChangeValue[P],
    change: mobxLib.libTypesObservablearrayMod.IArrayWillChange[P]
  ): scala.Unit = js.native
  def sendListChangeDeltas[T, P](
    property: (mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[P]]) with mendixmodelsdkLib.Anon_ToRawChangeValue[P],
    change: mobxLib.libTypesObservablearrayMod.IArrayWillSplice[P]
  ): scala.Unit = js.native
}

