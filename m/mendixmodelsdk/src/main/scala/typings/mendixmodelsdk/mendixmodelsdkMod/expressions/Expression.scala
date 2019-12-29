package typings.mendixmodelsdk.mendixmodelsdkMod.expressions

import typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-expressions relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.Expression")
@js.native
abstract class Expression protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions.Expression {
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
@JSImport("mendixmodelsdk", "expressions.Expression")
@js.native
object Expression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

