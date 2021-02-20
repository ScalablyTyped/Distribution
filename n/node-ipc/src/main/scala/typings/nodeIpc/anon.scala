package typings.nodeIpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Family extends StObject {
    
    /**
      * Default: false
      */
    var family: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      */
    var hints: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      */
    var localAddress: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      */
    var localPort: js.UndefOr[Boolean] = js.native
    
    /**
      * Default: false
      */
    var lookup: js.UndefOr[Boolean] = js.native
  }
  object Family {
    
    @scala.inline
    def apply(): Family = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Family]
    }
    
    @scala.inline
    implicit class FamilyMutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamily(value: Boolean): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHints(value: Boolean): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: Boolean): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLocalPort(value: Boolean): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
      
      @scala.inline
      def setLookup(value: Boolean): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
  
  @js.native
  trait Private extends StObject {
    
    var `private`: js.UndefOr[String] = js.native
    
    var public: js.UndefOr[String] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  }
  object Private {
    
    @scala.inline
    def apply(): Private = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Private]
    }
    
    @scala.inline
    implicit class PrivateMutableBuilder[Self <: Private] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
}
