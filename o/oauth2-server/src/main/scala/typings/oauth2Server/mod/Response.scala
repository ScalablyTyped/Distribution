package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Response_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an outgoing HTTP response.
  */
@JSImport("oauth2-server", "Response")
@js.native
/**
  * Instantiates Response using the supplied options.
  *
  */
class Response () extends js.Object {
  def this(options: StringDictionary[js.Any]) = this()
  def this(options: Response_[_]) = this()
  
  var body: js.UndefOr[js.Any] = js.native
  
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: String): js.UndefOr[js.Any] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Redirects to the specified URL using 302 Found.
    *
    */
  def redirect(url: String): Unit = js.native
  
  /**
    * Sets the specified HTTP header field. The match is case-insensitive.
    *
    */
  def set(field: String, value: String): Unit = js.native
  
  var status: js.UndefOr[Double] = js.native
}
