package typings.phonon.Phonon

import typings.phonon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononPopoverComponent extends StObject {
  
  def attachButton(element: String): PhononPopoverComponent = js.native
  def attachButton(element: String, autoBind: Boolean): PhononPopoverComponent = js.native
  def attachButton(element: Element): PhononPopoverComponent = js.native
  def attachButton(element: Element, autoBind: Boolean): PhononPopoverComponent = js.native
  
  def close(): Unit = js.native
  
  def onItemChanged(callback: js.Function1[/* data */ PhononPopoverItem, Unit]): PhononPopoverComponent = js.native
  
  def open(direction: PhononPopoverDirection): PhononPopoverComponent = js.native
  
  def openFrom(element: String): PhononPopoverComponent = js.native
  def openFrom(element: Element): PhononPopoverComponent = js.native
  
  def setList(list: js.Array[_ | PhononPopoverItem | String]): PhononPopoverComponent = js.native
  def setList(list: js.Array[_], itemBuilder: js.Function1[/* item */ js.Any, Unit]): PhononPopoverComponent = js.native
}
