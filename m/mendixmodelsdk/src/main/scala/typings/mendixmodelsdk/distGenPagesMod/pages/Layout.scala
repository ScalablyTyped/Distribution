package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
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
- typings.mendixmodelsdk.distGenPagesMod.pages.ILayout because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined content, layoutCall, layoutType */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Layout")
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
    * In version 6.8.0: deleted
    */
  var acceptButtonPlaceholder: ILayoutParameter | Null = js.native
  val acceptButtonPlaceholderQualifiedName: String | Null = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  var acceptPlaceholderName: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var appearance: Appearance = js.native
  /**
    * In version 6.8.0: deleted
    */
  var cancelButtonPlaceholder: ILayoutParameter | Null = js.native
  val cancelButtonPlaceholderQualifiedName: String | Null = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  var cancelPlaceholderName: String = js.native
  /**
    * In version 8.0.0: deleted
    */
  var `class`: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var content: ILayoutContent | LayoutContent = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.17.0: added public
    * In version 6.8.0: added optional
    */
  var layoutCall: ILayoutCall | LayoutCall | Null = js.native
  /**
    * In version 8.0.0: deleted
    * In version 6.8.0: added public
    */
  var layoutType: LayoutType = js.native
  /**
    * In version 6.8.0: deleted
    */
  var mainPlaceholder: ILayoutParameter | Null = js.native
  /**
    * In version 7.9.0: deleted
    * In version 6.8.0: introduced
    */
  var mainPlaceholderName: String = js.native
  val mainPlaceholderQualifiedName: String | Null = js.native
  /**
    * In version 8.0.0: deleted
    */
  var style: String = js.native
  /**
    * In version 7.9.0: deleted
    */
  var useMainPlaceholderForPopups: Boolean = js.native
  /**
    * In version 7.15.0: deleted
    */
  var widget: Widget | Null = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  val widgets: IList[Widget] = js.native
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

