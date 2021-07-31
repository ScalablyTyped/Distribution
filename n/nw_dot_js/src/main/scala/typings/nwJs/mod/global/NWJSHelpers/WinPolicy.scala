package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window.get().on('new-win-policy') callback policy argument object
  */
trait WinPolicy extends StObject {
  
  /**
    * Force the link to be opened in the same frame
    */
  def forceCurrent(): Unit
  
  /**
    * Force the link to be a downloadable, or open by external program
    */
  def forceDownload(): Unit
  
  /**
    * Force the link to be opened in a new popup window
    */
  def forceNewPopup(): Unit
  
  /**
    * Force the link to be opened in a new window
    */
  def forceNewWindow(): Unit
  
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit
  
  /**
    * Control the options for the new popup window.
    *
    *@param m {Object} The object is in the same format as the Window subfields in manifest format.
    */
  def setNewWindowManifest(m: WindowOption): Unit
}
object WinPolicy {
  
  @scala.inline
  def apply(
    forceCurrent: () => Unit,
    forceDownload: () => Unit,
    forceNewPopup: () => Unit,
    forceNewWindow: () => Unit,
    ignore: () => Unit,
    setNewWindowManifest: WindowOption => Unit
  ): WinPolicy = {
    val __obj = js.Dynamic.literal(forceCurrent = js.Any.fromFunction0(forceCurrent), forceDownload = js.Any.fromFunction0(forceDownload), forceNewPopup = js.Any.fromFunction0(forceNewPopup), forceNewWindow = js.Any.fromFunction0(forceNewWindow), ignore = js.Any.fromFunction0(ignore), setNewWindowManifest = js.Any.fromFunction1(setNewWindowManifest))
    __obj.asInstanceOf[WinPolicy]
  }
  
  @scala.inline
  implicit class WinPolicyMutableBuilder[Self <: WinPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceCurrent(value: () => Unit): Self = StObject.set(x, "forceCurrent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceDownload(value: () => Unit): Self = StObject.set(x, "forceDownload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceNewPopup(value: () => Unit): Self = StObject.set(x, "forceNewPopup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceNewWindow(value: () => Unit): Self = StObject.set(x, "forceNewWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIgnore(value: () => Unit): Self = StObject.set(x, "ignore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNewWindowManifest(value: WindowOption => Unit): Self = StObject.set(x, "setNewWindowManifest", js.Any.fromFunction1(value))
  }
}
