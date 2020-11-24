package typings.optionalJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("optional-js", JSImport.Default)
@js.native
class default[T] protected () extends Optional[T] {
  protected def this(value: T) = this()
}
/* static members */
@JSImport("optional-js", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Returns an empty Optional instance. No value is present for this Optional.
    *
    * @return an empty Optional
    */
  def empty[T](): Optional[T] = js.native
  
  /**
    * Returns an Optional describing the given non-null value.
    *
    * @typeparam T the type of the value
    * @param value the value to describe, which must be non-null
    * @return an Optional with the value present
    * @throws Error if value is null
    */
  def of[T](value: T): Optional[T] = js.native
  
  /**
    * Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
    *
    * @typeparam T the type of the value
    * @param value the possibly-null value to describe
    * @return an Optional with a present value if the specified value is non-null, otherwise an empty Optional
    */
  def ofNullable[T](): Optional[T] = js.native
  def ofNullable[T](value: T): Optional[T] = js.native
}
