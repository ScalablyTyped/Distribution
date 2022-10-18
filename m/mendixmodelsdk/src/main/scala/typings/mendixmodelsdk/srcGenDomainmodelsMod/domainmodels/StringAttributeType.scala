package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenMlmappingsMod.mlmappings.TensorMappingElement
import typings.mendixmodelsdk.srcGenRestMod.rest.ODataKeyPart
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttributeType because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IStringAttributeType because var conflicts: containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.StringAttributeType")
@js.native
open class StringAttributeType protected () extends AttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MStringAttributeType: Attribute = js.native
  
  @JSName("containerAsEntityKeyPart")
  def containerAsEntityKeyPart_MStringAttributeType: EntityKeyPart = js.native
  
  @JSName("containerAsODataKeyPart")
  def containerAsODataKeyPart_MStringAttributeType: ODataKeyPart = js.native
  
  def length: Double = js.native
  def length_=(newValue: Double): Unit = js.native
}
object StringAttributeType {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.StringAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  inline def createIn(container: Attribute): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  /* static member */
  inline def createInAttributeUnderType(container: Attribute): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  inline def createInEntityKeyPartUnderType(container: EntityKeyPart): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  inline def createInODataKeyPartUnderType(container: ODataKeyPart): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInODataKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'attributeType' property
    * of the parent businessevents.PublishedMessageAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.14.0 and higher
    */
  /* static member */
  inline def createInPublishedMessageAttributeUnderAttributeType(container: PublishedMessageAttribute): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedMessageAttributeUnderAttributeType")(container.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'attributeType' property
    * of the parent mlmappings.TensorMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.17.0 and higher
    */
  /* static member */
  inline def createInTensorMappingElementUnderAttributeType(container: TensorMappingElement): StringAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderAttributeType")(container.asInstanceOf[js.Any]).asInstanceOf[StringAttributeType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.StringAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.StringAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
