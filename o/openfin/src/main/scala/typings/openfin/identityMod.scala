package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.identityMod.NativeIdOptional
    - typings.openfin.identityMod.UuidOptional
  */
  trait ExternalWindowIdentity extends StObject
  object ExternalWindowIdentity {
    
    @scala.inline
    def NativeIdOptional(uuid: String): typings.openfin.identityMod.NativeIdOptional = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.identityMod.NativeIdOptional]
    }
    
    @scala.inline
    def UuidOptional(nativeId: String): typings.openfin.identityMod.UuidOptional = {
      val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.identityMod.UuidOptional]
    }
  }
  
  @js.native
  trait GroupWindowIdentity extends Identity {
    
    var isExternalWindow: js.UndefOr[Boolean] = js.native
  }
  object GroupWindowIdentity {
    
    @scala.inline
    def apply(uuid: String): GroupWindowIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupWindowIdentity]
    }
    
    @scala.inline
    implicit class GroupWindowIdentityMutableBuilder[Self <: GroupWindowIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExternalWindow(value: Boolean): Self = StObject.set(x, "isExternalWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExternalWindowUndefined: Self = StObject.set(x, "isExternalWindow", js.undefined)
    }
  }
  
  @js.native
  trait Identity extends StObject {
    
    var entityType: js.UndefOr[js.Any] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var uuid: String = js.native
  }
  object Identity {
    
    @scala.inline
    def apply(uuid: String): Identity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityType(value: js.Any): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NamedIdentity extends StObject {
    
    var name: String = js.native
    
    var uuid: String = js.native
  }
  object NamedIdentity {
    
    @scala.inline
    def apply(name: String, uuid: String): NamedIdentity = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedIdentity]
    }
    
    @scala.inline
    implicit class NamedIdentityMutableBuilder[Self <: NamedIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeIdOptional
    extends Identity
       with ExternalWindowIdentity {
    
    var nativeId: js.UndefOr[String] = js.native
  }
  object NativeIdOptional {
    
    @scala.inline
    def apply(uuid: String): NativeIdOptional = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeIdOptional]
    }
    
    @scala.inline
    implicit class NativeIdOptionalMutableBuilder[Self <: NativeIdOptional] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeId(value: String): Self = StObject.set(x, "nativeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeIdUndefined: Self = StObject.set(x, "nativeId", js.undefined)
    }
  }
  
  @js.native
  trait UuidOptional extends ExternalWindowIdentity {
    
    var name: js.UndefOr[String] = js.native
    
    var nativeId: String = js.native
    
    var uuid: js.UndefOr[String] = js.native
  }
  object UuidOptional {
    
    @scala.inline
    def apply(nativeId: String): UuidOptional = {
      val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UuidOptional]
    }
    
    @scala.inline
    implicit class UuidOptionalMutableBuilder[Self <: UuidOptional] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNativeId(value: String): Self = StObject.set(x, "nativeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
