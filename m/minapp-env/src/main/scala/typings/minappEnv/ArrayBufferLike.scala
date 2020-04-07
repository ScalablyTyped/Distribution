package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.ArrayBufferTypes[keyof minapp-env.ArrayBufferTypes] */
/* Rewritten from type alias, can be one of: 
  - typings.minappEnv.minappEnvStrings.byteLength
  - typings.minappEnv.minappEnvStrings.slice
*/
trait ArrayBufferLike extends js.Object

object ArrayBufferLike {
  @scala.inline
  def byteLength: typings.minappEnv.minappEnvStrings.byteLength = this.cast("byteLength")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def slice: typings.minappEnv.minappEnvStrings.slice = this.cast("slice")
}

