package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents an incoming HTTP request.
     */
@JSImport("oauth2-server", "Request")
@js.native
class Request ()
  extends oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request {
  /**
           * Instantiates Request using the supplied options.
           *
           */
  def this(options: expressLib.expressMod.eNs.Request) = this()
  /**
           * Instantiates Request using the supplied options.
           *
           */
  def this(options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /**
           * Returns the specified HTTP header field. The match is case-insensitive.
           *
           */
  /* CompleteClass */
  override def get(field: java.lang.String): js.UndefOr[_] = js.native
  /**
           * Checks if the request’s Content-Type HTTP header matches any of the given MIME types.
           *
           */
  /* CompleteClass */
  override def is(types: js.Array[java.lang.String]): java.lang.String | oauth2DashServerLib.oauth2DashServerLibNumbers.`false` = js.native
}

