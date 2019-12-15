package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/attributes relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, name, `type`, value */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Attribute")
@js.native
class Attribute protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsEntity")
  val containerAsEntity_FAttribute: IEntity = js.native
  @JSName("model")
  var model_FAttribute: IModel = js.native
  @JSName("name")
  val name_FAttribute: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FAttribute: IAttributeType = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.6.0: added public
    */
  @JSName("value")
  val value_FAttribute: IValueType = js.native
  def containerAsEntity(): Entity = js.native
  def dataStorageGuid(): String = js.native
  def dataStorageGuid(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MAttribute(): String | Null = js.native
  def `type`(): AttributeType = js.native
  def `type`(newValue: AttributeType): js.Any = js.native
  /**
    * In version 6.6.0: added public
    */
  def value(): ValueType = js.native
  def value(newValue: ValueType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.Attribute")
@js.native
object Attribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Attribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Attribute = js.native
  /**
    * Creates and returns a new Attribute instance in the SDK and on the server.
    * The new Attribute will be automatically stored in the 'attributes' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: Entity): Attribute = js.native
}

