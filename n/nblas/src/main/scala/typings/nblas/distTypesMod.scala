package typings.nblas

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type FloatArray = js.typedarray.Float64Array | js.typedarray.Float32Array
  
  @js.native
  trait INBlas
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    def asum(x: FloatArray): Double = js.native
    
    def axpy(x: FloatArray, y: FloatArray): Unit = js.native
    def axpy(x: FloatArray, y: FloatArray, a: Double): Unit = js.native
    
    def caxpy(
      n: Double,
      alpha: js.typedarray.Float32Array,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def ccopy(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def cgbmv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: js.typedarray.Float32Array,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def cgemm(
      transa: MatrixTrans,
      transb: MatrixTrans,
      m: Double,
      n: Double,
      k: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      beta: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def cgemv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: js.typedarray.Float32Array,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def copy(x: FloatArray, y: FloatArray): Unit = js.native
    
    def cscal(n: Double, a: js.typedarray.Float32Array, x: js.typedarray.Float32Array, incx: Double): Unit = js.native
    
    def cswap(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def csymm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      beta: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def csyr2k(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      beta: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def csyrk(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      beta: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def ctbmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def ctbsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def ctpmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float32Array,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def ctpsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float32Array,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def ctrmm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Unit = js.native
    
    def ctrmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def ctrsm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float32Array,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Unit = js.native
    
    def ctrsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def dasum(n: Double, x: js.typedarray.Float64Array, incx: Double): Double = js.native
    
    def daxpy(
      n: Double,
      alpha: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dcopy(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def ddot(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Double = js.native
    
    def dgbmv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dgemm(
      transa: MatrixTrans,
      transb: MatrixTrans,
      m: Double,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      beta: Double,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def dgemv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dger(
      m: Double,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double,
      a: js.typedarray.Float64Array,
      lda: Double
    ): Unit = js.native
    
    def dnrm2(n: Double, x: js.typedarray.Float64Array, incx: Double): Double = js.native
    
    def dot(x: FloatArray, y: FloatArray): Double = js.native
    
    def drot(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double,
      c: Double,
      s: Double
    ): Unit = js.native
    
    def drotg(
      a: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      s: js.typedarray.Float64Array
    ): Unit = js.native
    
    def drotm(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def drotmg(
      d1: js.typedarray.Float64Array,
      d2: js.typedarray.Float64Array,
      x1: js.typedarray.Float64Array,
      y1: js.typedarray.Float64Array,
      param: js.typedarray.Float64Array
    ): Unit = js.native
    
    def dsbmv(
      uplo: MatrixUpperLower,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dscal(n: Double, a: Double, x: js.typedarray.Float64Array, incx: Double): Unit = js.native
    
    def dspmv(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      ap: js.typedarray.Float64Array,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dspr(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      ap: js.typedarray.Float64Array
    ): Unit = js.native
    
    def dspr2(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double,
      ap: js.typedarray.Float64Array
    ): Unit = js.native
    
    def dswap(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dsymm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      beta: Double,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def dsymv(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def dsyr(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      a: js.typedarray.Float64Array,
      lda: Double
    ): Unit = js.native
    
    def dsyr2(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double,
      a: js.typedarray.Float64Array,
      lda: Double
    ): Unit = js.native
    
    def dsyr2k(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      beta: Double,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def dsyrk(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      beta: Double,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def dtbmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def dtbsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def dtpmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float64Array,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def dtpsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float64Array,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def dtrmm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Unit = js.native
    
    def dtrmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def dtrsm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Unit = js.native
    
    def dtrsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def dzasum(n: Double, x: js.typedarray.Float64Array, incx: Double): Double = js.native
    
    def dznrm2(n: Double, x: js.typedarray.Float64Array, incx: Double): Double = js.native
    
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Double, alpha: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Double, alpha: Double, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Double,
      alpha: Double,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Double,
      alpha: Double,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Double, alpha: Unit, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Double,
      alpha: Unit,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Double,
      alpha: Unit,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Unit, alpha: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Unit, alpha: Double, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Unit,
      alpha: Double,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Unit,
      alpha: Double,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Double, ku: Unit, alpha: Unit, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Unit,
      alpha: Unit,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Double,
      ku: Unit,
      alpha: Unit,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Double, alpha: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Double, alpha: Double, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Double,
      alpha: Double,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Double,
      alpha: Double,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Double, alpha: Unit, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Double,
      alpha: Unit,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Double,
      alpha: Unit,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Unit, alpha: Double): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Unit, alpha: Double, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Unit,
      alpha: Double,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Unit,
      alpha: Double,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(a: FloatArray, x: FloatArray, y: FloatArray, kl: Unit, ku: Unit, alpha: Unit, beta: Double): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Unit,
      alpha: Unit,
      beta: Double,
      trans: MatrixTrans
    ): Unit = js.native
    def gbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      kl: Unit,
      ku: Unit,
      alpha: Unit,
      beta: Unit,
      trans: MatrixTrans
    ): Unit = js.native
    
    def gemm(a: FloatArray, b: FloatArray, c: FloatArray, m: Double, n: Double, k: Double): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: Unit,
      alpha: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: MatrixTrans
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: MatrixTrans,
      alpha: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: MatrixTrans,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: Unit,
      transb: MatrixTrans,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def gemm(a: FloatArray, b: FloatArray, c: FloatArray, m: Double, n: Double, k: Double, transa: MatrixTrans): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: Unit,
      alpha: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: MatrixTrans
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: MatrixTrans,
      alpha: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: MatrixTrans,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def gemm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      k: Double,
      transa: MatrixTrans,
      transb: MatrixTrans,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Double): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Double, beta: Double): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Double, beta: Double, trans: MatrixTrans): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Double, beta: Unit, trans: MatrixTrans): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Unit, beta: Double): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Unit, beta: Double, trans: MatrixTrans): Unit = js.native
    def gemv(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Unit, beta: Unit, trans: MatrixTrans): Unit = js.native
    
    def ger(a: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def ger(a: FloatArray, x: FloatArray, y: FloatArray, alpha: Double): Unit = js.native
    
    def iamax(x: FloatArray): Double = js.native
    
    def icamax(n: Double, x: js.typedarray.Float32Array, incx: Double): Double = js.native
    
    def idamax(n: Double, x: js.typedarray.Float64Array, incx: Double): Double = js.native
    
    def isamax(n: Double, x: js.typedarray.Float32Array, incx: Double): Double = js.native
    
    def izamax(n: Double, x: js.typedarray.Float64Array, incx: Double): Double = js.native
    
    def nrm2(x: FloatArray): Double = js.native
    
    def rot(x: FloatArray, y: FloatArray, c: Double, s: Double): Unit = js.native
    
    def rotg(a: FloatArray, b: FloatArray, c: FloatArray, s: FloatArray): Unit = js.native
    
    def rotm(x: FloatArray, y: FloatArray, param: FloatArray): Unit = js.native
    
    def rotmg(d1: FloatArray, d2: FloatArray, x1: FloatArray, y1: FloatArray, param: FloatArray): Unit = js.native
    
    def sasum(n: Double, x: js.typedarray.Float32Array, incx: Double): Double = js.native
    
    def saxpy(
      n: Double,
      alpha: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Double, uplo: Unit, alpha: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Double, uplo: Unit, alpha: Double, beta: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Double, uplo: Unit, alpha: Unit, beta: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Double, uplo: MatrixUpperLower): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Double, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    def sbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def sbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Unit, uplo: Unit, alpha: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Unit, uplo: Unit, alpha: Double, beta: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Unit, uplo: Unit, alpha: Unit, beta: Double): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Unit, uplo: MatrixUpperLower): Unit = js.native
    def sbmv(a: FloatArray, x: FloatArray, y: FloatArray, k: Unit, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    def sbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      k: Unit,
      uplo: MatrixUpperLower,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def sbmv(
      a: FloatArray,
      x: FloatArray,
      y: FloatArray,
      k: Unit,
      uplo: MatrixUpperLower,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    
    def scal(x: FloatArray, a: Double): Unit = js.native
    
    def scasum(n: Double, x: js.typedarray.Float32Array, incx: Double): Double = js.native
    
    def scnrm2(n: Double, x: js.typedarray.Float32Array, incx: Double): Double = js.native
    
    def scopy(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def sdot(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Double = js.native
    
    def sgbmv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def sgemm(
      transa: MatrixTrans,
      transb: MatrixTrans,
      m: Double,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      beta: Double,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def sgemv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def sger(
      m: Double,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double,
      a: js.typedarray.Float32Array,
      lda: Double
    ): Unit = js.native
    
    def snrm2(n: Double, x: js.typedarray.Float32Array, incx: Double): Double = js.native
    
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Double): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Double, beta: Double): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Unit, beta: Double): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Double, beta: Double): Unit = js.native
    def spmv(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Unit, beta: Double): Unit = js.native
    
    def spr(ap: FloatArray, x: FloatArray): Unit = js.native
    def spr(ap: FloatArray, x: FloatArray, uplo: Unit, alpha: Double): Unit = js.native
    def spr(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def spr(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    
    def spr2(ap: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def spr2(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Double): Unit = js.native
    def spr2(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def spr2(ap: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    
    def srot(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double,
      c: Double,
      s: Double
    ): Unit = js.native
    
    def srotg(
      a: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      s: js.typedarray.Float32Array
    ): Unit = js.native
    
    def srotm(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def srotmg(
      d1: js.typedarray.Float32Array,
      d2: js.typedarray.Float32Array,
      x1: js.typedarray.Float32Array,
      y1: js.typedarray.Float32Array,
      param: js.typedarray.Float32Array
    ): Unit = js.native
    
    def ssbmv(
      uplo: MatrixUpperLower,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def sscal(n: Double, a: Double, x: js.typedarray.Float32Array, incx: Double): Unit = js.native
    
    def sspmv(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      ap: js.typedarray.Float32Array,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def sspr(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      ap: js.typedarray.Float32Array
    ): Unit = js.native
    
    def sspr2(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double,
      ap: js.typedarray.Float32Array
    ): Unit = js.native
    
    def sswap(
      n: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def ssymm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      beta: Double,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def ssymv(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      beta: Double,
      y: js.typedarray.Float32Array,
      incy: Double
    ): Unit = js.native
    
    def ssyr(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      a: js.typedarray.Float32Array,
      lda: Double
    ): Unit = js.native
    
    def ssyr2(
      uplo: MatrixUpperLower,
      n: Double,
      alpha: Double,
      x: js.typedarray.Float32Array,
      incx: Double,
      y: js.typedarray.Float32Array,
      incy: Double,
      a: js.typedarray.Float32Array,
      lda: Double
    ): Unit = js.native
    
    def ssyr2k(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      beta: Double,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def ssyrk(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      beta: Double,
      c: js.typedarray.Float32Array,
      ldc: Double
    ): Unit = js.native
    
    def stbmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def stbsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def stpmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float32Array,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def stpsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float32Array,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def strmm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Unit = js.native
    
    def strmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def strsm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Unit = js.native
    
    def strsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      x: js.typedarray.Float32Array,
      incx: Double
    ): Unit = js.native
    
    def swap(x: FloatArray, y: FloatArray): Unit = js.native
    
    def symm(a: FloatArray, b: FloatArray, c: FloatArray, m: Double, n: Double): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      alpha: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      alpha: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def symm(a: FloatArray, b: FloatArray, c: FloatArray, m: Double, n: Double, side: MatrixLeftRight): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      alpha: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      alpha: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def symm(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    
    def symv(a: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Double): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Double, beta: Double): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Unit, beta: Double): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Double, beta: Double): Unit = js.native
    def symv(a: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Unit, beta: Double): Unit = js.native
    
    def syr(a: FloatArray, x: FloatArray): Unit = js.native
    def syr(a: FloatArray, x: FloatArray, uplo: Unit, alpha: Double): Unit = js.native
    def syr(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def syr(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    
    def syr2(a: FloatArray, x: FloatArray, y: FloatArray): Unit = js.native
    def syr2(a: FloatArray, x: FloatArray, y: FloatArray, uplo: Unit, alpha: Double): Unit = js.native
    def syr2(a: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def syr2(a: FloatArray, x: FloatArray, y: FloatArray, uplo: MatrixUpperLower, alpha: Double): Unit = js.native
    
    def syr2k(a: FloatArray, b: FloatArray, c: FloatArray, n: Double, k: Double): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: Unit,
      trans: Unit,
      alpha: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: Unit,
      trans: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: Unit,
      trans: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def syr2k(a: FloatArray, b: FloatArray, c: FloatArray, n: Double, k: Double, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: Unit,
      trans: MatrixTrans,
      alpha: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: Unit,
      trans: MatrixTrans,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: Unit,
      trans: MatrixTrans,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def syr2k(a: FloatArray, b: FloatArray, c: FloatArray, n: Double, k: Double, uplo: MatrixUpperLower): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: Unit,
      alpha: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      alpha: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syr2k(
      a: FloatArray,
      b: FloatArray,
      c: FloatArray,
      n: Double,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    
    def syrk(a: FloatArray, c: FloatArray, n: FloatArray, k: Double): Unit = js.native
    def syrk(a: FloatArray, c: FloatArray, n: FloatArray, k: Double, uplo: Unit, trans: Unit, alpha: Double): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: Unit,
      trans: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: Unit,
      trans: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def syrk(a: FloatArray, c: FloatArray, n: FloatArray, k: Double, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: Unit,
      trans: MatrixTrans,
      alpha: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: Unit,
      trans: MatrixTrans,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: Unit,
      trans: MatrixTrans,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def syrk(a: FloatArray, c: FloatArray, n: FloatArray, k: Double, uplo: MatrixUpperLower): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      trans: Unit,
      alpha: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      trans: Unit,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      trans: Unit,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    def syrk(a: FloatArray, c: FloatArray, n: FloatArray, k: Double, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      alpha: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      alpha: Double,
      beta: Double
    ): Unit = js.native
    def syrk(
      a: FloatArray,
      c: FloatArray,
      n: FloatArray,
      k: Double,
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      alpha: Unit,
      beta: Double
    ): Unit = js.native
    
    def tbmv(a: FloatArray, x: FloatArray): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: Unit, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def tbmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    
    def tbsv(a: FloatArray, x: FloatArray): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: Unit, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def tbsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    
    def tpmv(ap: FloatArray, x: FloatArray): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: Unit, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def tpmv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    
    def tpsv(ap: FloatArray, x: FloatArray): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: Unit, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: Unit, diag: MatrixUnit): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def tpsv(ap: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    
    def trmm(a: FloatArray, b: FloatArray, m: Double, n: Double): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: Unit, uplo: Unit, transa: MatrixTrans): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: Unit, uplo: MatrixUpperLower): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: MatrixLeftRight): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: MatrixLeftRight, uplo: MatrixUpperLower): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trmm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    
    def trmv(a: FloatArray, x: FloatArray): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: Unit, trans: Unit, diag: MatrixUnit): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: Unit, diag: MatrixUnit): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def trmv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    
    def trsm(a: FloatArray, b: FloatArray, m: Double, n: Double): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: Unit, uplo: Unit, transa: MatrixTrans): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: Unit, uplo: MatrixUpperLower): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: Unit,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: MatrixLeftRight): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: Unit,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(a: FloatArray, b: FloatArray, m: Double, n: Double, side: MatrixLeftRight, uplo: MatrixUpperLower): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: Unit,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: Unit,
      alpha: Double
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit
    ): Unit = js.native
    def trsm(
      a: FloatArray,
      b: FloatArray,
      m: Double,
      n: Double,
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      alpha: Double
    ): Unit = js.native
    
    def trsv(a: FloatArray, x: FloatArray): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: Unit, trans: Unit, diag: MatrixUnit): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: Unit, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: Unit, diag: MatrixUnit): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans): Unit = js.native
    def trsv(a: FloatArray, x: FloatArray, uplo: MatrixUpperLower, trans: MatrixTrans, diag: MatrixUnit): Unit = js.native
    
    def zaxpy(
      n: Double,
      alpha: js.typedarray.Float64Array,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def zcopy(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def zgbmv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: js.typedarray.Float64Array,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def zgemm(
      transa: MatrixTrans,
      transb: MatrixTrans,
      m: Double,
      n: Double,
      k: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      beta: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def zgemv(
      trans: MatrixTrans,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      beta: js.typedarray.Float64Array,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def zscal(n: Double, a: js.typedarray.Float64Array, x: js.typedarray.Float64Array, incx: Double): Unit = js.native
    
    def zswap(
      n: Double,
      x: js.typedarray.Float64Array,
      incx: Double,
      y: js.typedarray.Float64Array,
      incy: Double
    ): Unit = js.native
    
    def zsymm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      beta: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def zsyr2k(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      beta: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def zsyrk(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      n: Double,
      k: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      beta: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      ldc: Double
    ): Unit = js.native
    
    def ztbmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def ztbsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      k: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def ztpmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float64Array,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def ztpsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float64Array,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def ztrmm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Unit = js.native
    
    def ztrmv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
    
    def ztrsm(
      side: MatrixLeftRight,
      uplo: MatrixUpperLower,
      transa: MatrixTrans,
      diag: MatrixUnit,
      m: Double,
      n: Double,
      alpha: js.typedarray.Float64Array,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Unit = js.native
    
    def ztrsv(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      x: js.typedarray.Float64Array,
      incx: Double
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nblas.nblasInts.`141`
    - typings.nblas.nblasInts.`142`
  */
  trait MatrixLeftRight extends StObject
  object MatrixLeftRight {
    
    inline def `141`: typings.nblas.nblasInts.`141` = 141.asInstanceOf[typings.nblas.nblasInts.`141`]
    
    inline def `142`: typings.nblas.nblasInts.`142` = 142.asInstanceOf[typings.nblas.nblasInts.`142`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nblas.nblasInts.`111`
    - typings.nblas.nblasInts.`112`
    - typings.nblas.nblasInts.`113`
  */
  trait MatrixTrans extends StObject
  object MatrixTrans {
    
    inline def `111`: typings.nblas.nblasInts.`111` = 111.asInstanceOf[typings.nblas.nblasInts.`111`]
    
    inline def `112`: typings.nblas.nblasInts.`112` = 112.asInstanceOf[typings.nblas.nblasInts.`112`]
    
    inline def `113`: typings.nblas.nblasInts.`113` = 113.asInstanceOf[typings.nblas.nblasInts.`113`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nblas.nblasInts.`131`
    - typings.nblas.nblasInts.`132`
  */
  trait MatrixUnit extends StObject
  object MatrixUnit {
    
    inline def `131`: typings.nblas.nblasInts.`131` = 131.asInstanceOf[typings.nblas.nblasInts.`131`]
    
    inline def `132`: typings.nblas.nblasInts.`132` = 132.asInstanceOf[typings.nblas.nblasInts.`132`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nblas.nblasInts.`121`
    - typings.nblas.nblasInts.`122`
  */
  trait MatrixUpperLower extends StObject
  object MatrixUpperLower {
    
    inline def `121`: typings.nblas.nblasInts.`121` = 121.asInstanceOf[typings.nblas.nblasInts.`121`]
    
    inline def `122`: typings.nblas.nblasInts.`122` = 122.asInstanceOf[typings.nblas.nblasInts.`122`]
  }
}
