package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.workflowsMod.workflows.IParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
@js.native
trait IEntityRef
  extends StObject
     with IElement {
  
  val containerAsMemberRef: IMemberRef = js.native
  
  val containerAsParameter: IParameter = js.native
  
  @JSName("model")
  val model_IEntityRef: IModel = js.native
}
