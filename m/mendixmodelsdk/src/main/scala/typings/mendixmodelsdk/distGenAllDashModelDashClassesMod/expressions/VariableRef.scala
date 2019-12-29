package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions

import typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.VariableRef")
@js.native
abstract class VariableRef protected ()
  extends typings.mendixmodelsdk.distGenExpressionsMod.expressions.VariableRef {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.VariableRef")
@js.native
object VariableRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

