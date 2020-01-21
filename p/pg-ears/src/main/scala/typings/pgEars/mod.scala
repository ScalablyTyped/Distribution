package typings.pgEars

import typings.pg.mod.ClientConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-ears", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait PgEars extends js.Object {
    def listen(channel: String, cb: js.Function2[/* err */ Error | Null, /* payload */ js.UndefOr[String], Unit]): Null = js.native
    def notify(channel: String, payload: js.Any): Unit = js.native
    def notify(channel: String, payload: js.Any, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  }
  
  def apply(opts: ClientConfig with AnonCheckInterval): PgEars = js.native
}

