package typings.oauth2orize.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "OAuth2Error")
@js.native
/**
  * @param code Defaults to *server_error*.
  * @param status Defaults to 500.
  */
class OAuth2Error ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: Unit, code: String) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: String, code: Unit, uri: String) = this()
  def this(message: Unit, code: String, uri: String) = this()
  def this(message: Unit, code: Unit, uri: String) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  def this(message: String, code: String, uri: Unit, status: Double) = this()
  def this(message: String, code: Unit, uri: String, status: Double) = this()
  def this(message: String, code: Unit, uri: Unit, status: Double) = this()
  def this(message: Unit, code: String, uri: String, status: Double) = this()
  def this(message: Unit, code: String, uri: Unit, status: Double) = this()
  def this(message: Unit, code: Unit, uri: String, status: Double) = this()
  def this(message: Unit, code: Unit, uri: Unit, status: Double) = this()
  
  var code: String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  var status: Double = js.native
  
  var uri: js.UndefOr[String] = js.native
}
