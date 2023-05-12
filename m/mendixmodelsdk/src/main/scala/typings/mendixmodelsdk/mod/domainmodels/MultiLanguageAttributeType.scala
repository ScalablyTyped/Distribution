package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenBusinesseventsMod.businessevents.PublishedMessageAttribute
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
  * In version 9.24.0: deleted
  * In version 9.22.0: introduced
  */
@JSImport("mendixmodelsdk", "domainmodels.MultiLanguageAttributeType")
@js.native
open class MultiLanguageAttributeType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels.MultiLanguageAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MultiLanguageAttributeType {
  
  @JSImport("mendixmodelsdk", "domainmodels.MultiLanguageAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MultiLanguageAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType]
  
  /**
    * Creates and returns a new MultiLanguageAttributeType instance in the SDK and on the server.
    * The new MultiLanguageAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 to 9.23.0
    */
  /* static member */
  inline def createInAttributeUnderType(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType]
  
  /**
    * Creates and returns a new MultiLanguageAttributeType instance in the SDK and on the server.
    * The new MultiLanguageAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 to 9.23.0
    */
  /* static member */
  inline def createInEntityKeyPartUnderType(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EntityKeyPart): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType]
  
  /**
    * Creates and returns a new MultiLanguageAttributeType instance in the SDK and on the server.
    * The new MultiLanguageAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 to 9.23.0
    */
  /* static member */
  inline def createInODataKeyPartUnderType(container: ODataKeyPart): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInODataKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType]
  
  /**
    * Creates and returns a new MultiLanguageAttributeType instance in the SDK and on the server.
    * The new MultiLanguageAttributeType will be automatically stored in the 'attributeType' property
    * of the parent businessevents.PublishedMessageAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.22.0 to 9.23.0
    */
  /* static member */
  inline def createInPublishedMessageAttributeUnderAttributeType(container: PublishedMessageAttribute): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedMessageAttributeUnderAttributeType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.MultiLanguageAttributeType]
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.MultiLanguageAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "domainmodels.MultiLanguageAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
