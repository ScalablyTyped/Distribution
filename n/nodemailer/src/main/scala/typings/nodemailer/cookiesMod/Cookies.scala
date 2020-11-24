package typings.nodemailer.cookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a biskviit cookie jar for managing cookie values in memory */
@js.native
trait Cookies extends js.Object {
  
  /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
  def add(cookie: Cookie): Boolean = js.native
  
  /** Checks if two cookie objects are the same */
  def compare(a: Cookie, b: Cookie): Boolean = js.native
  
  var cookies: js.Array[Cookie] = js.native
  
  /** Returns cookie string for the 'Cookie:' header. */
  def get(url: String): String = js.native
  
  /** Returns normalized cookie path for an URL path argument */
  def getPath(pathname: String): String = js.native
  
  /** Checks if a cookie is expired */
  def isExpired(cookie: Cookie): Boolean = js.native
  
  /** Lists all valied cookie objects for the specified URL */
  def list(url: String): js.Array[Cookie] = js.native
  
  /** Checks if a cookie object is valid for a specified URL */
  def `match`(cookie: Cookie, url: String): Boolean = js.native
  
  var options: Options = js.native
  
  /** Parses cookie string from the 'Set-Cookie:' header */
  def parse(cookieStr: String): Cookie = js.native
  
  /** Stores a cookie string to the cookie storage */
  def set(cookieStr: String, url: String): Boolean = js.native
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
  implicit class CookiesOps[Self <: Cookies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Cookie => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompare(value: (Cookie, Cookie) => Boolean): Self = this.set("compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCookiesVarargs(value: Cookie*): Self = this.set("cookies", js.Array(value :_*))
    
    @scala.inline
    def setCookies(value: js.Array[Cookie]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => String): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPath(value: String => String): Self = this.set("getPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsExpired(value: Cookie => Boolean): Self = this.set("isExpired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: String => js.Array[Cookie]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatch(value: (Cookie, String) => Boolean): Self = this.set("match", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: String => Cookie): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, String) => Boolean): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
