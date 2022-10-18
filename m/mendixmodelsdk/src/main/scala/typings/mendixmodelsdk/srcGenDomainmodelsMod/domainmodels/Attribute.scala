package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.ExportLevel
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/attributes relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity, name, `type`, documentation, value, capabilities */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Attribute")
@js.native
open class Attribute protected ()
  extends Element[IModel]
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.0.1: deleted
    * In version 8.13.0: introduced
    */
  def capabilities: AttributeCapabilities = js.native
  def capabilities_=(newValue: AttributeCapabilities): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.0.1: deleted
    * In version 8.13.0: introduced
    */
  @JSName("capabilities")
  val capabilities_FAttribute: IAttributeCapabilities = js.native
  
  def containerAsEntity: Entity = js.native
  @JSName("containerAsEntity")
  val containerAsEntity_FAttribute: IEntity = js.native
  
  def dataStorageGuid: String = js.native
  def dataStorageGuid_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.10.0: added public
    */
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  /**
    * In version 9.10.0: added public
    */
  @JSName("documentation")
  val documentation_FAttribute: String = js.native
  
  /**
    * In version 9.3.0: introduced
    */
  def exportLevel: ExportLevel = js.native
  def exportLevel_=(newValue: ExportLevel): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
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
  @JSName("qualifiedName")
  def qualifiedName_MAttribute: String | Null = js.native
  
  def `type`: AttributeType = js.native
  def type_=(newValue: AttributeType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FAttribute: IAttributeType = js.native
  
  /**
    * In version 6.6.0: added public
    */
  def value: ValueType = js.native
  def value_=(newValue: ValueType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.6.0: added public
    */
  @JSName("value")
  val value_FAttribute: IValueType = js.native
}
object Attribute {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Attribute")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Attribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Attribute]
  
  /**
    * Creates and returns a new Attribute instance in the SDK and on the server.
    * The new Attribute will be automatically stored in the 'attributes' property
    * of the parent Entity element passed as argument.
    */
  /* static member */
  inline def createIn(container: Entity): Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Attribute]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Attribute.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Attribute.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
