package typings.parse

import org.scalablytyped.runtime.StringDictionary
import typings.parse.mod.global.Parse.Object._Encode
import typings.parse.parseStrings.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthData extends StObject {
    
    var authData: js.UndefOr[typings.parse.mod.global.Parse.AuthData] = js.undefined
  }
  object AuthData {
    
    inline def apply(): AuthData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthData]
    }
    
    extension [Self <: AuthData](x: Self) {
      
      inline def setAuthData(value: typings.parse.mod.global.Parse.AuthData): Self = StObject.set(x, "authData", value.asInstanceOf[js.Any])
      
      inline def setAuthDataUndefined: Self = StObject.set(x, "authData", js.undefined)
    }
  }
  
  trait Base64 extends StObject {
    
    var base64: String
  }
  object Base64 {
    
    inline def apply(base64: String): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    extension [Self <: Base64](x: Self) {
      
      inline def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
  }
  object ClassName {
    
    inline def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var objectId: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  trait ForceSecure extends StObject {
    
    var forceSecure: js.UndefOr[Boolean] = js.undefined
  }
  object ForceSecure {
    
    inline def apply(): ForceSecure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceSecure]
    }
    
    extension [Self <: ForceSecure](x: Self) {
      
      inline def setForceSecure(value: Boolean): Self = StObject.set(x, "forceSecure", value.asInstanceOf[js.Any])
      
      inline def setForceSecureUndefined: Self = StObject.set(x, "forceSecure", js.undefined)
    }
  }
  
  trait Iso
    extends StObject
       with _Encode[js.Any] {
    
    var __type: Date
    
    var iso: String
  }
  object Iso {
    
    inline def apply(iso: String): Iso = {
      val __obj = js.Dynamic.literal(__type = "Date", iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iso]
    }
    
    extension [Self <: Iso](x: Self) {
      
      inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
      
      inline def set__type(value: Date): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
    
    var longitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    extension [Self <: Latitude](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var __type: String
    
    var name: String
    
    var url: String
  }
  object Name {
    
    inline def apply(__type: String, name: String, url: String): Name = {
      val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var size: Double
    
    var `type`: String
  }
  object Size {
    
    inline def apply(size: Double, `type`: String): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeNumber extends StObject {
    
    var size: Double
  }
  object SizeNumber {
    
    inline def apply(size: Double): SizeNumber = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeNumber]
    }
    
    extension [Self <: SizeNumber](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Uri extends StObject {
    
    var uri: String
  }
  object Uri {
    
    inline def apply(uri: String): Uri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uri]
    }
    
    extension [Self <: Uri](x: Self) {
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
