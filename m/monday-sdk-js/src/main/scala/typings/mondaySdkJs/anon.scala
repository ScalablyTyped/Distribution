package typings.mondaySdkJs

import typings.mondaySdkJs.mod.GetResponse
import typings.mondaySdkJs.mod.SetResponse
import typings.mondaySdkJs.mondaySdkJsStrings.columns
import typings.mondaySdkJs.mondaySdkJsStrings.error
import typings.mondaySdkJs.mondaySdkJsStrings.info
import typings.mondaySdkJs.mondaySdkJsStrings.success
import typings.mondaySdkJs.mondaySdkJsStrings.updates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CancelButton extends StObject {
    
    /**
      * The text for the cancel button
      * Defaults to "Cancel"
      */
    var cancelButton: js.UndefOr[String] = js.undefined
    
    /**
      * The text for the confirmation button
      * Defaults to "OK"
      */
    var confirmButton: js.UndefOr[String] = js.undefined
    
    /**
      * Either to exclude the cancel button
      * Defaults to `false`
      */
    var excludeCancelButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The message to display in the dialog
      */
    var message: String
  }
  object CancelButton {
    
    inline def apply(message: String): CancelButton = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelButton]
    }
    
    extension [Self <: CancelButton](x: Self) {
      
      inline def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      inline def setConfirmButton(value: String): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
      
      inline def setExcludeCancelButton(value: Boolean): Self = StObject.set(x, "excludeCancelButton", value.asInstanceOf[js.Any])
      
      inline def setExcludeCancelButtonUndefined: Self = StObject.set(x, "excludeCancelButton", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetItem extends StObject {
    
    /**
      * Returns a stored value from the database under `key`
      * @param key
      */
    def getItem(key: String): js.Promise[GetResponse]
    
    /**
      * Stores `value` under `key` in the database
      * @param key
      * @param value
      */
    def setItem(key: String, value: js.Any): js.Promise[SetResponse]
  }
  object GetItem {
    
    inline def apply(getItem: String => js.Promise[GetResponse], setItem: (String, js.Any) => js.Promise[SetResponse]): GetItem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[GetItem]
    }
    
    extension [Self <: GetItem](x: Self) {
      
      inline def setGetItem(value: String => js.Promise[GetResponse]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, js.Any) => js.Promise[SetResponse]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  trait Instance extends StObject {
    
    var instance: GetItem
  }
  object Instance {
    
    inline def apply(instance: GetItem): Instance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setInstance(value: GetItem): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemId extends StObject {
    
    /**
      * The ID of the item to open
      */
    var itemId: Double
    
    /**
      * On which view to open the item card.
      * Can be "updates" / "columns"
      * Defaults to "columns"
      */
    var kind: js.UndefOr[updates | columns] = js.undefined
  }
  object ItemId {
    
    inline def apply(itemId: Double): ItemId = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemId]
    }
    
    extension [Self <: ItemId](x: Self) {
      
      inline def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setKind(value: updates | columns): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    /**
      * The message to display
      */
    var message: String
    
    /**
      * The number of milliseconds to show the message until it closes
      * Defaults to 5000
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of message to display. Can be "success" (green), "error" (red) or "info" (blue)
      * Defaults to "info"
      */
    var `type`: js.UndefOr[success | error | info] = js.undefined
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: success | error | info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  clientId :string,   apiToken :string}> */
  trait PartialclientIdstringapiT extends StObject {
    
    var apiToken: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
  }
  object PartialclientIdstringapiT {
    
    inline def apply(): PartialclientIdstringapiT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialclientIdstringapiT]
    }
    
    extension [Self <: PartialclientIdstringapiT](x: Self) {
      
      inline def setApiToken(value: String): Self = StObject.set(x, "apiToken", value.asInstanceOf[js.Any])
      
      inline def setApiTokenUndefined: Self = StObject.set(x, "apiToken", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  token :string}> */
  trait Partialtokenstring extends StObject {
    
    var token: js.UndefOr[String] = js.undefined
  }
  object Partialtokenstring {
    
    inline def apply(): Partialtokenstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialtokenstring]
    }
    
    extension [Self <: Partialtokenstring](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
