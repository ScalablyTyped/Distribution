package typings.nodemailer.libFetchCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a biskviit cookie jar for managing cookie values in memory */
trait Cookies extends js.Object {
  var cookies: js.Array[Cookie]
  var options: Options
  /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
  def add(cookie: Cookie): Boolean
  /** Checks if two cookie objects are the same */
  def compare(a: Cookie, b: Cookie): Boolean
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
}

