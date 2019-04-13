package typings
package nodemailerLib.libFetchCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a biskviit cookie jar for managing cookie values in memory */
trait Cookies extends js.Object {
  var cookies: js.Array[Cookie]
  var options: Options
  /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
  def add(cookie: Cookie): scala.Boolean
  /** Checks if two cookie objects are the same */
  def compare(a: Cookie, b: Cookie): scala.Boolean
  /** Returns cookie string for the 'Cookie:' header. */
  def get(url: java.lang.String): java.lang.String
  /** Returns normalized cookie path for an URL path argument */
  def getPath(pathname: java.lang.String): java.lang.String
  /** Checks if a cookie is expired */
  def isExpired(cookie: Cookie): scala.Boolean
  /** Lists all valied cookie objects for the specified URL */
  def list(url: java.lang.String): js.Array[Cookie]
  /** Checks if a cookie object is valid for a specified URL */
  def `match`(cookie: Cookie, url: java.lang.String): scala.Boolean
  /** Parses cookie string from the 'Set-Cookie:' header */
  def parse(cookieStr: java.lang.String): Cookie
  /** Stores a cookie string to the cookie storage */
  def set(cookieStr: java.lang.String, url: java.lang.String): scala.Boolean
}

object Cookies {
  @scala.inline
  def apply(
    add: Cookie => scala.Boolean,
    compare: (Cookie, Cookie) => scala.Boolean,
    cookies: js.Array[Cookie],
    get: java.lang.String => java.lang.String,
    getPath: java.lang.String => java.lang.String,
    isExpired: Cookie => scala.Boolean,
    list: java.lang.String => js.Array[Cookie],
    `match`: (Cookie, java.lang.String) => scala.Boolean,
    options: Options,
    parse: java.lang.String => Cookie,
    set: (java.lang.String, java.lang.String) => scala.Boolean
  ): Cookies = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), compare = js.Any.fromFunction2(compare), cookies = cookies, get = js.Any.fromFunction1(get), getPath = js.Any.fromFunction1(getPath), isExpired = js.Any.fromFunction1(isExpired), list = js.Any.fromFunction1(list), options = options, parse = js.Any.fromFunction1(parse), set = js.Any.fromFunction2(set))
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Cookies]
  }
}

