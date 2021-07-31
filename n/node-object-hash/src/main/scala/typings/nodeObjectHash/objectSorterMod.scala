package typings.nodeObjectHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectSorterMod {
  
  /**
    * Object sorter consturctor
    * @param options object transformation options
    * @returns function that transforms object to strings
    */
  @scala.inline
  def apply(): js.Function1[/* obj */ js.Any, String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[/* obj */ js.Any, String]]
  @scala.inline
  def apply(options: SorterOptions): js.Function1[/* obj */ js.Any, String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, String]]
  
  @JSImport("node-object-hash/dist/objectSorter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Advanced coerce options
    */
  trait CoerceOptions extends StObject {
    
    /**
      * If `true` converts booleans to string `1` and `0`
      * @example
      * // coerce.boolean = true
      * true === 1;
      * false === '0';
      * @example
      * // coerce.boolean = true
      * true !== 1;
      * false !== '0'
      * @default true
      */
    var boolean: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` dates may equal the same formatted strings
      * @example
      * // coerce.date = true
      * @example
      * // coerce.date = false
      * @default true
      */
    var date: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` functions may equal the same formatted strings
      * @example
      * // coerce.function = true
      * @example
      * // coerce.function = false
      * @default true
      */
    var function: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` null will be equal to empty string
      * @example
      * // coerce.null = true
      * null === ''
      * @example
      * // coerce.null = false
      * null !== ''
      * @default true
      */
    var `null`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` converts numbers to strings
      * @example
      * // coerce.number = true
      * 1 === '1';
      * @example
      * // coerce.number = true
      * 1 !== '1';
      * @default true
      */
    var number: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` set will be coerced to array
      * @example
      * // coerce.set = true
      * @example
      * // coerce.set = false
      * @default true
      */
    var set: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` strings and coerced string will be equal to coerced numbers, booleans, etc
      * @example
      * // coerce.string = true
      * '1' === true
      * @example
      * // coerce.string = false
      * '1' !== 1
      * @default true
      */
    var string: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` all symbols will have eual representation
      * @example
      * // coerce.symbol = true
      * Symbol.for('a') === Symbol.for('b')
      * @example
      * // coerce.symbol = false
      * Symbol.for('a') !== Symbol.for('b')
      * @default true
      */
    var symbol: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` undefined will be equal to empty string
      * @example
      * // coerce.undefined = true
      * undefined === ''
      * @example
      * // coerce.undefined = false
      * undefined !== ''
      * @default true
      */
    var undefined: js.UndefOr[Boolean] = js.undefined
  }
  object CoerceOptions {
    
    @scala.inline
    def apply(): CoerceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoerceOptions]
    }
    
    @scala.inline
    implicit class CoerceOptionsMutableBuilder[Self <: CoerceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setFunction(value: Boolean): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setNull(value: Boolean): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      @scala.inline
      def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setString(value: Boolean): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setUndefined(value: Boolean): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    }
  }
  
  /**
    * Advanced sort options
    */
  trait SortOptions extends StObject {
    
    /**
      * If `true` sort array entries before hash
      */
    var array: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` sort map entries before hash
      */
    var map: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` sort object entries before hash
      */
    var `object`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` sort set entries before hash
      */
    var set: js.UndefOr[Boolean] = js.undefined
  }
  object SortOptions {
    
    @scala.inline
    def apply(): SortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortOptions]
    }
    
    @scala.inline
    implicit class SortOptionsMutableBuilder[Self <: SortOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: Boolean): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setObject(value: Boolean): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      @scala.inline
      def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  /**
    * Object sorter options
    */
  trait SorterOptions extends StObject {
    
    /**
      * If `true` enables type coercion.
      * Advanced coerce options could be provided as object
      * @default true
      */
    var coerce: js.UndefOr[Boolean | CoerceOptions] = js.undefined
    
    /**
      * If `true` enables sorting.
      * Advanced sorting options could be provided as object
      * @default true
      */
    var sort: js.UndefOr[Boolean | SortOptions] = js.undefined
    
    /**
      * If `true` enables trimming and multiple whitespace replacement.
      * Advanced sorting options could be provided as object.
      * @default false
      */
    var trim: js.UndefOr[Boolean | TrimOptions] = js.undefined
  }
  object SorterOptions {
    
    @scala.inline
    def apply(): SorterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SorterOptions]
    }
    
    @scala.inline
    implicit class SorterOptionsMutableBuilder[Self <: SorterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoerce(value: Boolean | CoerceOptions): Self = StObject.set(x, "coerce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoerceUndefined: Self = StObject.set(x, "coerce", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean | SortOptions): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean | TrimOptions): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  /**
    * Advanced trim options
    */
  trait TrimOptions extends StObject {
    
    /**
      * If `true` replaces multiple space with one and trims whitespaces in function body
      */
    var function: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` replaces multiple space with one and trims whitespaces in strings
      */
    var string: js.UndefOr[Boolean] = js.undefined
  }
  object TrimOptions {
    
    @scala.inline
    def apply(): TrimOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrimOptions]
    }
    
    @scala.inline
    implicit class TrimOptionsMutableBuilder[Self <: TrimOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunction(value: Boolean): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setString(value: Boolean): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
}
