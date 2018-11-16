package typings
package pDashQueueLib.pDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PQueueNs {
  type Task[T] = js.Function0[stdLib.Promise[T]]
}
