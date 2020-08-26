package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/layout relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.IFormBase because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.ILayout because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined content, layoutCall, layoutType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Layout")
@js.native
class Layout protected () extends FormBase {
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
    * In version 8.0.0: introduced
    */
  @JSName("content")
  val content_FLayout: ILayoutContent = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.17.0: added public
    * In version 6.8.0: added optional
    */
  @JSName("layoutCall")
  val layoutCall_FLayout: ILayoutCall | Null = js.native
  /**
    * In version 8.0.0: deleted
    * In version 6.8.0: added public
    */
  @JSName("layoutType")
  val layoutType_FLayout: LayoutType = js.native
  @JSName("model")
  var model_FLayout: IModel = js.native
  /**
    * In version 6.8.0: deleted
    */
  def acceptButtonPlaceholder: ILayoutParameter | Null = js.native
  def acceptButtonPlaceholderQualifiedName: String | Null = js.native
  def acceptButtonPlaceholder_=(newValue: ILayoutParameter | Null): Unit = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  def acceptPlaceholderName: String = js.native
  def acceptPlaceholderName_=(newValue: String): Unit = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance: Appearance = js.native
  def appearance_=(newValue: Appearance): Unit = js.native
  /**
    * In version 6.8.0: deleted
    */
  def cancelButtonPlaceholder: ILayoutParameter | Null = js.native
  def cancelButtonPlaceholderQualifiedName: String | Null = js.native
  def cancelButtonPlaceholder_=(newValue: ILayoutParameter | Null): Unit = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  def cancelPlaceholderName: String = js.native
  def cancelPlaceholderName_=(newValue: String): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MLayout: FolderBase = js.native
  /**
    * In version 8.0.0: introduced
    */
  def content: LayoutContent = js.native
  def content_=(newValue: LayoutContent): Unit = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.17.0: added public
    * In version 6.8.0: added optional
    */
  def layoutCall: LayoutCall | Null = js.native
  def layoutCall_=(newValue: LayoutCall | Null): Unit = js.native
  /**
    * In version 8.0.0: deleted
    * In version 6.8.0: added public
    */
  def layoutType: LayoutType = js.native
  def layoutType_=(newValue: LayoutType): Unit = js.native
  /**
    * In version 6.8.0: deleted
    */
  def mainPlaceholder: ILayoutParameter | Null = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  def mainPlaceholderName: String = js.native
  def mainPlaceholderName_=(newValue: String): Unit = js.native
  def mainPlaceholderQualifiedName: String | Null = js.native
  def mainPlaceholder_=(newValue: ILayoutParameter | Null): Unit = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
  /**
    * In version 7.9.0: deleted
    */
  def useMainPlaceholderForPopups: Boolean = js.native
  def useMainPlaceholderForPopups_=(newValue: Boolean): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Layout")
@js.native
object Layout extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Layout unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Layout = js.native
}

