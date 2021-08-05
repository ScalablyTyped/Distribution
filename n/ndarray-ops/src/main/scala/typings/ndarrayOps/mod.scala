package typings.ndarrayOps

import typings.ndarray.mod.ndarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndarray-ops", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abs(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("abs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def abseq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("abseq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def acos(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("acos")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def acoseq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("acoseq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def add(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def addeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def adds(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("adds")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def addseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def all(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def and(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def andeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("andeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ands(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ands")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def andseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("andseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def any(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def argmax(index: Double, array: ndarray[Double], shape: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("argmax")(index.asInstanceOf[js.Any], array.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def argmin(index: Double, array: ndarray[Double], shape: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("argmin")(index.asInstanceOf[js.Any], array.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def asin(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("asin")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def asineq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asineq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def assign(array: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def assigns(array: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("assigns")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def atan(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("atan")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def atan2(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def atan2eq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2eq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def atan2op(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2op")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def atan2opeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2opeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def atan2ops(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2ops")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def atan2opseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2opseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def atan2s(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2s")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def atan2seq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2seq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ataneq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ataneq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def band(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("band")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def bandeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bandeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bands(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bands")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def bandseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bandseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bnot(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bnot")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def bnoteq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bnoteq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def bor(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bor")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def boreq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boreq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bors(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bors")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def borseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("borseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bxor(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bxor")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def bxoreq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bxoreq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def bxors(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bxors")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def bxorseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bxorseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ceil(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def ceileq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ceileq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def cos(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cos")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def coseq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("coseq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def div(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def diveq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("diveq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def divs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("divs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def divseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("divseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def eq_(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def eqeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eqeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def eqs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("eqs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def eqseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eqseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equals_(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def exp(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("exp")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def expeq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("expeq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def floor(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def flooreq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flooreq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def geq(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("geq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def geqeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("geqeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def geqs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("geqs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def geqseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("geqseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def gteq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gteq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gts(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("gts")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def gtseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inf(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inf")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def leq(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("leq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def leqeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("leqeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def leqs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("leqs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def leqseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("leqseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def log(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def logeq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("logeq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lshift(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lshift")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def lshifteq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lshifteq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lshifts(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lshifts")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def lshiftseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lshiftseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def lteq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lteq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lts(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("lts")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def ltseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def max(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def maxeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def maxs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("maxs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def maxseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def min(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def mineq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mineq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mins(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mins")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def minseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mod(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def modeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("modeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mods(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mods")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def modseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("modseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mul(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def muleq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("muleq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def muls(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("muls")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def mulseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mulseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def neg(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("neg")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def negeq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("negeq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def neq(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def neqeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neqeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def neqs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("neqs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def neqseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neqseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def norm1(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("norm1")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def norm2(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("norm2")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def norm2squared(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("norm2squared")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def norminf(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("norminf")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def not(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def noteq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("noteq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def or(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def oreq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("oreq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ors(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ors")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def orseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("orseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pow(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def poweq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("poweq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def powop(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("powop")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def powopeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("powopeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def powops(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("powops")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def powopseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("powopseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pows(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pows")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def powseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("powseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def prod(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def random(array: ndarray[Double]): ndarray[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(array.asInstanceOf[js.Any]).asInstanceOf[ndarray[Double]]
  
  inline def recip(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("recip")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def recipeq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("recipeq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def round(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def roundeq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("roundeq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def rrshift(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rrshift")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def rrshifteq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rrshifteq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def rrshifts(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rrshifts")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def rrshiftseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rrshiftseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def rshift(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rshift")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def rshifteq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rshifteq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def rshifts(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rshifts")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def rshiftseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rshiftseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sin(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sin")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def sineq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sineq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sqrt(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def sqrteq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrteq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sub(array1: ndarray[Double], array2: ndarray[Double], array3: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], array3.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def subeq(array1: ndarray[Double], array2: ndarray[Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subeq")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def subs(array1: ndarray[Double], array2: ndarray[Double], scalar: Double): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("subs")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def subseq(array: ndarray[Double], scalar: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subseq")(array.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sum(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def sup(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("sup")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tan(array1: ndarray[Double], array2: ndarray[Double]): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("tan")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  inline def taneq(array: ndarray[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("taneq")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
