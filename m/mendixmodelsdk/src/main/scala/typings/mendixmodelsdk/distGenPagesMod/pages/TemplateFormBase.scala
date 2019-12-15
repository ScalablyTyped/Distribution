package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.7.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenPagesMod.pages.IFormBase because Already inherited
- typings.mendixmodelsdk.distGenPagesMod.pages.ITemplateFormBase because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined displayName, documentationUrl */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateFormBase")
@js.native
abstract class TemplateFormBase protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  /**
    * In version 7.17.0: added public
    */
  @JSName("displayName")
  val displayName_FTemplateFormBase: String = js.native
  /**
    * In version 7.17.0: introduced
    */
  @JSName("documentationUrl")
  val documentationUrl_FTemplateFormBase: String = js.native
  @JSName("model")
  var model_FTemplateFormBase: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MTemplateFormBase(): FolderBase = js.native
  /**
    * In version 7.17.0: added public
    */
  def displayName(): String = js.native
  def displayName(newValue: String): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def documentationUrl(): String = js.native
  def documentationUrl(newValue: String): js.Any = js.native
  def imageData(): String | Null = js.native
  def imageData(newValue: String): js.Any = js.native
  @JSName("imageData")
  def imageData_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateFormBase")
@js.native
object TemplateFormBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

