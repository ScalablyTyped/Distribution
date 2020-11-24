package typings.pinoHttp.mod

import typings.pino.mod.DestinationStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino-http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): HttpLogger = js.native
  def apply(opts: js.UndefOr[scala.Nothing], stream: DestinationStream): HttpLogger = js.native
  def apply(opts: Options): HttpLogger = js.native
  def apply(opts: Options, stream: DestinationStream): HttpLogger = js.native
  def apply(stream: DestinationStream): HttpLogger = js.native
}
