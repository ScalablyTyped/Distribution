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
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IType because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IPrimitiveType because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IStringType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringType")
@js.native
class StringType protected () extends PrimitiveType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FStringType: IModel = js.native
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MStringType(): BasicParameterType = js.native
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MStringType(): CodeAction = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.StringType")
@js.native
object StringType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): StringType = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * The new StringType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: BasicParameterType): StringType = js.native
  /**
    * Creates and returns a new StringType instance in the SDK and on the server.
    * The new StringType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: CodeAction): StringType = js.native
}

