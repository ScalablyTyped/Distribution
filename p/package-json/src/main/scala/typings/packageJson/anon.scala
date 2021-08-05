package typings.packageJson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictversion
    extends StObject
       with /* tagName */ StringDictionary[String] {
    
    val created: String
    
    val modified: String
  }
  object Dictversion {
    
    inline def apply(created: String, modified: String): Dictversion = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictversion]
    }
    
    extension [Self <: Dictversion](x: Self) {
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    val email: js.UndefOr[String] = js.undefined
    
    val url: String
  }
  object Email {
    
    inline def apply(url: String): Email = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Integrity extends StObject {
    
    val integrity: js.UndefOr[String] = js.undefined
    
    val shasum: String
    
    val tarball: String
  }
  object Integrity {
    
    inline def apply(shasum: String, tarball: String): Integrity = {
      val __obj = js.Dynamic.literal(shasum = shasum.asInstanceOf[js.Any], tarball = tarball.asInstanceOf[js.Any])
      __obj.asInstanceOf[Integrity]
    }
    
    extension [Self <: Integrity](x: Self) {
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setShasum(value: String): Self = StObject.set(x, "shasum", value.asInstanceOf[js.Any])
      
      inline def setTarball(value: String): Self = StObject.set(x, "tarball", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    val `type`: String
    
    val url: String
  }
  object Type {
    
    inline def apply(`type`: String, url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    val email: String
    
    val url: js.UndefOr[String] = js.undefined
  }
  object Url {
    
    inline def apply(email: String): Url = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
