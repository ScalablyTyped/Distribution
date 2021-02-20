package typings.parse

import org.scalablytyped.runtime.StringDictionary
import typings.parse.mod.global.Parse.Object._Encode
import typings.parse.parseStrings.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AuthData extends StObject {
    
    var authData: js.UndefOr[typings.parse.mod.global.Parse.AuthData] = js.native
  }
  object AuthData {
    
    @scala.inline
    def apply(): AuthData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthData]
    }
    
    @scala.inline
    implicit class AuthDataMutableBuilder[Self <: AuthData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthData(value: typings.parse.mod.global.Parse.AuthData): Self = StObject.set(x, "authData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthDataUndefined: Self = StObject.set(x, "authData", js.undefined)
    }
  }
  
  @js.native
  trait Base64 extends StObject {
    
    var base64: String = js.native
  }
  object Base64 {
    
    @scala.inline
    def apply(base64: String): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    @scala.inline
    implicit class Base64MutableBuilder[Self <: Base64] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClassName extends StObject {
    
    var className: String = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var objectId: js.UndefOr[String] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    }
  }
  
  @js.native
  trait ForceSecure extends StObject {
    
    var forceSecure: js.UndefOr[Boolean] = js.native
  }
  object ForceSecure {
    
    @scala.inline
    def apply(): ForceSecure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceSecure]
    }
    
    @scala.inline
    implicit class ForceSecureMutableBuilder[Self <: ForceSecure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceSecure(value: Boolean): Self = StObject.set(x, "forceSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSecureUndefined: Self = StObject.set(x, "forceSecure", js.undefined)
    }
  }
  
  @js.native
  trait Iso
    extends _Encode[js.Any] {
    
    var __type: Date = js.native
    
    var iso: String = js.native
  }
  object Iso {
    
    @scala.inline
    def apply(__type: Date, iso: String): Iso = {
      val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iso]
    }
    
    @scala.inline
    implicit class IsoMutableBuilder[Self <: Iso] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__type(value: Date): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Latitude extends StObject {
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
  }
  object Latitude {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit class LatitudeMutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var __type: String = js.native
    
    var name: String = js.native
    
    var url: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(__type: String, name: String, url: String): Name = {
      val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var size: Double = js.native
    
    var `type`: String = js.native
  }
  object Size {
    
    @scala.inline
    def apply(size: Double, `type`: String): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SizeNumber extends StObject {
    
    var size: Double = js.native
  }
  object SizeNumber {
    
    @scala.inline
    def apply(size: Double): SizeNumber = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeNumber]
    }
    
    @scala.inline
    implicit class SizeNumberMutableBuilder[Self <: SizeNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Uri extends StObject {
    
    var uri: String = js.native
  }
  object Uri {
    
    @scala.inline
    def apply(uri: String): Uri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit class UriMutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
