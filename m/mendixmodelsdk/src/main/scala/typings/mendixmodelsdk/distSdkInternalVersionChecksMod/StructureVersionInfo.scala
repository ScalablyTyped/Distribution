package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "StructureVersionInfo")
@js.native
class StructureVersionInfo protected () extends VersionInfo {
  def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  var availability: LifeCycle = js.native
  var defaultPropertyInfo: PropertyVersionInfo = js.native
  var isExperimental: ModifierValueHistory = js.native
  var isPublic: ModifierValueHistory = js.native
  var properties: StringDictionary[PropertyVersionInfo] = js.native
  var structureType: StructureType = js.native
  def checkStructureVersion(instance: IStructure): Unit = js.native
  def getPropertyVersionInfo(name: String): PropertyVersionInfo = js.native
}

