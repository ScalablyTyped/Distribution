package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.7.0: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.IFormBase because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.ITemplateFormBase because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined displayName, documentationUrl, templateCategory, templateCategoryWeight */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.TemplateFormBase")
@js.native
open class TemplateFormBase protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MTemplateFormBase: FolderBase = js.native
  
  /**
    * In version 7.17.0: added public
    */
  def displayName: String = js.native
  def displayName_=(newValue: String): Unit = js.native
  /**
    * In version 7.17.0: added public
    */
  @JSName("displayName")
  val displayName_FTemplateFormBase: String = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def documentationUrl: String = js.native
  def documentationUrl_=(newValue: String): Unit = js.native
  /**
    * In version 7.17.0: introduced
    */
  @JSName("documentationUrl")
  val documentationUrl_FTemplateFormBase: String = js.native
  
  def imageData: String | Null = js.native
  def imageData_=(newValue: String | Null): Unit = js.native
  
  /**
    * In version 9.0.2: introduced
    */
  def templateCategory: String = js.native
  
  /**
    * In version 9.0.2: introduced
    */
  def templateCategoryWeight: Double = js.native
  def templateCategoryWeight_=(newValue: Double): Unit = js.native
  /**
    * In version 9.0.2: introduced
    */
  @JSName("templateCategoryWeight")
  val templateCategoryWeight_FTemplateFormBase: Double = js.native
  
  def templateCategory_=(newValue: String): Unit = js.native
  /**
    * In version 9.0.2: introduced
    */
  @JSName("templateCategory")
  val templateCategory_FTemplateFormBase: String = js.native
}
object TemplateFormBase {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.TemplateFormBase")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.TemplateFormBase.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.TemplateFormBase.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
