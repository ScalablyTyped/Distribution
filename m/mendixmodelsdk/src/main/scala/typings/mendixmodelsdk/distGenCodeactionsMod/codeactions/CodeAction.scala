package typings.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeAction because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, modelerActionInfo, actionParameters */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeAction")
@js.native
abstract class CodeAction protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionParameters")
  val actionParameters_FCodeAction: IList[ICodeActionParameter] = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: introduced
    */
  @JSName("actionReturnType")
  val actionReturnType_FCodeAction: IType = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionTypeParameters")
  val actionTypeParameters_FCodeAction: IList[ITypeParameter] = js.native
  @JSName("model")
  var model_FCodeAction: IModel = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("modelerActionInfo")
  val modelerActionInfo_FCodeAction: IMicroflowActionInfo | Null = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionParameters(): IList[CodeActionParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionReturnType(): Type = js.native
  def actionReturnType(newValue: Type): js.Any = js.native
  /**
    * In version 7.21.0: introduced
    */
  def actionTypeParameters(): IList[TypeParameter] = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MCodeAction(): FolderBase = js.native
  /**
    * In version 7.21.0: introduced
    */
  def modelerActionInfo(): MicroflowActionInfo | Null = js.native
  def modelerActionInfo(newValue: MicroflowActionInfo): js.Any = js.native
  @JSName("modelerActionInfo")
  def modelerActionInfo_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeAction")
@js.native
object CodeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

