package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DocumentTemplateParameterMapping")
@js.native
class DocumentTemplateParameterMapping protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDocumentTemplateParameterMapping: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def argument: String = js.native
  def argument(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def argumentModel: Expression = js.native
  def argumentModel(newValue: Expression): js.Any = js.native
  def containerAsGenerateDocumentAction: GenerateDocumentAction = js.native
  def widgetName: String = js.native
  def widgetName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.DocumentTemplateParameterMapping")
@js.native
object DocumentTemplateParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DocumentTemplateParameterMapping = js.native
  /**
    * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
    * The new DocumentTemplateParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent GenerateDocumentAction element passed as argument.
    */
  def createIn(container: GenerateDocumentAction): DocumentTemplateParameterMapping = js.native
}

