package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplate
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/generate-document relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction")
@js.native
class GenerateDocumentAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGenerateDocumentAction: IModel = js.native
  def documentTemplate(): js.Any = js.native
  def documentTemplate(newValue: IDocumentTemplate): js.Any = js.native
  def documentTemplateQualifiedName(): String | Null = js.native
  @JSName("documentTemplate")
  def documentTemplate_Union(): IDocumentTemplate | Null = js.native
  def documentType(): TargetDocumentType = js.native
  def documentType(newValue: TargetDocumentType): js.Any = js.native
  def fileVariableName(): String = js.native
  def fileVariableName(newValue: String): js.Any = js.native
  def languageSetting(): LanguageSettingType = js.native
  def languageSetting(newValue: LanguageSettingType): js.Any = js.native
  def languageVariableName(): String = js.native
  def languageVariableName(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginBottomInInch(): String = js.native
  def marginBottomInInch(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def marginBottomInInchModel(): Expression = js.native
  def marginBottomInInchModel(newValue: Expression): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginLeftInInch(): String = js.native
  def marginLeftInInch(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def marginLeftInInchModel(): Expression = js.native
  def marginLeftInInchModel(newValue: Expression): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginRightInInch(): String = js.native
  def marginRightInInch(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def marginRightInInchModel(): Expression = js.native
  def marginRightInInchModel(newValue: Expression): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def marginTopInInch(): String = js.native
  def marginTopInInch(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def marginTopInInchModel(): Expression = js.native
  def marginTopInInchModel(newValue: Expression): js.Any = js.native
  def overrideBottomMargin(): Boolean = js.native
  def overrideBottomMargin(newValue: Boolean): js.Any = js.native
  def overrideLeftMargin(): Boolean = js.native
  def overrideLeftMargin(newValue: Boolean): js.Any = js.native
  def overrideRightMargin(): Boolean = js.native
  def overrideRightMargin(newValue: Boolean): js.Any = js.native
  def overrideTopMargin(): Boolean = js.native
  def overrideTopMargin(newValue: Boolean): js.Any = js.native
  def parameterMappings(): IList[DocumentTemplateParameterMapping] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.GenerateDocumentAction")
@js.native
object GenerateDocumentAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): GenerateDocumentAction = js.native
  /**
    * Creates and returns a new GenerateDocumentAction instance in the SDK and on the server.
    * The new GenerateDocumentAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): GenerateDocumentAction = js.native
}

