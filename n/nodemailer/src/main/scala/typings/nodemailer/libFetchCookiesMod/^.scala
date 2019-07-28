package typings.nodemailer.libFetchCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a biskviit cookie jar for managing cookie values in memory */
@JSImport("nodemailer/lib/fetch/cookies", JSImport.Namespace)
@js.native
class ^ () extends Cookies {
  def this(options: Options) = this()
  /* CompleteClass */
  override var cookies: js.Array[Cookie] = js.native
  /* CompleteClass */
  override var options: Options = js.native
  /** Adds (or updates/removes if needed) a cookie object to the cookie storage */
  /* CompleteClass */
  override def add(cookie: Cookie): Boolean = js.native
  /** Checks if two cookie objects are the same */
  /* CompleteClass */
  override def compare(a: Cookie, b: Cookie): Boolean = js.native
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
  /** Parses cookie string from the 'Set-Cookie:' header */
  /* CompleteClass */
  override def parse(cookieStr: String): Cookie = js.native
  /** Stores a cookie string to the cookie storage */
  /* CompleteClass */
  override def set(cookieStr: String, url: String): Boolean = js.native
}

