package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Numeric extends js.Object {
  val epsilon: scala.Double = js.native
  var largeArray: scala.Double = js.native
  var precision: scala.Double = js.native
  var seedrandom: numericLib.Anon_Random = js.native
  val version: java.lang.String = js.native
  def `!==`(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def `!==`(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `!==`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): scala.Boolean = js.native
  def `!==`(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `!==`(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `!==`(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `%`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `%`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `%`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `%`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `%`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `%`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("%")
  def `%_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `&`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `&`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def `&&`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&&`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&&`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&&`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `&&`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `&&`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("&&")
  def `&&_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  @JSName("&")
  def `&_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `*`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `*`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `*`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `*`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `*`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `*`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("*")
  def `*_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `+`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `+`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `+`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `+`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `+`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `+`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("+")
  def `+_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `-`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `-`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `-`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `-`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `-`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `-`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("-")
  def `-_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `/`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `/`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `/`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `/`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `/`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `/`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("/")
  def `/_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `<`(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def `<`(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `<`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): scala.Boolean = js.native
  def `<`(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `<`(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `<`(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `<<`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `<<`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `<<`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `<<`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `<<`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `<<`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("<<")
  def `<<_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `<=`(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def `<=`(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `<=`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): scala.Boolean = js.native
  def `<=`(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `<=`(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `<=`(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `===`(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def `===`(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `===`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): scala.Boolean = js.native
  def `===`(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `===`(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `===`(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `>`(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def `>`(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `>`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): scala.Boolean = js.native
  def `>`(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `>`(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `>`(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `>=`(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def `>=`(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `>=`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): scala.Boolean = js.native
  def `>=`(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `>=`(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def `>=`(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def `>>`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `>>`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def `>>>`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>>`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>>`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>>`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `>>>`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (T | numericLib.Scalar)*): T = js.native
  def `>>>`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (T | numericLib.Scalar)*): T = js.native
  @JSName(">>>")
  def `>>>_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  @JSName(">>")
  def `>>_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def LU(matrix: numericLib.Matrix): numericLib.Anon_LU = js.native
  def LU(matrix: numericLib.Matrix, fast: scala.Boolean): numericLib.Anon_LU = js.native
  def LUsolve(lup: numericLib.Anon_LU, vector: numericLib.Vector): numericLib.Vector = js.native
  def QRFrancis(x: numericLib.Matrix): numericLib.Anon_B = js.native
  def QRFrancis(x: numericLib.Matrix, maxiter: scala.Double): numericLib.Anon_B = js.native
  def ^(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def ^(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def ^(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def ^(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def ^[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def ^[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("^")
  def `^_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  // Pointwise Math.abs(x)
  def abs[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def absV(x: numericLib.Vector): numericLib.Vector = js.native
  def abseq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def abseqV(x: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise arc-cosine
  def acos[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def acosV(x: numericLib.Vector): numericLib.Vector = js.native
  def acoseq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def acoseqV(x: numericLib.Vector): numericLib.Vector = js.native
  def add(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def add(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def add(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def add(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def add[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (T | numericLib.Scalar)*): T = js.native
  def add[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (T | numericLib.Scalar)*): T = js.native
  def addSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def addVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def addVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise sum x+y
  @JSName("add")
  def add_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def addeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def addeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def addeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def addeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // 	All the components of x are true
  def all(x: js.Any): scala.Boolean = js.native
  def allV(x: js.Array[_]): scala.Boolean = js.native
  def and(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def and(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def and(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def and(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def and[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def and[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def andSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def andVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def andVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x && y
  @JSName("and")
  def and_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def andeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def andeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def andeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def andeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // One or more of the components of x are true
  def any(x: js.Any): scala.Boolean = js.native
  def anyV(x: js.Array[_]): scala.Boolean = js.native
  // Pointwise arc-sine
  def asin[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def asinV(x: numericLib.Vector): numericLib.Vector = js.native
  def asineq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def asineqV(x: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise arc-tangent
  def atan[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def atan2(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def atan2(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def atan2(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def atan2(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def atan2[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (T | numericLib.Scalar)*): T = js.native
  def atan2[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (T | numericLib.Scalar)*): T = js.native
  def atan2SV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def atan2VS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def atan2VV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise	arc-tangent (two parameters)
  @JSName("atan2")
  def atan2_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def atan2eq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def atan2eq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def atan2eqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def atan2eqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def atanV(x: numericLib.Vector): numericLib.Vector = js.native
  def ataneq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def ataneqV(x: numericLib.Vector): numericLib.Vector = js.native
  def band(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def band(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def band(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def band(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def band[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def band[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def bandSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def bandVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def bandVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x & y
  @JSName("band")
  def band_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def bandeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def bandeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def bandeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def bandeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // utility functions
  // Benchmarking routine
  def bench(func: js.Function0[_]): scala.Double = js.native
  def bench(func: js.Function0[_], interval: scala.Double): scala.Double = js.native
  def blockMatrix(x: numericLib.MultidimensionalMatrix): numericLib.Matrix = js.native
  // create two-dimensional matrix
  def blockMatrix(x: numericLib.Scalar): numericLib.Matrix = js.native
  def blockMatrix(x: numericLib.Vector): numericLib.Matrix = js.native
  // Pointwise binary negation ~x
  def bnot[T /* <: numericLib.TensorValue */](x: T): T = js.native
  def bnotV(x: numericLib.Vector): numericLib.Vector = js.native
  def bnoteq[T /* <: numericLib.TensorValue */](x: T): T = js.native
  def bnoteqV(x: numericLib.Vector): numericLib.Vector = js.native
  def bor(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bor(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bor(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bor(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bor[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def bor[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def borSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def borVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def borVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise binary or x|y
  @JSName("bor")
  def bor_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def boreq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def boreq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def boreqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def boreqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def bxor(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bxor(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bxor(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bxor(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def bxor[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def bxor[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def bxorSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def bxorVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def bxorVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise binary xor x^y
  @JSName("bxor")
  def bxor_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def bxoreq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def bxoreq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def bxoreqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def bxoreqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Coordinate matrices
  def cLU(matrix: numericLib.Matrix): LU = js.native
  def cLUSolve(lu: LU, b: numericLib.Vector): numericLib.Vector = js.native
  def ccsDim(matrix: numericLib.SparseMatrix): numericLib.Vector = js.native
  def ccsDot(A: numericLib.SparseMatrix, B: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsFull(matrix: numericLib.SparseMatrix): numericLib.Matrix = js.native
  def ccsGather(matrix: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix, i: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix, i: numericLib.Scalar, j: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix, i: numericLib.Scalar, j: numericLib.Vector): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix, i: numericLib.Vector): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix, i: numericLib.Vector, j: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsGetBlock(matrix: numericLib.SparseMatrix, i: numericLib.Vector, j: numericLib.Vector): numericLib.SparseMatrix = js.native
  def ccsLUP(matrix: numericLib.SparseMatrix): LUPP = js.native
  def ccsLUP(matrix: numericLib.SparseMatrix, threshold: scala.Double): LUPP = js.native
  def ccsLUPSolve(lup: LUPP, B: numericLib.SparseMatrix): numericLib.Vector = js.native
  def ccsScatter(matrix: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  // Compressed Column Storage matrices
  def ccsSparse(matrix: numericLib.Matrix): numericLib.SparseMatrix = js.native
  def ccsTSolve(matrix: numericLib.SparseMatrix, b: numericLib.Vector): numericLib.Vector = js.native
  def ccsTSolve(matrix: numericLib.SparseMatrix, b: numericLib.Vector, x: numericLib.Vector): numericLib.Vector = js.native
  def ccsTSolve(matrix: numericLib.SparseMatrix, b: numericLib.Vector, x: numericLib.Vector, bj: numericLib.Vector): numericLib.Vector = js.native
  def ccsTSolve(
    matrix: numericLib.SparseMatrix,
    b: numericLib.Vector,
    x: numericLib.Vector,
    bj: numericLib.Vector,
    xj: numericLib.Vector
  ): numericLib.Vector = js.native
  def ccsadd(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsadd(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsadd(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsaddMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsand(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsand(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsand(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsandMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsband(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsband(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsband(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsbandMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsbor(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsbor(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsbor(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsborMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsbxor(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsbxor(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsbxor(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsbxorMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsdiv(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsdiv(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsdiv(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsdivMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccseq(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccseq(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.CCSComparisonResult = js.native
  def ccseq(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccseqMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsgeq(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsgeq(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.CCSComparisonResult = js.native
  def ccsgeq(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsgeqMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsgt(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsgt(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.CCSComparisonResult = js.native
  def ccsgt(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsgtMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsleq(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsleq(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.CCSComparisonResult = js.native
  def ccsleq(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsleqMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccslshift(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccslshift(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccslshift(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccslshiftMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccslt(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccslt(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.CCSComparisonResult = js.native
  def ccslt(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsltMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsmod(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsmod(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsmod(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsmodMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsmul(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsmul(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsmul(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsmulMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsneq(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsneq(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.CCSComparisonResult = js.native
  def ccsneq(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsneqMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.CCSComparisonResult = js.native
  def ccsor(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsor(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsor(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsorMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsrrshift(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsrrshift(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsrrshift(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsrrshiftMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsrshift(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsrshift(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccsrshift(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccsrshiftMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccssub(x: numericLib.Scalar, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccssub(x: numericLib.SparseMatrix, y: numericLib.Scalar): numericLib.SparseMatrix = js.native
  def ccssub(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def ccssubMM(x: numericLib.SparseMatrix, y: numericLib.SparseMatrix): numericLib.SparseMatrix = js.native
  def cdelsq(g: numericLib.Matrix): numericLib.Matrix = js.native
  def cdotmv(matrix: numericLib.Matrix, x: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise Math.ceil(x)
  def ceil[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def ceilV(x: numericLib.Vector): numericLib.Vector = js.native
  def ceileq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def ceileqV(x: numericLib.Vector): numericLib.Vector = js.native
  def cgrid(n: js.Tuple2[scala.Double, scala.Double]): numericLib.Matrix = js.native
  def cgrid(n: js.Tuple2[scala.Double, scala.Double], shape: numericLib.ShapeFunction): numericLib.Matrix = js.native
  def cgrid(n: scala.Double): numericLib.Matrix = js.native
  def cgrid(n: scala.Double, shape: numericLib.ShapeFunction): numericLib.Matrix = js.native
  @JSName("cgrid")
  def cgrid_L(n: js.Tuple2[scala.Double, scala.Double], shape: numericLib.numericLibStrings.L): numericLib.Matrix = js.native
  @JSName("cgrid")
  def cgrid_L(n: scala.Double, shape: numericLib.numericLibStrings.L): numericLib.Matrix = js.native
  // Deep copy of Array
  def clone[T /* <: js.Array[numericLib.NonNullPrimitive] | numericLib.MultidimensionalArray[numericLib.NonNullPrimitive] */](x: T): T = js.native
  def cloneV(x: js.Array[numericLib.NonNullPrimitive]): js.Array[numericLib.NonNullPrimitive] = js.native
  def cloneeq(x: js.Array[numericLib.NonNullPrimitive]): js.Array[numericLib.NonNullPrimitive] = js.native
  def cloneeq[T /* <: js.Array[numericLib.NonNullPrimitive] | numericLib.MultidimensionalArray[numericLib.NonNullPrimitive] */](x: T): T = js.native
  def cloneeqV(x: js.Array[numericLib.NonNullPrimitive]): js.Array[numericLib.NonNullPrimitive] = js.native
  // Pointwise Math.cos(x)
  def cos[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def cosV(x: numericLib.Vector): numericLib.Vector = js.native
  def coseq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def coseqV(x: numericLib.Vector): numericLib.Vector = js.native
  // Determinant
  def det(x: numericLib.Matrix): scala.Double = js.native
  // Create diagonal matrix
  def diag(diagonal: numericLib.Vector): numericLib.Matrix = js.native
  // linear algebra with arrays
  // Get Array dimensions
  def dim(arr: js.Any): numericLib.Vector = js.native
  def div(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def div(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def div(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def div(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def div[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def div[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def divSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def divVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def divVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x/y
  @JSName("div")
  def div_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def diveq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def diveq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def diveqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def diveqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Ode solver (Dormand-Prince)
  def dopri(
    x0: numericLib.Scalar,
    x1: numericLib.Scalar,
    y0: numericLib.Scalar,
    f: js.Function2[
      /* x */ numericLib.Vector | numericLib.Scalar, 
      /* y */ numericLib.Vector | numericLib.Scalar, 
      numericLib.Vector | numericLib.Scalar
    ]
  ): Dopri = js.native
  def dopri(
    x0: numericLib.Scalar,
    x1: numericLib.Scalar,
    y0: numericLib.Scalar,
    f: js.Function2[
      /* x */ numericLib.Vector | numericLib.Scalar, 
      /* y */ numericLib.Vector | numericLib.Scalar, 
      numericLib.Vector | numericLib.Scalar
    ],
    tol: scala.Double
  ): Dopri = js.native
  def dopri(
    x0: numericLib.Scalar,
    x1: numericLib.Scalar,
    y0: numericLib.Scalar,
    f: js.Function2[
      /* x */ numericLib.Vector | numericLib.Scalar, 
      /* y */ numericLib.Vector | numericLib.Scalar, 
      numericLib.Vector | numericLib.Scalar
    ],
    tol: scala.Double,
    maxit: scala.Double
  ): Dopri = js.native
  def dopri(
    x0: numericLib.Scalar,
    x1: numericLib.Scalar,
    y0: numericLib.Scalar,
    f: js.Function2[
      /* x */ numericLib.Vector | numericLib.Scalar, 
      /* y */ numericLib.Vector | numericLib.Scalar, 
      numericLib.Vector | numericLib.Scalar
    ],
    tol: scala.Double,
    maxit: scala.Double,
    event: js.Function2[
      /* x */ numericLib.Vector | numericLib.Scalar, 
      /* y */ numericLib.Vector | numericLib.Scalar, 
      numericLib.Vector | numericLib.Scalar
    ]
  ): Dopri = js.native
  // 	Matrix-Matrix, Matrix-Vector, Vector-Matrix and Vector-Vector product
  def dot(x: numericLib.Matrix | numericLib.Vector, y: numericLib.Matrix | numericLib.Vector): numericLib.Vector | numericLib.Matrix | numericLib.Scalar = js.native
  def dot(x: numericLib.Matrix | numericLib.Vector, y: numericLib.Scalar): numericLib.Vector | numericLib.Matrix | numericLib.Scalar = js.native
  def dot(x: numericLib.Scalar, y: numericLib.Matrix | numericLib.Vector): numericLib.Vector | numericLib.Matrix | numericLib.Scalar = js.native
  def dot(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.Vector | numericLib.Matrix | numericLib.Scalar = js.native
  def dotMMbig(x: numericLib.Matrix, y: numericLib.Matrix): numericLib.Matrix = js.native
  def dotMMsmall(x: numericLib.Matrix, y: numericLib.Matrix): numericLib.Matrix = js.native
  def dotMV(x: numericLib.Matrix, y: numericLib.Vector): numericLib.Vector = js.native
  def dotVM(x: numericLib.Vector, y: numericLib.Matrix): numericLib.Vector = js.native
  def dotVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Scalar = js.native
  // Linear programming
  def echelonize(matrix: numericLib.Matrix): numericLib.Anon_A = js.native
  def eig(A: numericLib.Matrix): numericLib.Anon_E = js.native
  def eig(A: numericLib.Matrix, maxiter: scala.Double): numericLib.Anon_E = js.native
  def eq(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def eq(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def eq(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def eq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def eq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def eqSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def eqVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def eqVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise comparison x === y
  @JSName("eq")
  def eq_Boolean(x: numericLib.Scalar, y: numericLib.Scalar): scala.Boolean = js.native
  def eqeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def eqeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def eqeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def eqeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise Math.exp(x)
  def exp[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def expV(x: numericLib.Vector): numericLib.Vector = js.native
  def expeq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def expeqV(x: numericLib.Vector): numericLib.Vector = js.native
  // 	Poinwise Math.floor(x)
  def floor[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def floorV(x: numericLib.Vector): numericLib.Vector = js.native
  def flooreq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def flooreqV(x: numericLib.Vector): numericLib.Vector = js.native
  def geq(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def geq(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def geq(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def geq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def geq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def geqSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def geqVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def geqVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise x>=y
  @JSName("geq")
  def geq_Boolean(x: numericLib.Scalar, y: numericLib.Scalar): scala.Boolean = js.native
  def geqeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def geqeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def geqeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def geqeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Extract a block from a matrix
  def getBlock[T /* <: numericLib.MultidimensionalMatrix */](x: T, from: numericLib.Vector, to: numericLib.Vector): T = js.native
  // Get the diagonal of a Matrix
  def getDiag(matrix: numericLib.Matrix): numericLib.Vector = js.native
  def getURL(url: java.lang.String): js.Any = js.native
  def gradient(f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar], x: numericLib.Vector): numericLib.Vector = js.native
  def gt(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def gt(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def gt(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def gt(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def gt(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def gtSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def gtVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def gtVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise x>y
  @JSName("gt")
  def gt_Boolean(x: numericLib.Scalar, y: numericLib.Scalar): scala.Boolean = js.native
  def gteq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def gteq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def gteqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def gteqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Eigenvalues of real matrices
  def house(x: numericLib.Vector): numericLib.Vector = js.native
  // Identity matrix
  def identity(num: scala.Double): numericLib.Matrix = js.native
  // Encode a matrix as an image URL
  def imageURL(img: js.Array[js.Array[scala.Double]]): java.lang.String = js.native
  def inf(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Smallest value of entries (not modulus)
  def inf(x: numericLib.Scalar): scala.Double = js.native
  def inf(x: numericLib.Vector): scala.Double = js.native
  def infV(x: numericLib.Vector): scala.Double = js.native
  // Matrix inverse
  def inv(x: numericLib.Matrix): numericLib.Matrix = js.native
  def isFinite(x: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  // Pointwise Number.isFinite(x)
  def isFinite(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isFiniteV(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isFiniteeq(x: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def isFiniteeq(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isFiniteeqV(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isNaN(x: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  // Pointwise Number.isNan(x)
  def isNaN(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isNaNV(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isNaNeq(x: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def isNaNeq(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def isNaNeqV(x: numericLib.Vector): numericLib.VectorBoolean = js.native
  def leq(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def leq(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def leq(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def leq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def leq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def leqSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def leqVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def leqVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise x<=y
  @JSName("leq")
  def leq_Boolean(x: numericLib.Scalar, y: numericLib.Scalar): scala.Boolean = js.native
  def leqeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def leqeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def leqeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def leqeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Generate evenly spaced values
  def linspace(from: scala.Double, to: scala.Double): numericLib.Vector = js.native
  def linspace(from: scala.Double, to: scala.Double, numberOfValues: scala.Double): numericLib.Vector = js.native
  // Pointwise Math.log(x)
  def log[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def logV(x: numericLib.Vector): numericLib.Vector = js.native
  def logeq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def logeqV(x: numericLib.Vector): numericLib.Vector = js.native
  def lshift(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def lshift(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def lshift(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def lshift(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def lshift[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (T | numericLib.Scalar)*): T = js.native
  def lshift[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (T | numericLib.Scalar)*): T = js.native
  def lshiftSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def lshiftVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def lshiftVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x<<y
  @JSName("lshift")
  def lshift_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def lshifteq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def lshifteq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def lshifteqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def lshifteqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def lt(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def lt(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def lt(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def lt(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def lt(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def ltSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def ltVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def ltVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise x<y
  @JSName("lt")
  def lt_Boolean(x: numericLib.Scalar, y: numericLib.Scalar): scala.Boolean = js.native
  def lteq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def lteq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def lteqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def lteqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def max(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def max(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def max(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def max(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def max[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def max[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def maxSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def maxVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def maxVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise max(x,y)
  @JSName("max")
  def max_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def maxeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def maxeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def maxeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def maxeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def min(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def min(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def min(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def min(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def min[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def min[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def minSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def minVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def minVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise min(x,y)
  @JSName("min")
  def min_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def mineq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def mineq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def mineqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def mineqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def mod(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mod(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mod(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mod(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mod[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def mod[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def modSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def modVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def modVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x%y
  @JSName("mod")
  def mod_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def modeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def modeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def modeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def modeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def mul(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mul(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mul(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mul(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def mul[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def mul[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def mulSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def mulVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def mulVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x*y
  @JSName("mul")
  def mul_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def muleq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def muleq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def muleqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def muleqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise -x
  def neg[T /* <: numericLib.TensorValue */](x: T): T = js.native
  def negV(x: numericLib.Vector): numericLib.Vector = js.native
  def negeq[T /* <: numericLib.TensorValue */](x: T): T = js.native
  def negeqV(x: numericLib.Vector): numericLib.Vector = js.native
  // Negate matrix and transpose
  def negtranspose(x: numericLib.Matrix): numericLib.Matrix = js.native
  def neq(x: numericLib.MultidimensionalMatrix, y: numericLib.MultidimensionalMatrix): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def neq(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def neq(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def neq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def neq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def neqSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def neqVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def neqVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  // Pointwise x!==y
  @JSName("neq")
  def neq_Boolean(x: numericLib.Scalar, y: numericLib.Scalar): scala.Boolean = js.native
  def neqeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def neqeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def neqeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.VectorBoolean = js.native
  def neqeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.VectorBoolean = js.native
  def norm1(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Sum all absolute values of entries
  def norm1(x: numericLib.Scalar): scala.Double = js.native
  def norm1(x: numericLib.Vector): scala.Double = js.native
  def norm1V(x: numericLib.Vector): scala.Double = js.native
  def norm2(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Square root of the sum of the square of the entries of x
  def norm2(x: numericLib.Scalar): scala.Double = js.native
  def norm2(x: numericLib.Vector): scala.Double = js.native
  def norm2Squared(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Sum of squares of entries of x
  def norm2Squared(x: numericLib.Scalar): scala.Double = js.native
  def norm2Squared(x: numericLib.Vector): scala.Double = js.native
  def norm2SquaredV(x: numericLib.Vector): scala.Double = js.native
  def norminf(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Largest modulus entry of x
  def norminf(x: numericLib.Scalar): scala.Double = js.native
  def norminf(x: numericLib.Vector): scala.Double = js.native
  def norminfV(x: numericLib.Vector): scala.Double = js.native
  def not(x: js.Array[numericLib.NonNullPrimitive]): numericLib.VectorBoolean = js.native
  // Pointwise logical negation !x
  def not(x: numericLib.NonNullPrimitive): scala.Boolean = js.native
  def notV(x: js.Array[numericLib.NonNullPrimitive]): numericLib.VectorBoolean = js.native
  @JSName("not")
  def not_MultidimensionalArray(x: numericLib.MultidimensionalArray[numericLib.NonNullPrimitive]): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def noteq(x: js.Array[numericLib.NonNullPrimitive]): numericLib.VectorBoolean = js.native
  def noteq(x: numericLib.NonNullPrimitive): scala.Boolean = js.native
  def noteqV(x: js.Array[numericLib.NonNullPrimitive]): numericLib.VectorBoolean = js.native
  @JSName("noteq")
  def noteq_MultidimensionalArray(x: numericLib.MultidimensionalArray[numericLib.NonNullPrimitive]): numericLib.MultidimensionalArray[scala.Boolean] = js.native
  def or(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def or(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def or(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def or(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def or[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def or[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def orSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def orVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def orVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // 	Pointwise logical or x||y
  @JSName("or")
  def or_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def oreq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def oreq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def oreqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def oreqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def parseCSV(csv: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def parseDate(date: java.lang.String): scala.Double = js.native
  def parseDate(dates: js.Array[java.lang.String]): js.Array[scala.Double] = js.native
  def parseFloat(input: java.lang.String): scala.Double = js.native
  def parseFloat(inputs: js.Array[java.lang.String]): js.Array[scala.Double] = js.native
  def pow(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def pow(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def pow(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def pow(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def pow[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def pow[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def powSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def powVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def powVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x**y
  @JSName("pow")
  def pow_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def poweq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def poweq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def poweqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def poweqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def prettyPrint(): java.lang.String = js.native
  def prettyPrint(x: js.Any): java.lang.String = js.native
  def prod(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Product of all the entries of x
  def prod(x: numericLib.Scalar): scala.Double = js.native
  def prod(x: numericLib.Vector): scala.Double = js.native
  def prodV(x: numericLib.Vector): scala.Double = js.native
  // Create an Array of random numbers
  def random(s: numericLib.Vector): numericLib.Vector | numericLib.MultidimensionalMatrix = js.native
  // 	Create an Array by duplicating values
  def rep[T](scale: numericLib.Vector, value: T): numericLib.MultidimensionalArray[T] = js.native
  def rep[T](scale: numericLib.Vector, value: T, key: scala.Double): numericLib.MultidimensionalArray[T] = js.native
  // 	Pointwise Math.round(x)
  def round[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def roundV(x: numericLib.Vector): numericLib.Vector = js.native
  def roundeq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def roundeqV(x: numericLib.Vector): numericLib.Vector = js.native
  def rrshift(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rrshift(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rrshift(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rrshift(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rrshift[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (T | numericLib.Scalar)*): T = js.native
  def rrshift[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (T | numericLib.Scalar)*): T = js.native
  def rrshiftSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def rrshiftVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def rrshiftVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x>>>y
  @JSName("rrshift")
  def rrshift_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def rrshifteq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def rrshifteq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def rrshifteqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def rrshifteqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def rshift(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rshift(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rshift(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rshift(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def rshift[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (T | numericLib.Scalar)*): T = js.native
  def rshift[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (T | numericLib.Scalar)*): T = js.native
  def rshiftSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def rshiftVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def rshiftVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x>>y
  @JSName("rshift")
  def rshift_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def rshifteq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def rshifteq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def rshifteqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def rshifteqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // 	x and y are entrywise identical
  def same(x: js.Any, y: js.Any): scala.Boolean = js.native
  /** @deprecated */
  def sclone[T](matrix: T): T = js.native
  def sclone[T](matrix: T, k: scala.Double): T = js.native
  def sclone[T](matrix: T, k: scala.Double, n: scala.Double): T = js.native
  /** @deprecated */
  def sdiag(d: numericLib.Vector): numericLib.DeprecatedSparseMatrix = js.native
  /**  @deprecated */
  def sdim(matrix: js.Any): numericLib.Vector = js.native
  def sdim(matrix: js.Any, ret: numericLib.Vector): numericLib.Vector = js.native
  def sdim(matrix: js.Any, ret: numericLib.Vector, k: scala.Double): numericLib.Vector = js.native
  def sdot(
    x: numericLib.DeprecatedSparseMatrix | numericLib.DeprecatedSparseVector,
    y: numericLib.DeprecatedSparseMatrix | numericLib.DeprecatedSparseVector
  ): numericLib.Scalar | numericLib.DeprecatedSparseVector | numericLib.DeprecatedSparseMatrix = js.native
  def sdot(x: numericLib.DeprecatedSparseMatrix | numericLib.DeprecatedSparseVector, y: numericLib.Scalar): numericLib.Scalar | numericLib.DeprecatedSparseVector | numericLib.DeprecatedSparseMatrix = js.native
  def sdot(x: numericLib.Scalar, y: numericLib.DeprecatedSparseMatrix | numericLib.DeprecatedSparseVector): numericLib.Scalar | numericLib.DeprecatedSparseVector | numericLib.DeprecatedSparseMatrix = js.native
  /** @deprecated */
  def sdot(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.Scalar | numericLib.DeprecatedSparseVector | numericLib.DeprecatedSparseMatrix = js.native
  /** @deprecated */
  def sdotMM(a: numericLib.DeprecatedSparseMatrix, b: numericLib.DeprecatedSparseMatrix): numericLib.DeprecatedSparseMatrix = js.native
  /** @deprecated */
  def sdotMV(matrix: numericLib.DeprecatedSparseMatrix, vector: numericLib.DeprecatedSparseVector): numericLib.DeprecatedSparseVector = js.native
  /** @deprecated */
  def sdotVM(vector: numericLib.DeprecatedSparseVector, matrix: numericLib.DeprecatedSparseMatrix): numericLib.DeprecatedSparseMatrix = js.native
  /** @deprecated */
  def sdotVV(x: numericLib.DeprecatedSparseVector, y: numericLib.DeprecatedSparseVector): scala.Double = js.native
  // Set a block of a matrix
  def setBlock[T /* <: numericLib.MultidimensionalMatrix */](x: T, from: numericLib.Vector, to: numericLib.Vector, b: T): T = js.native
  /** @deprecated */
  def sgather(matrix: numericLib.DeprecatedSparseMatrix): numericLib.DeprecatedSparseMatrix = js.native
  def sgather(matrix: numericLib.DeprecatedSparseMatrix, ret: numericLib.DeprecatedSparseVector): numericLib.DeprecatedSparseMatrix = js.native
  def sgather(
    matrix: numericLib.DeprecatedSparseMatrix,
    ret: numericLib.DeprecatedSparseVector,
    k: numericLib.DeprecatedSparseVector
  ): numericLib.DeprecatedSparseMatrix = js.native
  /** @deprecated */
  def sidentity(n: numericLib.Scalar): numericLib.DeprecatedSparseMatrix = js.native
  // Pointwise Math.sin(x)
  def sin[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def sinV(x: numericLib.Vector): numericLib.Vector = js.native
  def sineq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def sineqV(x: numericLib.Vector): numericLib.Vector = js.native
  // Solving the linear problem Ax=b
  def solve(matrix: numericLib.Matrix, vector: numericLib.Vector): numericLib.Vector = js.native
  def solveLP(c: numericLib.Vector, A: numericLib.Matrix, b: numericLib.Vector): numericLib.Anon_Iterations = js.native
  def solveLP(c: numericLib.Vector, A: numericLib.Matrix, b: numericLib.Vector, Aeq: numericLib.Matrix): numericLib.Anon_Iterations = js.native
  def solveLP(
    c: numericLib.Vector,
    A: numericLib.Matrix,
    b: numericLib.Vector,
    Aeq: numericLib.Matrix,
    beq: numericLib.Matrix
  ): numericLib.Anon_Iterations = js.native
  def solveLP(
    c: numericLib.Vector,
    A: numericLib.Matrix,
    b: numericLib.Vector,
    Aeq: numericLib.Matrix,
    beq: numericLib.Matrix,
    tol: scala.Double
  ): numericLib.Anon_Iterations = js.native
  def solveLP(
    c: numericLib.Vector,
    A: numericLib.Matrix,
    b: numericLib.Vector,
    Aeq: numericLib.Matrix,
    beq: numericLib.Matrix,
    tol: scala.Double,
    maxit: scala.Double
  ): numericLib.Anon_Iterations = js.native
  def solveQP(Dmat: numericLib.Matrix, dvec: numericLib.Vector, Amat: numericLib.Matrix, bvec: numericLib.Vector): numericLib.Anon_Iact = js.native
  def solveQP(
    Dmat: numericLib.Matrix,
    dvec: numericLib.Vector,
    Amat: numericLib.Matrix,
    bvec: numericLib.Vector,
    meq: scala.Double
  ): numericLib.Anon_Iact = js.native
  def solveQP(
    Dmat: numericLib.Matrix,
    dvec: numericLib.Vector,
    Amat: numericLib.Matrix,
    bvec: numericLib.Vector,
    meq: scala.Double,
    factorized: js.Any
  ): numericLib.Anon_Iact = js.native
  // Splines
  def spline(x: numericLib.Vector, y: numericLib.Matrix | numericLib.Vector): Spline = js.native
  def spline(x: numericLib.Vector, y: numericLib.Matrix | numericLib.Vector, k1: numericLib.Scalar): Spline = js.native
  def spline(
    x: numericLib.Vector,
    y: numericLib.Matrix | numericLib.Vector,
    k1: numericLib.Scalar,
    kn: numericLib.Scalar
  ): Spline = js.native
  @JSName("spline")
  def spline_periodic(
    x: numericLib.Vector,
    y: numericLib.Matrix | numericLib.Vector,
    k1: numericLib.Scalar,
    kn: numericLib.numericLibStrings.periodic
  ): Spline = js.native
  @JSName("spline")
  def spline_periodic(
    x: numericLib.Vector,
    y: numericLib.Matrix | numericLib.Vector,
    k1: numericLib.numericLibStrings.periodic
  ): Spline = js.native
  @JSName("spline")
  def spline_periodic(
    x: numericLib.Vector,
    y: numericLib.Matrix | numericLib.Vector,
    k1: numericLib.numericLibStrings.periodic,
    kn: numericLib.Scalar
  ): Spline = js.native
  @JSName("spline")
  def spline_periodic(
    x: numericLib.Vector,
    y: numericLib.Matrix | numericLib.Vector,
    k1: numericLib.numericLibStrings.periodic,
    kn: numericLib.numericLibStrings.periodic
  ): Spline = js.native
  // Pointwise Math.sqrt(x)
  def sqrt[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def sqrtV(x: numericLib.Vector): numericLib.Vector = js.native
  def sqrteq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def sqrteqV(x: numericLib.Vector): numericLib.Vector = js.native
  /** @deprecated */
  def sscatter(matrix: numericLib.DeprecatedSparseMatrix): numericLib.DeprecatedSparseMatrix = js.native
  /** @deprecated */
  def stranspose(matrix: numericLib.DeprecatedSparseMatrix): numericLib.DeprecatedSparseMatrix = js.native
  def sub(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def sub(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def sub(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def sub(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def sub[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def sub[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  def subSV(x: numericLib.Scalar, y: numericLib.Vector): numericLib.Vector = js.native
  def subVS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def subVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Pointwise x-y
  @JSName("sub")
  def sub_Scalar(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def subeq(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def subeq(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def subeqS(x: numericLib.Vector, y: numericLib.Scalar): numericLib.Vector = js.native
  def subeqV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def sum(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // 	Sum all the entries of x
  def sum(x: numericLib.Scalar): scala.Double = js.native
  def sum(x: numericLib.Vector): scala.Double = js.native
  def sumV(x: numericLib.Vector): scala.Double = js.native
  def sup(x: numericLib.MultidimensionalMatrix): scala.Double = js.native
  // Largest value of entries (not modulus)
  def sup(x: numericLib.Scalar): scala.Double = js.native
  def sup(x: numericLib.Vector): scala.Double = js.native
  def supV(x: numericLib.Vector): scala.Double = js.native
  def svd(matrix: numericLib.Matrix): numericLib.Anon_S = js.native
  // return instance of Tensor class. X — real value, y — imaginary part.
  def t(x: numericLib.TensorValue): Tensor = js.native
  def t(x: numericLib.TensorValue, y: numericLib.TensorValue): Tensor = js.native
  // Pointwise tangent
  def tan[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def tanV(x: numericLib.Vector): numericLib.Vector = js.native
  def taneq[T /* <: numericLib.NonScalar */](x: T): T = js.native
  def taneqV(x: numericLib.Vector): numericLib.Vector = js.native
  // x * y
  def tensor(x: numericLib.Scalar, y: numericLib.Scalar): numericLib.Scalar = js.native
  // 	TensorValue product ret[i][j] = x[i]*y[j]
  def tensor(x: numericLib.Vector, y: numericLib.Vector): numericLib.Matrix = js.native
  // toCSV is buggy.
  // https://github.com/sloisel/numeric/pull/51
  def toCSV(csvArray: js.Array[js.Array[_]]): java.lang.String = js.native
  def toUpperHessenberg(matrix: numericLib.Matrix): numericLib.Anon_H = js.native
  // Matrix transpose
  def transpose(x: numericLib.Matrix): numericLib.Matrix = js.native
  def trunc(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  def trunc(x: numericLib.Vector, y: scala.Double): numericLib.Vector = js.native
  def trunc(x: scala.Double, y: numericLib.Vector): numericLib.Vector = js.native
  def trunc(x: scala.Double, y: scala.Double): numericLib.Vector = js.native
  def truncSV(x: scala.Double, y: numericLib.Vector): numericLib.Vector = js.native
  def truncVS(x: numericLib.Vector, y: scala.Double): numericLib.Vector = js.native
  // Round the values of entries
  def truncVV(x: numericLib.Vector, y: numericLib.Vector): numericLib.Vector = js.native
  // Unconstrained optimisations
  def uncmin(f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar], x0: numericLib.Vector): numericLib.Anon_F = js.native
  def uncmin(
    f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar],
    x0: numericLib.Vector,
    tol: scala.Double
  ): numericLib.Anon_F = js.native
  def uncmin(
    f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar],
    x0: numericLib.Vector,
    tol: scala.Double,
    gradient: js.Any
  ): numericLib.Anon_F = js.native
  def uncmin(
    f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar],
    x0: numericLib.Vector,
    tol: scala.Double,
    gradient: js.Any,
    maxit: scala.Double
  ): numericLib.Anon_F = js.native
  def uncmin(
    f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar],
    x0: numericLib.Vector,
    tol: scala.Double,
    gradient: js.Any,
    maxit: scala.Double,
    callback: js.Function5[
      /* it */ scala.Double, 
      /* x0 */ numericLib.Vector, 
      /* f0 */ numericLib.Scalar, 
      /* g0 */ numericLib.Vector, 
      /* h1 */ numericLib.Matrix, 
      _
    ]
  ): numericLib.Anon_F = js.native
  def uncmin(
    f: js.Function1[/* x */ numericLib.Vector, numericLib.Scalar],
    x0: numericLib.Vector,
    tol: scala.Double,
    gradient: js.Any,
    maxit: scala.Double,
    callback: js.Function5[
      /* it */ scala.Double, 
      /* x0 */ numericLib.Vector, 
      /* f0 */ numericLib.Scalar, 
      /* g0 */ numericLib.Vector, 
      /* h1 */ numericLib.Matrix, 
      _
    ],
    options: numericLib.Anon_Hinv
  ): numericLib.Anon_F = js.native
  def `|`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `|`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `|`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `|`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `|`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `|`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("|")
  def `|_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
  def `||`(x: numericLib.Scalar, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `||`(x: numericLib.Scalar, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `||`(x: numericLib.Vector, y: numericLib.Scalar, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `||`(x: numericLib.Vector, y: numericLib.Vector, args: (numericLib.Scalar | numericLib.Vector)*): numericLib.Vector = js.native
  def `||`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: T, args: (numericLib.Scalar | T)*): T = js.native
  def `||`[T /* <: numericLib.MultidimensionalMatrix */](x: T, y: numericLib.Scalar, args: (numericLib.Scalar | T)*): T = js.native
  @JSName("||")
  def `||_Scalar`(x: numericLib.Scalar, y: numericLib.Scalar, args: numericLib.Scalar*): numericLib.Scalar = js.native
}

