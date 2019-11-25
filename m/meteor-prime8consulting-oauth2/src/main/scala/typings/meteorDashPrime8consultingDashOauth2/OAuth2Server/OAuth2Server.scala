package typings.meteorDashPrime8consultingDashOauth2.OAuth2Server

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
    val __obj = js.Dynamic.literal(callMethod = callMethod.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], methodNames = methodNames.asInstanceOf[js.Any], oauthserver = oauthserver.asInstanceOf[js.Any], pubSubNames = pubSubNames.asInstanceOf[js.Any], subscribeTo = subscribeTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuth2Server]
  }
}

