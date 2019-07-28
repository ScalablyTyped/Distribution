package typings.openidDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object openidDashClientStrings {
  @js.native
  sealed trait authorization_code extends js.Object
  
  @js.native
  sealed trait client_credentials extends js.Object
  
  @js.native
  sealed trait password extends js.Object
  
  @js.native
  sealed trait refresh_token extends js.Object
  
  @scala.inline
  def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
  @scala.inline
  def client_credentials: client_credentials = "client_credentials".asInstanceOf[client_credentials]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
}

