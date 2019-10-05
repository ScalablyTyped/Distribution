package typings.mendixmodelsdk.distGenDatatypesMod.datatypes

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameterBase
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataTypes`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@js.native
trait IDataType extends IElement {
  val containerAsAppServiceAction: IAppServiceAction = js.native
  val containerAsAppServiceActionParameter: IAppServiceActionParameter = js.native
  val containerAsConstant: IConstant = js.native
  val containerAsDataSetParameter: IDataSetParameter = js.native
  val containerAsDocumentTemplateParameter: IDocumentTemplateParameter = js.native
  val containerAsImportMapping: IImportMapping = js.native
  val containerAsMicroflowBase: IMicroflowBase = js.native
  val containerAsMicroflowParameterBase: IMicroflowParameterBase = js.native
  @JSName("model")
  val model_IDataType: IModel = js.native
}

