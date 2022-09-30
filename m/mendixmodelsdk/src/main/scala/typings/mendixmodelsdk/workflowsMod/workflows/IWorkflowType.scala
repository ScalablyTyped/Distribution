package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.10.0: deleted
  * In version 9.7.0: introduced
  */
@js.native
trait IWorkflowType
  extends StObject
     with IElement {
  
  val containerAsWorkflow: IWorkflow = js.native
  
  val entity: IEntity | Null = js.native
  
  val entityQualifiedName: String | Null = js.native
  
  @JSName("model")
  val model_IWorkflowType: IModel = js.native
}
