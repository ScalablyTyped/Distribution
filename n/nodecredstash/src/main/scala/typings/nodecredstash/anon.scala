package typings.nodecredstash

import typings.nodecredstash.srcTypesMod.SecretRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents extends StObject {
    
    var contents: String
    
    var digest: String
    
    var hmac: String
    
    var key: String
  }
  object Contents {
    
    inline def apply(contents: String, digest: String, hmac: String, key: String): Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], hmac = hmac.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setHmac(value: String): Self = StObject.set(x, "hmac", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncodedKey extends StObject {
    
    var encodedKey: js.typedarray.Uint8Array
    
    var key: js.typedarray.Uint8Array
  }
  object EncodedKey {
    
    inline def apply(encodedKey: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): EncodedKey = {
      val __obj = js.Dynamic.literal(encodedKey = encodedKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodedKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodedKey] (val x: Self) extends AnyVal {
      
      inline def setEncodedKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "encodedKey", value.asInstanceOf[js.Any])
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item extends StObject {
    
    var Item: SecretRecord
  }
  object Item {
    
    inline def apply(Item: SecretRecord): Item = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setItem(value: SecretRecord): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var Items: js.Array[SecretRecord]
  }
  object Items {
    
    inline def apply(Items: js.Array[SecretRecord]): Items = {
      val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[SecretRecord]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SecretRecord*): Self = StObject.set(x, "Items", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
