package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenRestMod.rest.ODataKeyPart
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.1.0: deleted
  * In version 6.0.0: deprecated
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttributeType because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.INumericAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IDecimalAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IFloatAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.ICurrencyAttributeType because var conflicts: containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CurrencyAttributeType")
@js.native
open class CurrencyAttributeType protected () extends FloatAttributeTypeBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MCurrencyAttributeType: Attribute = js.native
  
  @JSName("containerAsEntityKeyPart")
  def containerAsEntityKeyPart_MCurrencyAttributeType: EntityKeyPart = js.native
  
  @JSName("containerAsODataKeyPart")
  def containerAsODataKeyPart_MCurrencyAttributeType: ODataKeyPart = js.native
}
object CurrencyAttributeType {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CurrencyAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CurrencyAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CurrencyAttributeType]
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  inline def createIn(container: Attribute): CurrencyAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CurrencyAttributeType]
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 9.0.5
    */
  /* static member */
  inline def createInAttributeUnderType(container: Attribute): CurrencyAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[CurrencyAttributeType]
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 to 9.0.5
    */
  /* static member */
  inline def createInEntityKeyPartUnderType(container: EntityKeyPart): CurrencyAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[CurrencyAttributeType]
  
  /**
    * Creates and returns a new CurrencyAttributeType instance in the SDK and on the server.
    * The new CurrencyAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 to 9.0.5
    */
  /* static member */
  inline def createInODataKeyPartUnderType(container: ODataKeyPart): CurrencyAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInODataKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[CurrencyAttributeType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CurrencyAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.CurrencyAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
