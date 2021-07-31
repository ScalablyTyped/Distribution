package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.client
  */
trait Client extends StObject {
  
  /**
    * Whether this control should disable its scrolling capabilities.
    */
  var disableScroll: Boolean
  
  /**
    * Returns a value to indicate which client the script is executing in.
    * Web: Web application, or Unified Interface
    * Outlook: Outlook
    * Mobile: Mobile app
    */
  def getClient(): String
  
  /**
    * Device form factor.
    * Unknown = 0
    * Desktop = 1
    * Tablet = 2
    * Phone = 3
    */
  def getFormFactor(): Double
  
  /**
    * Returns information whether the server is online or offline.
    */
  def isOffline(): Boolean
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
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClient(value: () => String): Self = StObject.set(x, "getClient", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormFactor(value: () => Double): Self = StObject.set(x, "getFormFactor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = StObject.set(x, "isOffline", js.Any.fromFunction0(value))
  }
}
