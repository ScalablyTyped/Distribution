package typings.mendixmodelsdk.datatypesMod.datatypes

import typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.appservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameterBase
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

