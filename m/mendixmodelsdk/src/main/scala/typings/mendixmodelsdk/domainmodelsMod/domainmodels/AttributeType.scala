package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.businesseventsMod.businessevents.PublishedMessageAttribute
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mlmappingsMod.mlmappings.TensorMappingElement
import typings.mendixmodelsdk.restMod.rest.IODataKeyPart
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
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeType")
@js.native
abstract class AttributeType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAttribute: Attribute = js.native
  @JSName("containerAsAttribute")
  val containerAsAttribute_FAttributeType: IAttribute = js.native
  
  def containerAsEntityKeyPart: EntityKeyPart = js.native
  @JSName("containerAsEntityKeyPart")
  val containerAsEntityKeyPart_FAttributeType: IEntityKeyPart = js.native
  
  def containerAsODataKeyPart: ODataKeyPart = js.native
  @JSName("containerAsODataKeyPart")
  val containerAsODataKeyPart_FAttributeType: IODataKeyPart = js.native
  
  def containerAsPublishedMessageAttribute: PublishedMessageAttribute = js.native
  
  def containerAsTensorMappingElement: TensorMappingElement = js.native
}
object AttributeType {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
