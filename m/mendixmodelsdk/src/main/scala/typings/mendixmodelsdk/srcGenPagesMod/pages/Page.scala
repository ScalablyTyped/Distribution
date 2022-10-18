package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/page relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.IFormBase because Already inherited
- typings.mendixmodelsdk.srcGenPagesMod.pages.IPage because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined parameters, layoutCall, allowedRoles, allowedRolesQualifiedNames */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.Page")
@js.native
open class Page protected () extends FormBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 7.23.0: added public
    */
  def allowedRoles: IList[IModuleRole] = js.native
  
  def allowedRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedRolesQualifiedNames")
  val allowedRolesQualifiedNames_FPage: js.Array[String] = js.native
  
  /**
    * In version 7.23.0: added public
    */
  @JSName("allowedRoles")
  val allowedRoles_FPage: IList[IModuleRole] = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MPage: FolderBase = js.native
  
  /**
    * In version 7.17.0: added public
    */
  def layoutCall: LayoutCall = js.native
  def layoutCall_=(newValue: LayoutCall): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.17.0: added public
    */
  @JSName("layoutCall")
  val layoutCall_FPage: ILayoutCall = js.native
  
  def markAsUsed: Boolean = js.native
  def markAsUsed_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.4.0: introduced
    */
  def parameters: IList[PageParameter] = js.native
  /**
    * In version 9.4.0: introduced
    */
  @JSName("parameters")
  val parameters_FPage: IList[IPageParameter] = js.native
  
  /**
    * In version 6.7.0: introduced
    */
  def popupCloseAction: String = js.native
  def popupCloseAction_=(newValue: String): Unit = js.native
  
  def popupHeight: Double = js.native
  def popupHeight_=(newValue: Double): Unit = js.native
  
  def popupResizable: Boolean = js.native
  def popupResizable_=(newValue: Boolean): Unit = js.native
  
  def popupWidth: Double = js.native
  def popupWidth_=(newValue: Double): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  
  def title: Text = js.native
  def title_=(newValue: Text): Unit = js.native
  
  /**
    * In version 6.7.0: introduced
    */
  def url: String = js.native
  def url_=(newValue: String): Unit = js.native
}
object Page {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Page")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Page unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): Page = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Page]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Page.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.Page.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
