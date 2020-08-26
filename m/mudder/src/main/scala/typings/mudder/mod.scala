package typings.mudder

import typings.mudder.anon.Carry
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mudder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SymbolTable protected () extends js.Object {
    def this(symbols: String) = this()
    def this(symbols: js.Array[String]) = this()
    def this(symbols: String, map: Map[String, Double]) = this()
    def this(symbols: String, map: Record[String, Double]) = this()
    def this(symbols: js.Array[String], map: Map[String, Double]) = this()
    def this(symbols: js.Array[String], map: Record[String, Double]) = this()
    var isPrefixCode: Boolean = js.native
    var maxBase: Double = js.native
    var num2sym: js.Array[String] = js.native
    var sym2num: Map[String, Double] = js.native
    def digitsToNumber(digits: js.Array[Double]): Double = js.native
    def digitsToNumber(digits: js.Array[Double], base: Double): Double = js.native
    def digitsToString(digits: js.Array[Double]): String = js.native
    def mudder(
      a: js.UndefOr[String | js.Array[String]],
      b: js.UndefOr[String | js.Array[String]],
      numStrings: js.UndefOr[Double],
      base: js.UndefOr[Double],
      numDivisions: js.UndefOr[Double]
    ): js.Array[String] = js.native
    def mudder(num: Double): js.Array[String] = js.native
    def numberToDigits(num: Double): js.Array[Double] = js.native
    def numberToDigits(num: Double, base: Double): js.Array[Double] = js.native
    def numberToString(num: Double): String = js.native
    def numberToString(num: Double, base: Double): String = js.native
    def roundFraction(num: Double, den: Double): js.Array[Double] = js.native
    def roundFraction(num: Double, den: Double, base: Double): js.Array[Double] = js.native
    def stringToDigits(string: String): js.Array[Double] = js.native
    def stringToDigits(string: js.Array[String]): js.Array[Double] = js.native
    def stringToNumber(num: String): Double = js.native
    def stringToNumber(num: String, base: Double): Double = js.native
    def stringToNumber(num: js.Array[String]): Double = js.native
    def stringToNumber(num: js.Array[String], base: Double): Double = js.native
  }
  
  val alphabet: SymbolTable = js.native
  val base36: SymbolTable = js.native
  val base62: SymbolTable = js.native
  def longLinspace(a: js.Array[Double], b: js.Array[Double], base: Double, N: Double, M: Double): js.Array[Carry] = js.native
}

