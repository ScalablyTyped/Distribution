package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@js.native
trait IEnumerationValueSplitOutcome
  extends StObject
     with IExclusiveSplitOutcome {
  
  /**
    * This property is required and cannot be set to null.
    */
  val value: IEnumerationValue = js.native
  
  val valueQualifiedName: String = js.native
}
