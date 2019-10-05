package typings.mendixmodelsdk.mendixmodelsdkMod.expressions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.VariableRef")
@js.native
abstract class VariableRef protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions.VariableRef {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "expressions.VariableRef")
@js.native
object VariableRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo = js.native
}

