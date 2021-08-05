package typings.pacote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Created extends StObject {
    
    var created: String
    
    var modified: String
  }
  object Created {
    
    inline def apply(created: String, modified: String): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    extension [Self <: Created](x: Self) {
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  trait Directory extends StObject {
    
    var directory: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Directory {
    
    inline def apply(): Directory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directory]
    }
    
    extension [Self <: Directory](x: Self) {
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Latest extends StObject {
    
    var latest: String
  }
  object Latest {
    
    inline def apply(latest: String): Latest = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latest]
    }
    
    extension [Self <: Latest](x: Self) {
      
      inline def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
}
