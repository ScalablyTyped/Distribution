package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "StructureVersionInfo")
@js.native
class StructureVersionInfo protected () extends VersionInfo {
  def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  var availability: LifeCycle = js.native
  var defaultPropertyInfo: PropertyVersionInfo = js.native
  var isExperimental: ModifierValueHistory = js.native
  var isPublic: ModifierValueHistory = js.native
  var properties: ScalablyTyped.runtime.StringDictionary[PropertyVersionInfo] = js.native
  var structureType: StructureType = js.native
  def checkStructureVersion(instance: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure): scala.Unit = js.native
  def getPropertyVersionInfo(name: java.lang.String): PropertyVersionInfo = js.native
}

