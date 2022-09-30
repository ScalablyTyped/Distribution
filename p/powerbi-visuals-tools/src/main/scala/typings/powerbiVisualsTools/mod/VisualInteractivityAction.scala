package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
import typings.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines actions to be taken by the visual in response to a selection.
  *
  * An undefined/null VisualInteractivityAction should be treated as Selection,
  * as that is the default action.
  */
/* Rewritten from type alias, can be one of: 
  - typings.powerbiVisualsTools.powerbiVisualsToolsInts.`0`
  - typings.powerbiVisualsTools.powerbiVisualsToolsInts.`1`
*/
trait VisualInteractivityAction extends StObject
object VisualInteractivityAction {
  
  /** No additional action or feedback from the visual is needed */
  inline def None: `1` = 1.asInstanceOf[`1`]
  
  /** Normal selection behavior which should call onSelect */
  inline def Selection: `0` = 0.asInstanceOf[`0`]
}
