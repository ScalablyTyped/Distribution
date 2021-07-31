package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deploy extends StObject {
  
  /**
    * options:
    *   type: "default" - Button with drop-down options - no further customisation available
    *   type: "simple"  - Button without dropdown. Customisations:
    *      label: the text to display - default: "Deploy"
    *      icon : the icon to use. Null removes the icon. default: "red/images/deploy-full-o.svg"
    */
  def init(): Unit = js.native
  def init(options: Icon): Unit = js.native
  
  def setDeployInflight(state: Boolean): Unit = js.native
}
