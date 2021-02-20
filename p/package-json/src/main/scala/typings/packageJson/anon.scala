package typings.packageJson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictversion extends /* tagName */ StringDictionary[String] {
    
    val created: String = js.native
    
    val modified: String = js.native
  }
  object Dictversion {
    
    @scala.inline
    def apply(created: String, modified: String): Dictversion = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictversion]
    }
    
    @scala.inline
    implicit class DictversionMutableBuilder[Self <: Dictversion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    val email: js.UndefOr[String] = js.native
    
    val url: String = js.native
  }
  object Email {
    
    @scala.inline
    def apply(url: String): Email = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Integrity extends StObject {
    
    val integrity: js.UndefOr[String] = js.native
    
    val shasum: String = js.native
    
    val tarball: String = js.native
  }
  object Integrity {
    
    @scala.inline
    def apply(shasum: String, tarball: String): Integrity = {
      val __obj = js.Dynamic.literal(shasum = shasum.asInstanceOf[js.Any], tarball = tarball.asInstanceOf[js.Any])
      __obj.asInstanceOf[Integrity]
    }
    
    @scala.inline
    implicit class IntegrityMutableBuilder[Self <: Integrity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setShasum(value: String): Self = StObject.set(x, "shasum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarball(value: String): Self = StObject.set(x, "tarball", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    val `type`: String = js.native
    
    val url: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: String, url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    val email: String = js.native
    
    val url: js.UndefOr[String] = js.native
  }
  object Url {
    
    @scala.inline
    def apply(email: String): Url = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
