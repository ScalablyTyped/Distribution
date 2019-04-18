package typings
package microeventDotTsLib.microeventLibEventInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventInterfaceNs {
  type HandlerInterface[EventPayload, T] = js.Function2[/* payload */ EventPayload, /* context */ T, scala.Unit]
}
