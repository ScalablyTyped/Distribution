package typings.microsoftLiveConnect

import typings.microsoftLiveConnect.Microsoft.Live.IFile
import typings.microsoftLiveConnect.Microsoft.Live.IFolder
import typings.microsoftLiveConnect.Microsoft.Live.IPostalAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Account extends StObject {
    
    /**
      * The email address that is associated with the account.
      */
    var account: String
    
    /**
      * The user's business email address, or null if one is not
      * specified.
      */
    var business: String
    
    /**
      * The user's "alternate" email address, or null if one is not
      * specified.
      */
    var other: String
    
    /**
      * The user's personal email address, or null if one is not
      * specified.
      */
    var personal: String
    
    /**
      * The user's preferred email address, or null if one is not
      * specified.
      */
    var preferred: String
  }
  object Account {
    
    inline def apply(account: String, business: String, other: String, personal: String, preferred: String): Account = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any], preferred = preferred.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    extension [Self <: Account](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPersonal(value: String): Self = StObject.set(x, "personal", value.asInstanceOf[js.Any])
      
      inline def setPreferred(value: String): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    }
  }
  
  trait Business extends StObject {
    
    /**
      * The contact's business email address.
      */
    var business: js.UndefOr[String] = js.undefined
    
    /**
      * The contact's "alternate" email address.
      */
    var other: js.UndefOr[String] = js.undefined
    
    /**
      * The contact's personal email address.
      */
    var personal: js.UndefOr[String] = js.undefined
    
    /**
      * The contact's preferred email address.
      */
    var preferred: js.UndefOr[String] = js.undefined
  }
  object Business {
    
    inline def apply(): Business = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Business]
    }
    
    extension [Self <: Business](x: Self) {
      
      inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      inline def setBusinessUndefined: Self = StObject.set(x, "business", js.undefined)
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      inline def setPersonal(value: String): Self = StObject.set(x, "personal", value.asInstanceOf[js.Any])
      
      inline def setPersonalUndefined: Self = StObject.set(x, "personal", js.undefined)
      
      inline def setPreferred(value: String): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
      
      inline def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    /**
      * The error code.
      */
    var code: String
    
    /**
      * The error message.
      */
    var message: String
  }
  object Code {
    
    inline def apply(code: String, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Employer extends StObject {
    
    var employer: Name
  }
  object Employer {
    
    inline def apply(employer: Name): Employer = {
      val __obj = js.Dynamic.literal(employer = employer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Employer]
    }
    
    extension [Self <: Employer](x: Self) {
      
      inline def setEmployer(value: Name): Self = StObject.set(x, "employer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    /**
      * Information on files choden in the picker.
      */
    var files: js.UndefOr[js.Array[IFile]] = js.undefined
    
    /**
      * Information on folders chosen in the picker.
      */
    var folders: js.UndefOr[js.Array[IFolder]] = js.undefined
  }
  object Files {
    
    inline def apply(): Files = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: js.Array[IFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: IFile*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setFolders(value: js.Array[IFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setFoldersVarargs(value: IFolder*): Self = StObject.set(x, "folders", js.Array(value :_*))
    }
  }
  
  trait Mobile extends StObject {
    
    /**
      * The user's business phone number, or null if one is not
      * specified.
      */
    var business: String
    
    /**
      * The user's mobile phone number, or null if one is not specified.
      */
    var mobile: String
    
    /**
      * The user's personal phone number, or null if one is not
      * specified.
      */
    var personal: String
  }
  object Mobile {
    
    inline def apply(business: String, mobile: String, personal: String): Mobile = {
      val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mobile]
    }
    
    extension [Self <: Mobile](x: Self) {
      
      inline def setBusiness(value: String): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      inline def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setPersonal(value: String): Self = StObject.set(x, "personal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    /**
      * The name of the user's work position, or null if the name of the
      * work position is not specified.
      */
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Next extends StObject {
    
    /**
      * Path string for the next set of results.
      */
    var next: js.UndefOr[String] = js.undefined
    
    /**
      * Path string for the previous set of results.
      */
    var previous: js.UndefOr[String] = js.undefined
  }
  object Next {
    
    inline def apply(): Next = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait Personal extends StObject {
    
    /**
      * The user's business postal address.
      */
    var business: IPostalAddress
    
    /**
      * The user's personal postal address.
      */
    var personal: IPostalAddress
  }
  object Personal {
    
    inline def apply(business: IPostalAddress, personal: IPostalAddress): Personal = {
      val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Personal]
    }
    
    extension [Self <: Personal](x: Self) {
      
      inline def setBusiness(value: IPostalAddress): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
      
      inline def setPersonal(value: IPostalAddress): Self = StObject.set(x, "personal", value.asInstanceOf[js.Any])
    }
  }
}
