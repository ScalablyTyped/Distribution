package typings.minimistOptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.minimistOptions.minimistOptionsStrings.string
  - typings.minimistOptions.minimistOptionsStrings.boolean
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def boolean: typings.minimistOptions.minimistOptionsStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def string: typings.minimistOptions.minimistOptionsStrings.string = this.cast("string")
}

