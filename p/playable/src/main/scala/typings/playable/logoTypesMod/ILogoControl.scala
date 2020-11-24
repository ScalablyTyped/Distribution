package typings.playable.logoTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogoControl extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def setLogo(src: String): Unit = js.native
  
  def setLogoClickCallback(): Unit = js.native
  def setLogoClickCallback(callback: js.Function0[Unit]): Unit = js.native
  
  def show(): Unit = js.native
}
