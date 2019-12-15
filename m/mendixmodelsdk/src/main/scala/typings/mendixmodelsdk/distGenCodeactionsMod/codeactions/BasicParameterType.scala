package typings.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IParameterType because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IBasicParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined `type` */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.BasicParameterType")
@js.native
class BasicParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FBasicParameterType: IModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FBasicParameterType: IType = js.native
  @JSName("containerAsCodeActionParameter")
  def containerAsCodeActionParameter_MBasicParameterType(): CodeActionParameter = js.native
  def `type`(): Type = js.native
  def `type`(newValue: Type): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.BasicParameterType")
@js.native
object BasicParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BasicParameterType = js.native
}

