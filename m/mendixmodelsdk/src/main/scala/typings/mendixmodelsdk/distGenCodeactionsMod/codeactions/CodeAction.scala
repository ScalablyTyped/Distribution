package typings.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.distGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
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
- typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeAction because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, modelerActionInfo, actionParameters */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeAction")
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
  val actionParameters: IList[CodeActionParameter | ICodeActionParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  var actionReturnType: IType | Type = js.native
  /**
    * In version 7.21.0: introduced
    */
  val actionTypeParameters: IList[ITypeParameter | TypeParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  var modelerActionInfo: IMicroflowActionInfo | MicroflowActionInfo | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.CodeAction")
@js.native
object CodeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

