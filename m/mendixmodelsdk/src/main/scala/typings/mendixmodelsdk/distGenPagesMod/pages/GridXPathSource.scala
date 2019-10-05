package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridXPathSource")
@js.native
class GridXPathSource protected () extends GridBaseSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.0.0: deleted
    */
  var applyContext: Boolean = js.native
  /**
    * In version 8.0.0: deleted
    */
  var removeAllFromContext: Boolean = js.native
  /**
    * In version 8.0.0: deleted
    */
  val removeFromContextIds: IList[IEntity] = js.native
  val removeFromContextIdsQualifiedNames: js.Array[String] = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  var xPathConstraint: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridXPathSource")
@js.native
object GridXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GridXPathSource = js.native
  /**
    * Creates and returns a new GridXPathSource instance in the SDK and on the server.
    * The new GridXPathSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createIn(container: EntityWidget): GridXPathSource = js.native
}

