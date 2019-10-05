package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DatabaseRetrieveSource")
@js.native
class DatabaseRetrieveSource protected () extends RetrieveSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var entity: IEntity | Null = js.native
  val entityQualifiedName: String | Null = js.native
  var range: Range = js.native
  var sortItemList: SortItemList = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  var xPathConstraint: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DatabaseRetrieveSource")
@js.native
object DatabaseRetrieveSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DatabaseRetrieveSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DatabaseRetrieveSource = js.native
  /**
    * Creates and returns a new DatabaseRetrieveSource instance in the SDK and on the server.
    * The new DatabaseRetrieveSource will be automatically stored in the 'retrieveSource' property
    * of the parent RetrieveAction element passed as argument.
    */
  def createIn(container: RetrieveAction): DatabaseRetrieveSource = js.native
}

