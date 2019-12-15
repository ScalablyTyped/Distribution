package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/layout relevant section in reference guide}
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
- typings.mendixmodelsdk.distGenPagesMod.pages.ILayout because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined content, layoutCall, layoutType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Layout")
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
  def acceptButtonPlaceholder(): ILayoutParameter | Null = js.native
  def acceptButtonPlaceholder(newValue: ILayoutParameter): js.Any = js.native
  def acceptButtonPlaceholderQualifiedName(): String | Null = js.native
  @JSName("acceptButtonPlaceholder")
  def acceptButtonPlaceholder_Any(): js.Any = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  def acceptPlaceholderName(): String = js.native
  def acceptPlaceholderName(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def appearance(): Appearance = js.native
  def appearance(newValue: Appearance): js.Any = js.native
  /**
    * In version 6.8.0: deleted
    */
  def cancelButtonPlaceholder(): ILayoutParameter | Null = js.native
  def cancelButtonPlaceholder(newValue: ILayoutParameter): js.Any = js.native
  def cancelButtonPlaceholderQualifiedName(): String | Null = js.native
  @JSName("cancelButtonPlaceholder")
  def cancelButtonPlaceholder_Any(): js.Any = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  def cancelPlaceholderName(): String = js.native
  def cancelPlaceholderName(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def `class`(): String = js.native
  def `class`(newValue: String): js.Any = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MLayout(): FolderBase = js.native
  /**
    * In version 8.0.0: introduced
    */
  def content(): LayoutContent = js.native
  def content(newValue: LayoutContent): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.17.0: added public
    * In version 6.8.0: added optional
    */
  def layoutCall(): LayoutCall | Null = js.native
  def layoutCall(newValue: LayoutCall): js.Any = js.native
  @JSName("layoutCall")
  def layoutCall_Any(): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    * In version 6.8.0: added public
    */
  def layoutType(): LayoutType = js.native
  def layoutType(newValue: LayoutType): js.Any = js.native
  /**
    * In version 6.8.0: deleted
    */
  def mainPlaceholder(): ILayoutParameter | Null = js.native
  def mainPlaceholder(newValue: ILayoutParameter): js.Any = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  def mainPlaceholderName(): String = js.native
  def mainPlaceholderName(newValue: String): js.Any = js.native
  def mainPlaceholderQualifiedName(): String | Null = js.native
  @JSName("mainPlaceholder")
  def mainPlaceholder_Any(): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def style(): String = js.native
  def style(newValue: String): js.Any = js.native
  /**
    * In version 7.9.0: deleted
    */
  def useMainPlaceholderForPopups(): Boolean = js.native
  def useMainPlaceholderForPopups(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget(): Widget | Null = js.native
  def widget(newValue: Widget): js.Any = js.native
  @JSName("widget")
  def widget_Any(): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  def widgets(): IList[Widget] = js.native
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

