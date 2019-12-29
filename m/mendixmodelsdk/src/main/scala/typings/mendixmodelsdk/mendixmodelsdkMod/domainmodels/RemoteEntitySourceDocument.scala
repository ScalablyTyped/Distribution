package typings.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.2.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.RemoteEntitySourceDocument")
@js.native
abstract class RemoteEntitySourceDocument protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.RemoteEntitySourceDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.RemoteEntitySourceDocument")
@js.native
object RemoteEntitySourceDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

