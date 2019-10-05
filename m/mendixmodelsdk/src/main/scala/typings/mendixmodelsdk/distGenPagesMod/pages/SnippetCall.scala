package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  val containerAsSnippetCallWidget: SnippetCallWidget = js.native
  @JSName("model")
  var model_SnippetCall: IModel = js.native
  var snippet: ISnippet | Null = js.native
  val snippetQualifiedName: String | Null = js.native
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

