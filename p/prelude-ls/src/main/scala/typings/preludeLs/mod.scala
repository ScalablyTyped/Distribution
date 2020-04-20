package typings.preludeLs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prelude-ls", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var pi: Double = js.native
  var tau: Double = js.native
  def abs(x: Double): Double = js.native
  def acos(x: Double): Double = js.native
  def all[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Boolean] = js.native
  def all[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Boolean = js.native
  def andList[A](xs: js.Array[A]): Boolean = js.native
  def any[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Boolean] = js.native
  def any[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Boolean = js.native
  @JSName("apply")
  def apply[A, B](f: js.Function1[/* repeated */ A, B]): js.Function1[/* args */ js.Array[A], B] = js.native
  @JSName("apply")
  def apply[A, B](f: js.Function1[/* repeated */ A, B], args: js.Array[A]): B = js.native
  def asin(x: Double): Double = js.native
  def at[A](n: Double): js.Function1[/* xs */ js.Array[A], A] = js.native
  def at[A](n: Double, xs: js.Array[A]): A = js.native
  def atan(x: Double): Double = js.native
  def atan2(x: Double, y: Double): Double = js.native
  def breakList[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def breakList[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  def breakStr(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
  def breakStr(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
  def camelize(str: String): String = js.native
  def capitalize(str: String): String = js.native
  def ceiling(x: Double): Double = js.native
  def chars(str: String): js.Array[String] = js.native
  def compact[A](`object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  def compact[A](`object`: StringDictionary[A]): StringDictionary[A] = js.native
  def compact[A](xs: js.Array[A]): js.Array[A] = js.native
  def concat[A](xss: js.Array[js.Array[A]]): js.Array[A] = js.native
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  def cos(x: Double): Double = js.native
  def countBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], _] = js.native
  def countBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = js.native
  def curry(f: js.Function): js.Function = js.native
  def dasherize(str: String): String = js.native
  def difference[A](xss: js.Array[A]*): js.Array[A] = js.native
  def div(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def div(x: Double, y: Double): Double = js.native
  def drop(n: Double): js.Function1[/* str */ String, String] = js.native
  def drop(n: Double, str: String): String = js.native
  def drop[A](n: Double, xs: js.Array[A]): js.Array[A] = js.native
  def dropWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
  def dropWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
  def dropWhile[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSName("dropWhile")
  def dropWhile_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSName("drop")
  def drop_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def each[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def each[A](f: js.Function1[/* x */ A, Unit], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  def each[A](f: js.Function1[/* x */ A, Unit], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  def each[A](f: js.Function1[/* x */ A, Unit], xs: js.Array[A]): js.Array[A] = js.native
  def elemIndex[A](x: A): js.Function1[/* xs */ js.Array[A], Double] = js.native
  def elemIndex[A](x: A, xs: js.Array[A]): Double = js.native
  def elemIndices[A](x: A): js.Function1[/* xs */ js.Array[A], js.Array[Double]] = js.native
  def elemIndices[A](x: A, xs: js.Array[A]): js.Array[Double] = js.native
  def empty(str: String): Boolean = js.native
  def empty[A](`object`: js.Any): Boolean = js.native
  def empty[A](xs: js.Array[A]): Boolean = js.native
  def even(x: Double): Boolean = js.native
  def exp(x: Double): Double = js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  def filter[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  def find[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def find[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): A = js.native
  def find[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): A = js.native
  def find[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): A = js.native
  def findIndex[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], Double] = js.native
  def findIndex[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): Double = js.native
  def findIndices[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[Double]] = js.native
  def findIndices[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[Double] = js.native
  def fix(f: js.Function): js.Function = js.native
  def flatten(xs: js.Array[_]): js.Array[_] = js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B): js.Function1[/* x */ A, C] = js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B, x: A): C = js.native
  def floor(x: Double): Double = js.native
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]] = js.native
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], A] = js.native
  def fold[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): A = js.native
  def fold1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def fold1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = js.native
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], A]] = js.native
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], A] = js.native
  def foldl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): A = js.native
  def foldl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def foldl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = js.native
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]]): js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], B]] = js.native
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B): js.Function1[/* xs */ js.Array[A], B] = js.native
  def foldr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B, xs: js.Array[A]): B = js.native
  def foldr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def foldr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): A = js.native
  def gcd(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def gcd(x: Double, y: Double): Double = js.native
  def groupBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], _] = js.native
  def groupBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = js.native
  def head[A](xs: js.Array[A]): A = js.native
  def id[A](x: A): A = js.native
  def initial[A](xs: js.Array[A]): js.Array[A] = js.native
  def intersection[A](xss: js.Array[A]*): js.Array[A] = js.native
  def isItNaN(x: Double): Boolean = js.native
  def isType[A](`type`: String): js.Function1[/* x */ A, Boolean] = js.native
  def isType[A](`type`: String, x: A): Boolean = js.native
  def join(separator: String): js.Function1[/* xs */ js.Array[String], String] = js.native
  def join(separator: String, xs: js.Array[String]): String = js.native
  def keys[A](`object`: NumberDictionary[A]): js.Array[Double] = js.native
  def keys[A](`object`: StringDictionary[A]): js.Array[String] = js.native
  def last[A](xs: js.Array[A]): A = js.native
  def lcm(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def lcm(x: Double, y: Double): Double = js.native
  def lines(str: String): js.Array[String] = js.native
  def listsToObj[A](keys: js.Array[Double | String]): js.Function1[/* values */ js.Array[A], StringDictionary[A]] = js.native
  def listsToObj[A](keys: js.Array[Double], values: js.Array[A]): NumberDictionary[A] = js.native
  @JSName("listsToObj")
  def listsToObj_A_StringDictionary[A](keys: js.Array[String], values: js.Array[A]): StringDictionary[A] = js.native
  def ln(x: Double): Double = js.native
  def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: NumberDictionary[A]): NumberDictionary[B] = js.native
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: StringDictionary[A]): StringDictionary[B] = js.native
  def map[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  def max[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = js.native
  def max[Comparable](x: Comparable, y: Comparable): Comparable = js.native
  def maximum[A](xs: js.Array[A]): A = js.native
  def maximumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def maximumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = js.native
  def mean(xs: js.Array[Double]): Double = js.native
  def min[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = js.native
  def min[Comparable](x: Comparable, y: Comparable): Comparable = js.native
  def minimum[A](xs: js.Array[A]): A = js.native
  def minimumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def minimumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = js.native
  def mod(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def mod(x: Double, y: Double): Double = js.native
  def negate(x: Double): Double = js.native
  def objToLists[A](`object`: NumberDictionary[A]): js.Tuple2[js.Array[Double], js.Array[A]] = js.native
  def objToLists[A](`object`: StringDictionary[A]): js.Tuple2[js.Array[String], js.Array[A]] = js.native
  def objToPairs[A](`object`: NumberDictionary[A]): js.Array[js.Tuple2[Double, A]] = js.native
  def objToPairs[A](`object`: StringDictionary[A]): js.Array[js.Tuple2[String, A]] = js.native
  def odd(x: Double): Boolean = js.native
  def orList[A](xs: js.Array[A]): Boolean = js.native
  def over[A, B, C](f: js.Function1[/* x */ B, js.Function1[/* y */ B, C]]): js.Function1[
    /* g */ js.Function1[/* x */ A, B], 
    js.Function1[/* x */ A, js.Function1[/* y */ A, C]]
  ] = js.native
  def over[A, B, C](f: js.Function1[/* x */ B, js.Function1[/* y */ B, C]], g: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, js.Function1[/* y */ A, C]] = js.native
  def over[A, B, C](
    f: js.Function1[/* x */ B, js.Function1[/* y */ B, C | (js.Function2[/* x */ B, /* y */ B, C])]],
    g: js.Function1[/* x */ A, B],
    x: A,
    y: A
  ): C = js.native
  def over[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C]): js.Function1[/* g */ js.Function1[/* x */ A, B], js.Function2[/* x */ A, /* y */ A, C]] = js.native
  def over[A, B, C](f: js.Function2[/* x */ B, /* y */ B, C], g: js.Function1[/* x */ A, B]): js.Function2[/* x */ A, /* y */ A, C] = js.native
  def over[A, B, C](
    f: js.Function2[/* x */ B, /* y */ B, C | (js.Function1[/* x */ B, js.Function1[/* y */ B, C]])],
    g: js.Function1[/* x */ A, B],
    x: A
  ): js.Function1[/* y */ A, C] = js.native
  def pairsToObj[A](`object`: js.Array[js.Tuple2[Double, A]]): NumberDictionary[A] = js.native
  @JSName("pairsToObj")
  def pairsToObj_A_StringDictionary[A](`object`: js.Array[js.Tuple2[String, A]]): StringDictionary[A] = js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): js.Tuple2[NumberDictionary[A], NumberDictionary[A]] = js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): js.Tuple2[StringDictionary[A], StringDictionary[A]] = js.native
  def partition[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  def pow(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def pow(x: Double, y: Double): Double = js.native
  def product(xs: js.Array[Double]): Double = js.native
  def quot(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def quot(x: Double, y: Double): Double = js.native
  def recip(x: Double): Double = js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  def reject[A](f: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  def rem(x: Double): js.Function1[/* y */ Double, Double] = js.native
  def rem(x: Double, y: Double): Double = js.native
  def repeat(n: Double): js.Function1[/* str */ String, String] = js.native
  def repeat(n: Double, str: String): String = js.native
  def replicate[A](n: Double): js.Function1[/* x */ A, js.Array[A]] = js.native
  def replicate[A](n: Double, x: A): js.Array[A] = js.native
  def reverse(str: String): String = js.native
  def reverse[A](xs: js.Array[A]): js.Array[A] = js.native
  def round(x: Double): Double = js.native
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]] = js.native
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], js.Array[A]] = js.native
  def scan[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): js.Array[A] = js.native
  def scan1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def scan1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = js.native
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]]): js.Function1[/* memo */ A, js.Function1[/* xs */ js.Array[B], js.Array[A]]] = js.native
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A): js.Function1[/* xs */ js.Array[B], js.Array[A]] = js.native
  def scanl[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, A]], memo: A, xs: js.Array[B]): js.Array[A] = js.native
  def scanl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def scanl1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = js.native
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]]): js.Function1[/* memo */ B, js.Function1[/* xs */ js.Array[A], js.Array[B]]] = js.native
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  def scanr[A, B](f: js.Function1[/* x */ A, js.Function1[/* y */ B, B]], memo: B, xs: js.Array[A]): js.Array[B] = js.native
  def scanr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def scanr1[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, A]], xs: js.Array[A]): js.Array[A] = js.native
  def signum(x: Double): Double = js.native
  def sin(x: Double): Double = js.native
  def slice(x: Double): js.Function1[/* y */ Double, js.Function1[/* str */ String, String]] = js.native
  def slice(x: Double, y: Double): js.Function1[/* str */ String, String] = js.native
  def slice(x: Double, y: Double, str: String): String = js.native
  def slice[A](x: Double, y: Double, xs: js.Array[A]): js.Array[A] = js.native
  @JSName("slice")
  def slice_A[A](x: Double): js.Function1[/* y */ Double, js.Function1[/* xs */ js.Array[A], js.Array[A]]] = js.native
  @JSName("slice")
  def slice_A[A](x: Double, y: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def sort[A](xs: js.Array[A]): js.Array[A] = js.native
  def sortBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def sortBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = js.native
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, Double]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, Double]], xs: js.Array[A]): js.Array[A] = js.native
  def span(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
  def span(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
  def span[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  @JSName("span")
  def span_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def split(separator: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def split(separator: String, str: String): js.Array[String] = js.native
  def splitAt(n: Double): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
  def splitAt(n: Double, str: String): js.Tuple2[String, String] = js.native
  def splitAt[A](n: Double, xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  @JSName("splitAt")
  def splitAt_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def sqrt(x: Double): Double = js.native
  def sum(xs: js.Array[Double]): Double = js.native
  def tail[A](xs: js.Array[A]): js.Array[A] = js.native
  def take(n: Double): js.Function1[/* str */ String, String] = js.native
  def take(n: Double, str: String): String = js.native
  def take[A](n: Double, xs: js.Array[A]): js.Array[A] = js.native
  def takeWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
  def takeWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
  def takeWhile[A](p: js.Function1[/* x */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSName("takeWhile")
  def takeWhile_A[A](p: js.Function1[/* x */ A, Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSName("take")
  def take_A[A](n: Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def tan(x: Double): Double = js.native
  def truncate(x: Double): Double = js.native
  def unchars(xs: js.Array[String]): String = js.native
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | Unit]): js.Function1[/* x */ B, js.Array[A]] = js.native
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | Unit], x: B): js.Array[A] = js.native
  def union[A](xss: js.Array[A]*): js.Array[A] = js.native
  def unique[A](xs: js.Array[A]): js.Array[A] = js.native
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = js.native
  def unlines(xs: js.Array[String]): String = js.native
  def unwords(xs: js.Array[String]): String = js.native
  def values[A](`object`: NumberDictionary[A]): js.Array[A] = js.native
  def values[A](`object`: StringDictionary[A]): js.Array[A] = js.native
  def words(str: String): js.Array[String] = js.native
  def zip[A, B](xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[js.Tuple2[A, B]]] = js.native
  def zip[A, B](xs: js.Array[A], ys: js.Array[B]): js.Array[js.Tuple2[A, B]] = js.native
  def zipAll[A](xss: js.Array[A]*): js.Array[js.Array[A]] = js.native
  def zipAllWith[A, B](f: js.Function1[/* repeated */ A, B], xss: js.Array[A]*): js.Array[B] = js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* xs */ js.Array[A], js.Function1[/* ys */ js.Array[B], js.Array[C]]] = js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[C]] = js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A], ys: js.Array[B]): js.Array[C] = js.native
  @js.native
  object Obj extends js.Object {
    def compact[A](`object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    def compact[A](`object`: StringDictionary[A]): StringDictionary[A] = js.native
    def each[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = js.native
    def each[A](f: js.Function1[/* x */ A, Unit], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    def each[A](f: js.Function1[/* x */ A, Unit], `object`: StringDictionary[A]): StringDictionary[A] = js.native
    def empty[A](`object`: js.Any): Boolean = js.native
    def filter[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = js.native
    def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    def filter[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
    def find[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], A] = js.native
    def find[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): A = js.native
    def find[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): A = js.native
    def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* object */ StringDictionary[A], StringDictionary[B]] = js.native
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: NumberDictionary[A]): NumberDictionary[B] = js.native
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: StringDictionary[A]): StringDictionary[B] = js.native
    def partition[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[
        /* object */ StringDictionary[A], 
        js.Tuple2[StringDictionary[A], StringDictionary[A]]
      ] = js.native
    def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): js.Tuple2[NumberDictionary[A], NumberDictionary[A]] = js.native
    def partition[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): js.Tuple2[StringDictionary[A], StringDictionary[A]] = js.native
    def reject[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* object */ StringDictionary[A], StringDictionary[A]] = js.native
    def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: NumberDictionary[A]): NumberDictionary[A] = js.native
    def reject[A](f: js.Function1[/* x */ A, Boolean], `object`: StringDictionary[A]): StringDictionary[A] = js.native
  }
  
  @js.native
  object Str extends js.Object {
    def breakStr(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
    def breakStr(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
    def drop(n: Double): js.Function1[/* str */ String, String] = js.native
    def drop(n: Double, str: String): String = js.native
    def dropWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
    def dropWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
    def empty(str: String): Boolean = js.native
    def reverse(str: String): String = js.native
    def slice(x: Double): js.Function1[/* y */ Double, js.Function1[/* str */ String, String]] = js.native
    def slice(x: Double, y: Double): js.Function1[/* str */ String, String] = js.native
    def slice(x: Double, y: Double, str: String): String = js.native
    def span(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
    def span(f: js.Function1[/* str */ String, Boolean], str: String): js.Tuple2[String, String] = js.native
    def splitAt(n: Double): js.Function1[/* str */ String, js.Tuple2[String, String]] = js.native
    def splitAt(n: Double, str: String): js.Tuple2[String, String] = js.native
    def take(n: Double): js.Function1[/* str */ String, String] = js.native
    def take(n: Double, str: String): String = js.native
    def takeWhile(f: js.Function1[/* str */ String, Boolean]): js.Function1[/* str */ String, String] = js.native
    def takeWhile(f: js.Function1[/* str */ String, Boolean], str: String): String = js.native
  }
  
}

