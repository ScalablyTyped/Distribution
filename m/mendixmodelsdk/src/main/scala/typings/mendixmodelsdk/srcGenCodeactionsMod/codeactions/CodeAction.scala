package typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.srcGenCodeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenCodeactionsMod.codeactions.ICodeAction because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, actionDefaultReturnName, modelerActionInfo, actionParameters */ @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction")
@js.native
open class CodeAction protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 9.23.0: introduced
    */
  def actionDefaultReturnName: String = js.native
  def actionDefaultReturnName_=(newValue: String): Unit = js.native
  /**
    * In version 9.23.0: introduced
    */
  @JSName("actionDefaultReturnName")
  val actionDefaultReturnName_FCodeAction: String = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def actionParameters: IList[CodeActionParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionParameters")
  val actionParameters_FCodeAction: IList[ICodeActionParameter] = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def actionReturnType: Type = js.native
  def actionReturnType_=(newValue: Type): Unit = js.native
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
  def actionTypeParameters: IList[TypeParameter] = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("actionTypeParameters")
  val actionTypeParameters_FCodeAction: IList[ITypeParameter] = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MCodeAction: FolderBase = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def modelerActionInfo: MicroflowActionInfo | Null = js.native
  def modelerActionInfo_=(newValue: MicroflowActionInfo | Null): Unit = js.native
  /**
    * In version 7.21.0: introduced
    */
  @JSName("modelerActionInfo")
  val modelerActionInfo_FCodeAction: IMicroflowActionInfo | Null = js.native
}
object CodeAction {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.CodeAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
