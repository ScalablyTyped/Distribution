package typings.pino.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino", "destination")
@js.native
object destination extends js.Object {
  
  /**
    * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
    * @param [dest]: The `destination` parameter, at a minimum must be an object with a `write` method. An ordinary Node.js
    *                `stream` can be passed as the destination (such as the result of `fs.createWriteStream`) but for peak log
    *                writing performance it is strongly recommended to use `pino.destination` to create the destination stream.
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  def apply(): typings.sonicBoom.mod.^ = js.native
  def apply(dest: String): typings.sonicBoom.mod.^ = js.native
  def apply(dest: Double): typings.sonicBoom.mod.^ = js.native
  def apply(dest: WritableStream): typings.sonicBoom.mod.^ = js.native
  def apply(dest: DestinationObjectOptions): typings.sonicBoom.mod.^ = js.native
  def apply(dest: DestinationStream): typings.sonicBoom.mod.^ = js.native
}
