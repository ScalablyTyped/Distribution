package typings.postcss

import typings.postcss.mod.Processor
import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import typings.postcss.mod.SourceMapOptions
import typings.postcss.mod.TransformCallback
import typings.postcss.mod._AcceptedPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Column extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fast extends StObject {
    
    /**
      * Used to narrow down values and speed up the regexp search. Searching
      * every single value with a regexp can be slow. If you pass a fast
      * string, PostCSS will first check whether the value contains the fast
      * string; and only if it does will PostCSS check that value against
      * regexp. For example, instead of just checking for /\d+rem/ on all
      * values, set fast: 'rem' to first check whether a value has the rem
      * unit, and only if it does perform the regexp check.
      */
    var fast: js.UndefOr[String] = js.native
    
    /**
      * Property names. The method will only search for values that match
      * regexp  within declarations of listed properties.
      */
    var props: js.UndefOr[js.Array[String]] = js.native
  }
  object Fast {
    
    @scala.inline
    def apply(): Fast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fast]
    }
    
    @scala.inline
    implicit class FastMutableBuilder[Self <: Fast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFast(value: String): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastUndefined: Self = StObject.set(x, "fast", js.undefined)
      
      @scala.inline
      def setProps(value: js.Array[String]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setPropsVarargs(value: String*): Self = StObject.set(x, "props", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Result, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Result, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def apply[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  }
  
  @js.native
  trait FnCallOnrejected extends StObject {
    
    def apply[TResult](): js.Promise[Result | TResult] = js.native
    def apply[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Result | TResult] = js.native
  }
  
  @js.native
  trait Map extends StObject {
    
    var map: js.UndefOr[SourceMapOptions] = js.native
    
    /**
      * The path where you'll put the output CSS file. You should always
      * set "to" to generate correct source maps.
      */
    var to: js.UndefOr[String] = js.native
  }
  object Map {
    
    @scala.inline
    def apply(): Map = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: SourceMapOptions): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Inlined std.Pick<postcss.postcss.ProcessOptions, 'map' | 'from'> */
  @js.native
  trait PickProcessOptionsmapfrom extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
  }
  object PickProcessOptionsmapfrom {
    
    @scala.inline
    def apply(): PickProcessOptionsmapfrom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickProcessOptionsmapfrom]
    }
    
    @scala.inline
    implicit class PickProcessOptionsmapfromMutableBuilder[Self <: PickProcessOptionsmapfrom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  @js.native
  trait Postcss extends _AcceptedPlugin {
    
    var postcss: TransformCallback | Processor = js.native
  }
  object Postcss {
    
    @scala.inline
    def apply(postcss: TransformCallback | Processor): Postcss = {
      val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
      __obj.asInstanceOf[Postcss]
    }
    
    @scala.inline
    implicit class PostcssMutableBuilder[Self <: Postcss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostcss(value: TransformCallback | Processor): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostcssFunction2(value: (/* root */ Root_, /* result */ Result) => js.Promise[js.Any] | js.Any): Self = StObject.set(x, "postcss", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ToString extends StObject
}
