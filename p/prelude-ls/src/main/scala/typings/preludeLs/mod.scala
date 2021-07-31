package typings.preludeLs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prelude-ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Obj {
    
    @JSImport("prelude-ls", "Obj")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def compact[A](`object`: NumberDictionary[A]): NumberDictionary[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(`object`.asInstanceOf[js.Any]).asInstanceOf[NumberDictionary[A]]
    @scala.inline
    def compact[A](`object`: StringDictionary[A]): StringDictionary[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[A]]
    
    @scala.inline
    def each[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* object */ StringDictionary[A], StringDictionary[A]]]
    @scala.inline
    def each[A](f: js.Function1[/* x */ A, Unit], `object`: NumberDictionary[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
    @scala.inline
    def each[A](f: js.Function1[/* x */ A, Unit], `object`: StringDictionary[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
    
    @scala.inline
    def empty[A](`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def filter[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* object */ StringDictionary[A], StringDictionary[A]]]
    @scala.inline
    def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
    @scala.inline
    def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
    
    @scala.inline
    def find[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* object */ StringDictionary[A], A]]
    @scala.inline
    def find[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[A]
    @scala.inline
    def find[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[A]
    
    @scala.inline
    def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* object */ StringDictionary[A], StringDictionary[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* object */ StringDictionary[A], StringDictionary[B]]]
    @scala.inline
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: NumberDictionary[A]): NumberDictionary[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[B]]
    @scala.inline
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: StringDictionary[A]): StringDictionary[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[B]]
    
    @scala.inline
    def partition[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[
        /* object */ StringDictionary[A], 
        js.Tuple2[StringDictionary[A], StringDictionary[A]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* object */ StringDictionary[A], 
        js.Tuple2[StringDictionary[A], StringDictionary[A]]
      ]]
    @scala.inline
    def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): js.Tuple2[NumberDictionary[A], NumberDictionary[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[NumberDictionary[A], NumberDictionary[A]]]
    @scala.inline
    def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): js.Tuple2[StringDictionary[A], StringDictionary[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StringDictionary[A], StringDictionary[A]]]
    
    @scala.inline
    def reject[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* object */ StringDictionary[A], StringDictionary[A]]]
    @scala.inline
    def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
    @scala.inline
    def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
  }
  
  object Str {
    
    @JSImport("prelude-ls", "Str")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def breakStr(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breakStr")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Tuple2[String, String]]]
    @scala.inline
    def breakStr(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("breakStr")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
    
    @scala.inline
    def drop(n: Double): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
    @scala.inline
    def drop(n: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def dropWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
    @scala.inline
    def dropWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def empty(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def reverse(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def slice(x: Double): js.Function1[/* y */ Double, js.Function1[/* str */ String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, js.Function1[/* str */ String, String]]]
    @scala.inline
    def slice(x: Double, y: Double): js.Function1[/* str */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* str */ String, String]]
    @scala.inline
    def slice(x: Double, y: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def span(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Tuple2[String, String]]]
    @scala.inline
    def span(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("span")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
    
    @scala.inline
    def splitAt(n: Double): js.Function1[/* str */ String, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Tuple2[String, String]]]
    @scala.inline
    def splitAt(n: Double, str: String): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
    
    @scala.inline
    def take(n: Double): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
    @scala.inline
    def take(n: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def takeWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
    @scala.inline
    def takeWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @scala.inline
  def abs(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def acos(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def all[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], Boolean]]
  @scala.inline
  def all[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def andList[A](xs: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("andList")(xs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def any[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], Boolean]]
  @scala.inline
  def any[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def apply[A, B](f: js.Function1[/* repeated */ A, B]): js.Function1[/* args */ js.Array[A], B] = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ js.Array[A], B]]
  @scala.inline
  def apply[A, B](f: js.Function1[/* repeated */ A, B], args: js.Array[A]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(f.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[B]
  
  @scala.inline
  def asin(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def at[A](n: Double): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def at[A](n: Double, xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("at")(n.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def atan(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def atan2(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def breakList[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breakList")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]]]
  @scala.inline
  def breakList[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("breakList")(p.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[A], js.Array[A]]]
  
  @scala.inline
  def breakStr(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("breakStr")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Tuple2[String, String]]]
  @scala.inline
  def breakStr(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("breakStr")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  
  @scala.inline
  def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def ceiling(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ceiling")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def chars(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("chars")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def compact[A](`object`: NumberDictionary[A]): NumberDictionary[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(`object`.asInstanceOf[js.Any]).asInstanceOf[NumberDictionary[A]]
  @scala.inline
  def compact[A](`object`: StringDictionary[A]): StringDictionary[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[A]]
  @scala.inline
  def compact[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def concat[A](xss: js.Array[js.Array[A]]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(xss.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[B]]]
  @scala.inline
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatMap")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
  
  @scala.inline
  def cos(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def countBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("countBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Any]]
  @scala.inline
  def countBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("countBy")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def curry(f: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def dasherize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dasherize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def difference[A](xss: js.Array[A]*): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(xss.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def div(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("div")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def div(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def drop(n: Double): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
  @scala.inline
  def drop(n: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def drop[A](n: Double, xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def dropWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
  @scala.inline
  def dropWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def dropWhile[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(p.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def dropWhile_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropWhile")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def drop_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def each[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def each[A](f: js.Function1[/* x */ A, Unit], `object`: NumberDictionary[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
  @scala.inline
  def each[A](f: js.Function1[/* x */ A, Unit], `object`: StringDictionary[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
  @scala.inline
  def each[A](f: js.Function1[/* x */ A, Unit], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def elemIndex[A](x: A): js.Function1[/* xs */ js.Array[A], Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elemIndex")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], Double]]
  @scala.inline
  def elemIndex[A](x: A, xs: js.Array[A]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("elemIndex")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def elemIndices[A](x: A): js.Function1[/* xs */ js.Array[A], js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("elemIndices")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[Double]]]
  @scala.inline
  def elemIndices[A](x: A, xs: js.Array[A]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("elemIndices")(x.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def empty(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def empty[A](`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def empty[A](xs: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(xs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def even(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("even")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def exp(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def filter[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
  @scala.inline
  def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
  @scala.inline
  def filter[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def find[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def find[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[A]
  @scala.inline
  def find[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[A]
  @scala.inline
  def find[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def findIndex[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], Double]]
  @scala.inline
  def findIndex[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def findIndices[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndices")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[Double]]]
  @scala.inline
  def findIndices[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndices")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def fix(f: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("fix")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def flatten(xs: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ B, js.Function1[/* x */ A, C]]]
  @scala.inline
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B): js.Function1[/* x */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, C]]
  @scala.inline
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B, x: A): C = (^.asInstanceOf[js.Dynamic].applyDynamic("flip")(f.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[C]
  
  @scala.inline
  def floor(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]]]
  @scala.inline
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[B], A]]
  @scala.inline
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def fold1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold1")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def fold1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("fold1")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]]]
  @scala.inline
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], A] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[B], A]]
  @scala.inline
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def foldl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldl1")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def foldl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl1")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]]): js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], B]]]
  @scala.inline
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B): js.Function1[/* xs */ js.Array[A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[A], B]]
  @scala.inline
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B, xs: js.Array[A]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[B]
  
  @scala.inline
  def foldr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldr1")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def foldr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr1")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def gcd(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("gcd")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def gcd(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("gcd")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def groupBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Any]]
  @scala.inline
  def groupBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def head[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def id[A](x: A): A = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(x.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def initial[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("initial")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def intersection[A](xss: js.Array[A]*): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(xss.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def isItNaN(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItNaN")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isType[A](`type`: String): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  @scala.inline
  def isType[A](`type`: String, x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isType")(`type`.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def join(separator: String): js.Function1[/* xs */ js.Array[String], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[String], String]]
  @scala.inline
  def join(separator: String, xs: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def keys[A](`object`: NumberDictionary[A]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def keys[A](`object`: StringDictionary[A]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def last[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("last")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def lcm(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("lcm")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def lcm(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lcm")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def lines(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lines")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def listsToObj[A](keys: js.Array[Double | String]): js.Function1[/* values */ js.Array[A], StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listsToObj")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* values */ js.Array[A], StringDictionary[A]]]
  @scala.inline
  def listsToObj[A](keys: js.Array[Double], values: js.Array[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("listsToObj")(keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
  
  @scala.inline
  def listsToObj_A_StringDictionary[A](keys: js.Array[String], values: js.Array[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("listsToObj")(keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
  
  @scala.inline
  def ln(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ln")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[B]]]
  @scala.inline
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: NumberDictionary[A]): NumberDictionary[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[B]]
  @scala.inline
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: StringDictionary[A]): StringDictionary[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[B]]
  @scala.inline
  def map[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
  
  @scala.inline
  def max[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Comparable, Comparable]]
  @scala.inline
  def max[Comparable](x: Comparable, y: Comparable): Comparable = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Comparable]
  
  @scala.inline
  def maximum[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def maximumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("maximumBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def maximumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumBy")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def mean(xs: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(xs.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def min[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Comparable, Comparable]]
  @scala.inline
  def min[Comparable](x: Comparable, y: Comparable): Comparable = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Comparable]
  
  @scala.inline
  def minimum[A](xs: js.Array[A]): A = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(xs.asInstanceOf[js.Any]).asInstanceOf[A]
  
  @scala.inline
  def minimumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("minimumBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], A]]
  @scala.inline
  def minimumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumBy")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[A]
  
  @scala.inline
  def mod(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def mod(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def negate(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("negate")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def objToLists[A](`object`: NumberDictionary[A]): js.Tuple2[js.Array[Double], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objToLists")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[Double], js.Array[A]]]
  @scala.inline
  def objToLists[A](`object`: StringDictionary[A]): js.Tuple2[js.Array[String], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objToLists")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[A]]]
  
  @scala.inline
  def objToPairs[A](`object`: NumberDictionary[A]): js.Array[js.Tuple2[Double, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objToPairs")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, A]]]
  @scala.inline
  def objToPairs[A](`object`: StringDictionary[A]): js.Array[js.Tuple2[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("objToPairs")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, A]]]
  
  @scala.inline
  def odd(x: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("odd")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def orList[A](xs: js.Array[A]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("orList")(xs.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def over[A, B, C](f: js.Function1[/* x */ B, js.Function1[/* y */ B, C]]): js.Function1[
    /* g */ js.Function1[/* x */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("over")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* g */ js.Function1[/* x */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ]]
  @scala.inline
  def over[A, B, C](f: js.Function1[/* x */ B, js.Function1[/* y */ B, C]], g: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, js.Function1[/* y */ A, C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("over")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, js.Function1[/* y */ A, C]]]
  @scala.inline
  def over[A, B, C](
    f: js.Function1[/* x */ B, js.Function1[/* y */ B, C | (js.Function2[/* x */ B, /* y */ B, C])]],
    g: js.Function1[/* x */ A, B],
    x: A,
    y: A
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("over")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[C]
  @scala.inline
  def over[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C]): js.Function1[/* g */ js.Function1[/* x */ A, B], js.Function2[/* x */ A, /* y */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("over")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, B], js.Function2[/* x */ A, /* y */ A, C]]]
  @scala.inline
  def over[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* x */ A, B]): js.Function2[/* x */ A, /* y */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("over")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, C]]
  @scala.inline
  def over[A, B, C](
    f: js.Function2[/* x */ B, /* y */ B, C | (js.Function1[/* x */ B, js.Function1[/* y */ B, C]])],
    g: js.Function1[/* x */ A, B],
    x: A
  ): js.Function1[/* y */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("over")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* y */ A, C]]
  
  @scala.inline
  def pairsToObj[A](`object`: js.Array[js.Tuple2[Double, A]]): NumberDictionary[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairsToObj")(`object`.asInstanceOf[js.Any]).asInstanceOf[NumberDictionary[A]]
  
  @scala.inline
  def pairsToObj_A_StringDictionary[A](`object`: js.Array[js.Tuple2[String, A]]): StringDictionary[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairsToObj")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[A]]
  
  @scala.inline
  def partition[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]]]
  @scala.inline
  def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): js.Tuple2[NumberDictionary[A], NumberDictionary[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[NumberDictionary[A], NumberDictionary[A]]]
  @scala.inline
  def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): js.Tuple2[StringDictionary[A], StringDictionary[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StringDictionary[A], StringDictionary[A]]]
  @scala.inline
  def partition[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[A], js.Array[A]]]
  
  @JSImport("prelude-ls", "pi")
  @js.native
  def pi: Double = js.native
  @scala.inline
  def pi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pi")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def pow(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def pow(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def product(xs: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("product")(xs.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def quot(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("quot")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def quot(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("quot")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def recip(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("recip")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def reject[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[NumberDictionary[A]]
  @scala.inline
  def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
  @scala.inline
  def reject[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def rem(x: Double): js.Function1[/* y */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("rem")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, Double]]
  @scala.inline
  def rem(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rem")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def repeat(n: Double): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
  @scala.inline
  def repeat(n: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def replicate[A](n: Double): js.Function1[/* x */ A, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, js.Array[A]]]
  @scala.inline
  def replicate[A](n: Double, x: A): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("replicate")(n.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def reverse(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def reverse[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def round(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]]]
  @scala.inline
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[B], js.Array[A]]]
  @scala.inline
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def scan1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan1")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def scan1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan1")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanl")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]]]
  @scala.inline
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanl")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[B], js.Array[A]]]
  @scala.inline
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanl")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def scanl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanl1")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def scanl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanl1")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]]): js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanr")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], js.Array[B]]]]
  @scala.inline
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B): js.Function1[/* xs */ js.Array[A], js.Array[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanr")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[B]]]
  @scala.inline
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B, xs: js.Array[A]): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanr")(f.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
  
  @scala.inline
  def scanr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanr1")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def scanr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanr1")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def signum(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("signum")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sin(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def slice(x: Double): js.Function1[/* y */ Double, js.Function1[/* str */ String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, js.Function1[/* str */ String, String]]]
  @scala.inline
  def slice(x: Double, y: Double): js.Function1[/* str */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* str */ String, String]]
  @scala.inline
  def slice(x: Double, y: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def slice[A](x: Double, y: Double, xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def slice_A[A](x: Double): js.Function1[/* y */ Double, js.Function1[/* xs */ js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* y */ Double, js.Function1[/* xs */ js.Array[A], js.Array[A]]]]
  @scala.inline
  def slice_A[A](x: Double, y: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def sort[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def sortBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def sortBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, Double]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortWith")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, Double]], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortWith")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def span(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Tuple2[String, String]]]
  @scala.inline
  def span(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("span")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  @scala.inline
  def span[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("span")(p.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[A], js.Array[A]]]
  
  @scala.inline
  def span_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]]]
  
  @scala.inline
  def split(separator: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(separator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  @scala.inline
  def split(separator: String, str: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(separator.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def splitAt(n: Double): js.Function1[/* str */ String, js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Tuple2[String, String]]]
  @scala.inline
  def splitAt(n: Double, str: String): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  @scala.inline
  def splitAt[A](n: Double, xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[A], js.Array[A]]]
  
  @scala.inline
  def splitAt_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAt")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]]]
  
  @scala.inline
  def sqrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sum(xs: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(xs.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tail[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def take(n: Double): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
  @scala.inline
  def take(n: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def take[A](n: Double, xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def takeWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, String]]
  @scala.inline
  def takeWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(f.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def takeWhile[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(p.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def takeWhile_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def take_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(n.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  
  @scala.inline
  def tan(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("prelude-ls", "tau")
  @js.native
  def tau: Double = js.native
  @scala.inline
  def tau_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tau")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def truncate(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def unchars(xs: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unchars")(xs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | Unit]): js.Function1[/* x */ B, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unfoldr")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ B, js.Array[A]]]
  @scala.inline
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | Unit], x: B): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("unfoldr")(f.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def union[A](xss: js.Array[A]*): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(xss.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def unique[A](xs: js.Array[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueBy")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Array[A]]]
  @scala.inline
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqueBy")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def unlines(xs: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unlines")(xs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unwords(xs: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unwords")(xs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def values[A](`object`: NumberDictionary[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  @scala.inline
  def values[A](`object`: StringDictionary[A]): js.Array[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[A]]
  
  @scala.inline
  def words(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("words")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def zip[A, B](xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[js.Tuple2[A, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(xs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ys */ js.Array[B], js.Array[js.Tuple2[A, B]]]]
  @scala.inline
  def zip[A, B](xs: js.Array[A], ys: js.Array[B]): js.Array[js.Tuple2[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[A, B]]]
  
  @scala.inline
  def zipAll[A](xss: js.Array[A]*): js.Array[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(xss.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[A]]]
  
  @scala.inline
  def zipAllWith[A, B](f: js.Function1[/* repeated */ A, B], xss: js.Array[A]*): js.Array[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipAllWith")(f.asInstanceOf[js.Any], xss.asInstanceOf[js.Any])).asInstanceOf[js.Array[B]]
  
  @scala.inline
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* xs */ js.Array[A], js.Function1[/* ys */ js.Array[B], js.Array[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* xs */ js.Array[A], js.Function1[/* ys */ js.Array[B], js.Array[C]]]]
  @scala.inline
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ys */ js.Array[B], js.Array[C]]]
  @scala.inline
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A], ys: js.Array[B]): js.Array[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(f.asInstanceOf[js.Any], xs.asInstanceOf[js.Any], ys.asInstanceOf[js.Any])).asInstanceOf[js.Array[C]]
}
