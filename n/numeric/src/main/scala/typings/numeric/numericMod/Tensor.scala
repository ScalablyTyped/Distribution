package typings.numeric.numericMod

import typings.numeric.Anon_E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tensor extends js.Object {
  var x: TensorValue = js.native
  var y: js.UndefOr[TensorValue] = js.native
  def abs(): Tensor = js.native
  def add(tensor: Tensor): Tensor = js.native
  def add(tensor: TensorValue): Tensor = js.native
  def conj(): Tensor = js.native
  def cos(): Tensor = js.native
  def diag(d: Tensor): Tensor = js.native
  def diag(d: TensorValue): Tensor = js.native
  def div(tensor: Tensor): Tensor = js.native
  def div(tensor: TensorValue): Tensor = js.native
  def dot(tensor: Tensor): Tensor = js.native
  def dot(tensor: TensorValue): Tensor = js.native
  def eig(): Anon_E = js.native
  def exp(): Tensor = js.native
  // fast fourier transforms
  def fft(): Tensor = js.native
  def get(i: Vector): Tensor = js.native
  def getBlock(from: Vector, to: Vector): Tensor = js.native
  def getDiag(): Tensor = js.native
  def getRow(k: Double): Tensor = js.native
  def getRows(i0: Double, i1: Double): Tensor = js.native
  def identity(n: Double): Tensor = js.native
  def ifft(): Tensor = js.native
  def inv(): Tensor = js.native
  def log(): Tensor = js.native
  def mul(tensor: Tensor): Tensor = js.native
  def mul(tensor: TensorValue): Tensor = js.native
  def neg(): Tensor = js.native
  def norm2(): Tensor = js.native
  // it's buggy. https://github.com/sloisel/numeric/pull/59
  def reciprocal(): Tensor = js.native
  def rep(s: Vector, value: Tensor): Tensor = js.native
  def rep(s: Vector, value: TensorValue): Tensor = js.native
  def set(i: Vector, value: Tensor): Tensor = js.native
  def setBlock(from: Vector, to: Vector, tensor: Tensor): Tensor = js.native
  def setRow(i: Double, tensor: Tensor): Tensor = js.native
  def setRows(i0: Double, i1: Double, tensor: Tensor): Tensor = js.native
  def sin(): Tensor = js.native
  def sub(tensor: Tensor): Tensor = js.native
  def sub(tensor: TensorValue): Tensor = js.native
  def transjugate(): Tensor = js.native
  def transpose(): Tensor = js.native
}

