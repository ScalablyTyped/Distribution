package typings
package portscannerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portscannerMod {
  type PortCallback = js.Function2[/* error */ stdLib.Error | scala.Null, /* port */ scala.Double, scala.Unit]
  type StatusCallback = js.Function2[/* error */ stdLib.Error | scala.Null, /* port */ Status, scala.Unit]
}
