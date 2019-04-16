package typings
package optionalDashJsLib.optionalDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optional-js", JSImport.Default)
@js.native
class default[T] protected () extends Optional[T] {
  protected def this(value: T) = this()
  /* CompleteClass */
  override val _value: js.Any = js.native
  /**
    * If a value is present, and the value matches the given predicate, return an Optional describing the value,
    * otherwise return an empty Optional.
    *
    * @param predicate A predicate to apply to the value, if present
    * @return an Optional describing the value of this Optional if a value is present and the value matches the given
    * predicate, otherwise an empty Optional
    * @throws Error if the predicate is null
    */
  /* CompleteClass */
  override def filter(predicate: js.Function1[T, scala.Boolean]): Optional[js.UndefOr[T | scala.Null]] = js.native
  /**
    * If a value is present, apply the provided Optional-bearing mapping function to it, return that result,
    * otherwise return an empty Optional. This method is similar to map(Function), but the provided mapper is one whose
    * result is already an Optional, and if invoked, flatMap does not wrap it with an additional Optional.
    *
    * @typeparam U The type parameter to the Optional returned by the mapping function
    * @param mapper a mapping function to apply to the value, if present the mapping function
    * @return the result of applying an Optional-bearing mapping function to the value of this Optional,
    * if a value is present, otherwise an empty Optional
    * @throws Error if the mapping function is null or returns a null result
    */
  /* CompleteClass */
  override def flatMap[U](mapper: js.Function1[T, js.UndefOr[Optional[U] | scala.Null]]): Optional[U] = js.native
  /**
    * If a value is present in this Optional, returns the value, otherwise throws an Error.
    *
    * @return the non-null value held by this Optional
    * @throws Error if the value is null;
    */
  /* CompleteClass */
  override def get(): T = js.native
  /**
    * If a value is present, invoke the specified consumer with the value, otherwise do nothing.
    *
    * @param consumer function to be executed if a value is present
    */
  /* CompleteClass */
  override def ifPresent(consumer: js.Function1[T, scala.Unit]): scala.Unit = js.native
  /**
    * If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
    *
    * @param action the action to be performed, if a value is present
    * @param emptyAction the empty-based action to be performed, if no value is present
    * @throws if a value is present and the given action is null, or no value is present and the given empty-based action is null.
    */
  /* CompleteClass */
  override def ifPresentOrElse(action: js.Function1[T, scala.Unit], emptyAction: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Return true if there is a value present, otherwise false.
    *
    * @return true if there is a value present, otherwise false
    */
  /* CompleteClass */
  override def isPresent(): scala.Boolean = js.native
  /**
    * If a value is present, apply the provided mapping function to it, and if the result is non-null,
    * return an Optional describing the result. Otherwise return an empty Optional.
    *
    * @typeparam U The type of the result of the mapping function
    * @param mapper a mapping function to apply to the value, if present.
    * @return an Optional describing the result of applying a mapping function to the value of this Optional,
    * if a value is present, otherwise an empty Optional
    * @throws Error if the mapping function is null
    */
  /* CompleteClass */
  override def map[U](mapper: js.Function1[T, js.UndefOr[U | scala.Null]]): Optional[U] = js.native
  /**
    * If a value is present, returns an Optional describing the value, otherwise returns an Optional produced by the supplying function.
    *
    * @param optionalSupplier the supplying function that produces an Optional to be returned
    * @return returns an Optional describing the value of this Optional, if a value is present,
    * otherwise an Optional produced by the supplying function.
    * @throws Error if the supplying function is null or produces a null result
    */
  /* CompleteClass */
  override def or(optionalSupplier: js.Function0[Optional[T]]): Optional[T] = js.native
  /**
    * If a value is present, returns the value, otherwise returns other.
    *
    * @param other the value to be returned, if no value is present. May be null.
    * @return the value, if present, otherwise other
    */
  /* CompleteClass */
  override def orElse(other: T): T = js.native
  /**
    * If a value is present, returns the value, otherwise returns the result produced by the supplying function.
    *
    * @param supplier the supplying function that produces a value to be returned
    * @return the value, if present, otherwise the result produced by the supplying function
    * @throws Error if no value is present and the supplying function is null
    */
  /* CompleteClass */
  override def orElseGet(supplier: js.Function0[T]): T = js.native
  /**
    * If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
    *
    * @param exceptionSupplier the supplying function that produces an exception to be thrown
    * @return the value, if present
    * @throws Error if no value is present and the exception supplying function is null
    */
  /* CompleteClass */
  override def orElseThrow(exceptionSupplier: js.Function0[stdLib.Error]): T = js.native
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
  def empty[T](): optionalDashJsLib.optionalDashJsMod.Optional[T] = js.native
  /**
    * Returns an Optional describing the given non-null value.
    *
    * @typeparam T the type of the value
    * @param value the value to describe, which must be non-null
    * @return an Optional with the value present
    * @throws Error if value is null
    */
  def of[T](value: T): optionalDashJsLib.optionalDashJsMod.Optional[T] = js.native
  def ofNullable[T](): optionalDashJsLib.optionalDashJsMod.Optional[T] = js.native
  /**
    * Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
    *
    * @typeparam T the type of the value
    * @param value the possibly-null value to describe
    * @return an Optional with a present value if the specified value is non-null, otherwise an empty Optional
    */
  def ofNullable[T](value: T): optionalDashJsLib.optionalDashJsMod.Optional[T] = js.native
}

