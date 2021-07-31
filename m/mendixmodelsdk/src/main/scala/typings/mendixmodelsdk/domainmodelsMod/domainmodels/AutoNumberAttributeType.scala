package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.rest.ODataKeyPart
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.INumericAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IIntegerAttributeTypeBase because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAutoNumberAttributeType because var conflicts: containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AutoNumberAttributeType")
@js.native
class AutoNumberAttributeType protected () extends IntegerAttributeTypeBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MAutoNumberAttributeType: Attribute = js.native
  
  @JSName("containerAsEntityKeyPart")
  def containerAsEntityKeyPart_MAutoNumberAttributeType: EntityKeyPart = js.native
  
  @JSName("containerAsODataKeyPart")
  def containerAsODataKeyPart_MAutoNumberAttributeType: ODataKeyPart = js.native
}
object AutoNumberAttributeType {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AutoNumberAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): AutoNumberAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AutoNumberAttributeType]
  
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * The new AutoNumberAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  @scala.inline
  def createIn(container: Attribute): AutoNumberAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AutoNumberAttributeType]
  
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * The new AutoNumberAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInAttributeUnderType(container: Attribute): AutoNumberAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[AutoNumberAttributeType]
  
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * The new AutoNumberAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInEntityKeyPartUnderType(container: EntityKeyPart): AutoNumberAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[AutoNumberAttributeType]
  
  /**
    * Creates and returns a new AutoNumberAttributeType instance in the SDK and on the server.
    * The new AutoNumberAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInODataKeyPartUnderType(container: ODataKeyPart): AutoNumberAttributeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInODataKeyPartUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[AutoNumberAttributeType]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AutoNumberAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AutoNumberAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
