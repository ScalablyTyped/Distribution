package typings.officeJsPreview.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result for methods that return primitive types. The object's value property is retrieved from the document after `context.sync()` is invoked. */
trait ClientResult[T] extends js.Object {
  /** The value of the result that is retrieved from the document after `context.sync()` is invoked. */
  var value: T
}

object ClientResult {
  @scala.inline
  def apply[T](value: T): ClientResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientResult[T]]
  }
}

