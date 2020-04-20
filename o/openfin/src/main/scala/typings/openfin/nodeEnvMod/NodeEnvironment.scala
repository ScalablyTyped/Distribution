package typings.openfin.nodeEnvMod

import typings.openfin.environmentMod.Environment
import typings.openfin.frameFrameMod.EntityType
import typings.openfin.identityMod.Identity
import typings.openfin.wireMod.NewConnectConfig
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeEnvironment extends Environment {
  var messageCounter: js.Any
}

object NodeEnvironment {
  @scala.inline
  def apply(
    createChildWindow: js.Any => js.Promise[_],
    getCurrentEntityIdentity: () => Identity,
    getCurrentEntityType: () => EntityType,
    getNextMessageId: () => js.Any,
    getRandomId: () => String,
    getWebWindow: Identity => Window_,
    isWindowExists: (String, String) => Boolean,
    messageCounter: js.Any,
    retrievePort: NewConnectConfig => js.Promise[Double],
    writeToken: (String, String) => js.Promise[String]
  ): NodeEnvironment = {
    val __obj = js.Dynamic.literal(createChildWindow = js.Any.fromFunction1(createChildWindow), getCurrentEntityIdentity = js.Any.fromFunction0(getCurrentEntityIdentity), getCurrentEntityType = js.Any.fromFunction0(getCurrentEntityType), getNextMessageId = js.Any.fromFunction0(getNextMessageId), getRandomId = js.Any.fromFunction0(getRandomId), getWebWindow = js.Any.fromFunction1(getWebWindow), isWindowExists = js.Any.fromFunction2(isWindowExists), messageCounter = messageCounter.asInstanceOf[js.Any], retrievePort = js.Any.fromFunction1(retrievePort), writeToken = js.Any.fromFunction2(writeToken))
    __obj.asInstanceOf[NodeEnvironment]
  }
}

