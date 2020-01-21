package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewZoneChangeAccessor extends js.Object {
  /**
    * Create a new view zone.
    * @param zone Zone to create
    * @return A unique identifier to the view zone.
    */
  def addZone(zone: IViewZone): String
  /**
    * Change a zone's position.
    * The editor will rescan the `afterLineNumber` and `afterColumn` properties of a view zone.
    */
  def layoutZone(id: String): Unit
  /**
    * Remove a zone
    * @param id A unique identifier to the view zone, as returned by the `addZone` call.
    */
  def removeZone(id: String): Unit
}

object IViewZoneChangeAccessor {
  @scala.inline
  def apply(addZone: IViewZone => String, layoutZone: String => Unit, removeZone: String => Unit): IViewZoneChangeAccessor = {
    val __obj = js.Dynamic.literal(addZone = js.Any.fromFunction1(addZone), layoutZone = js.Any.fromFunction1(layoutZone), removeZone = js.Any.fromFunction1(removeZone))
  
    __obj.asInstanceOf[IViewZoneChangeAccessor]
  }
}

