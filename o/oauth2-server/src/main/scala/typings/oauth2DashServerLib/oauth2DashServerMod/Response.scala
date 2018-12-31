package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an outgoing HTTP response.
  */
@JSImport("oauth2-server", "Response")
@js.native
/**
  * Instantiates Response using the supplied options.
  *
  */
class Response ()
  extends oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response {
  def this(options: expressLib.expressMod.eNs.Response) = this()
  def this(options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  /* CompleteClass */
  override def get(field: java.lang.String): js.UndefOr[_] = js.native
  /**
    * Redirects to the specified URL using 302 Found.
    *
    */
  /* CompleteClass */
  override def redirect(url: java.lang.String): scala.Unit = js.native
  /**
    * Sets the specified HTTP header field. The match is case-insensitive.
    *
    */
  /* CompleteClass */
  override def set(field: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

