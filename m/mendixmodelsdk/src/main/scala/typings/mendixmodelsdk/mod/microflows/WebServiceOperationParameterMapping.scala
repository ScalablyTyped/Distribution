package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.3.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.WebServiceOperationParameterMapping")
@js.native
abstract class WebServiceOperationParameterMapping protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.WebServiceOperationParameterMapping {
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
@JSImport("mendixmodelsdk", "microflows.WebServiceOperationParameterMapping")
@js.native
object WebServiceOperationParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

