package typings.mendixmodelsdk.mendixmodelsdkMod.datatypes

import typings.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "datatypes.DataType")
@js.native
abstract class DataType protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datatypes.DataType {
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
@JSImport("mendixmodelsdk", "datatypes.DataType")
@js.native
object DataType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

