package typings
package nblasLib.nblasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ConjTrans: nblasLib.nblasMod.TRANS = js.native
  val Left: nblasLib.nblasMod.SIDE = js.native
  val Lower: nblasLib.nblasMod.UPLO = js.native
  val NoTrans: nblasLib.nblasMod.TRANS = js.native
  val NonUnit: nblasLib.nblasMod.DIAG = js.native
  val Right: nblasLib.nblasMod.SIDE = js.native
  val Trans: nblasLib.nblasMod.TRANS = js.native
  val Unit: nblasLib.nblasMod.DIAG = js.native
  val Upper: nblasLib.nblasMod.UPLO = js.native
  def asum(x: stdLib.Float32Array): scala.Double = js.native
  def asum(x: stdLib.Float64Array): scala.Double = js.native
  def axpy(x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def axpy(x: stdLib.Float32Array, y: stdLib.Float32Array, alpha: scala.Double): scala.Unit = js.native
  def axpy(x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def axpy(x: stdLib.Float64Array, y: stdLib.Float64Array, alpha: scala.Double): scala.Unit = js.native
  def copy(x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def copy(x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def dot(x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Double = js.native
  def dot(x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Double = js.native
  def gbmv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def gbmv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array, kl: scala.Double): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    kl: scala.Double,
    ku: scala.Double
  ): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    kl: scala.Double,
    ku: scala.Double,
    alpha: scala.Double
  ): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    kl: scala.Double,
    ku: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    kl: scala.Double,
    ku: scala.Double,
    alpha: scala.Double,
    beta: scala.Double,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gbmv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def gbmv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array, kl: scala.Double): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    kl: scala.Double,
    ku: scala.Double
  ): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    kl: scala.Double,
    ku: scala.Double,
    alpha: scala.Double
  ): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    kl: scala.Double,
    ku: scala.Double,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def gbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    kl: scala.Double,
    ku: scala.Double,
    alpha: scala.Double,
    beta: scala.Double,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS,
    transb: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS,
    transb: nblasLib.nblasMod.TRANS,
    alpha: scala.Double
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS,
    transb: nblasLib.nblasMod.TRANS,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS,
    transb: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS,
    transb: nblasLib.nblasMod.TRANS,
    alpha: scala.Double
  ): scala.Unit = js.native
  def gemm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    k: scala.Double,
    transa: nblasLib.nblasMod.TRANS,
    transb: nblasLib.nblasMod.TRANS,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def gemv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def gemv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array, alpha: scala.Double): scala.Unit = js.native
  def gemv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def gemv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    alpha: scala.Double,
    beta: scala.Double,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def gemv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def gemv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array, alpha: scala.Double): scala.Unit = js.native
  def gemv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def gemv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    alpha: scala.Double,
    beta: scala.Double,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def ger(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def ger(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array, alpha: scala.Double): scala.Unit = js.native
  def ger(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def ger(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array, alpha: scala.Double): scala.Unit = js.native
  def iamax(x: stdLib.Float32Array): scala.Double = js.native
  def iamax(x: stdLib.Float64Array): scala.Double = js.native
  def nrm2(x: stdLib.Float32Array): scala.Double = js.native
  def nrm2(x: stdLib.Float64Array): scala.Double = js.native
  def rot(x: stdLib.Float32Array, y: stdLib.Float32Array, c: scala.Double, s: scala.Double): scala.Unit = js.native
  def rot(x: stdLib.Float64Array, y: stdLib.Float64Array, c: scala.Double, s: scala.Double): scala.Unit = js.native
  def rotg(x: stdLib.Float32Array, y: stdLib.Float32Array, c: stdLib.Float32Array, s: stdLib.Float32Array): scala.Unit = js.native
  def rotg(x: stdLib.Float64Array, y: stdLib.Float64Array, c: stdLib.Float64Array, s: stdLib.Float64Array): scala.Unit = js.native
  def rotm(x: stdLib.Float32Array, y: stdLib.Float32Array, param: stdLib.Float32Array): scala.Unit = js.native
  def rotm(x: stdLib.Float64Array, y: stdLib.Float64Array, param: stdLib.Float64Array): scala.Unit = js.native
  def rotmg(
    d1: stdLib.Float32Array,
    d2: stdLib.Float32Array,
    x1: stdLib.Float32Array,
    y1: scala.Double,
    param: stdLib.Float32Array
  ): scala.Unit = js.native
  def rotmg(
    d1: stdLib.Float64Array,
    d2: stdLib.Float64Array,
    x1: stdLib.Float64Array,
    y1: scala.Double,
    param: stdLib.Float64Array
  ): scala.Unit = js.native
  def sbmv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def sbmv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array, k: scala.Double): scala.Unit = js.native
  def sbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def sbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def sbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def sbmv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def sbmv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array, k: scala.Double): scala.Unit = js.native
  def sbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def sbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def sbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def scal(x: stdLib.Float32Array, alpha: scala.Double): scala.Unit = js.native
  def scal(x: stdLib.Float64Array, alpha: scala.Double): scala.Unit = js.native
  def spmv(ap: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def spmv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def spmv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def spmv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def spmv(ap: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def spmv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def spmv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def spmv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def spr(ap: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def spr(ap: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def spr(ap: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO, alpha: scala.Double): scala.Unit = js.native
  def spr(ap: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def spr(ap: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def spr(ap: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO, alpha: scala.Double): scala.Unit = js.native
  def spr2(ap: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def spr2(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def spr2(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def spr2(ap: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def spr2(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def spr2(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def swap(x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def swap(x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def symm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def symm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def symv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def symv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def symv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def symv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def symv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def symv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def symv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def symv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def syr(a: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def syr(a: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def syr(a: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO, alpha: scala.Double): scala.Unit = js.native
  def syr(a: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def syr(a: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def syr(a: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO, alpha: scala.Double): scala.Unit = js.native
  def syr2(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def syr2(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def syr2(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def syr2(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def syr2(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def syr2(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    alpha: scala.Double
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double
  ): scala.Unit = js.native
  def syr2k(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def syrk(a: stdLib.Float32Array, c: stdLib.Float32Array, n: scala.Double, k: scala.Double): scala.Unit = js.native
  def syrk(
    a: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def syrk(
    a: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def syrk(
    a: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double
  ): scala.Unit = js.native
  def syrk(
    a: stdLib.Float32Array,
    c: stdLib.Float32Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def syrk(a: stdLib.Float64Array, c: stdLib.Float64Array, n: scala.Double, k: scala.Double): scala.Unit = js.native
  def syrk(
    a: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def syrk(
    a: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def syrk(
    a: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double
  ): scala.Unit = js.native
  def syrk(
    a: stdLib.Float64Array,
    c: stdLib.Float64Array,
    n: scala.Double,
    k: scala.Double,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    alpha: scala.Double,
    beta: scala.Double
  ): scala.Unit = js.native
  def tbmv(a: stdLib.Float32Array, x: stdLib.Float32Array, y: stdLib.Float32Array): scala.Unit = js.native
  def tbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def tbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tbmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    y: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tbmv(a: stdLib.Float64Array, x: stdLib.Float64Array, y: stdLib.Float64Array): scala.Unit = js.native
  def tbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def tbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tbmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    y: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tbsv(a: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def tbsv(a: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def tbsv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tbsv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tbsv(a: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def tbsv(a: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def tbsv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tbsv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tpmv(ap: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def tpmv(ap: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def tpmv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tpmv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tpmv(ap: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def tpmv(ap: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def tpmv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tpmv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tpsv(ap: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def tpsv(ap: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def tpsv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tpsv(
    ap: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def tpsv(ap: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def tpsv(ap: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def tpsv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def tpsv(
    ap: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG,
    alpha: scala.Double
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trmm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG,
    alpha: scala.Double
  ): scala.Unit = js.native
  def trmv(a: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def trmv(a: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def trmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trmv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trmv(a: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def trmv(a: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def trmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trmv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float32Array,
    b: stdLib.Float32Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG,
    alpha: scala.Double
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trsm(
    a: stdLib.Float64Array,
    b: stdLib.Float64Array,
    m: scala.Double,
    n: scala.Double,
    side: nblasLib.nblasMod.SIDE,
    uplo: nblasLib.nblasMod.UPLO,
    transa: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG,
    alpha: scala.Double
  ): scala.Unit = js.native
  def trsv(a: stdLib.Float32Array, x: stdLib.Float32Array): scala.Unit = js.native
  def trsv(a: stdLib.Float32Array, x: stdLib.Float32Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def trsv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trsv(
    a: stdLib.Float32Array,
    x: stdLib.Float32Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
  def trsv(a: stdLib.Float64Array, x: stdLib.Float64Array): scala.Unit = js.native
  def trsv(a: stdLib.Float64Array, x: stdLib.Float64Array, uplo: nblasLib.nblasMod.UPLO): scala.Unit = js.native
  def trsv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS
  ): scala.Unit = js.native
  def trsv(
    a: stdLib.Float64Array,
    x: stdLib.Float64Array,
    uplo: nblasLib.nblasMod.UPLO,
    trans: nblasLib.nblasMod.TRANS,
    diag: nblasLib.nblasMod.DIAG
  ): scala.Unit = js.native
}

