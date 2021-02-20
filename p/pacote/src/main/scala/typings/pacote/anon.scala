package typings.pacote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Created extends StObject {
    
    var created: String = js.native
    
    var modified: String = js.native
  }
  object Created {
    
    @scala.inline
    def apply(created: String, modified: String): Created = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Created]
    }
    
    @scala.inline
    implicit class CreatedMutableBuilder[Self <: Created] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Directory extends StObject {
    
    var directory: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Directory {
    
    @scala.inline
    def apply(): Directory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directory]
    }
    
    @scala.inline
    implicit class DirectoryMutableBuilder[Self <: Directory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Email {
    
    @scala.inline
    def apply(): Email = {
      val __obj = js.Dynamic.literal()
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
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Latest extends StObject {
    
    var latest: String = js.native
  }
  object Latest {
    
    @scala.inline
    def apply(latest: String): Latest = {
      val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latest]
    }
    
    @scala.inline
    implicit class LatestMutableBuilder[Self <: Latest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatest(value: String): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
    }
  }
}
