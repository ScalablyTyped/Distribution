package typings.playable.titleTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITitle extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def setTitle(): Unit = js.native
  def setTitle(title: String): Unit = js.native
  
  def setTitleClickCallback(): Unit = js.native
  def setTitleClickCallback(callback: js.Function0[Unit]): Unit = js.native
  
  def show(): Unit = js.native
}
