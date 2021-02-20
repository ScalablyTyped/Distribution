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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CancelButton extends StObject {
    
    /**
      * The text for the cancel button
      * Defaults to "Cancel"
      */
    var cancelButton: js.UndefOr[String] = js.native
    
    /**
      * The text for the confirmation button
      * Defaults to "OK"
      */
    var confirmButton: js.UndefOr[String] = js.native
    
    /**
      * Either to exclude the cancel button
      * Defaults to `false`
      */
    var excludeCancelButton: js.UndefOr[Boolean] = js.native
    
    /**
      * The message to display in the dialog
      */
    var message: String = js.native
  }
  object CancelButton {
    
    @scala.inline
    def apply(message: String): CancelButton = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelButton]
    }
    
    @scala.inline
    implicit class CancelButtonMutableBuilder[Self <: CancelButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButton(value: String): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      @scala.inline
      def setConfirmButton(value: String): Self = StObject.set(x, "confirmButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonUndefined: Self = StObject.set(x, "confirmButton", js.undefined)
      
      @scala.inline
      def setExcludeCancelButton(value: Boolean): Self = StObject.set(x, "excludeCancelButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeCancelButtonUndefined: Self = StObject.set(x, "excludeCancelButton", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetItem extends StObject {
    
    /**
      * Returns a stored value from the database under `key`
      * @param key
      */
    def getItem(key: String): js.Promise[GetResponse] = js.native
    
    /**
      * Stores `value` under `key` in the database
      * @param key
      * @param value
      */
    def setItem(key: String, value: js.Any): js.Promise[SetResponse] = js.native
  }
  object GetItem {
    
    @scala.inline
    def apply(getItem: String => js.Promise[GetResponse], setItem: (String, js.Any) => js.Promise[SetResponse]): GetItem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[GetItem]
    }
    
    @scala.inline
    implicit class GetItemMutableBuilder[Self <: GetItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: String => js.Promise[GetResponse]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (String, js.Any) => js.Promise[SetResponse]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Instance extends StObject {
    
    var instance: GetItem = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(instance: GetItem): Instance = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: GetItem): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ItemId extends StObject {
    
    /**
      * The ID of the item to open
      */
    var itemId: Double = js.native
    
    /**
      * On which view to open the item card.
      * Can be "updates" / "columns"
      * Defaults to "columns"
      */
    var kind: js.UndefOr[updates | columns] = js.native
  }
  object ItemId {
    
    @scala.inline
    def apply(itemId: Double): ItemId = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemId]
    }
    
    @scala.inline
    implicit class ItemIdMutableBuilder[Self <: ItemId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: updates | columns): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    /**
      * The message to display
      */
    var message: String = js.native
    
    /**
      * The number of milliseconds to show the message until it closes
      * Defaults to 5000
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * The type of message to display. Can be "success" (green), "error" (red) or "info" (blue)
      * Defaults to "info"
      */
    var `type`: js.UndefOr[success | error | info] = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: success | error | info): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  clientId :string,   apiToken :string}> */
  @js.native
  trait PartialclientIdstringapiT extends StObject {
    
    var apiToken: js.UndefOr[String] = js.native
    
    var clientId: js.UndefOr[String] = js.native
  }
  object PartialclientIdstringapiT {
    
    @scala.inline
    def apply(): PartialclientIdstringapiT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialclientIdstringapiT]
    }
    
    @scala.inline
    implicit class PartialclientIdstringapiTMutableBuilder[Self <: PartialclientIdstringapiT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiToken(value: String): Self = StObject.set(x, "apiToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiTokenUndefined: Self = StObject.set(x, "apiToken", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  token :string}> */
  @js.native
  trait Partialtokenstring extends StObject {
    
    var token: js.UndefOr[String] = js.native
  }
  object Partialtokenstring {
    
    @scala.inline
    def apply(): Partialtokenstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialtokenstring]
    }
    
    @scala.inline
    implicit class PartialtokenstringMutableBuilder[Self <: Partialtokenstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
