package typings
package preludeDashLsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prelude-ls", JSImport.Namespace)
@js.native
object preludeDashLsMod extends js.Object {
  var pi: scala.Double = js.native
  var tau: scala.Double = js.native
  def abs(x: scala.Double): scala.Double = js.native
  def acos(x: scala.Double): scala.Double = js.native
  def all[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], scala.Boolean] = js.native
  def all[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): scala.Boolean = js.native
  def andList[A](xs: js.Array[A]): scala.Boolean = js.native
  def any[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], scala.Boolean] = js.native
  def any[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): scala.Boolean = js.native
  @JSName("apply")
  def apply[A, B](f: js.Function1[/* repeated */A, B]): js.Function1[/* args */ js.Array[A], B] = js.native
  @JSName("apply")
  def apply[A, B](f: js.Function1[/* repeated */A, B], args: js.Array[A]): B = js.native
  def asin(x: scala.Double): scala.Double = js.native
  def at[A](n: scala.Double): js.Function1[/* xs */ js.Array[A], A] = js.native
  def at[A](n: scala.Double, xs: js.Array[A]): A = js.native
  def atan(x: scala.Double): scala.Double = js.native
  def atan2(x: scala.Double, y: scala.Double): scala.Double = js.native
  def breakList[A](p: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def breakList[A](p: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  def breakStr(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def breakStr(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def camelize(str: java.lang.String): java.lang.String = js.native
  def capitalize(str: java.lang.String): java.lang.String = js.native
  def ceiling(x: scala.Double): scala.Double = js.native
  def chars(str: java.lang.String): js.Array[java.lang.String] = js.native
  def compact[A](`object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
  def compact[A](`object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  def compact[A](xs: js.Array[A]): js.Array[A] = js.native
  def concat[A](xss: js.Array[js.Array[A]]): js.Array[A] = js.native
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  def concatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  def cos(x: scala.Double): scala.Double = js.native
  def countBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], _] = js.native
  def countBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = js.native
  def curry(f: js.Function): js.Function = js.native
  def dasherize(str: java.lang.String): java.lang.String = js.native
  def difference[A](xss: js.Array[A]*): js.Array[A] = js.native
  def div(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def div(x: scala.Double, y: scala.Double): scala.Double = js.native
  def drop(n: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def drop(n: scala.Double, str: java.lang.String): java.lang.String = js.native
  def drop[A](n: scala.Double, xs: js.Array[A]): js.Array[A] = js.native
  def dropWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def dropWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): java.lang.String = js.native
  def dropWhile[A](p: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSName("dropWhile")
  def dropWhile_A[A](p: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSName("drop")
  def drop_A[A](n: scala.Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def each[A](f: js.Function1[/* x */ A, scala.Unit]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def each[A](f: js.Function1[/* x */ A, scala.Unit], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
  def each[A](f: js.Function1[/* x */ A, scala.Unit], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  def each[A](f: js.Function1[/* x */ A, scala.Unit], xs: js.Array[A]): js.Array[A] = js.native
  def elemIndex[A](x: A): js.Function1[/* xs */ js.Array[A], scala.Double] = js.native
  def elemIndex[A](x: A, xs: js.Array[A]): scala.Double = js.native
  def elemIndices[A](x: A): js.Function1[/* xs */ js.Array[A], js.Array[scala.Double]] = js.native
  def elemIndices[A](x: A, xs: js.Array[A]): js.Array[scala.Double] = js.native
  def empty(str: java.lang.String): scala.Boolean = js.native
  def empty[A](`object`: js.Any): scala.Boolean = js.native
  def empty[A](xs: js.Array[A]): scala.Boolean = js.native
  def even(x: scala.Double): scala.Boolean = js.native
  def exp(x: scala.Double): scala.Double = js.native
  def filter[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def filter[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
  def filter[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  def filter[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Array[A] = js.native
  def find[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def find[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): A = js.native
  def find[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): A = js.native
  def find[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): A = js.native
  def findIndex[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], scala.Double] = js.native
  def findIndex[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): scala.Double = js.native
  def findIndices[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[scala.Double]] = js.native
  def findIndices[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Array[scala.Double] = js.native
  def fix(f: js.Function): js.Function = js.native
  def flatten(xs: js.Array[_]): js.Array[_] = js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* y */ B, js.Function1[/* x */ A, C]] = js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B): js.Function1[/* x */ A, C] = js.native
  def flip[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], y: B, x: A): C = js.native
  def floor(x: scala.Double): scala.Double = js.native
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
  def gcd(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def gcd(x: scala.Double, y: scala.Double): scala.Double = js.native
  def groupBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], _] = js.native
  def groupBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Any = js.native
  def head[A](xs: js.Array[A]): A = js.native
  def id[A](x: A): A = js.native
  def initial[A](xs: js.Array[A]): js.Array[A] = js.native
  def intersection[A](xss: js.Array[A]*): js.Array[A] = js.native
  def isItNaN(x: scala.Double): scala.Boolean = js.native
  def isType[A](`type`: java.lang.String): js.Function1[/* x */ A, scala.Boolean] = js.native
  def isType[A](`type`: java.lang.String, x: A): scala.Boolean = js.native
  def join(separator: java.lang.String): js.Function1[/* xs */ js.Array[java.lang.String], java.lang.String] = js.native
  def join(separator: java.lang.String, xs: js.Array[java.lang.String]): java.lang.String = js.native
  def keys[A](`object`: ScalablyTyped.runtime.NumberDictionary[A]): js.Array[scala.Double] = js.native
  def keys[A](`object`: ScalablyTyped.runtime.StringDictionary[A]): js.Array[java.lang.String] = js.native
  def last[A](xs: js.Array[A]): A = js.native
  def lcm(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def lcm(x: scala.Double, y: scala.Double): scala.Double = js.native
  def lines(str: java.lang.String): js.Array[java.lang.String] = js.native
  def listsToObj[A](keys: js.Array[java.lang.String | scala.Double]): js.Function1[/* values */ js.Array[A], ScalablyTyped.runtime.StringDictionary[A]] = js.native
  def listsToObj[A](keys: js.Array[java.lang.String], values: js.Array[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  @JSName("listsToObj")
  def listsToObj_ANumberDictionary[A](keys: js.Array[scala.Double], values: js.Array[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
  def ln(x: scala.Double): scala.Double = js.native
  def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[B]] = js.native
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[B] = js.native
  def map[A, B](f: js.Function1[/* x */ A, B], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[B] = js.native
  def map[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  def max[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = js.native
  def max[Comparable](x: Comparable, y: Comparable): Comparable = js.native
  def maximum[A](xs: js.Array[A]): A = js.native
  def maximumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def maximumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = js.native
  def mean(xs: js.Array[scala.Double]): scala.Double = js.native
  def min[Comparable](x: Comparable): js.Function1[/* y */ Comparable, Comparable] = js.native
  def min[Comparable](x: Comparable, y: Comparable): Comparable = js.native
  def minimum[A](xs: js.Array[A]): A = js.native
  def minimumBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], A] = js.native
  def minimumBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): A = js.native
  def mod(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def mod(x: scala.Double, y: scala.Double): scala.Double = js.native
  def negate(x: scala.Double): scala.Double = js.native
  def objToLists[A](`object`: ScalablyTyped.runtime.NumberDictionary[A]): js.Tuple2[js.Array[scala.Double], js.Array[A]] = js.native
  def objToLists[A](`object`: ScalablyTyped.runtime.StringDictionary[A]): js.Tuple2[js.Array[java.lang.String], js.Array[A]] = js.native
  def objToPairs[A](`object`: ScalablyTyped.runtime.NumberDictionary[A]): js.Array[js.Tuple2[scala.Double, A]] = js.native
  def objToPairs[A](`object`: ScalablyTyped.runtime.StringDictionary[A]): js.Array[js.Tuple2[java.lang.String, A]] = js.native
  def odd(x: scala.Double): scala.Boolean = js.native
  def orList[A](xs: js.Array[A]): scala.Boolean = js.native
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
  def pairsToObj[A](`object`: js.Array[js.Tuple2[java.lang.String, A]]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  @JSName("pairsToObj")
  def pairsToObj_ANumberDictionary[A](`object`: js.Array[js.Tuple2[scala.Double, A]]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
  def partition[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def partition[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): js.Tuple2[
    ScalablyTyped.runtime.NumberDictionary[A], 
    ScalablyTyped.runtime.NumberDictionary[A]
  ] = js.native
  def partition[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): js.Tuple2[
    ScalablyTyped.runtime.StringDictionary[A], 
    ScalablyTyped.runtime.StringDictionary[A]
  ] = js.native
  def partition[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  def pow(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def pow(x: scala.Double, y: scala.Double): scala.Double = js.native
  def product(xs: js.Array[scala.Double]): scala.Double = js.native
  def quot(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def quot(x: scala.Double, y: scala.Double): scala.Double = js.native
  def recip(x: scala.Double): scala.Double = js.native
  def reject[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def reject[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
  def reject[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  def reject[A](f: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Array[A] = js.native
  def rem(x: scala.Double): js.Function1[/* y */ scala.Double, scala.Double] = js.native
  def rem(x: scala.Double, y: scala.Double): scala.Double = js.native
  def repeat(n: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def repeat(n: scala.Double, str: java.lang.String): java.lang.String = js.native
  def replicate[A](n: scala.Double): js.Function1[/* x */ A, js.Array[A]] = js.native
  def replicate[A](n: scala.Double, x: A): js.Array[A] = js.native
  def reverse(str: java.lang.String): java.lang.String = js.native
  def reverse[A](xs: js.Array[A]): js.Array[A] = js.native
  def round(x: scala.Double): scala.Double = js.native
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
  def signum(x: scala.Double): scala.Double = js.native
  def sin(x: scala.Double): scala.Double = js.native
  def slice(x: scala.Double): js.Function1[/* y */ scala.Double, js.Function1[/* str */ java.lang.String, java.lang.String]] = js.native
  def slice(x: scala.Double, y: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def slice(x: scala.Double, y: scala.Double, str: java.lang.String): java.lang.String = js.native
  def slice[A](x: scala.Double, y: scala.Double, xs: js.Array[A]): js.Array[A] = js.native
  @JSName("slice")
  def slice_A[A](x: scala.Double): js.Function1[/* y */ scala.Double, js.Function1[/* xs */ js.Array[A], js.Array[A]]] = js.native
  @JSName("slice")
  def slice_A[A](x: scala.Double, y: scala.Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def sort[A](xs: js.Array[A]): js.Array[A] = js.native
  def sortBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def sortBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = js.native
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, scala.Double]]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def sortWith[A](f: js.Function1[/* x */ A, js.Function1[/* y */ A, scala.Double]], xs: js.Array[A]): js.Array[A] = js.native
  def span(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def span(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def span[A](p: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  @JSName("span")
  def span_A[A](p: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def split(separator: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitAt(n: scala.Double): js.Function1[/* str */ java.lang.String, js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def splitAt(n: scala.Double, str: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
  def splitAt[A](n: scala.Double, xs: js.Array[A]): js.Tuple2[js.Array[A], js.Array[A]] = js.native
  @JSName("splitAt")
  def splitAt_A[A](n: scala.Double): js.Function1[/* xs */ js.Array[A], js.Tuple2[js.Array[A], js.Array[A]]] = js.native
  def sqrt(x: scala.Double): scala.Double = js.native
  def sum(xs: js.Array[scala.Double]): scala.Double = js.native
  def tail[A](xs: js.Array[A]): js.Array[A] = js.native
  def take(n: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def take(n: scala.Double, str: java.lang.String): java.lang.String = js.native
  def take[A](n: scala.Double, xs: js.Array[A]): js.Array[A] = js.native
  def takeWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def takeWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): java.lang.String = js.native
  def takeWhile[A](p: js.Function1[/* x */ A, scala.Boolean], xs: js.Array[A]): js.Array[A] = js.native
  @JSName("takeWhile")
  def takeWhile_A[A](p: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  @JSName("take")
  def take_A[A](n: scala.Double): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def tan(x: scala.Double): scala.Double = js.native
  def truncate(x: scala.Double): scala.Double = js.native
  def unchars(xs: js.Array[java.lang.String]): java.lang.String = js.native
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | scala.Unit]): js.Function1[/* x */ B, js.Array[A]] = js.native
  def unfoldr[A, B](f: js.Function1[/* x */ B, (js.Tuple2[A, B]) | scala.Unit], x: B): js.Array[A] = js.native
  def union[A](xss: js.Array[A]*): js.Array[A] = js.native
  def unique[A](xs: js.Array[A]): js.Array[A] = js.native
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B]): js.Function1[/* xs */ js.Array[A], js.Array[A]] = js.native
  def uniqueBy[A, B](f: js.Function1[/* x */ A, B], xs: js.Array[A]): js.Array[A] = js.native
  def unlines(xs: js.Array[java.lang.String]): java.lang.String = js.native
  def unwords(xs: js.Array[java.lang.String]): java.lang.String = js.native
  def values[A](`object`: ScalablyTyped.runtime.NumberDictionary[A]): js.Array[A] = js.native
  def values[A](`object`: ScalablyTyped.runtime.StringDictionary[A]): js.Array[A] = js.native
  def words(str: java.lang.String): js.Array[java.lang.String] = js.native
  def zip[A, B](xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[js.Tuple2[A, B]]] = js.native
  def zip[A, B](xs: js.Array[A], ys: js.Array[B]): js.Array[js.Tuple2[A, B]] = js.native
  def zipAll[A](xss: js.Array[A]*): js.Array[js.Array[A]] = js.native
  def zipAllWith[A, B](f: js.Function1[/* repeated */A, B], xss: js.Array[A]*): js.Array[B] = js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]]): js.Function1[/* xs */ js.Array[A], js.Function1[/* ys */ js.Array[B], js.Array[C]]] = js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A]): js.Function1[/* ys */ js.Array[B], js.Array[C]] = js.native
  def zipWith[A, B, C](f: js.Function1[/* x */ A, js.Function1[/* y */ B, C]], xs: js.Array[A], ys: js.Array[B]): js.Array[C] = js.native
  @JSName("Obj")
  @js.native
  object ObjNs extends js.Object {
    def compact[A](`object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
    def compact[A](`object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
    def each[A](f: js.Function1[/* x */ A, scala.Unit]): js.Function1[
        /* object */ ScalablyTyped.runtime.StringDictionary[A], 
        ScalablyTyped.runtime.StringDictionary[A]
      ] = js.native
    def each[A](f: js.Function1[/* x */ A, scala.Unit], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
    def each[A](f: js.Function1[/* x */ A, scala.Unit], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
    def empty[A](`object`: js.Any): scala.Boolean = js.native
    def filter[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[
        /* object */ ScalablyTyped.runtime.StringDictionary[A], 
        ScalablyTyped.runtime.StringDictionary[A]
      ] = js.native
    def filter[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
    def filter[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
    def find[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[/* object */ ScalablyTyped.runtime.StringDictionary[A], A] = js.native
    def find[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): A = js.native
    def find[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): A = js.native
    def map[A, B](f: js.Function1[/* x */ A, B]): js.Function1[
        /* object */ ScalablyTyped.runtime.StringDictionary[A], 
        ScalablyTyped.runtime.StringDictionary[B]
      ] = js.native
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[B] = js.native
    def map[A, B](f: js.Function1[/* x */ A, B], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[B] = js.native
    def partition[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[
        /* object */ ScalablyTyped.runtime.StringDictionary[A], 
        js.Tuple2[
          ScalablyTyped.runtime.StringDictionary[A], 
          ScalablyTyped.runtime.StringDictionary[A]
        ]
      ] = js.native
    def partition[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): js.Tuple2[
        ScalablyTyped.runtime.NumberDictionary[A], 
        ScalablyTyped.runtime.NumberDictionary[A]
      ] = js.native
    def partition[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): js.Tuple2[
        ScalablyTyped.runtime.StringDictionary[A], 
        ScalablyTyped.runtime.StringDictionary[A]
      ] = js.native
    def reject[A](f: js.Function1[/* x */ A, scala.Boolean]): js.Function1[
        /* object */ ScalablyTyped.runtime.StringDictionary[A], 
        ScalablyTyped.runtime.StringDictionary[A]
      ] = js.native
    def reject[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.NumberDictionary[A]): ScalablyTyped.runtime.NumberDictionary[A] = js.native
    def reject[A](f: js.Function1[/* x */ A, scala.Boolean], `object`: ScalablyTyped.runtime.StringDictionary[A]): ScalablyTyped.runtime.StringDictionary[A] = js.native
  }
  
  @JSName("Str")
  @js.native
  object StrNs extends js.Object {
    def breakStr(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, js.Tuple2[java.lang.String, java.lang.String]] = js.native
    def breakStr(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
    def drop(n: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
    def drop(n: scala.Double, str: java.lang.String): java.lang.String = js.native
    def dropWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
    def dropWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): java.lang.String = js.native
    def empty(str: java.lang.String): scala.Boolean = js.native
    def reverse(str: java.lang.String): java.lang.String = js.native
    def slice(x: scala.Double): js.Function1[/* y */ scala.Double, js.Function1[/* str */ java.lang.String, java.lang.String]] = js.native
    def slice(x: scala.Double, y: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
    def slice(x: scala.Double, y: scala.Double, str: java.lang.String): java.lang.String = js.native
    def span(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, js.Tuple2[java.lang.String, java.lang.String]] = js.native
    def span(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
    def splitAt(n: scala.Double): js.Function1[/* str */ java.lang.String, js.Tuple2[java.lang.String, java.lang.String]] = js.native
    def splitAt(n: scala.Double, str: java.lang.String): js.Tuple2[java.lang.String, java.lang.String] = js.native
    def take(n: scala.Double): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
    def take(n: scala.Double, str: java.lang.String): java.lang.String = js.native
    def takeWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean]): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
    def takeWhile(f: js.Function1[/* str */ java.lang.String, scala.Boolean], str: java.lang.String): java.lang.String = js.native
  }
  
}

