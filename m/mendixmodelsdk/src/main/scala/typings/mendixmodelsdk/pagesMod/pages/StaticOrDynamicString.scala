package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.StaticOrDynamicString")
@js.native
class StaticOrDynamicString protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attribute: String = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef | Null = js.native
  def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
  
  def attribute_=(newValue: String): Unit = js.native
  
  def containerAsLinkButton: LinkButton = js.native
  
  def containerAsOpenLinkClientAction: OpenLinkClientAction = js.native
  
  def isDynamic: Boolean = js.native
  def isDynamic_=(newValue: Boolean): Unit = js.native
  
  def value: String = js.native
  def value_=(newValue: String): Unit = js.native
}
object StaticOrDynamicString {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.StaticOrDynamicString")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[StaticOrDynamicString]
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent LinkButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @scala.inline
  def createInLinkButtonUnderAddress(container: LinkButton): StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLinkButtonUnderAddress")(container.asInstanceOf[js.Any]).asInstanceOf[StaticOrDynamicString]
  
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent OpenLinkClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @scala.inline
  def createInOpenLinkClientActionUnderAddress(container: OpenLinkClientAction): StaticOrDynamicString = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOpenLinkClientActionUnderAddress")(container.asInstanceOf[js.Any]).asInstanceOf[StaticOrDynamicString]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.StaticOrDynamicString.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.StaticOrDynamicString.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
