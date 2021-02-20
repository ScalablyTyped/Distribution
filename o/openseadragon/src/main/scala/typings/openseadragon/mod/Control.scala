package typings.openseadragon.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Control")
@js.native
class Control protected () extends StObject {
  def this(element: Element, options: TControlOptions, container: Element) = this()
  
  var anchor: ControlAnchor = js.native
  
  var autoFade: Boolean = js.native
  
  var container: Element = js.native
  
  def destroy(): Unit = js.native
  
  var element: Element = js.native
  
  def isVisible(): Boolean = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  var wrapper: Element = js.native
}
