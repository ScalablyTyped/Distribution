package typings.mendixmodelsdk.mod.domainmodels

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

@JSImport("mendixmodelsdk", "domainmodels.IntegerAttributeType")
@js.native
open class IntegerAttributeType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.IntegerAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object IntegerAttributeType {
  
  @JSImport("mendixmodelsdk", "domainmodels.IntegerAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * The new IntegerAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * The new IntegerAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  /* static member */
  inline def createInAttributeUnderType(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * The new IntegerAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  inline def createInEntityKeyPartUnderType(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EntityKeyPart): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * The new IntegerAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  inline def createInODataKeyPartUnderType(container: ODataKeyPart): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInODataKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * The new IntegerAttributeType will be automatically stored in the 'attributeType' property
    * of the parent businessevents.PublishedMessageAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.14.0 and higher
    */
  /* static member */
  inline def createInPublishedMessageAttributeUnderAttributeType(container: PublishedMessageAttribute): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedMessageAttributeUnderAttributeType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /**
    * Creates and returns a new IntegerAttributeType instance in the SDK and on the server.
    * The new IntegerAttributeType will be automatically stored in the 'attributeType' property
    * of the parent mlmappings.TensorMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.17.0 and higher
    */
  /* static member */
  inline def createInTensorMappingElementUnderAttributeType(container: TensorMappingElement): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTensorMappingElementUnderAttributeType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IntegerAttributeType]
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IntegerAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.IntegerAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
