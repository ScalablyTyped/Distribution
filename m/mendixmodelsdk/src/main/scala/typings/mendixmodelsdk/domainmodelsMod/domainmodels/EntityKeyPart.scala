package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntityKeyPart because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntityKey, name, `type` */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityKeyPart")
@js.native
class EntityKeyPart protected ()
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
  @JSName("containerAsEntityKey")
  val containerAsEntityKey_FEntityKeyPart: IEntityKey = js.native
  @JSName("model")
  var model_FEntityKeyPart: IModel = js.native
  @JSName("name")
  val name_FEntityKeyPart: String = js.native
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
  val type_FEntityKeyPart: IAttributeType = js.native
  def containerAsEntityKey: EntityKey = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MEntityKeyPart: String | Null = js.native
  def `type`: AttributeType = js.native
  def `type`(newValue: AttributeType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityKeyPart")
@js.native
object EntityKeyPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityKeyPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityKeyPart = js.native
  /**
    * Creates and returns a new EntityKeyPart instance in the SDK and on the server.
    * The new EntityKeyPart will be automatically stored in the 'parts' property
    * of the parent EntityKey element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createIn(container: EntityKey): EntityKeyPart = js.native
}

