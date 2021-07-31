package typings.nodemailer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cookiesMod {
  
  /** Creates a biskviit cookie jar for managing cookie values in memory */
  @JSImport("nodemailer/lib/fetch/cookies", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Cookies {
    def this(options: Options) = this()
    
    /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
    /* CompleteClass */
    override def add(cookie: Cookie): Boolean = js.native
    
    /** Checks if two cookie objects are the same */
    /* CompleteClass */
    override def compare(a: Cookie, b: Cookie): Boolean = js.native
    
    /* CompleteClass */
    var cookies: js.Array[Cookie] = js.native
    
    /** Returns cookie string for the 'Cookie:' header. */
    /* CompleteClass */
    override def get(url: String): String = js.native
    
    /** Returns normalized cookie path for an URL path argument */
    /* CompleteClass */
    override def getPath(pathname: String): String = js.native
    
    /** Checks if a cookie is expired */
    /* CompleteClass */
    override def isExpired(cookie: Cookie): Boolean = js.native
    
    /** Lists all valied cookie objects for the specified URL */
    /* CompleteClass */
    override def list(url: String): js.Array[Cookie] = js.native
    
    /** Checks if a cookie object is valid for a specified URL */
    /* CompleteClass */
    override def `match`(cookie: Cookie, url: String): Boolean = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /** Parses cookie string from the 'Set-Cookie:' header */
    /* CompleteClass */
    override def parse(cookieStr: String): Cookie = js.native
    
    /** Stores a cookie string to the cookie storage */
    /* CompleteClass */
    override def set(cookieStr: String, url: String): Boolean = js.native
  }
  
  trait Cookie extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[Date] = js.undefined
    
    var httponly: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Cookie {
    
    @scala.inline
    def apply(name: String): Cookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /** Creates a biskviit cookie jar for managing cookie values in memory */
  trait Cookies extends StObject {
    
    /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
    def add(cookie: Cookie): Boolean
    
    /** Checks if two cookie objects are the same */
    def compare(a: Cookie, b: Cookie): Boolean
    
    var cookies: js.Array[Cookie]
    
    /** Returns cookie string for the 'Cookie:' header. */
    def get(url: String): String
    
    /** Returns normalized cookie path for an URL path argument */
    def getPath(pathname: String): String
    
    /** Checks if a cookie is expired */
    def isExpired(cookie: Cookie): Boolean
    
    /** Lists all valied cookie objects for the specified URL */
    def list(url: String): js.Array[Cookie]
    
    /** Checks if a cookie object is valid for a specified URL */
    def `match`(cookie: Cookie, url: String): Boolean
    
    var options: Options
    
    /** Parses cookie string from the 'Set-Cookie:' header */
    def parse(cookieStr: String): Cookie
    
    /** Stores a cookie string to the cookie storage */
    def set(cookieStr: String, url: String): Boolean
  }
  object Cookies {
    
    @scala.inline
    def apply(
      add: Cookie => Boolean,
      compare: (Cookie, Cookie) => Boolean,
      cookies: js.Array[Cookie],
      get: String => String,
      getPath: String => String,
      isExpired: Cookie => Boolean,
      list: String => js.Array[Cookie],
      `match`: (Cookie, String) => Boolean,
      options: Options,
      parse: String => Cookie,
      set: (String, String) => Boolean
    ): Cookies = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), compare = js.Any.fromFunction2(compare), cookies = cookies.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getPath = js.Any.fromFunction1(getPath), isExpired = js.Any.fromFunction1(isExpired), list = js.Any.fromFunction1(list), options = options.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), set = js.Any.fromFunction2(set))
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.asInstanceOf[Cookies]
    }
    
    @scala.inline
    implicit class CookiesMutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Cookie => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompare(value: (Cookie, Cookie) => Boolean): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value :_*))
      
      @scala.inline
      def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPath(value: String => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsExpired(value: Cookie => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction1(value))
      
      @scala.inline
      def setList(value: String => js.Array[Cookie]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatch(value: (Cookie, String) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: String => Cookie): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, String) => Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    var sessionTimeout: js.UndefOr[s] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionTimeout(value: s): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    }
  }
  
  type s = Double
}
