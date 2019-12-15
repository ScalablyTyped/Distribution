package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/java-actions relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeAction because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaAction because var conflicts: actionParameters, actionReturnType, actionTypeParameters, containerAsFolderBase, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined typeParameters, parameters, returnType, javaReturnType, microflowActionInfo, useLegacyCodeGeneration */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaAction")
@js.native
class JavaAction protected () extends CodeAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("javaReturnType")
  val javaReturnType_FJavaAction: IType = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("microflowActionInfo")
  val microflowActionInfo_FJavaAction: IMicroflowActionInfo | Null = js.native
  @JSName("model")
  var model_FJavaAction: IModel = js.native
  /**
    * In version 7.21.0: deleted
    */
  @JSName("parameters")
  val parameters_FJavaAction: IList[IJavaActionParameter] = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  @JSName("returnType")
  val returnType_FJavaAction: String | Null = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("typeParameters")
  val typeParameters_FJavaAction: IList[ITypeParameter] = js.native
  /**
    * In version 8.0.0: introduced
    */
  @JSName("useLegacyCodeGeneration")
  val useLegacyCodeGeneration_FJavaAction: Boolean = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MJavaAction(): FolderBase = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  def javaReturnType(): Type = js.native
  def javaReturnType(newValue: Type): js.Any = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  def microflowActionInfo(): MicroflowActionInfo | Null = js.native
  def microflowActionInfo(newValue: MicroflowActionInfo): js.Any = js.native
  @JSName("microflowActionInfo")
  def microflowActionInfo_Any(): js.Any = js.native
  /**
    * In version 7.21.0: deleted
    */
  def parameters(): IList[JavaActionParameter] = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  def returnType(): String = js.native
  def returnType(newValue: String): js.Any = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  def typeParameters(): IList[TypeParameter] = js.native
  /**
    * In version 8.0.0: introduced
    */
  def useLegacyCodeGeneration(): Boolean = js.native
  def useLegacyCodeGeneration(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaAction")
@js.native
object JavaAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new JavaAction unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): JavaAction = js.native
}

