package typings
package pgDashEarsLib.pgDashEarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PgEars extends js.Object {
  def listen(
    channel: java.lang.String,
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* payload */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Null = js.native
  def notify(channel: java.lang.String, payload: js.Any): scala.Unit = js.native
  def notify(channel: java.lang.String, payload: js.Any, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
}

