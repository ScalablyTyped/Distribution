package typings.preludeLs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prelude-ls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Obj {
    
    @JSImport("prelude-ls", "Obj.compact")
    @js.native
    def compact[A](`object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    @JSImport("prelude-ls", "Obj.compact")
    @js.native
    def compact[A](`object`: StringDictionary[A]): StringDictionary[A] = js.native
    
    @JSImport("prelude-ls", "Obj.each")
    @js.native
    def each[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = js.native
    @JSImport("prelude-ls", "Obj.each")
    @js.native
    def each[A](f: js.Function1[/* x */ A, Unit], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    @JSImport("prelude-ls", "Obj.each")
    @js.native
    def each[A](f: js.Function1[/* x */ A, Unit], `object`: StringDictionary[A]): StringDictionary[A] = js.native
    
    @JSImport("prelude-ls", "Obj.empty")
    @js.native
    def empty[A](`object`: js.Any): Boolean = js.native
    
    @JSImport("prelude-ls", "Obj.filter")
    @js.native
    def filter[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = js.native
    @JSImport("prelude-ls", "Obj.filter")
    @js.native
    def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    @JSImport("prelude-ls", "Obj.filter")
    @js.native
    def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
    
    @JSImport("prelude-ls", "Obj.find")
    @js.native
    def find[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], A] = js.native
    @JSImport("prelude-ls", "Obj.find")
    @js.native
    def find[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): A = js.native
    @JSImport("prelude-ls", "Obj.find")
    @js.native
    def find[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): A = js.native
    
    @JSImport("prelude-ls", "Obj.map")
    @js.native
    def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* object */ StringDictionary[A], StringDictionary[B]] = js.native
    @JSImport("prelude-ls", "Obj.map")
    @js.native
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: NumberDictionary[A]): NumberDictionary[B] = js.native
    @JSImport("prelude-ls", "Obj.map")
    @js.native
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: StringDictionary[A]): StringDictionary[B] = js.native
    
    @JSImport("prelude-ls", "Obj.partition")
    @js.native
    def partition[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[
        /* object */ StringDictionary[A], 
        js.Tuple2[StringDictionary[A], StringDictionary[A]]
      ] = js.native
    @JSImport("prelude-ls", "Obj.partition")
    @js.native
    def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): js.Tuple2[NumberDictionary[A], NumberDictionary[A]] = js.native
    @JSImport("prelude-ls", "Obj.partition")
    @js.native
    def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): js.Tuple2[StringDictionary[A], StringDictionary[A]] = js.native
    
    @JSImport("prelude-ls", "Obj.reject")
    @js.native
    def reject[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = js.native
    @JSImport("prelude-ls", "Obj.reject")
    @js.native
    def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    @JSImport("prelude-ls", "Obj.reject")
    @js.native
    def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  }
  
  object Str {
    
    @JSImport("prelude-ls", "Str.breakStr")
    @js.native
    def breakStr(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
    @JSImport("prelude-ls", "Str.breakStr")
    @js.native
    def breakStr(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
    
    @JSImport("prelude-ls", "Str.drop")
    @js.native
    def drop(n: Double): js.Function1[/* str */ String, String] = js.native
    @JSImport("prelude-ls", "Str.drop")
    @js.native
    def drop(n: Double, str: String): String = js.native
    
    @JSImport("prelude-ls", "Str.dropWhile")
    @js.native
    def dropWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
    @JSImport("prelude-ls", "Str.dropWhile")
    @js.native
    def dropWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
    
    @JSImport("prelude-ls", "Str.empty")
    @js.native
    def empty(str: String): Boolean = js.native
    
    @JSImport("prelude-ls", "Str.reverse")
    @js.native
    def reverse(str: String): String = js.native
    
    @JSImport("prelude-ls", "Str.slice")
    @js.native
    def slice(x: Double): js.Function1[/* y */ Double, js.Function1[/* str */ String, String]] = js.native
    @JSImport("prelude-ls", "Str.slice")
    @js.native
    def slice(x: Double, y: Double): js.Function1[/* str */ String, String] = js.native
    @JSImport("prelude-ls", "Str.slice")
    @js.native
    def slice(x: Double, y: Double, str: String): String = js.native
    
    @JSImport("prelude-ls", "Str.span")
    @js.native
    def span(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
    @JSImport("prelude-ls", "Str.span")
    @js.native
    def span(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
    
    @JSImport("prelude-ls", "Str.splitAt")
    @js.native
    def splitAt(n: Double): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
    @JSImport("prelude-ls", "Str.splitAt")
    @js.native
    def splitAt(n: Double, str: String): js.Tuple2[String, String] = js.native
    
    @JSImport("prelude-ls", "Str.take")
    @js.native
    def take(n: Double): js.Function1[/* str */ String, String] = js.native
    @JSImport("prelude-ls", "Str.take")
    @js.native
    def take(n: Double, str: String): String = js.native
    
    @JSImport("prelude-ls", "Str.takeWhile")
    @js.native
    def takeWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
    @JSImport("prelude-ls", "Str.takeWhile")
    @js.native
    def takeWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
  }
  
  @JSImport("prelude-ls", "abs")
  @js.native
  def abs(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "acos")
  @js.native
  def acos(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "all")
  @js.native
  def all[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Boolean] = js.native
  @JSImport("prelude-ls", "all")
  @js.native
  def all[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Boolean = js.native
  
  @JSImport("prelude-ls", "andList")
  @js.native
  def andList[A](xs: js.Array[A]): Boolean = js.native
  
  @JSImport("prelude-ls", "any")
  @js.native
  def any[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Boolean] = js.native
  @JSImport("prelude-ls", "any")
  @js.native
  def any[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Boolean = js.native
  
  @JSImport("prelude-ls", "apply")
  @js.native
  def apply[A, B](f: js.Function1[/* repeated */ A, B]): js.Function1[/* args */ js.Array[A], B] = js.native
  @JSImport("prelude-ls", "apply")
  @js.native
  def apply[A, B](f: js.Function1[/* repeated */ A, B], args: js.Array[A]): B = js.native
  
  @JSImport("prelude-ls", "asin")
  @js.native
  def asin(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "at")
  @js.native
  def at[A](n: Double): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "at")
  @js.native
  def at[A](n: Double, xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "atan")
  @js.native
  def atan(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "atan2")
  @js.native
  def atan2(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "breakList")
  @js.native
  def breakList[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  @JSImport("prelude-ls", "breakList")
  @js.native
  def breakList[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "breakStr")
  @js.native
  def breakStr(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
  @JSImport("prelude-ls", "breakStr")
  @js.native
  def breakStr(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
  
  @JSImport("prelude-ls", "camelize")
  @js.native
  def camelize(str: String): String = js.native
  
  @JSImport("prelude-ls", "capitalize")
  @js.native
  def capitalize(str: String): String = js.native
  
  @JSImport("prelude-ls", "ceiling")
  @js.native
  def ceiling(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "chars")
  @js.native
  def chars(str: String): js.Array[String] = js.native
  
  @JSImport("prelude-ls", "compact")
  @js.native
  def compact[A](`object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  @JSImport("prelude-ls", "compact")
  @js.native
  def compact[A](`object`: StringDictionary[A]): StringDictionary[A] = js.native
  @JSImport("prelude-ls", "compact")
  @js.native
  def compact[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "concat")
  @js.native
  def concat[A](xss: js.Array[js.Array[A]]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "concatMap")
  @js.native
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  @JSImport("prelude-ls", "concatMap")
  @js.native
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  
  @JSImport("prelude-ls", "cos")
  @js.native
  def cos(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "countBy")
  @js.native
  def countBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], _] = js.native
  @JSImport("prelude-ls", "countBy")
  @js.native
  def countBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = js.native
  
  @JSImport("prelude-ls", "curry")
  @js.native
  def curry(f: js.Function): js.Function = js.native
  
  @JSImport("prelude-ls", "dasherize")
  @js.native
  def dasherize(str: String): String = js.native
  
  @JSImport("prelude-ls", "difference")
  @js.native
  def difference[A](xss: js.Array[A]*): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "div")
  @js.native
  def div(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "div")
  @js.native
  def div(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "drop")
  @js.native
  def drop(n: Double): js.Function1[/* str */ String, String] = js.native
  @JSImport("prelude-ls", "drop")
  @js.native
  def drop(n: Double, str: String): String = js.native
  @JSImport("prelude-ls", "drop")
  @js.native
  def drop[A](n: Double, xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "dropWhile")
  @js.native
  def dropWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
  @JSImport("prelude-ls", "dropWhile")
  @js.native
  def dropWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
  @JSImport("prelude-ls", "dropWhile")
  @js.native
  def dropWhile[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSImport("prelude-ls", "dropWhile")
  @js.native
  def dropWhile_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "drop")
  @js.native
  def drop_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "each")
  @js.native
  def each[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "each")
  @js.native
  def each[A](f: js.Function1[/* x */ A, Unit], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  @JSImport("prelude-ls", "each")
  @js.native
  def each[A](f: js.Function1[/* x */ A, Unit], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  @JSImport("prelude-ls", "each")
  @js.native
  def each[A](f: js.Function1[/* x */ A, Unit], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "elemIndex")
  @js.native
  def elemIndex[A](x: A): js.Function1[/* xs */ js.Array[A], Double] = js.native
  @JSImport("prelude-ls", "elemIndex")
  @js.native
  def elemIndex[A](x: A, xs: js.Array[A]): Double = js.native
  
  @JSImport("prelude-ls", "elemIndices")
  @js.native
  def elemIndices[A](x: A): js.Function1[/* xs */ js.Array[A], js.Array[Double]] = js.native
  @JSImport("prelude-ls", "elemIndices")
  @js.native
  def elemIndices[A](x: A, xs: js.Array[A]): js.Array[Double] = js.native
  
  @JSImport("prelude-ls", "empty")
  @js.native
  def empty(str: String): Boolean = js.native
  @JSImport("prelude-ls", "empty")
  @js.native
  def empty[A](`object`: js.Any): Boolean = js.native
  @JSImport("prelude-ls", "empty")
  @js.native
  def empty[A](xs: js.Array[A]): Boolean = js.native
  
  @JSImport("prelude-ls", "even")
  @js.native
  def even(x: Double): Boolean = js.native
  
  @JSImport("prelude-ls", "exp")
  @js.native
  def exp(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "filter")
  @js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "filter")
  @js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  @JSImport("prelude-ls", "filter")
  @js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  @JSImport("prelude-ls", "filter")
  @js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "find")
  @js.native
  def find[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "find")
  @js.native
  def find[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): A = js.native
  @JSImport("prelude-ls", "find")
  @js.native
  def find[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): A = js.native
  @JSImport("prelude-ls", "find")
  @js.native
  def find[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "findIndex")
  @js.native
  def findIndex[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Double] = js.native
  @JSImport("prelude-ls", "findIndex")
  @js.native
  def findIndex[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Double = js.native
  
  @JSImport("prelude-ls", "findIndices")
  @js.native
  def findIndices[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[Double]] = js.native
  @JSImport("prelude-ls", "findIndices")
  @js.native
  def findIndices[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[Double] = js.native
  
  @JSImport("prelude-ls", "fix")
  @js.native
  def fix(f: js.Function): js.Function = js.native
  
  @JSImport("prelude-ls", "flatten")
  @js.native
  def flatten(xs: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("prelude-ls", "flip")
  @js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = js.native
  @JSImport("prelude-ls", "flip")
  @js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B): js.Function1[/* x */ A, C] = js.native
  @JSImport("prelude-ls", "flip")
  @js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B, x: A): C = js.native
  
  @JSImport("prelude-ls", "floor")
  @js.native
  def floor(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "fold")
  @js.native
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]] = js.native
  @JSImport("prelude-ls", "fold")
  @js.native
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], A] = js.native
  @JSImport("prelude-ls", "fold")
  @js.native
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): A = js.native
  
  @JSImport("prelude-ls", "fold1")
  @js.native
  def fold1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "fold1")
  @js.native
  def fold1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "foldl")
  @js.native
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]] = js.native
  @JSImport("prelude-ls", "foldl")
  @js.native
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], A] = js.native
  @JSImport("prelude-ls", "foldl")
  @js.native
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): A = js.native
  
  @JSImport("prelude-ls", "foldl1")
  @js.native
  def foldl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "foldl1")
  @js.native
  def foldl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "foldr")
  @js.native
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]]): js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], B]] = js.native
  @JSImport("prelude-ls", "foldr")
  @js.native
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B): js.Function1[/* xs */ js.Array[A], B] = js.native
  @JSImport("prelude-ls", "foldr")
  @js.native
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B, xs: js.Array[A]): B = js.native
  
  @JSImport("prelude-ls", "foldr1")
  @js.native
  def foldr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "foldr1")
  @js.native
  def foldr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "gcd")
  @js.native
  def gcd(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "gcd")
  @js.native
  def gcd(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "groupBy")
  @js.native
  def groupBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], _] = js.native
  @JSImport("prelude-ls", "groupBy")
  @js.native
  def groupBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = js.native
  
  @JSImport("prelude-ls", "head")
  @js.native
  def head[A](xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "id")
  @js.native
  def id[A](x: A): A = js.native
  
  @JSImport("prelude-ls", "initial")
  @js.native
  def initial[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "intersection")
  @js.native
  def intersection[A](xss: js.Array[A]*): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "isItNaN")
  @js.native
  def isItNaN(x: Double): Boolean = js.native
  
  @JSImport("prelude-ls", "isType")
  @js.native
  def isType[A](`type`: String): js.Function1[/* x */ A, Boolean] = js.native
  @JSImport("prelude-ls", "isType")
  @js.native
  def isType[A](`type`: String, x: A): Boolean = js.native
  
  @JSImport("prelude-ls", "join")
  @js.native
  def join(separator: String): js.Function1[/* xs */ js.Array[String], String] = js.native
  @JSImport("prelude-ls", "join")
  @js.native
  def join(separator: String, xs: js.Array[String]): String = js.native
  
  @JSImport("prelude-ls", "keys")
  @js.native
  def keys[A](`object`: NumberDictionary[A]): js.Array[Double] = js.native
  @JSImport("prelude-ls", "keys")
  @js.native
  def keys[A](`object`: StringDictionary[A]): js.Array[String] = js.native
  
  @JSImport("prelude-ls", "last")
  @js.native
  def last[A](xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "lcm")
  @js.native
  def lcm(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "lcm")
  @js.native
  def lcm(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "lines")
  @js.native
  def lines(str: String): js.Array[String] = js.native
  
  @JSImport("prelude-ls", "listsToObj")
  @js.native
  def listsToObj[A](keys: js.Array[Double | String]): js.Function1[/* values */ js.Array[A], StringDictionary[A]] = js.native
  @JSImport("prelude-ls", "listsToObj")
  @js.native
  def listsToObj[A](keys: js.Array[Double], values: js.Array[A]): NumberDictionary[A] = js.native
  @JSImport("prelude-ls", "listsToObj")
  @js.native
  def listsToObj_A_StringDictionary[A](keys: js.Array[String], values: js.Array[A]): StringDictionary[A] = js.native
  
  @JSImport("prelude-ls", "ln")
  @js.native
  def ln(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "map")
  @js.native
  def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  @JSImport("prelude-ls", "map")
  @js.native
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: NumberDictionary[A]): NumberDictionary[B] = js.native
  @JSImport("prelude-ls", "map")
  @js.native
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: StringDictionary[A]): StringDictionary[B] = js.native
  @JSImport("prelude-ls", "map")
  @js.native
  def map[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  
  @JSImport("prelude-ls", "max")
  @js.native
  def max[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = js.native
  @JSImport("prelude-ls", "max")
  @js.native
  def max[Comparable](x: Comparable, y: Comparable): Comparable = js.native
  
  @JSImport("prelude-ls", "maximum")
  @js.native
  def maximum[A](xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "maximumBy")
  @js.native
  def maximumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "maximumBy")
  @js.native
  def maximumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "mean")
  @js.native
  def mean(xs: js.Array[Double]): Double = js.native
  
  @JSImport("prelude-ls", "min")
  @js.native
  def min[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = js.native
  @JSImport("prelude-ls", "min")
  @js.native
  def min[Comparable](x: Comparable, y: Comparable): Comparable = js.native
  
  @JSImport("prelude-ls", "minimum")
  @js.native
  def minimum[A](xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "minimumBy")
  @js.native
  def minimumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = js.native
  @JSImport("prelude-ls", "minimumBy")
  @js.native
  def minimumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = js.native
  
  @JSImport("prelude-ls", "mod")
  @js.native
  def mod(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "mod")
  @js.native
  def mod(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "negate")
  @js.native
  def negate(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "objToLists")
  @js.native
  def objToLists[A](`object`: NumberDictionary[A]): js.Tuple2[js.Array[Double], js.Array[A]] = js.native
  @JSImport("prelude-ls", "objToLists")
  @js.native
  def objToLists[A](`object`: StringDictionary[A]): js.Tuple2[js.Array[String], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "objToPairs")
  @js.native
  def objToPairs[A](`object`: NumberDictionary[A]): js.Array[js.Tuple2[Double, A]] = js.native
  @JSImport("prelude-ls", "objToPairs")
  @js.native
  def objToPairs[A](`object`: StringDictionary[A]): js.Array[js.Tuple2[String, A]] = js.native
  
  @JSImport("prelude-ls", "odd")
  @js.native
  def odd(x: Double): Boolean = js.native
  
  @JSImport("prelude-ls", "orList")
  @js.native
  def orList[A](xs: js.Array[A]): Boolean = js.native
  
  @JSImport("prelude-ls", "over")
  @js.native
  def over[A, B, C](f: js.Function1[/* x */ B, js.Function1[/* y */ B, C]]): js.Function1[
    /* g */ js.Function1[/* x */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ] = js.native
  @JSImport("prelude-ls", "over")
  @js.native
  def over[A, B, C](f: js.Function1[/* x */ B, js.Function1[/* y */ B, C]], g: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, js.Function1[/* y */ A, C]] = js.native
  @JSImport("prelude-ls", "over")
  @js.native
  def over[A, B, C](
    f: js.Function1[/* x */ B, js.Function1[/* y */ B, C | (js.Function2[/* x */ B, /* y */ B, C])]],
    g: js.Function1[/* x */ A, B],
    x: A,
    y: A
  ): C = js.native
  @JSImport("prelude-ls", "over")
  @js.native
  def over[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C]): js.Function1[/* g */ js.Function1[/* x */ A, B], js.Function2[/* x */ A, /* y */ A, C]] = js.native
  @JSImport("prelude-ls", "over")
  @js.native
  def over[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* x */ A, B]): js.Function2[/* x */ A, /* y */ A, C] = js.native
  @JSImport("prelude-ls", "over")
  @js.native
  def over[A, B, C](
    f: js.Function2[/* x */ B, /* y */ B, C | (js.Function1[/* x */ B, js.Function1[/* y */ B, C]])],
    g: js.Function1[/* x */ A, B],
    x: A
  ): js.Function1[/* y */ A, C] = js.native
  
  @JSImport("prelude-ls", "pairsToObj")
  @js.native
  def pairsToObj[A](`object`: js.Array[js.Tuple2[Double, A]]): NumberDictionary[A] = js.native
  @JSImport("prelude-ls", "pairsToObj")
  @js.native
  def pairsToObj_A_StringDictionary[A](`object`: js.Array[js.Tuple2[String, A]]): StringDictionary[A] = js.native
  
  @JSImport("prelude-ls", "partition")
  @js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  @JSImport("prelude-ls", "partition")
  @js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): js.Tuple2[NumberDictionary[A], NumberDictionary[A]] = js.native
  @JSImport("prelude-ls", "partition")
  @js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): js.Tuple2[StringDictionary[A], StringDictionary[A]] = js.native
  @JSImport("prelude-ls", "partition")
  @js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "pi")
  @js.native
  def pi: Double = js.native
  @scala.inline
  def pi_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pi")(x.asInstanceOf[js.Any])
  
  @JSImport("prelude-ls", "pow")
  @js.native
  def pow(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "pow")
  @js.native
  def pow(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "product")
  @js.native
  def product(xs: js.Array[Double]): Double = js.native
  
  @JSImport("prelude-ls", "quot")
  @js.native
  def quot(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "quot")
  @js.native
  def quot(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "recip")
  @js.native
  def recip(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "reject")
  @js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "reject")
  @js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  @JSImport("prelude-ls", "reject")
  @js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  @JSImport("prelude-ls", "reject")
  @js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "rem")
  @js.native
  def rem(x: Double): js.Function1[/* y */ Double, Double] = js.native
  @JSImport("prelude-ls", "rem")
  @js.native
  def rem(x: Double, y: Double): Double = js.native
  
  @JSImport("prelude-ls", "repeat")
  @js.native
  def repeat(n: Double): js.Function1[/* str */ String, String] = js.native
  @JSImport("prelude-ls", "repeat")
  @js.native
  def repeat(n: Double, str: String): String = js.native
  
  @JSImport("prelude-ls", "replicate")
  @js.native
  def replicate[A](n: Double): js.Function1[/* x */ A, js.Array[A]] = js.native
  @JSImport("prelude-ls", "replicate")
  @js.native
  def replicate[A](n: Double, x: A): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "reverse")
  @js.native
  def reverse(str: String): String = js.native
  @JSImport("prelude-ls", "reverse")
  @js.native
  def reverse[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "round")
  @js.native
  def round(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "scan")
  @js.native
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]] = js.native
  @JSImport("prelude-ls", "scan")
  @js.native
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], js.Array[A]] = js.native
  @JSImport("prelude-ls", "scan")
  @js.native
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "scan1")
  @js.native
  def scan1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "scan1")
  @js.native
  def scan1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "scanl")
  @js.native
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]] = js.native
  @JSImport("prelude-ls", "scanl")
  @js.native
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], js.Array[A]] = js.native
  @JSImport("prelude-ls", "scanl")
  @js.native
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "scanl1")
  @js.native
  def scanl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "scanl1")
  @js.native
  def scanl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "scanr")
  @js.native
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]]): js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], js.Array[B]]] = js.native
  @JSImport("prelude-ls", "scanr")
  @js.native
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  @JSImport("prelude-ls", "scanr")
  @js.native
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B, xs: js.Array[A]): js.Array[B] = js.native
  
  @JSImport("prelude-ls", "scanr1")
  @js.native
  def scanr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "scanr1")
  @js.native
  def scanr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "signum")
  @js.native
  def signum(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "sin")
  @js.native
  def sin(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "slice")
  @js.native
  def slice(x: Double): js.Function1[/* y */ Double, js.Function1[/* str */ String, String]] = js.native
  @JSImport("prelude-ls", "slice")
  @js.native
  def slice(x: Double, y: Double): js.Function1[/* str */ String, String] = js.native
  @JSImport("prelude-ls", "slice")
  @js.native
  def slice(x: Double, y: Double, str: String): String = js.native
  @JSImport("prelude-ls", "slice")
  @js.native
  def slice[A](x: Double, y: Double, xs: js.Array[A]): js.Array[A] = js.native
  @JSImport("prelude-ls", "slice")
  @js.native
  def slice_A[A](x: Double): js.Function1[/* y */ Double, js.Function1[/* xs */ js.Array[A], js.Array[A]]] = js.native
  @JSImport("prelude-ls", "slice")
  @js.native
  def slice_A[A](x: Double, y: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "sort")
  @js.native
  def sort[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "sortBy")
  @js.native
  def sortBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "sortBy")
  @js.native
  def sortBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "sortWith")
  @js.native
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, Double]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "sortWith")
  @js.native
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, Double]], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "span")
  @js.native
  def span(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
  @JSImport("prelude-ls", "span")
  @js.native
  def span(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
  @JSImport("prelude-ls", "span")
  @js.native
  def span[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "span")
  @js.native
  def span_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  
  @JSImport("prelude-ls", "split")
  @js.native
  def split(separator: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  @JSImport("prelude-ls", "split")
  @js.native
  def split(separator: String, str: String): js.Array[String] = js.native
  
  @JSImport("prelude-ls", "splitAt")
  @js.native
  def splitAt(n: Double): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
  @JSImport("prelude-ls", "splitAt")
  @js.native
  def splitAt(n: Double, str: String): js.Tuple2[String, String] = js.native
  @JSImport("prelude-ls", "splitAt")
  @js.native
  def splitAt[A](n: Double, xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "splitAt")
  @js.native
  def splitAt_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  
  @JSImport("prelude-ls", "sqrt")
  @js.native
  def sqrt(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "sum")
  @js.native
  def sum(xs: js.Array[Double]): Double = js.native
  
  @JSImport("prelude-ls", "tail")
  @js.native
  def tail[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "take")
  @js.native
  def take(n: Double): js.Function1[/* str */ String, String] = js.native
  @JSImport("prelude-ls", "take")
  @js.native
  def take(n: Double, str: String): String = js.native
  @JSImport("prelude-ls", "take")
  @js.native
  def take[A](n: Double, xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "takeWhile")
  @js.native
  def takeWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
  @JSImport("prelude-ls", "takeWhile")
  @js.native
  def takeWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
  @JSImport("prelude-ls", "takeWhile")
  @js.native
  def takeWhile[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSImport("prelude-ls", "takeWhile")
  @js.native
  def takeWhile_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "take")
  @js.native
  def take_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "tan")
  @js.native
  def tan(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "tau")
  @js.native
  def tau: Double = js.native
  @scala.inline
  def tau_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tau")(x.asInstanceOf[js.Any])
  
  @JSImport("prelude-ls", "truncate")
  @js.native
  def truncate(x: Double): Double = js.native
  
  @JSImport("prelude-ls", "unchars")
  @js.native
  def unchars(xs: js.Array[String]): String = js.native
  
  @JSImport("prelude-ls", "unfoldr")
  @js.native
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | Unit]): js.Function1[/* x */ B, js.Array[A]] = js.native
  @JSImport("prelude-ls", "unfoldr")
  @js.native
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | Unit], x: B): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "union")
  @js.native
  def union[A](xss: js.Array[A]*): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "unique")
  @js.native
  def unique[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "uniqueBy")
  @js.native
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSImport("prelude-ls", "uniqueBy")
  @js.native
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "unlines")
  @js.native
  def unlines(xs: js.Array[String]): String = js.native
  
  @JSImport("prelude-ls", "unwords")
  @js.native
  def unwords(xs: js.Array[String]): String = js.native
  
  @JSImport("prelude-ls", "values")
  @js.native
  def values[A](`object`: NumberDictionary[A]): js.Array[A] = js.native
  @JSImport("prelude-ls", "values")
  @js.native
  def values[A](`object`: StringDictionary[A]): js.Array[A] = js.native
  
  @JSImport("prelude-ls", "words")
  @js.native
  def words(str: String): js.Array[String] = js.native
  
  @JSImport("prelude-ls", "zip")
  @js.native
  def zip[A, B](xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[js.Tuple2[A, B]]] = js.native
  @JSImport("prelude-ls", "zip")
  @js.native
  def zip[A, B](xs: js.Array[A], ys: js.Array[B]): js.Array[js.Tuple2[A, B]] = js.native
  
  @JSImport("prelude-ls", "zipAll")
  @js.native
  def zipAll[A](xss: js.Array[A]*): js.Array[js.Array[A]] = js.native
  
  @JSImport("prelude-ls", "zipAllWith")
  @js.native
  def zipAllWith[A, B](f: js.Function1[/* repeated */ A, B], xss: js.Array[A]*): js.Array[B] = js.native
  
  @JSImport("prelude-ls", "zipWith")
  @js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* xs */ js.Array[A], js.Function1[/* ys */ js.Array[B], js.Array[C]]] = js.native
  @JSImport("prelude-ls", "zipWith")
  @js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[C]] = js.native
  @JSImport("prelude-ls", "zipWith")
  @js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A], ys: js.Array[B]): js.Array[C] = js.native
}
