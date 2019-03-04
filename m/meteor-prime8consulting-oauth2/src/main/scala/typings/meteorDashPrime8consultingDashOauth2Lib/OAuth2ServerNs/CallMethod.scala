package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallMethod extends js.Object {
  /**
    * Wrapper for Meteor.method to create an authorization code. This is an async function and a callback must be provided to be of any use.
    */
  def authCodeGrant(
    client_id: java.lang.String,
    redirect_uri: java.lang.String,
    response_type: java.lang.String,
    scope: js.Array[java.lang.String],
    state: java.lang.String,
    callback: js.Function2[
      /* err */ meteorLib.MeteorNs.Error, 
      /* authCodeGrantResult */ AuthCodeGrantResult, 
      scala.Unit
    ]
  ): scala.Unit
}

object CallMethod {
  @scala.inline
  def apply(
    authCodeGrant: js.Function6[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      js.Array[java.lang.String], 
      java.lang.String, 
      js.Function2[
        /* err */ meteorLib.MeteorNs.Error, 
        /* authCodeGrantResult */ AuthCodeGrantResult, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): CallMethod = {
    val __obj = js.Dynamic.literal(authCodeGrant = authCodeGrant)
  
    __obj.asInstanceOf[CallMethod]
  }
}

