package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@js.native
trait ICallMicroflowTask extends IWorkflowTask {
  
  val microflow: IMicroflow | Null = js.native
  
  val microflowQualifiedName: String | Null = js.native
}
