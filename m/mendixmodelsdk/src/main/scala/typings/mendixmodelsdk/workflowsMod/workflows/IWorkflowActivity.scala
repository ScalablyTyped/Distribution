package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/workflows relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait IWorkflowActivity
  extends StObject
     with IElement
     with IByNameReferrable {
  
  val caption: String = js.native
  
  val containerAsFlow: IFlow = js.native
  
  @JSName("model")
  val model_IWorkflowActivity: IModel = js.native
  
  /**
    * In version 9.0.5: introduced
    */
  val name: String = js.native
}
