package typings.npmUserPackages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bugs extends StObject {
    
    var bugs: js.UndefOr[String] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var npm: String
    
    var repository: js.UndefOr[String] = js.undefined
  }
  object Bugs {
    
    @scala.inline
    def apply(npm: String): Bugs = {
      val __obj = js.Dynamic.literal(npm = npm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bugs]
    }
    
    @scala.inline
    implicit class BugsMutableBuilder[Self <: Bugs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBugs(value: String): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      @scala.inline
      def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setNpm(value: String): Self = StObject.set(x, "npm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    @scala.inline
    def apply(name: String): Email = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Username extends StObject {
    
    var email: String
    
    var username: String
  }
  object Username {
    
    @scala.inline
    def apply(email: String, username: String): Username = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    @scala.inline
    implicit class UsernameMutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
