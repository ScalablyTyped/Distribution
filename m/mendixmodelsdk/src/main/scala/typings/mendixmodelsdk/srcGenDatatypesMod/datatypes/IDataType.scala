package typings.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowParameterBase
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPageParameter
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DataTypes`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
@js.native
trait IDataType
  extends StObject
     with IElement {
  
  val containerAsAppServiceAction: IAppServiceAction = js.native
  
  val containerAsAppServiceActionParameter: IAppServiceActionParameter = js.native
  
  val containerAsConstant: IConstant = js.native
  
  val containerAsDataSetParameter: IDataSetParameter = js.native
  
  val containerAsDocumentTemplateParameter: IDocumentTemplateParameter = js.native
  
  val containerAsImportMapping: IImportMapping = js.native
  
  val containerAsMicroflowBase: IMicroflowBase = js.native
  
  val containerAsMicroflowParameterBase: IMicroflowParameterBase = js.native
  
  val containerAsPageParameter: IPageParameter = js.native
  
  @JSName("model")
  val model_IDataType: IModel = js.native
}
