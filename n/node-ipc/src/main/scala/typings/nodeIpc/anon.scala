package typings.nodeIpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Family extends StObject {
    
    /**
      * Default: false
      */
    var family: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var hints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var localAddress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var localPort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var lookup: js.UndefOr[Boolean] = js.undefined
  }
  object Family {
    
    inline def apply(): Family = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Family]
    }
    
    extension [Self <: Family](x: Self) {
      
      inline def setFamily(value: Boolean): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setHints(value: Boolean): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      inline def setLocalAddress(value: Boolean): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLocalPort(value: Boolean): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      inline def setLookup(value: Boolean): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
  
  trait Private extends StObject {
    
    var `private`: js.UndefOr[String] = js.undefined
    
    var public: js.UndefOr[String] = js.undefined
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object Private {
    
    inline def apply(): Private = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Private]
    }
    
    extension [Self <: Private](x: Self) {
      
      inline def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
