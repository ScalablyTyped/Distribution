package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/call-microflow relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait ICallMicroflowTask
  extends StObject
     with IConditionOutcomeActivity {
  
  val microflow: IMicroflow | Null = js.native
  
  val microflowQualifiedName: String | Null = js.native
}
