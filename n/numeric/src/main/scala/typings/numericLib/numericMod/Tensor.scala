package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tensor extends js.Object {
  var x: numericLib.TensorValue = js.native
  var y: js.UndefOr[numericLib.TensorValue] = js.native
  def abs(): Tensor = js.native
  def add(tensor: numericLib.TensorValue): Tensor = js.native
  def add(tensor: Tensor): Tensor = js.native
  def conj(): Tensor = js.native
  def cos(): Tensor = js.native
  def diag(d: numericLib.TensorValue): Tensor = js.native
  def diag(d: Tensor): Tensor = js.native
  def div(tensor: numericLib.TensorValue): Tensor = js.native
  def div(tensor: Tensor): Tensor = js.native
  def dot(tensor: numericLib.TensorValue): Tensor = js.native
  def dot(tensor: Tensor): Tensor = js.native
  def eig(): numericLib.Anon_Lambda = js.native
  def exp(): Tensor = js.native
  // fast fourier transforms
  def fft(): Tensor = js.native
  def get(i: numericLib.Vector): Tensor = js.native
  def getBlock(from: numericLib.Vector, to: numericLib.Vector): Tensor = js.native
  def getDiag(): Tensor = js.native
  def getRow(k: scala.Double): Tensor = js.native
  def getRows(i0: scala.Double, i1: scala.Double): Tensor = js.native
  def identity(n: scala.Double): Tensor = js.native
  def ifft(): Tensor = js.native
  def inv(): Tensor = js.native
  def log(): Tensor = js.native
  def mul(tensor: numericLib.TensorValue): Tensor = js.native
  def mul(tensor: Tensor): Tensor = js.native
  def neg(): Tensor = js.native
  def norm2(): Tensor = js.native
  // it's buggy. https://github.com/sloisel/numeric/pull/59
  def reciprocal(): Tensor = js.native
  def rep(s: numericLib.Vector, value: numericLib.TensorValue): Tensor = js.native
  def rep(s: numericLib.Vector, value: Tensor): Tensor = js.native
  def set(i: numericLib.Vector, value: Tensor): Tensor = js.native
  def setBlock(from: numericLib.Vector, to: numericLib.Vector, tensor: Tensor): Tensor = js.native
  def setRow(i: scala.Double, tensor: Tensor): Tensor = js.native
  def setRows(i0: scala.Double, i1: scala.Double, tensor: Tensor): Tensor = js.native
  def sin(): Tensor = js.native
  def sub(tensor: numericLib.TensorValue): Tensor = js.native
  def sub(tensor: Tensor): Tensor = js.native
  def transjugate(): Tensor = js.native
  def transpose(): Tensor = js.native
}

