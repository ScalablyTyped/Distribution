package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenSecurityMod.security.IUserRole
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalQuery")
@js.native
class RetrievalQuery protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRetrievalQuery: IModel = js.native
  def allowedUserRoles(): IList[IUserRole] = js.native
  def allowedUserRolesQualifiedNames(): js.Array[String] = js.native
  /**
    * In version 7.21.0: introduced
    */
  def entityPath(): String = js.native
  def entityPath(newValue: String): js.Any = js.native
  /**
    * In version 7.21.0: introduced
    */
  def microflow(): IMicroflow | Null = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Any(): js.Any = js.native
  /**
    * In version 7.14.0: introduced
    */
  def pageName(): String = js.native
  def pageName(newValue: String): js.Any = js.native
  def queryId(): String = js.native
  def queryId(newValue: String): js.Any = js.native
  /**
    * In version 8.4.0: deleted
    */
  def schemaId(): String = js.native
  def schemaId(newValue: String): js.Any = js.native
  /**
    * In version 8.4.0: introduced
    */
  def usedAssociations(): IList[String] = js.native
  /**
    * In version 8.4.0: introduced
    */
  def widgetName(): String = js.native
  def widgetName(newValue: String): js.Any = js.native
  def xPath(): String = js.native
  def xPath(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.RetrievalQuery")
@js.native
object RetrievalQuery extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RetrievalQuery instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RetrievalQuery = js.native
}

