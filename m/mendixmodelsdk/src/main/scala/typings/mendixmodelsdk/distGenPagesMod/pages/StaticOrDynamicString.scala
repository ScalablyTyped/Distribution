package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.StaticOrDynamicString")
@js.native
class StaticOrDynamicString protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FStaticOrDynamicString: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attribute(): String = js.native
  def attribute(newValue: String): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef(): AttributeRef | Null = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  @JSName("attributeRef")
  def attributeRef_Any(): js.Any = js.native
  def containerAsLinkButton(): LinkButton = js.native
  def containerAsOpenLinkClientAction(): OpenLinkClientAction = js.native
  def isDynamic(): Boolean = js.native
  def isDynamic(newValue: Boolean): js.Any = js.native
  def value(): String = js.native
  def value(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.StaticOrDynamicString")
@js.native
object StaticOrDynamicString extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): StaticOrDynamicString = js.native
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent LinkButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  def createInLinkButtonUnderAddress(container: LinkButton): StaticOrDynamicString = js.native
  /**
    * Creates and returns a new StaticOrDynamicString instance in the SDK and on the server.
    * The new StaticOrDynamicString will be automatically stored in the 'address' property
    * of the parent OpenLinkClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  def createInOpenLinkClientActionUnderAddress(container: OpenLinkClientAction): StaticOrDynamicString = js.native
}

