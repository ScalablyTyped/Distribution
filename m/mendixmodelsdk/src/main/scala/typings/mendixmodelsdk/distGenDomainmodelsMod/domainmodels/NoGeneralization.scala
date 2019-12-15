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
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IGeneralizationBase because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.INoGeneralization because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined hasChangedDate, hasCreatedDate, hasOwner, hasChangedBy, persistable */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization")
@js.native
class NoGeneralization protected () extends GeneralizationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasChangedBy")
  val hasChangedBy_FNoGeneralization: Boolean = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasChangedDate")
  val hasChangedDate_FNoGeneralization: Boolean = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasCreatedDate")
  val hasCreatedDate_FNoGeneralization: Boolean = js.native
  /**
    * In version 8.2.0: added public
    */
  @JSName("hasOwner")
  val hasOwner_FNoGeneralization: Boolean = js.native
  @JSName("model")
  var model_FNoGeneralization: IModel = js.native
  @JSName("persistable")
  val persistable_FNoGeneralization: Boolean = js.native
  @JSName("containerAsEntity")
  def containerAsEntity_MNoGeneralization(): Entity = js.native
  /**
    * In version 8.2.0: added public
    */
  def hasChangedBy(): Boolean = js.native
  def hasChangedBy(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.2.0: added public
    */
  def hasChangedDate(): Boolean = js.native
  def hasChangedDate(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.2.0: added public
    */
  def hasCreatedDate(): Boolean = js.native
  def hasCreatedDate(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.2.0: added public
    */
  def hasOwner(): Boolean = js.native
  def hasOwner(newValue: Boolean): js.Any = js.native
  def persistable(): Boolean = js.native
  def persistable(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.NoGeneralization")
@js.native
object NoGeneralization extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NoGeneralization = js.native
  /**
    * Creates and returns a new NoGeneralization instance in the SDK and on the server.
    * The new NoGeneralization will be automatically stored in the 'generalization' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: Entity): NoGeneralization = js.native
}

