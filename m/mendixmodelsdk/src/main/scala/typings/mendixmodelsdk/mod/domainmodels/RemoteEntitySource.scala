package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.10.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.RemoteEntitySource")
@js.native
abstract class RemoteEntitySource protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.RemoteEntitySource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.RemoteEntitySource")
@js.native
object RemoteEntitySource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

