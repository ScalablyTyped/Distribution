package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.ICrossAssociation because var conflicts: id, isLoaded, model, name, owner, parent, remoteSourceDocument, structureTypeName, `type`, unit. Inlined child, childQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CrossAssociation")
@js.native
class CrossAssociation protected () extends AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var child: IEntity = js.native
  val childQualifiedName: String = js.native
  @JSName("containerAsDomainModel")
  val containerAsDomainModel_CrossAssociation: DomainModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.CrossAssociation")
@js.native
object CrossAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CrossAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CrossAssociation = js.native
  /**
    * Creates and returns a new CrossAssociation instance in the SDK and on the server.
    * The new CrossAssociation will be automatically stored in the 'crossAssociations' property
    * of the parent DomainModel element passed as argument.
    */
  def createIn(container: DomainModel): CrossAssociation = js.native
}

