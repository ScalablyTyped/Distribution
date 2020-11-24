package typings.playable.bottomBlockTypesMod

import typings.playable.anon.Position
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomBlock extends js.Object {
  
  def addControl(key: String, element: HTMLElement): Unit = js.native
  def addControl(key: String, element: HTMLElement, options: Position): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getElement(): HTMLElement = js.native
  
  def hide(): Unit = js.native
  
  def hideContent(): Unit = js.native
  
  def hideDownloadButton(): Unit = js.native
  
  def hideFullScreenControl(): Unit = js.native
  
  def hideLogo(): Unit = js.native
  
  def hidePlayControl(): Unit = js.native
  
  def hideProgressControl(): Unit = js.native
  
  def hideTimeControl(): Unit = js.native
  
  def hideVolumeControl(): Unit = js.native
  
  var isFocused: Boolean = js.native
  
  def setAlwaysShowLogo(flag: Boolean): Unit = js.native
  
  def show(): Unit = js.native
  
  def showContent(): Unit = js.native
  
  def showDownloadButton(): Unit = js.native
  
  def showFullScreenControl(): Unit = js.native
  
  def showLogo(): Unit = js.native
  
  def showPlayControl(): Unit = js.native
  
  def showProgressControl(): Unit = js.native
  
  def showTimeControl(): Unit = js.native
  
  def showVolumeControl(): Unit = js.native
}
