package typings
package meteorDashPrime8consultingDashOauth2Lib.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Server extends js.Object {
  var callMethod: CallMethod
  var collections: Collections
  var methodNames: MethodNames
  var oauthserver: js.Any
  var pubSubNames: PubSubNames
  var subscribeTo: SubscribeTo
}

object OAuth2Server {
  @scala.inline
  def apply(
    callMethod: CallMethod,
    collections: Collections,
    methodNames: MethodNames,
    oauthserver: js.Any,
    pubSubNames: PubSubNames,
    subscribeTo: SubscribeTo
  ): OAuth2Server = {
    val __obj = js.Dynamic.literal(callMethod = callMethod, collections = collections, methodNames = methodNames, oauthserver = oauthserver, pubSubNames = pubSubNames, subscribeTo = subscribeTo)
  
    __obj.asInstanceOf[OAuth2Server]
  }
}

