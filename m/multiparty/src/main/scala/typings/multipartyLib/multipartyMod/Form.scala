package typings
package multipartyLib.multipartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multiparty", "Form")
@js.native
class Form ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: FormOptions) = this()
  @JSName("on")
  def on_close(event: multipartyLib.multipartyLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(
    event: multipartyLib.multipartyLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_field(
    event: multipartyLib.multipartyLibStrings.field,
    listener: js.Function2[/* name */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_part(
    event: multipartyLib.multipartyLibStrings.part,
    listener: js.Function1[/* part */ Part, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: multipartyLib.multipartyLibStrings.progress,
    listener: js.Function2[/* bytesReceived */ scala.Double, /* bytesExpected */ scala.Double, scala.Unit]
  ): this.type = js.native
  /**
    * Parses an incoming node.js request containing form data.
    * This will cause form to emit events based off the incoming request
    * @param request
    * @param callback
    */
  def parse(request: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  def parse(
    request: nodeLib.httpMod.IncomingMessage,
    callback: js.Function3[/* error */ stdLib.Error, /* fields */ js.Any, /* files */ js.Any, _]
  ): scala.Unit = js.native
}

