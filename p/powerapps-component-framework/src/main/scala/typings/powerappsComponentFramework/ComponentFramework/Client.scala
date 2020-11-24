package typings.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.client
  */
@js.native
trait Client extends js.Object {
  
  /**
    * Whether this control should disable its scrolling capabilities.
    */
  var disableScroll: Boolean = js.native
  
  /**
    * Returns a value to indicate which client the script is executing in.
    * Web: Web application, or Unified Interface
    * Outlook: Outlook
    * Mobile: Mobile app
    */
  def getClient(): String = js.native
  
  /**
    * Device form factor.
    * Unknown = 0
    * Desktop = 1
    * Tablet = 2
    * Phone = 3
    */
  def getFormFactor(): Double = js.native
  
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean = js.native
}
object Client {
  
  @scala.inline
  def apply(
    disableScroll: Boolean,
    getClient: () => String,
    getFormFactor: () => Double,
    isOffline: () => Boolean
  ): Client = {
    val __obj = js.Dynamic.literal(disableScroll = disableScroll.asInstanceOf[js.Any], getClient = js.Any.fromFunction0(getClient), getFormFactor = js.Any.fromFunction0(getFormFactor), isOffline = js.Any.fromFunction0(isOffline))
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClient(value: () => String): Self = this.set("getClient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormFactor(value: () => Double): Self = this.set("getFormFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = this.set("isOffline", js.Any.fromFunction0(value))
  }
}
