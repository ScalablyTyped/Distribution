package typings.mendixmodelsdk.mendixmodelsdkMod.expressions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
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
@JSImport("mendixmodelsdk", "expressions.NoVariableRef")
@js.native
class NoVariableRef protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions.NoVariableRef {
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
@JSImport("mendixmodelsdk", "expressions.NoVariableRef")
@js.native
object NoVariableRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NoVariableRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenExpressionsMod.expressions.NoVariableRef = js.native
  /**
    * Creates and returns a new NoVariableRef instance in the SDK and on the server.
    * The new NoVariableRef will be automatically stored in the 'variable' property
    * of the parent VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenExpressionsMod.expressions.VariableRefExpression): typings.mendixmodelsdk.distGenExpressionsMod.expressions.NoVariableRef = js.native
}

