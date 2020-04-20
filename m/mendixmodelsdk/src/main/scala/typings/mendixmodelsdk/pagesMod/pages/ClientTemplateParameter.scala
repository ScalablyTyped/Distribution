package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter")
@js.native
class ClientTemplateParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FClientTemplateParameter: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath(newValue: String): js.Any = js.native
  def attributeRef(): js.Any = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("attributeRef")
  def attributeRef_Union: AttributeRef | Null = js.native
  def containerAsClientTemplate: ClientTemplate = js.native
  /**
    * In version 7.15.0: introduced
    */
  def formattingInfo: FormattingInfo = js.native
  def formattingInfo(newValue: FormattingInfo): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter")
@js.native
object ClientTemplateParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ClientTemplateParameter = js.native
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * The new ClientTemplateParameter will be automatically stored in the 'parameters' property
    * of the parent ClientTemplate element passed as argument.
    */
  def createIn(container: ClientTemplate): ClientTemplateParameter = js.native
}

