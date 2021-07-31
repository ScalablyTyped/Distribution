package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.13.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeCapabilities because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute, filterable, sortable, canDeleteFromModel */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities")
@js.native
class AttributeCapabilities protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.0.0: introduced
    */
  def canDeleteFromModel: Boolean = js.native
  def canDeleteFromModel_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.0.0: introduced
    */
  @JSName("canDeleteFromModel")
  val canDeleteFromModel_FAttributeCapabilities: Boolean = js.native
  
  def containerAsAttribute: Attribute = js.native
  @JSName("containerAsAttribute")
  val containerAsAttribute_FAttributeCapabilities: IAttribute = js.native
  
  def filterable: Boolean = js.native
  def filterable_=(newValue: Boolean): Unit = js.native
  @JSName("filterable")
  val filterable_FAttributeCapabilities: Boolean = js.native
  
  def sortable: Boolean = js.native
  def sortable_=(newValue: Boolean): Unit = js.native
  @JSName("sortable")
  val sortable_FAttributeCapabilities: Boolean = js.native
}
object AttributeCapabilities {
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): AttributeCapabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AttributeCapabilities]
  
  /**
    * Creates and returns a new AttributeCapabilities instance in the SDK and on the server.
    * The new AttributeCapabilities will be automatically stored in the 'capabilities' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: Attribute): AttributeCapabilities = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AttributeCapabilities]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AttributeCapabilities.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
