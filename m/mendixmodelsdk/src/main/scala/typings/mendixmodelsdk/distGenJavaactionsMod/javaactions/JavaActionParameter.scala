package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeActionParameter
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeActionParameter because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaActionParameter because var conflicts: actionParameterType, description, id, isLoaded, model, name, structureTypeName, unit. Inlined `type`, javaType, parameterType */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter")
@js.native
class JavaActionParameter protected () extends CodeActionParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_JavaActionParameter: CodeAction = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_JavaActionParameter: JavaAction = js.native
  /**
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  var javaType: IType | Type = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  var parameterType: IParameterType | ParameterType = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  var `type`: Null | String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter")
@js.native
object JavaActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaActionParameter = js.native
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
    * of the parent codeactions.CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionParameters(container: CodeAction): JavaActionParameter = js.native
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'parameters' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.20.0
    */
  def createInJavaActionUnderParameters(container: JavaAction): JavaActionParameter = js.native
}

