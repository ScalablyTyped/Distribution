package typings
package nodeDashCronLib.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScheduledTask extends js.Object {
  def destroy(): scala.Unit
  def start(): this.type
  def stop(): this.type
}

