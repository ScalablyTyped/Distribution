package typings.optionalJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("optional-js", JSImport.Default)
  @js.native
  /* private */ class default[T] ()
    extends StObject
       with Optional[T] {
    /* private */ def this(value: T) = this()
    
    /* private */ /* CompleteClass */
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
    override def filter(predicate: js.Function1[T, Boolean]): Optional[T] = js.native
    
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
    override def flatMap[U](mapper: js.Function1[T, js.UndefOr[Optional[U] | Null]]): Optional[U] = js.native
    
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
    override def ifPresent(consumer: js.Function1[T, Unit]): Unit = js.native
    
    /**
      * If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
      *
      * @param action the action to be performed, if a value is present
      * @param emptyAction the empty-based action to be performed, if no value is present
      * @throws if a value is present and the given action is null, or no value is present and the given empty-based action is null.
      */
    /* CompleteClass */
    override def ifPresentOrElse(action: js.Function1[T, Unit], emptyAction: js.Function0[Unit]): Unit = js.native
    
    /**
      * Return true if there is a value present, otherwise false.
      *
      * @return true if there is a value present, otherwise false
      */
    /* CompleteClass */
    override def isPresent(): Boolean = js.native
    
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
    override def map[U](mapper: js.Function1[T, js.UndefOr[U | Null]]): Optional[U] = js.native
    
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
    override def orElseThrow(exceptionSupplier: js.Function0[Error]): T = js.native
  }
  /* static members */
  object default {
    
    @JSImport("optional-js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an empty Optional instance. No value is present for this Optional.
      *
      * @return an empty Optional
      */
    inline def empty[T](): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Optional[T]]
    
    /**
      * Returns an Optional describing the given non-null value.
      *
      * @typeparam T the type of the value
      * @param value the value to describe, which must be non-null
      * @return an Optional with the value present
      * @throws Error if value is null
      */
    inline def of[T](value: T): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Optional[T]]
    
    /**
      * Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
      *
      * @typeparam T the type of the value
      * @param value the possibly-null value to describe
      * @return an Optional with a present value if the specified value is non-null, otherwise an empty Optional
      */
    inline def ofNullable[T](): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")().asInstanceOf[Optional[T]]
    inline def ofNullable[T](value: T): Optional[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofNullable")(value.asInstanceOf[js.Any]).asInstanceOf[Optional[T]]
  }
  
  trait Optional[T] extends StObject {
    
    /* private */ val _value: js.Any
    
    /**
      * If a value is present, and the value matches the given predicate, return an Optional describing the value,
      * otherwise return an empty Optional.
      *
      * @param predicate A predicate to apply to the value, if present
      * @return an Optional describing the value of this Optional if a value is present and the value matches the given
      * predicate, otherwise an empty Optional
      * @throws Error if the predicate is null
      */
    def filter(predicate: js.Function1[/* value */ T, Boolean]): Optional[T]
    
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
    def flatMap[U](mapper: js.Function1[/* value */ T, js.UndefOr[Optional[U] | Null]]): Optional[U]
    
    /**
      * If a value is present in this Optional, returns the value, otherwise throws an Error.
      *
      * @return the non-null value held by this Optional
      * @throws Error if the value is null;
      */
    def get(): T
    
    /**
      * If a value is present, invoke the specified consumer with the value, otherwise do nothing.
      *
      * @param consumer function to be executed if a value is present
      */
    def ifPresent(consumer: js.Function1[/* value */ T, Unit]): Unit
    
    /**
      * If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
      *
      * @param action the action to be performed, if a value is present
      * @param emptyAction the empty-based action to be performed, if no value is present
      * @throws if a value is present and the given action is null, or no value is present and the given empty-based action is null.
      */
    def ifPresentOrElse(action: js.Function1[/* value */ T, Unit], emptyAction: js.Function0[Unit]): Unit
    
    /**
      * Return true if there is a value present, otherwise false.
      *
      * @return true if there is a value present, otherwise false
      */
    def isPresent(): Boolean
    
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
    def map[U](mapper: js.Function1[/* value */ T, js.UndefOr[U | Null]]): Optional[U]
    
    /**
      * If a value is present, returns an Optional describing the value, otherwise returns an Optional produced by the supplying function.
      *
      * @param optionalSupplier the supplying function that produces an Optional to be returned
      * @return returns an Optional describing the value of this Optional, if a value is present,
      * otherwise an Optional produced by the supplying function.
      * @throws Error if the supplying function is null or produces a null result
      */
    def or(optionalSupplier: js.Function0[Optional[T]]): Optional[T]
    
    /**
      * If a value is present, returns the value, otherwise returns other.
      *
      * @param other the value to be returned, if no value is present. May be null.
      * @return the value, if present, otherwise other
      */
    def orElse(other: T): T
    
    /**
      * If a value is present, returns the value, otherwise returns the result produced by the supplying function.
      *
      * @param supplier the supplying function that produces a value to be returned
      * @return the value, if present, otherwise the result produced by the supplying function
      * @throws Error if no value is present and the supplying function is null
      */
    def orElseGet(supplier: js.Function0[T]): T
    
    /**
      * If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
      *
      * @param exceptionSupplier the supplying function that produces an exception to be thrown
      * @return the value, if present
      * @throws Error if no value is present and the exception supplying function is null
      */
    def orElseThrow(exceptionSupplier: js.Function0[Error]): T
  }
  object Optional {
    
    inline def apply[T](
      _value: js.Any,
      filter: js.Function1[/* value */ T, Boolean] => Optional[T],
      flatMap: js.Function1[/* value */ T, js.UndefOr[Optional[js.Any] | Null]] => Optional[js.Any],
      get: () => T,
      ifPresent: js.Function1[/* value */ T, Unit] => Unit,
      ifPresentOrElse: (js.Function1[/* value */ T, Unit], js.Function0[Unit]) => Unit,
      isPresent: () => Boolean,
      map: js.Function1[/* value */ T, js.UndefOr[js.Any | Null]] => Optional[js.Any],
      or: js.Function0[Optional[T]] => Optional[T],
      orElse: T => T,
      orElseGet: js.Function0[T] => T,
      orElseThrow: js.Function0[Error] => T
    ): Optional[T] = {
      val __obj = js.Dynamic.literal(_value = _value.asInstanceOf[js.Any], filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), get = js.Any.fromFunction0(get), ifPresent = js.Any.fromFunction1(ifPresent), ifPresentOrElse = js.Any.fromFunction2(ifPresentOrElse), isPresent = js.Any.fromFunction0(isPresent), map = js.Any.fromFunction1(map), or = js.Any.fromFunction1(or), orElse = js.Any.fromFunction1(orElse), orElseGet = js.Any.fromFunction1(orElseGet), orElseThrow = js.Any.fromFunction1(orElseThrow))
      __obj.asInstanceOf[Optional[T]]
    }
    
    extension [Self <: Optional[?], T](x: Self & Optional[T]) {
      
      inline def setFilter(value: js.Function1[/* value */ T, Boolean] => Optional[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: js.Function1[/* value */ T, js.UndefOr[Optional[js.Any] | Null]] => Optional[js.Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setIfPresent(value: js.Function1[/* value */ T, Unit] => Unit): Self = StObject.set(x, "ifPresent", js.Any.fromFunction1(value))
      
      inline def setIfPresentOrElse(value: (js.Function1[/* value */ T, Unit], js.Function0[Unit]) => Unit): Self = StObject.set(x, "ifPresentOrElse", js.Any.fromFunction2(value))
      
      inline def setIsPresent(value: () => Boolean): Self = StObject.set(x, "isPresent", js.Any.fromFunction0(value))
      
      inline def setMap(value: js.Function1[/* value */ T, js.UndefOr[js.Any | Null]] => Optional[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setOr(value: js.Function0[Optional[T]] => Optional[T]): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
      
      inline def setOrElse(value: T => T): Self = StObject.set(x, "orElse", js.Any.fromFunction1(value))
      
      inline def setOrElseGet(value: js.Function0[T] => T): Self = StObject.set(x, "orElseGet", js.Any.fromFunction1(value))
      
      inline def setOrElseThrow(value: js.Function0[Error] => T): Self = StObject.set(x, "orElseThrow", js.Any.fromFunction1(value))
      
      inline def set_value(value: js.Any): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
