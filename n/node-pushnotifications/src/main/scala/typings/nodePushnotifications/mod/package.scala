package typings.nodePushnotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  type PushMethod = js.Function3[
    /* regIds */ js.Array[java.lang.String], 
    /* data */ typings.nodePushnotifications.mod.Data, 
    /* settings */ typings.nodePushnotifications.mod.Settings, 
    scala.Unit
  ]
  type RegistrationId = java.lang.String | typings.webPush.mod.PushSubscription
}
