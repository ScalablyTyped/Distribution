package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.codeactionsMod.codeactions.CodeActionParameter
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeActionParameter because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IJavaActionParameter because var conflicts: actionParameterType, containerAsCodeAction, containerAsJavaAction, description, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined `type`, javaType, parameterType */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter")
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
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("javaType")
  val javaType_FJavaActionParameter: IType = js.native
  @JSName("model")
  var model_FJavaActionParameter: IModel = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @JSName("parameterType")
  val parameterType_FJavaActionParameter: IParameterType = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  @JSName("type")
  val type_FJavaActionParameter: String | Null = js.native
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MJavaActionParameter(): CodeAction = js.native
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MJavaActionParameter(): JavaAction = js.native
  /**
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  def javaType(): Type = js.native
  def javaType(newValue: Type): js.Any = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  def parameterType(): ParameterType = js.native
  def parameterType(newValue: ParameterType): js.Any = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  def `type`(): String = js.native
  def `type`(newValue: String): js.Any = js.native
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

