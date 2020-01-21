package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCall")
@js.native
class SnippetCall protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSnippetCall: IModel = js.native
  def containerAsSnippetCallWidget(): SnippetCallWidget = js.native
  def snippet(): js.Any = js.native
  def snippet(newValue: ISnippet): js.Any = js.native
  def snippetQualifiedName(): String | Null = js.native
  @JSName("snippet")
  def snippet_Union(): ISnippet | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SnippetCall")
@js.native
object SnippetCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SnippetCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SnippetCall = js.native
  /**
    * Creates and returns a new SnippetCall instance in the SDK and on the server.
    * The new SnippetCall will be automatically stored in the 'snippetCall' property
    * of the parent SnippetCallWidget element passed as argument.
    */
  def createIn(container: SnippetCallWidget): SnippetCall = js.native
}

