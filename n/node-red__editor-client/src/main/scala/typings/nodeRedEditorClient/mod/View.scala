package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  def calculateTextWidth(str: String, className: String): Double = js.native
  
  def clickNodeButton(n: js.Object): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getActiveGroup(): js.Object = js.native
  
  def getActiveNodes(): js.Array[js.Object] = js.native
  
  def getGroupAtPoint(x: Double, y: Double): js.Object | Null = js.native
  
  def getLinksAtPoint(x: Double, y: Double): js.Array[js.Object] = js.native
  
  def gridSize(): Double = js.native
  def gridSize(v: Double): Unit = js.native
  
  /**
    * Imports a new collection of nodes from a JSON String.
    *  - all get new IDs assigned
    *  - all "selected"
    *  - attached to mouse for placing - "IMPORT_DRAGGING"
    */
  def importNodes(newNodesStr: String): Unit = js.native
  def importNodes(newNodesStr: String, addNewFlow: js.UndefOr[scala.Nothing], touchImport: Boolean): Unit = js.native
  def importNodes(newNodesStr: String, addNewFlow: Boolean): Unit = js.native
  def importNodes(newNodesStr: String, addNewFlow: Boolean, touchImport: Boolean): Unit = js.native
  
  def init(): Unit = js.native
  
  var navigator: ViewNavigator = js.native
  
  def redraw(): Unit = js.native
  def redraw(updateActive: js.UndefOr[scala.Nothing], syncRedraw: Boolean): Unit = js.native
  def redraw(updateActive: Boolean): Unit = js.native
  def redraw(updateActive: Boolean, syncRedraw: Boolean): Unit = js.native
  
  def reveal(id: String): Unit = js.native
  def reveal(id: String, triggerHighlight: Boolean): Unit = js.native
  
  def scale(): Double = js.native
  
  def scroll(x: Double, y: Double): Unit = js.native
  
  def select(): Unit = js.native
  def select(selection: String): Unit = js.native
  def select(selection: js.Object): Unit = js.native
  
  def selectNodes(options: js.Object): Unit = js.native
  
  def selection(): Link = js.native
  
  def state(): Double = js.native
  def state(state: Double): Unit = js.native
  
  var tools: ViewTools = js.native
  
  def updateActive(): Unit = js.native
}
