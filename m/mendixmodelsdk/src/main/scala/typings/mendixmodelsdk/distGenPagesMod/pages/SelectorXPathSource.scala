package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource")
@js.native
class SelectorXPathSource protected () extends SelectorSource {
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
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  val constrainedBy: IList[String] = js.native
  /**
    * In version 7.11.0: introduced
    */
  val constrainedByRefs: IList[EntityRef] = js.native
  /**
    * In version 8.0.0: deleted
    */
  var removeAllFromContext: Boolean = js.native
  /**
    * In version 8.0.0: deleted
    */
  val removeFromContextEntities: IList[IEntity] = js.native
  val removeFromContextEntitiesQualifiedNames: js.Array[String] = js.native
  var sortBar: GridSortBar = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  var xPathConstraint: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource")
@js.native
object SelectorXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SelectorXPathSource = js.native
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * The new SelectorXPathSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createIn(container: AssociationWidget): SelectorXPathSource = js.native
}

