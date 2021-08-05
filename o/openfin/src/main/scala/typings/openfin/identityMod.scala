package typings.openfin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identityMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.identityMod.NativeIdOptional
    - typings.openfin.identityMod.UuidOptional
  */
  trait ExternalWindowIdentity extends StObject
  object ExternalWindowIdentity {
    
    inline def NativeIdOptional(uuid: String): typings.openfin.identityMod.NativeIdOptional = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.identityMod.NativeIdOptional]
    }
    
    inline def UuidOptional(nativeId: String): typings.openfin.identityMod.UuidOptional = {
      val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.openfin.identityMod.UuidOptional]
    }
  }
  
  trait GroupWindowIdentity
    extends StObject
       with Identity {
    
    var isExternalWindow: js.UndefOr[Boolean] = js.undefined
  }
  object GroupWindowIdentity {
    
    inline def apply(uuid: String): GroupWindowIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupWindowIdentity]
    }
    
    extension [Self <: GroupWindowIdentity](x: Self) {
      
      inline def setIsExternalWindow(value: Boolean): Self = StObject.set(x, "isExternalWindow", value.asInstanceOf[js.Any])
      
      inline def setIsExternalWindowUndefined: Self = StObject.set(x, "isExternalWindow", js.undefined)
    }
  }
  
  trait Identity extends StObject {
    
    var entityType: js.UndefOr[js.Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var uuid: String
  }
  object Identity {
    
    inline def apply(uuid: String): Identity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    extension [Self <: Identity](x: Self) {
      
      inline def setEntityType(value: js.Any): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait NamedIdentity extends StObject {
    
    var name: String
    
    var uuid: String
  }
  object NamedIdentity {
    
    inline def apply(name: String, uuid: String): NamedIdentity = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedIdentity]
    }
    
    extension [Self <: NamedIdentity](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeIdOptional
    extends StObject
       with Identity
       with ExternalWindowIdentity {
    
    var nativeId: js.UndefOr[String] = js.undefined
  }
  object NativeIdOptional {
    
    inline def apply(uuid: String): NativeIdOptional = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeIdOptional]
    }
    
    extension [Self <: NativeIdOptional](x: Self) {
      
      inline def setNativeId(value: String): Self = StObject.set(x, "nativeId", value.asInstanceOf[js.Any])
      
      inline def setNativeIdUndefined: Self = StObject.set(x, "nativeId", js.undefined)
    }
  }
  
  trait UuidOptional
    extends StObject
       with ExternalWindowIdentity {
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeId: String
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object UuidOptional {
    
    inline def apply(nativeId: String): UuidOptional = {
      val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UuidOptional]
    }
    
    extension [Self <: UuidOptional](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeId(value: String): Self = StObject.set(x, "nativeId", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
