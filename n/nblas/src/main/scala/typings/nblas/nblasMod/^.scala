package typings.nblas.nblasMod

import typings.nblas.nblasNumbers.`111`
import typings.nblas.nblasNumbers.`112`
import typings.nblas.nblasNumbers.`113`
import typings.nblas.nblasNumbers.`121`
import typings.nblas.nblasNumbers.`122`
import typings.nblas.nblasNumbers.`131`
import typings.nblas.nblasNumbers.`132`
import typings.nblas.nblasNumbers.`141`
import typings.nblas.nblasNumbers.`142`
import typings.std.Float32Array
import typings.std.Float64Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ConjTrans: `113` = js.native
  val Left: `141` = js.native
  val Lower: `122` = js.native
  val NoTrans: `111` = js.native
  val NonUnit: `131` = js.native
  val Right: `142` = js.native
  val Trans: `112` = js.native
  val Unit: `132` = js.native
  val Upper: `121` = js.native
  def asum(x: Float32Array): Double = js.native
  def asum(x: Float64Array): Double = js.native
  def axpy(x: Float32Array, y: Float32Array): scala.Unit = js.native
  def axpy(x: Float32Array, y: Float32Array, alpha: Double): scala.Unit = js.native
  def axpy(x: Float64Array, y: Float64Array): scala.Unit = js.native
  def axpy(x: Float64Array, y: Float64Array, alpha: Double): scala.Unit = js.native
  def copy(x: Float32Array, y: Float32Array): scala.Unit = js.native
  def copy(x: Float64Array, y: Float64Array): scala.Unit = js.native
  def dot(x: Float32Array, y: Float32Array): Double = js.native
  def dot(x: Float64Array, y: Float64Array): Double = js.native
  def gbmv(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def gbmv(a: Float32Array, x: Float32Array, y: Float32Array, kl: Double): scala.Unit = js.native
  def gbmv(a: Float32Array, x: Float32Array, y: Float32Array, kl: Double, ku: Double): scala.Unit = js.native
  def gbmv(a: Float32Array, x: Float32Array, y: Float32Array, kl: Double, ku: Double, alpha: Double): scala.Unit = js.native
  def gbmv(
    a: Float32Array,
    x: Float32Array,
    y: Float32Array,
    kl: Double,
    ku: Double,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def gbmv(
    a: Float32Array,
    x: Float32Array,
    y: Float32Array,
    kl: Double,
    ku: Double,
    alpha: Double,
    beta: Double,
    trans: TRANS
  ): scala.Unit = js.native
  def gbmv(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def gbmv(a: Float64Array, x: Float64Array, y: Float64Array, kl: Double): scala.Unit = js.native
  def gbmv(a: Float64Array, x: Float64Array, y: Float64Array, kl: Double, ku: Double): scala.Unit = js.native
  def gbmv(a: Float64Array, x: Float64Array, y: Float64Array, kl: Double, ku: Double, alpha: Double): scala.Unit = js.native
  def gbmv(
    a: Float64Array,
    x: Float64Array,
    y: Float64Array,
    kl: Double,
    ku: Double,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def gbmv(
    a: Float64Array,
    x: Float64Array,
    y: Float64Array,
    kl: Double,
    ku: Double,
    alpha: Double,
    beta: Double,
    trans: TRANS
  ): scala.Unit = js.native
  def gemm(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, k: Double): scala.Unit = js.native
  def gemm(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, k: Double, transa: TRANS): scala.Unit = js.native
  def gemm(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS
  ): scala.Unit = js.native
  def gemm(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double
  ): scala.Unit = js.native
  def gemm(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def gemm(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, k: Double): scala.Unit = js.native
  def gemm(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, k: Double, transa: TRANS): scala.Unit = js.native
  def gemm(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS
  ): scala.Unit = js.native
  def gemm(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double
  ): scala.Unit = js.native
  def gemm(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    k: Double,
    transa: TRANS,
    transb: TRANS,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def gemv(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def gemv(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double): scala.Unit = js.native
  def gemv(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double, beta: Double): scala.Unit = js.native
  def gemv(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double, beta: Double, trans: TRANS): scala.Unit = js.native
  def gemv(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def gemv(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double): scala.Unit = js.native
  def gemv(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double, beta: Double): scala.Unit = js.native
  def gemv(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double, beta: Double, trans: TRANS): scala.Unit = js.native
  def ger(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def ger(a: Float32Array, x: Float32Array, y: Float32Array, alpha: Double): scala.Unit = js.native
  def ger(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def ger(a: Float64Array, x: Float64Array, y: Float64Array, alpha: Double): scala.Unit = js.native
  def iamax(x: Float32Array): Double = js.native
  def iamax(x: Float64Array): Double = js.native
  def nrm2(x: Float32Array): Double = js.native
  def nrm2(x: Float64Array): Double = js.native
  def rot(x: Float32Array, y: Float32Array, c: Double, s: Double): scala.Unit = js.native
  def rot(x: Float64Array, y: Float64Array, c: Double, s: Double): scala.Unit = js.native
  def rotg(x: Float32Array, y: Float32Array, c: Float32Array, s: Float32Array): scala.Unit = js.native
  def rotg(x: Float64Array, y: Float64Array, c: Float64Array, s: Float64Array): scala.Unit = js.native
  def rotm(x: Float32Array, y: Float32Array, param: Float32Array): scala.Unit = js.native
  def rotm(x: Float64Array, y: Float64Array, param: Float64Array): scala.Unit = js.native
  def rotmg(d1: Float32Array, d2: Float32Array, x1: Float32Array, y1: Double, param: Float32Array): scala.Unit = js.native
  def rotmg(d1: Float64Array, d2: Float64Array, x1: Float64Array, y1: Double, param: Float64Array): scala.Unit = js.native
  def sbmv(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def sbmv(a: Float32Array, x: Float32Array, y: Float32Array, k: Double): scala.Unit = js.native
  def sbmv(a: Float32Array, x: Float32Array, y: Float32Array, k: Double, uplo: UPLO): scala.Unit = js.native
  def sbmv(a: Float32Array, x: Float32Array, y: Float32Array, k: Double, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def sbmv(
    a: Float32Array,
    x: Float32Array,
    y: Float32Array,
    k: Double,
    uplo: UPLO,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def sbmv(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def sbmv(a: Float64Array, x: Float64Array, y: Float64Array, k: Double): scala.Unit = js.native
  def sbmv(a: Float64Array, x: Float64Array, y: Float64Array, k: Double, uplo: UPLO): scala.Unit = js.native
  def sbmv(a: Float64Array, x: Float64Array, y: Float64Array, k: Double, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def sbmv(
    a: Float64Array,
    x: Float64Array,
    y: Float64Array,
    k: Double,
    uplo: UPLO,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def scal(x: Float32Array, alpha: Double): scala.Unit = js.native
  def scal(x: Float64Array, alpha: Double): scala.Unit = js.native
  def spmv(ap: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def spmv(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO): scala.Unit = js.native
  def spmv(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def spmv(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double, beta: Double): scala.Unit = js.native
  def spmv(ap: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def spmv(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO): scala.Unit = js.native
  def spmv(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def spmv(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double, beta: Double): scala.Unit = js.native
  def spr(ap: Float32Array, x: Float32Array): scala.Unit = js.native
  def spr(ap: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def spr(ap: Float32Array, x: Float32Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def spr(ap: Float64Array, x: Float64Array): scala.Unit = js.native
  def spr(ap: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def spr(ap: Float64Array, x: Float64Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def spr2(ap: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def spr2(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO): scala.Unit = js.native
  def spr2(ap: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def spr2(ap: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def spr2(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO): scala.Unit = js.native
  def spr2(ap: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def swap(x: Float32Array, y: Float32Array): scala.Unit = js.native
  def swap(x: Float64Array, y: Float64Array): scala.Unit = js.native
  def symm(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, side: SIDE): scala.Unit = js.native
  def symm(a: Float32Array, b: Float32Array, c: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO): scala.Unit = js.native
  def symm(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double
  ): scala.Unit = js.native
  def symm(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def symm(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, side: SIDE): scala.Unit = js.native
  def symm(a: Float64Array, b: Float64Array, c: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO): scala.Unit = js.native
  def symm(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double
  ): scala.Unit = js.native
  def symm(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def symv(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def symv(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO): scala.Unit = js.native
  def symv(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def symv(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double, beta: Double): scala.Unit = js.native
  def symv(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def symv(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO): scala.Unit = js.native
  def symv(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def symv(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double, beta: Double): scala.Unit = js.native
  def syr(a: Float32Array, x: Float32Array): scala.Unit = js.native
  def syr(a: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def syr(a: Float32Array, x: Float32Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def syr(a: Float64Array, x: Float64Array): scala.Unit = js.native
  def syr(a: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def syr(a: Float64Array, x: Float64Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def syr2(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def syr2(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO): scala.Unit = js.native
  def syr2(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def syr2(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def syr2(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO): scala.Unit = js.native
  def syr2(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, alpha: Double): scala.Unit = js.native
  def syr2k(a: Float32Array, b: Float32Array, c: Float32Array, n: Double, k: Double): scala.Unit = js.native
  def syr2k(a: Float32Array, b: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO): scala.Unit = js.native
  def syr2k(a: Float32Array, b: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def syr2k(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double
  ): scala.Unit = js.native
  def syr2k(
    a: Float32Array,
    b: Float32Array,
    c: Float32Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def syr2k(a: Float64Array, b: Float64Array, c: Float64Array, n: Double, k: Double): scala.Unit = js.native
  def syr2k(a: Float64Array, b: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO): scala.Unit = js.native
  def syr2k(a: Float64Array, b: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def syr2k(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double
  ): scala.Unit = js.native
  def syr2k(
    a: Float64Array,
    b: Float64Array,
    c: Float64Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def syrk(a: Float32Array, c: Float32Array, n: Double, k: Double): scala.Unit = js.native
  def syrk(a: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO): scala.Unit = js.native
  def syrk(a: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def syrk(a: Float32Array, c: Float32Array, n: Double, k: Double, uplo: UPLO, trans: TRANS, alpha: Double): scala.Unit = js.native
  def syrk(
    a: Float32Array,
    c: Float32Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def syrk(a: Float64Array, c: Float64Array, n: Double, k: Double): scala.Unit = js.native
  def syrk(a: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO): scala.Unit = js.native
  def syrk(a: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def syrk(a: Float64Array, c: Float64Array, n: Double, k: Double, uplo: UPLO, trans: TRANS, alpha: Double): scala.Unit = js.native
  def syrk(
    a: Float64Array,
    c: Float64Array,
    n: Double,
    k: Double,
    uplo: UPLO,
    trans: TRANS,
    alpha: Double,
    beta: Double
  ): scala.Unit = js.native
  def tbmv(a: Float32Array, x: Float32Array, y: Float32Array): scala.Unit = js.native
  def tbmv(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO): scala.Unit = js.native
  def tbmv(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tbmv(a: Float32Array, x: Float32Array, y: Float32Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tbmv(a: Float64Array, x: Float64Array, y: Float64Array): scala.Unit = js.native
  def tbmv(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO): scala.Unit = js.native
  def tbmv(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tbmv(a: Float64Array, x: Float64Array, y: Float64Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tbsv(a: Float32Array, x: Float32Array): scala.Unit = js.native
  def tbsv(a: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def tbsv(a: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tbsv(a: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tbsv(a: Float64Array, x: Float64Array): scala.Unit = js.native
  def tbsv(a: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def tbsv(a: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tbsv(a: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tpmv(ap: Float32Array, x: Float32Array): scala.Unit = js.native
  def tpmv(ap: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def tpmv(ap: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tpmv(ap: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tpmv(ap: Float64Array, x: Float64Array): scala.Unit = js.native
  def tpmv(ap: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def tpmv(ap: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tpmv(ap: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tpsv(ap: Float32Array, x: Float32Array): scala.Unit = js.native
  def tpsv(ap: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def tpsv(ap: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tpsv(ap: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def tpsv(ap: Float64Array, x: Float64Array): scala.Unit = js.native
  def tpsv(ap: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def tpsv(ap: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def tpsv(ap: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def trmm(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE): scala.Unit = js.native
  def trmm(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO): scala.Unit = js.native
  def trmm(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO, transa: TRANS): scala.Unit = js.native
  def trmm(
    a: Float32Array,
    b: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG
  ): scala.Unit = js.native
  def trmm(
    a: Float32Array,
    b: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG,
    alpha: Double
  ): scala.Unit = js.native
  def trmm(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE): scala.Unit = js.native
  def trmm(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO): scala.Unit = js.native
  def trmm(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO, transa: TRANS): scala.Unit = js.native
  def trmm(
    a: Float64Array,
    b: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG
  ): scala.Unit = js.native
  def trmm(
    a: Float64Array,
    b: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG,
    alpha: Double
  ): scala.Unit = js.native
  def trmv(a: Float32Array, x: Float32Array): scala.Unit = js.native
  def trmv(a: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def trmv(a: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def trmv(a: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def trmv(a: Float64Array, x: Float64Array): scala.Unit = js.native
  def trmv(a: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def trmv(a: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def trmv(a: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def trsm(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE): scala.Unit = js.native
  def trsm(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO): scala.Unit = js.native
  def trsm(a: Float32Array, b: Float32Array, m: Double, n: Double, side: SIDE, uplo: UPLO, transa: TRANS): scala.Unit = js.native
  def trsm(
    a: Float32Array,
    b: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG
  ): scala.Unit = js.native
  def trsm(
    a: Float32Array,
    b: Float32Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG,
    alpha: Double
  ): scala.Unit = js.native
  def trsm(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE): scala.Unit = js.native
  def trsm(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO): scala.Unit = js.native
  def trsm(a: Float64Array, b: Float64Array, m: Double, n: Double, side: SIDE, uplo: UPLO, transa: TRANS): scala.Unit = js.native
  def trsm(
    a: Float64Array,
    b: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG
  ): scala.Unit = js.native
  def trsm(
    a: Float64Array,
    b: Float64Array,
    m: Double,
    n: Double,
    side: SIDE,
    uplo: UPLO,
    transa: TRANS,
    diag: DIAG,
    alpha: Double
  ): scala.Unit = js.native
  def trsv(a: Float32Array, x: Float32Array): scala.Unit = js.native
  def trsv(a: Float32Array, x: Float32Array, uplo: UPLO): scala.Unit = js.native
  def trsv(a: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def trsv(a: Float32Array, x: Float32Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
  def trsv(a: Float64Array, x: Float64Array): scala.Unit = js.native
  def trsv(a: Float64Array, x: Float64Array, uplo: UPLO): scala.Unit = js.native
  def trsv(a: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS): scala.Unit = js.native
  def trsv(a: Float64Array, x: Float64Array, uplo: UPLO, trans: TRANS, diag: DIAG): scala.Unit = js.native
}

