package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/page relevant section in reference guide}
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
- typings.mendixmodelsdk.distGenPagesMod.pages.IPage because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined layoutCall, allowedRoles, allowedRolesQualifiedNames */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Page")
@js.native
class Page protected () extends FormBase {
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
  val allowedRoles: IList[IModuleRole] = js.native
  val allowedRolesQualifiedNames: js.Array[String] = js.native
  /**
    * In version 8.0.0: introduced
    */
  var appearance: Appearance = js.native
  /**
    * In version 8.0.0: deleted
    */
  var `class`: String = js.native
  /**
    * In version 7.17.0: added public
    */
  var layoutCall: ILayoutCall | LayoutCall = js.native
  var markAsUsed: Boolean = js.native
  /**
    * In version 6.7.0: introduced
    */
  var popupCloseAction: String = js.native
  var popupHeight: Double = js.native
  var popupResizable: Boolean = js.native
  var popupWidth: Double = js.native
  /**
    * In version 8.0.0: deleted
    */
  var style: String = js.native
  var title: Text = js.native
  /**
    * In version 6.7.0: introduced
    */
  var url: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Page")
@js.native
object Page extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new Page unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): Page = js.native
}

