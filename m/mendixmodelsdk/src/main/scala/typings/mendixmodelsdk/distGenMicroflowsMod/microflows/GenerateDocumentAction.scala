package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.IDocumentTemplate
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  var documentTemplate: IDocumentTemplate | Null = js.native
  val documentTemplateQualifiedName: String | Null = js.native
  var documentType: TargetDocumentType = js.native
  var fileVariableName: String = js.native
  var languageSetting: LanguageSettingType = js.native
  var languageVariableName: String = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var marginBottomInInch: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var marginBottomInInchModel: Expression = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var marginLeftInInch: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var marginLeftInInchModel: Expression = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var marginRightInInch: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var marginRightInInchModel: Expression = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var marginTopInInch: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var marginTopInInchModel: Expression = js.native
  var overrideBottomMargin: Boolean = js.native
  var overrideLeftMargin: Boolean = js.native
  var overrideRightMargin: Boolean = js.native
  var overrideTopMargin: Boolean = js.native
  val parameterMappings: IList[DocumentTemplateParameterMapping] = js.native
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

