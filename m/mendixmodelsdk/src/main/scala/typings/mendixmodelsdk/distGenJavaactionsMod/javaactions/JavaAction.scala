package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
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
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IJavaAction because var conflicts: actionReturnType, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined typeParameters, parameters, returnType, javaReturnType, microflowActionInfo, useLegacyCodeGeneration */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaAction")
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
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  var javaReturnType: IType | Type = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  var microflowActionInfo: IMicroflowActionInfo | MicroflowActionInfo | Null = js.native
  /**
    * In version 7.21.0: deleted
    */
  val parameters: IList[IJavaActionParameter | JavaActionParameter] = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  var returnType: Null | String = js.native
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  val typeParameters: IList[ITypeParameter | TypeParameter] = js.native
  /**
    * In version 8.0.0: introduced
    */
  var useLegacyCodeGeneration: Boolean = js.native
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

