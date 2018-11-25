package typings
package mqttLib.typesLibClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStream
  extends nodeLib.eventsMod.EventEmitter {
  def destroy(): js.Any = js.native
  def end(): js.Any = js.native
  def pipe(to: js.Any): js.Any = js.native
}

