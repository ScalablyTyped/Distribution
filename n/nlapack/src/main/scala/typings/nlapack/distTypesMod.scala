package typings.nlapack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type FloatArray = js.typedarray.Float64Array | js.typedarray.Float32Array
  
  trait INLapack extends StObject {
    
    def dgbcon(
      norm: MatrixNorm,
      n: Double,
      kl: Double,
      ku: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dgbequ(
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      r: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      rowcnd: js.typedarray.Float64Array,
      colcnd: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dgbequb(
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      r: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      rowcnd: js.typedarray.Float64Array,
      colcnd: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dgbrfs(
      trans: MatrixTrans,
      n: Double,
      kl: Double,
      ku: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      afb: js.typedarray.Float64Array,
      ldafb: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dgbrfsx(
      trans: MatrixTrans,
      equed: MatrixEquilibration,
      n: Double,
      kl: Double,
      ku: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      afb: js.typedarray.Float64Array,
      ldafb: Double,
      ipiv: js.typedarray.Int32Array,
      r: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      rcond: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float64Array,
      err_bnds_comp: js.typedarray.Float64Array,
      nparams: Double,
      params: js.typedarray.Float64Array
    ): Double
    
    def dgbtrf(
      m: Double,
      n: Double,
      kl: js.typedarray.Float64Array,
      ku: js.typedarray.Float64Array,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dgbtrs(
      trans: MatrixTrans,
      n: Double,
      kl: Double,
      ku: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dgecon(
      norm: MatrixNorm,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dgeequ(
      m: Double,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      r: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      rowcnd: js.typedarray.Float64Array,
      colcnd: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dgeequb(
      m: Double,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      r: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      rowcnd: js.typedarray.Float64Array,
      colcnd: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dgeev(
      jobvl: MatrixEigenvector,
      jobvr: MatrixEigenvector,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      wr: js.typedarray.Float64Array,
      wi: js.typedarray.Float64Array,
      vl: js.typedarray.Float64Array,
      ldvl: Double,
      vr: js.typedarray.Float64Array,
      ldvr: Double
    ): Double
    
    def dgerfs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      af: js.typedarray.Float64Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dgerfsx(
      trans: MatrixTrans,
      equed: MatrixEquilibration,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      af: js.typedarray.Float64Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      r: js.typedarray.Float64Array,
      c: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      rcond: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float64Array,
      err_bnds_comp: js.typedarray.Float64Array,
      nparams: Double,
      params: js.typedarray.Float64Array
    ): Double
    
    def dgesv(
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dgetrf(m: Double, n: Double, a: js.typedarray.Float64Array, lda: Double, ipiv: js.typedarray.Int32Array): Double
    
    def dgetrf2(m: Double, n: Double, a: js.typedarray.Float64Array, lda: Double, ipiv: js.typedarray.Int32Array): Double
    
    def dgetri(n: Double, a: js.typedarray.Float64Array, lda: Double, ipiv: js.typedarray.Int32Array): Double
    
    def dgetrs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dgtcon(
      norm: MatrixNorm,
      n: Double,
      dl: js.typedarray.Float64Array,
      d: js.typedarray.Float64Array,
      du: js.typedarray.Float64Array,
      du2: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dgtrfs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      dl: js.typedarray.Float64Array,
      d: js.typedarray.Float64Array,
      du: js.typedarray.Float64Array,
      dlf: js.typedarray.Float64Array,
      df: js.typedarray.Float64Array,
      duf: js.typedarray.Float64Array,
      du2: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dgttrf(
      n: Double,
      dl: js.typedarray.Float64Array,
      d: js.typedarray.Float64Array,
      du: js.typedarray.Float64Array,
      du2: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dgttrs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      dl: js.typedarray.Float64Array,
      d: js.typedarray.Float64Array,
      du: js.typedarray.Float64Array,
      du2: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dlatms(
      m: Double,
      n: Double,
      dist: MatrixDistribution,
      iseed: js.typedarray.Int32Array,
      sym: MatrixSymmetry,
      d: js.typedarray.Float64Array,
      mode: MatrixMode,
      cond: Double,
      dmax: Double,
      kl: Double,
      ku: Double,
      pack: MatrixPacking,
      a: js.typedarray.Float64Array,
      lda: Double
    ): Double
    
    def dpbcon(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dpbequ(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      s: js.typedarray.Float64Array,
      scond: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dpbrfs(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      afb: js.typedarray.Float64Array,
      ldafb: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dpbtrf(
      uplo: MatrixUpperLower,
      n: Double,
      kd: js.typedarray.Float64Array,
      ab: js.typedarray.Float64Array,
      ldab: Double
    ): Double
    
    def dpbtrs(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dpftrf(transr: MatrixTrans, uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float64Array): Double
    
    def dpftri(transr: MatrixTrans, uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float64Array): Double
    
    def dpftrs(
      transr: MatrixTrans,
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dpocon(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dpoequ(
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      s: js.typedarray.Float64Array,
      scond: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dpoequb(
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      s: js.typedarray.Float64Array,
      scond: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dporfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      af: js.typedarray.Float64Array,
      ldaf: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dporfsx(
      uplo: MatrixUpperLower,
      equed: MatrixEquilibration,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      af: js.typedarray.Float64Array,
      ldaf: Double,
      s: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      rcond: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float64Array,
      err_bnds_comp: js.typedarray.Float64Array,
      nparams: Double,
      params: js.typedarray.Float64Array
    ): Double
    
    def dpotrf(uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float64Array, lda: Double): Double
    
    def dpotrf2(uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float64Array, lda: Double): Double
    
    def dpotri(uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float64Array, lda: Double): Double
    
    def dpotrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dppcon(
      uplo: MatrixUpperLower,
      n: Double,
      ap: js.typedarray.Float64Array,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dppequ(
      uplo: MatrixUpperLower,
      n: Double,
      ap: js.typedarray.Float64Array,
      s: js.typedarray.Float64Array,
      scond: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dpprfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float64Array,
      afp: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dpptrf(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float64Array): Double
    
    def dpptri(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float64Array): Double
    
    def dpptrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dpstrf(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      piv: js.typedarray.Int32Array,
      rank: js.typedarray.Int32Array,
      tol: Double
    ): Double
    
    def dptcon(
      n: Double,
      d: js.typedarray.Float64Array,
      e: js.typedarray.Float64Array,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dptrfs(
      n: Double,
      nrhs: Double,
      d: js.typedarray.Float64Array,
      e: js.typedarray.Float64Array,
      df: js.typedarray.Float64Array,
      ef: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dpttrf(n: Double, d: js.typedarray.Float64Array, e: js.typedarray.Float64Array): Double
    
    def dpttrs(
      n: Double,
      nrhs: Double,
      d: js.typedarray.Float64Array,
      e: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dspcon(
      uplo: MatrixUpperLower,
      n: Double,
      ap: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dsprfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float64Array,
      afp: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dsptrf(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float64Array, ipiv: js.typedarray.Int32Array): Double
    
    def dsptri(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float64Array, ipiv: js.typedarray.Int32Array): Double
    
    def dsptrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float64Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dsycon(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dsyequb(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      s: js.typedarray.Float64Array,
      scond: js.typedarray.Float64Array,
      amax: js.typedarray.Float64Array
    ): Double
    
    def dsyrfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      af: js.typedarray.Float64Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dsyrfsx(
      uplo: MatrixUpperLower,
      equed: MatrixEquilibration,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      af: js.typedarray.Float64Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      s: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      rcond: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float64Array,
      err_bnds_comp: js.typedarray.Float64Array,
      nparams: Double,
      params: js.typedarray.Float64Array
    ): Double
    
    def dsytrf(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytrf_aa(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytrf_rook(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytri(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytri2(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytri2x(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytri_rook(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def dsytrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dsytrs2(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dsytrs_aa(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dsytrs_rook(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dtbcon(
      norm: MatrixNorm,
      uplo: MatrixUpperLower,
      diag: MatrixUnit,
      n: Double,
      kd: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dtbrfs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dtbtrs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      kd: Double,
      nrhs: Double,
      ab: js.typedarray.Float64Array,
      ldab: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dtftri(transr: MatrixTrans, uplo: MatrixUpperLower, diag: MatrixUnit, a: js.typedarray.Float64Array): Double
    
    def dtpcon(
      norm: MatrixNorm,
      uplo: MatrixUpperLower,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float64Array,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dtprfs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dtptri(uplo: MatrixUpperLower, diag: MatrixUnit, n: Double, ap: js.typedarray.Float64Array): Double
    
    def dtptrs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float64Array,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def dtrcon(
      norm: MatrixNorm,
      uplo: MatrixUpperLower,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def dtrrfs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double,
      x: js.typedarray.Float64Array,
      ldx: Double,
      ferr: js.typedarray.Float64Array,
      berr: js.typedarray.Float64Array
    ): Double
    
    def dtrtri(uplo: MatrixUpperLower, diag: MatrixUnit, n: Double, a: js.typedarray.Float64Array, lda: Double): Double
    
    def dtrtrs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      b: js.typedarray.Float64Array,
      ldb: Double
    ): Double
    
    def ilaver(
      vers_major: js.typedarray.Int32Array,
      vers_minor: js.typedarray.Int32Array,
      vers_patch: js.typedarray.Int32Array
    ): Unit
    
    def sgbcon(
      norm: MatrixNorm,
      n: Double,
      kl: Double,
      ku: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def sgbequ(
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      r: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      rowcnd: js.typedarray.Float32Array,
      colcnd: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def sgbequb(
      m: Double,
      n: Double,
      kl: Double,
      ku: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      r: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      rowcnd: js.typedarray.Float32Array,
      colcnd: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def sgbrfs(
      trans: MatrixTrans,
      n: Double,
      kl: Double,
      ku: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      afb: js.typedarray.Float32Array,
      ldafb: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def sgbrfsx(
      trans: MatrixTrans,
      equed: MatrixEquilibration,
      n: Double,
      kl: Double,
      ku: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      afb: js.typedarray.Float32Array,
      ldafb: Double,
      ipiv: js.typedarray.Int32Array,
      r: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      rcond: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float32Array,
      err_bnds_comp: js.typedarray.Float32Array,
      nparams: Double,
      params: js.typedarray.Float32Array
    ): Double
    
    def sgbtrf(
      m: Double,
      n: Double,
      kl: js.typedarray.Float32Array,
      ku: js.typedarray.Float32Array,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def sgbtrs(
      trans: MatrixTrans,
      n: Double,
      kl: Double,
      ku: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def sgecon(
      norm: MatrixNorm,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def sgeequ(
      m: Double,
      n: Double,
      a: js.typedarray.Float64Array,
      lda: Double,
      r: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      rowcnd: js.typedarray.Float32Array,
      colcnd: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def sgeequb(
      m: Double,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      r: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      rowcnd: js.typedarray.Float32Array,
      colcnd: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def sgeev(
      jobvl: MatrixEigenvector,
      jobvr: MatrixEigenvector,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      wr: js.typedarray.Float32Array,
      wi: js.typedarray.Float32Array,
      vl: js.typedarray.Float32Array,
      ldvl: Double,
      vr: js.typedarray.Float32Array,
      ldvr: Double
    ): Double
    
    def sgerfs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      af: js.typedarray.Float32Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def sgerfsx(
      trans: MatrixTrans,
      equed: MatrixEquilibration,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      af: js.typedarray.Float32Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      r: js.typedarray.Float32Array,
      c: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      rcond: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float32Array,
      err_bnds_comp: js.typedarray.Float32Array,
      nparams: Double,
      params: js.typedarray.Float32Array
    ): Double
    
    def sgesv(
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def sgetrf(m: Double, n: Double, a: js.typedarray.Float32Array, lda: Double, ipiv: js.typedarray.Int32Array): Double
    
    def sgetrf2(m: Double, n: Double, a: js.typedarray.Float32Array, lda: Double, ipiv: js.typedarray.Int32Array): Double
    
    def sgetri(n: Double, a: js.typedarray.Float32Array, lda: Double, ipiv: js.typedarray.Int32Array): Double
    
    def sgetrs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def sgtcon(
      norm: MatrixNorm,
      n: Double,
      dl: js.typedarray.Float32Array,
      d: js.typedarray.Float32Array,
      du: js.typedarray.Float32Array,
      du2: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def sgtrfs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      dl: js.typedarray.Float32Array,
      d: js.typedarray.Float32Array,
      du: js.typedarray.Float32Array,
      dlf: js.typedarray.Float32Array,
      df: js.typedarray.Float32Array,
      duf: js.typedarray.Float32Array,
      du2: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def sgttrf(
      n: Double,
      dl: js.typedarray.Float32Array,
      d: js.typedarray.Float32Array,
      du: js.typedarray.Float32Array,
      du2: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def sgttrs(
      trans: MatrixTrans,
      n: Double,
      nrhs: Double,
      dl: js.typedarray.Float32Array,
      d: js.typedarray.Float32Array,
      du: js.typedarray.Float32Array,
      du2: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def slatms(
      m: Double,
      n: Double,
      dist: MatrixDistribution,
      iseed: js.typedarray.Int32Array,
      sym: MatrixSymmetry,
      d: js.typedarray.Float32Array,
      mode: MatrixMode,
      cond: Double,
      dmax: Double,
      kl: Double,
      ku: Double,
      pack: MatrixPacking,
      a: js.typedarray.Float64Array,
      lda: Double
    ): Double
    
    def spbcon(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def spbequ(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      s: js.typedarray.Float32Array,
      scond: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def spbrfs(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      afb: js.typedarray.Float32Array,
      ldafb: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def spbtrf(
      uplo: MatrixUpperLower,
      n: Double,
      kd: js.typedarray.Float32Array,
      ab: js.typedarray.Float32Array,
      ldab: Double
    ): Double
    
    def spbtrs(
      uplo: MatrixUpperLower,
      n: Double,
      kd: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def spftrf(transr: MatrixTrans, uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float32Array): Double
    
    def spftri(transr: MatrixTrans, uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float32Array): Double
    
    def spftrs(
      transr: MatrixTrans,
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def spocon(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def spoequ(
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      s: js.typedarray.Float32Array,
      scond: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def spoequb(
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      s: js.typedarray.Float32Array,
      scond: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def sporfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      af: js.typedarray.Float32Array,
      ldaf: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def sporfsx(
      uplo: MatrixUpperLower,
      equed: MatrixEquilibration,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      af: js.typedarray.Float32Array,
      ldaf: Double,
      s: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      rcond: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float32Array,
      err_bnds_comp: js.typedarray.Float32Array,
      nparams: Double,
      params: js.typedarray.Float32Array
    ): Double
    
    def spotrf(uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float32Array, lda: Double): Double
    
    def spotrf2(uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float32Array, lda: Double): Double
    
    def spotri(uplo: MatrixUpperLower, n: Double, a: js.typedarray.Float32Array, lda: Double): Double
    
    def spotrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def sppcon(
      uplo: MatrixUpperLower,
      n: Double,
      ap: js.typedarray.Float32Array,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def sppequ(
      uplo: MatrixUpperLower,
      n: Double,
      ap: js.typedarray.Float32Array,
      s: js.typedarray.Float32Array,
      scond: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def spprfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float32Array,
      afp: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def spptrf(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float32Array): Double
    
    def spptri(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float32Array): Double
    
    def spptrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def spstrf(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      piv: js.typedarray.Int32Array,
      rank: js.typedarray.Int32Array,
      tol: Double
    ): Double
    
    def sptcon(
      n: Double,
      d: js.typedarray.Float32Array,
      e: js.typedarray.Float32Array,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def sptrfs(
      n: Double,
      nrhs: Double,
      d: js.typedarray.Float32Array,
      e: js.typedarray.Float32Array,
      df: js.typedarray.Float32Array,
      ef: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def spttrf(n: Double, d: js.typedarray.Float32Array, e: js.typedarray.Float32Array): Double
    
    def spttrs(
      n: Double,
      nrhs: Double,
      d: js.typedarray.Float32Array,
      e: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def sspcon(
      uplo: MatrixUpperLower,
      n: Double,
      ap: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def ssprfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float32Array,
      afp: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def ssptrf(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float32Array, ipiv: js.typedarray.Int32Array): Double
    
    def ssptri(uplo: MatrixUpperLower, n: Double, ap: js.typedarray.Float32Array, ipiv: js.typedarray.Int32Array): Double
    
    def ssptrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float32Array,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def ssycon(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      anorm: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def ssyequb(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      s: js.typedarray.Float32Array,
      scond: js.typedarray.Float32Array,
      amax: js.typedarray.Float32Array
    ): Double
    
    def ssyrfs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      af: js.typedarray.Float32Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def ssyrfsx(
      uplo: MatrixUpperLower,
      equed: MatrixEquilibration,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      af: js.typedarray.Float32Array,
      ldaf: Double,
      ipiv: js.typedarray.Int32Array,
      s: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      rcond: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array,
      n_err_bnds: Double,
      err_bnds_norm: js.typedarray.Float32Array,
      err_bnds_comp: js.typedarray.Float32Array,
      nparams: Double,
      params: js.typedarray.Float32Array
    ): Double
    
    def ssytrf(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytrf_aa(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytrf_rook(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytri(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytri2(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytri2x(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytri_rook(
      uplo: MatrixUpperLower,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array
    ): Double
    
    def ssytrs(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def ssytrs2(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def ssytrs_aa(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def ssytrs_rook(
      uplo: MatrixUpperLower,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      ipiv: js.typedarray.Int32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def stbcon(
      norm: MatrixNorm,
      uplo: MatrixUpperLower,
      diag: MatrixUnit,
      n: Double,
      kd: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def stbrfs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def stbtrs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      kd: Double,
      nrhs: Double,
      ab: js.typedarray.Float32Array,
      ldab: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def stftri(transr: MatrixTrans, uplo: MatrixUpperLower, diag: MatrixUnit, a: js.typedarray.Float32Array): Double
    
    def stpcon(
      norm: MatrixNorm,
      uplo: MatrixUpperLower,
      diag: MatrixUnit,
      n: Double,
      ap: js.typedarray.Float32Array,
      rcond: js.typedarray.Float32Array
    ): Double
    
    def stprfs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def stptri(uplo: MatrixUpperLower, diag: MatrixUnit, n: Double, ap: js.typedarray.Float32Array): Double
    
    def stptrs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      ap: js.typedarray.Float32Array,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
    
    def strcon(
      norm: MatrixNorm,
      uplo: MatrixUpperLower,
      diag: MatrixUnit,
      n: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      rcond: js.typedarray.Float64Array
    ): Double
    
    def strrfs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double,
      x: js.typedarray.Float32Array,
      ldx: Double,
      ferr: js.typedarray.Float32Array,
      berr: js.typedarray.Float32Array
    ): Double
    
    def strtri(uplo: MatrixUpperLower, diag: MatrixUnit, n: Double, a: js.typedarray.Float32Array, lda: Double): Double
    
    def strtrs(
      uplo: MatrixUpperLower,
      trans: MatrixTrans,
      diag: MatrixUnit,
      n: Double,
      nrhs: Double,
      a: js.typedarray.Float32Array,
      lda: Double,
      b: js.typedarray.Float32Array,
      ldb: Double
    ): Double
  }
  object INLapack {
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INLapack] (val x: Self) extends AnyVal {
      
      inline def setDgbcon(
        value: (MatrixNorm, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgbcon", js.Any.fromFunction9(value))
      
      inline def setDgbequ(
        value: (Double, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgbequ", js.Any.fromFunction11(value))
      
      inline def setDgbequb(
        value: (Double, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgbequb", js.Any.fromFunction11(value))
      
      inline def setDgbrfs(
        value: (MatrixTrans, Double, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgbrfs", js.Any.fromFunction16(value))
      
      inline def setDgbtrf(
        value: (Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dgbtrf", js.Any.fromFunction7(value))
      
      inline def setDgbtrs(
        value: (MatrixTrans, Double, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dgbtrs", js.Any.fromFunction10(value))
      
      inline def setDgecon(
        value: (MatrixNorm, Double, js.typedarray.Float64Array, Double, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgecon", js.Any.fromFunction6(value))
      
      inline def setDgeequ(
        value: (Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgeequ", js.Any.fromFunction9(value))
      
      inline def setDgeequb(
        value: (Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgeequb", js.Any.fromFunction9(value))
      
      inline def setDgeev(
        value: (MatrixEigenvector, MatrixEigenvector, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dgeev", js.Any.fromFunction11(value))
      
      inline def setDgerfs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgerfs", js.Any.fromFunction14(value))
      
      inline def setDgerfsx(
        value: (MatrixTrans, MatrixEquilibration, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgerfsx", js.Any.fromFunction22(value))
      
      inline def setDgesv(
        value: (Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dgesv", js.Any.fromFunction7(value))
      
      inline def setDgetrf(value: (Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "dgetrf", js.Any.fromFunction5(value))
      
      inline def setDgetrf2(value: (Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "dgetrf2", js.Any.fromFunction5(value))
      
      inline def setDgetri(value: (Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "dgetri", js.Any.fromFunction4(value))
      
      inline def setDgetrs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dgetrs", js.Any.fromFunction8(value))
      
      inline def setDgtcon(
        value: (MatrixNorm, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Int32Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgtcon", js.Any.fromFunction9(value))
      
      inline def setDgtrfs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Int32Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dgtrfs", js.Any.fromFunction17(value))
      
      inline def setDgttrf(
        value: (Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dgttrf", js.Any.fromFunction6(value))
      
      inline def setDgttrs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dgttrs", js.Any.fromFunction10(value))
      
      inline def setDlatms(
        value: (Double, Double, MatrixDistribution, js.typedarray.Int32Array, MatrixSymmetry, js.typedarray.Float64Array, MatrixMode, Double, Double, Double, Double, MatrixPacking, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dlatms", js.Any.fromFunction14(value))
      
      inline def setDpbcon(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpbcon", js.Any.fromFunction7(value))
      
      inline def setDpbequ(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpbequ", js.Any.fromFunction8(value))
      
      inline def setDpbrfs(
        value: (MatrixUpperLower, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpbrfs", js.Any.fromFunction14(value))
      
      inline def setDpbtrf(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dpbtrf", js.Any.fromFunction5(value))
      
      inline def setDpbtrs(
        value: (MatrixUpperLower, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dpbtrs", js.Any.fromFunction8(value))
      
      inline def setDpftrf(value: (MatrixTrans, MatrixUpperLower, Double, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dpftrf", js.Any.fromFunction4(value))
      
      inline def setDpftri(value: (MatrixTrans, MatrixUpperLower, Double, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dpftri", js.Any.fromFunction4(value))
      
      inline def setDpftrs(
        value: (MatrixTrans, MatrixUpperLower, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dpftrs", js.Any.fromFunction7(value))
      
      inline def setDpocon(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpocon", js.Any.fromFunction6(value))
      
      inline def setDpoequ(
        value: (Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpoequ", js.Any.fromFunction6(value))
      
      inline def setDpoequb(
        value: (Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpoequb", js.Any.fromFunction6(value))
      
      inline def setDporfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dporfs", js.Any.fromFunction13(value))
      
      inline def setDporfsx(
        value: (MatrixUpperLower, MatrixEquilibration, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dporfsx", js.Any.fromFunction20(value))
      
      inline def setDpotrf(value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double) => Double): Self = StObject.set(x, "dpotrf", js.Any.fromFunction4(value))
      
      inline def setDpotrf2(value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double) => Double): Self = StObject.set(x, "dpotrf2", js.Any.fromFunction4(value))
      
      inline def setDpotri(value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double) => Double): Self = StObject.set(x, "dpotri", js.Any.fromFunction4(value))
      
      inline def setDpotrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dpotrs", js.Any.fromFunction7(value))
      
      inline def setDppcon(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dppcon", js.Any.fromFunction5(value))
      
      inline def setDppequ(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dppequ", js.Any.fromFunction6(value))
      
      inline def setDpprfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dpprfs", js.Any.fromFunction11(value))
      
      inline def setDpptrf(value: (MatrixUpperLower, Double, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dpptrf", js.Any.fromFunction3(value))
      
      inline def setDpptri(value: (MatrixUpperLower, Double, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dpptri", js.Any.fromFunction3(value))
      
      inline def setDpptrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dpptrs", js.Any.fromFunction6(value))
      
      inline def setDpstrf(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Int32Array, Double) => Double
      ): Self = StObject.set(x, "dpstrf", js.Any.fromFunction7(value))
      
      inline def setDptcon(
        value: (Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dptcon", js.Any.fromFunction5(value))
      
      inline def setDptrfs(
        value: (Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dptrfs", js.Any.fromFunction12(value))
      
      inline def setDpttrf(value: (Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dpttrf", js.Any.fromFunction3(value))
      
      inline def setDpttrs(
        value: (Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dpttrs", js.Any.fromFunction6(value))
      
      inline def setDspcon(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, js.typedarray.Int32Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dspcon", js.Any.fromFunction6(value))
      
      inline def setDsprfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Int32Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dsprfs", js.Any.fromFunction12(value))
      
      inline def setDsptrf(value: (MatrixUpperLower, Double, js.typedarray.Float64Array, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "dsptrf", js.Any.fromFunction4(value))
      
      inline def setDsptri(value: (MatrixUpperLower, Double, js.typedarray.Float64Array, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "dsptri", js.Any.fromFunction4(value))
      
      inline def setDsptrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dsptrs", js.Any.fromFunction7(value))
      
      inline def setDsycon(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dsycon", js.Any.fromFunction7(value))
      
      inline def setDsyequb(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dsyequb", js.Any.fromFunction7(value))
      
      inline def setDsyrfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dsyrfs", js.Any.fromFunction14(value))
      
      inline def setDsyrfsx(
        value: (MatrixUpperLower, MatrixEquilibration, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dsyrfsx", js.Any.fromFunction21(value))
      
      inline def setDsytrf(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytrf", js.Any.fromFunction5(value))
      
      inline def setDsytrf_aa(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytrf_aa", js.Any.fromFunction5(value))
      
      inline def setDsytrf_rook(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytrf_rook", js.Any.fromFunction5(value))
      
      inline def setDsytri(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytri", js.Any.fromFunction5(value))
      
      inline def setDsytri2(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytri2", js.Any.fromFunction5(value))
      
      inline def setDsytri2x(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytri2x", js.Any.fromFunction5(value))
      
      inline def setDsytri_rook(
        value: (MatrixUpperLower, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "dsytri_rook", js.Any.fromFunction5(value))
      
      inline def setDsytrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dsytrs", js.Any.fromFunction8(value))
      
      inline def setDsytrs2(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dsytrs2", js.Any.fromFunction8(value))
      
      inline def setDsytrs_aa(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dsytrs_aa", js.Any.fromFunction8(value))
      
      inline def setDsytrs_rook(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Int32Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dsytrs_rook", js.Any.fromFunction8(value))
      
      inline def setDtbcon(
        value: (MatrixNorm, MatrixUpperLower, MatrixUnit, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dtbcon", js.Any.fromFunction8(value))
      
      inline def setDtbrfs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dtbrfs", js.Any.fromFunction13(value))
      
      inline def setDtbtrs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dtbtrs", js.Any.fromFunction10(value))
      
      inline def setDtftri(value: (MatrixTrans, MatrixUpperLower, MatrixUnit, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dtftri", js.Any.fromFunction4(value))
      
      inline def setDtpcon(
        value: (MatrixNorm, MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dtpcon", js.Any.fromFunction6(value))
      
      inline def setDtprfs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dtprfs", js.Any.fromFunction12(value))
      
      inline def setDtptri(value: (MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float64Array) => Double): Self = StObject.set(x, "dtptri", js.Any.fromFunction4(value))
      
      inline def setDtptrs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float64Array, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dtptrs", js.Any.fromFunction8(value))
      
      inline def setDtrcon(
        value: (MatrixNorm, MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dtrcon", js.Any.fromFunction7(value))
      
      inline def setDtrrfs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "dtrrfs", js.Any.fromFunction13(value))
      
      inline def setDtrtri(value: (MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float64Array, Double) => Double): Self = StObject.set(x, "dtrtri", js.Any.fromFunction5(value))
      
      inline def setDtrtrs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "dtrtrs", js.Any.fromFunction9(value))
      
      inline def setIlaver(value: (js.typedarray.Int32Array, js.typedarray.Int32Array, js.typedarray.Int32Array) => Unit): Self = StObject.set(x, "ilaver", js.Any.fromFunction3(value))
      
      inline def setSgbcon(
        value: (MatrixNorm, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgbcon", js.Any.fromFunction9(value))
      
      inline def setSgbequ(
        value: (Double, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgbequ", js.Any.fromFunction11(value))
      
      inline def setSgbequb(
        value: (Double, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgbequb", js.Any.fromFunction11(value))
      
      inline def setSgbrfs(
        value: (MatrixTrans, Double, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgbrfs", js.Any.fromFunction16(value))
      
      inline def setSgbtrf(
        value: (Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "sgbtrf", js.Any.fromFunction7(value))
      
      inline def setSgbtrs(
        value: (MatrixTrans, Double, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "sgbtrs", js.Any.fromFunction10(value))
      
      inline def setSgecon(
        value: (MatrixNorm, Double, js.typedarray.Float32Array, Double, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgecon", js.Any.fromFunction6(value))
      
      inline def setSgeequ(
        value: (Double, Double, js.typedarray.Float64Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgeequ", js.Any.fromFunction9(value))
      
      inline def setSgeequb(
        value: (Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgeequb", js.Any.fromFunction9(value))
      
      inline def setSgeev(
        value: (MatrixEigenvector, MatrixEigenvector, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "sgeev", js.Any.fromFunction11(value))
      
      inline def setSgerfs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgerfs", js.Any.fromFunction14(value))
      
      inline def setSgerfsx(
        value: (MatrixTrans, MatrixEquilibration, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgerfsx", js.Any.fromFunction22(value))
      
      inline def setSgesv(
        value: (Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "sgesv", js.Any.fromFunction7(value))
      
      inline def setSgetrf(value: (Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "sgetrf", js.Any.fromFunction5(value))
      
      inline def setSgetrf2(value: (Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "sgetrf2", js.Any.fromFunction5(value))
      
      inline def setSgetri(value: (Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "sgetri", js.Any.fromFunction4(value))
      
      inline def setSgetrs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "sgetrs", js.Any.fromFunction8(value))
      
      inline def setSgtcon(
        value: (MatrixNorm, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Int32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgtcon", js.Any.fromFunction9(value))
      
      inline def setSgtrfs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Int32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sgtrfs", js.Any.fromFunction17(value))
      
      inline def setSgttrf(
        value: (Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "sgttrf", js.Any.fromFunction6(value))
      
      inline def setSgttrs(
        value: (MatrixTrans, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "sgttrs", js.Any.fromFunction10(value))
      
      inline def setSlatms(
        value: (Double, Double, MatrixDistribution, js.typedarray.Int32Array, MatrixSymmetry, js.typedarray.Float32Array, MatrixMode, Double, Double, Double, Double, MatrixPacking, js.typedarray.Float64Array, Double) => Double
      ): Self = StObject.set(x, "slatms", js.Any.fromFunction14(value))
      
      inline def setSpbcon(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spbcon", js.Any.fromFunction7(value))
      
      inline def setSpbequ(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spbequ", js.Any.fromFunction8(value))
      
      inline def setSpbrfs(
        value: (MatrixUpperLower, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spbrfs", js.Any.fromFunction14(value))
      
      inline def setSpbtrf(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "spbtrf", js.Any.fromFunction5(value))
      
      inline def setSpbtrs(
        value: (MatrixUpperLower, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "spbtrs", js.Any.fromFunction8(value))
      
      inline def setSpftrf(value: (MatrixTrans, MatrixUpperLower, Double, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "spftrf", js.Any.fromFunction4(value))
      
      inline def setSpftri(value: (MatrixTrans, MatrixUpperLower, Double, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "spftri", js.Any.fromFunction4(value))
      
      inline def setSpftrs(
        value: (MatrixTrans, MatrixUpperLower, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "spftrs", js.Any.fromFunction7(value))
      
      inline def setSpocon(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spocon", js.Any.fromFunction6(value))
      
      inline def setSpoequ(
        value: (Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spoequ", js.Any.fromFunction6(value))
      
      inline def setSpoequb(
        value: (Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spoequb", js.Any.fromFunction6(value))
      
      inline def setSporfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sporfs", js.Any.fromFunction13(value))
      
      inline def setSporfsx(
        value: (MatrixUpperLower, MatrixEquilibration, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sporfsx", js.Any.fromFunction20(value))
      
      inline def setSpotrf(value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double) => Double): Self = StObject.set(x, "spotrf", js.Any.fromFunction4(value))
      
      inline def setSpotrf2(value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double) => Double): Self = StObject.set(x, "spotrf2", js.Any.fromFunction4(value))
      
      inline def setSpotri(value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double) => Double): Self = StObject.set(x, "spotri", js.Any.fromFunction4(value))
      
      inline def setSpotrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "spotrs", js.Any.fromFunction7(value))
      
      inline def setSppcon(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sppcon", js.Any.fromFunction5(value))
      
      inline def setSppequ(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sppequ", js.Any.fromFunction6(value))
      
      inline def setSpprfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "spprfs", js.Any.fromFunction11(value))
      
      inline def setSpptrf(value: (MatrixUpperLower, Double, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "spptrf", js.Any.fromFunction3(value))
      
      inline def setSpptri(value: (MatrixUpperLower, Double, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "spptri", js.Any.fromFunction3(value))
      
      inline def setSpptrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "spptrs", js.Any.fromFunction6(value))
      
      inline def setSpstrf(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Int32Array, Double) => Double
      ): Self = StObject.set(x, "spstrf", js.Any.fromFunction7(value))
      
      inline def setSptcon(
        value: (Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sptcon", js.Any.fromFunction5(value))
      
      inline def setSptrfs(
        value: (Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sptrfs", js.Any.fromFunction12(value))
      
      inline def setSpttrf(value: (Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "spttrf", js.Any.fromFunction3(value))
      
      inline def setSpttrs(
        value: (Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "spttrs", js.Any.fromFunction6(value))
      
      inline def setSspcon(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, js.typedarray.Int32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "sspcon", js.Any.fromFunction6(value))
      
      inline def setSsprfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Int32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "ssprfs", js.Any.fromFunction12(value))
      
      inline def setSsptrf(value: (MatrixUpperLower, Double, js.typedarray.Float32Array, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "ssptrf", js.Any.fromFunction4(value))
      
      inline def setSsptri(value: (MatrixUpperLower, Double, js.typedarray.Float32Array, js.typedarray.Int32Array) => Double): Self = StObject.set(x, "ssptri", js.Any.fromFunction4(value))
      
      inline def setSsptrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "ssptrs", js.Any.fromFunction7(value))
      
      inline def setSsycon(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "ssycon", js.Any.fromFunction7(value))
      
      inline def setSsyequb(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "ssyequb", js.Any.fromFunction7(value))
      
      inline def setSsyrfs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "ssyrfs", js.Any.fromFunction14(value))
      
      inline def setSsyrfsx(
        value: (MatrixUpperLower, MatrixEquilibration, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "ssyrfsx", js.Any.fromFunction21(value))
      
      inline def setSsytrf(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytrf", js.Any.fromFunction5(value))
      
      inline def setSsytrf_aa(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytrf_aa", js.Any.fromFunction5(value))
      
      inline def setSsytrf_rook(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytrf_rook", js.Any.fromFunction5(value))
      
      inline def setSsytri(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytri", js.Any.fromFunction5(value))
      
      inline def setSsytri2(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytri2", js.Any.fromFunction5(value))
      
      inline def setSsytri2x(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytri2x", js.Any.fromFunction5(value))
      
      inline def setSsytri_rook(
        value: (MatrixUpperLower, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array) => Double
      ): Self = StObject.set(x, "ssytri_rook", js.Any.fromFunction5(value))
      
      inline def setSsytrs(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "ssytrs", js.Any.fromFunction8(value))
      
      inline def setSsytrs2(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "ssytrs2", js.Any.fromFunction8(value))
      
      inline def setSsytrs_aa(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "ssytrs_aa", js.Any.fromFunction8(value))
      
      inline def setSsytrs_rook(
        value: (MatrixUpperLower, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Int32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "ssytrs_rook", js.Any.fromFunction8(value))
      
      inline def setStbcon(
        value: (MatrixNorm, MatrixUpperLower, MatrixUnit, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "stbcon", js.Any.fromFunction8(value))
      
      inline def setStbrfs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "stbrfs", js.Any.fromFunction13(value))
      
      inline def setStbtrs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "stbtrs", js.Any.fromFunction10(value))
      
      inline def setStftri(value: (MatrixTrans, MatrixUpperLower, MatrixUnit, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "stftri", js.Any.fromFunction4(value))
      
      inline def setStpcon(
        value: (MatrixNorm, MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "stpcon", js.Any.fromFunction6(value))
      
      inline def setStprfs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "stprfs", js.Any.fromFunction12(value))
      
      inline def setStptri(value: (MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float32Array) => Double): Self = StObject.set(x, "stptri", js.Any.fromFunction4(value))
      
      inline def setStptrs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float32Array, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "stptrs", js.Any.fromFunction8(value))
      
      inline def setStrcon(
        value: (MatrixNorm, MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float32Array, Double, js.typedarray.Float64Array) => Double
      ): Self = StObject.set(x, "strcon", js.Any.fromFunction7(value))
      
      inline def setStrrfs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, js.typedarray.Float32Array) => Double
      ): Self = StObject.set(x, "strrfs", js.Any.fromFunction13(value))
      
      inline def setStrtri(value: (MatrixUpperLower, MatrixUnit, Double, js.typedarray.Float32Array, Double) => Double): Self = StObject.set(x, "strtri", js.Any.fromFunction5(value))
      
      inline def setStrtrs(
        value: (MatrixUpperLower, MatrixTrans, MatrixUnit, Double, Double, js.typedarray.Float32Array, Double, js.typedarray.Float32Array, Double) => Double
      ): Self = StObject.set(x, "strtrs", js.Any.fromFunction9(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`85`
    - typings.nlapack.nlapackInts.`83`
    - typings.nlapack.nlapackInts.`78`
  */
  trait MatrixDistribution extends StObject
  object MatrixDistribution {
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `83`: typings.nlapack.nlapackInts.`83` = 83.asInstanceOf[typings.nlapack.nlapackInts.`83`]
    
    inline def `85`: typings.nlapack.nlapackInts.`85` = 85.asInstanceOf[typings.nlapack.nlapackInts.`85`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`78`
    - typings.nlapack.nlapackInts.`86`
  */
  trait MatrixEigenvector extends StObject
  object MatrixEigenvector {
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `86`: typings.nlapack.nlapackInts.`86` = 86.asInstanceOf[typings.nlapack.nlapackInts.`86`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`78`
    - typings.nlapack.nlapackInts.`82`
    - typings.nlapack.nlapackInts.`67`
    - typings.nlapack.nlapackInts.`66`
  */
  trait MatrixEquilibration extends StObject
  object MatrixEquilibration {
    
    inline def `66`: typings.nlapack.nlapackInts.`66` = 66.asInstanceOf[typings.nlapack.nlapackInts.`66`]
    
    inline def `67`: typings.nlapack.nlapackInts.`67` = 67.asInstanceOf[typings.nlapack.nlapackInts.`67`]
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `82`: typings.nlapack.nlapackInts.`82` = 82.asInstanceOf[typings.nlapack.nlapackInts.`82`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`-6`
    - typings.nlapack.nlapackInts.`-5`
    - typings.nlapack.nlapackInts.`-4`
    - typings.nlapack.nlapackInts.`-3`
    - typings.nlapack.nlapackInts.`-2`
    - typings.nlapack.nlapackInts.`-1`
    - typings.nlapack.nlapackInts.`0`
    - typings.nlapack.nlapackInts.`1`
    - typings.nlapack.nlapackInts.`2`
    - typings.nlapack.nlapackInts.`3`
    - typings.nlapack.nlapackInts.`4`
    - typings.nlapack.nlapackInts.`5`
    - typings.nlapack.nlapackInts.`6`
  */
  trait MatrixMode extends StObject
  object MatrixMode {
    
    inline def `-1`: typings.nlapack.nlapackInts.`-1` = -1.asInstanceOf[typings.nlapack.nlapackInts.`-1`]
    
    inline def `-2`: typings.nlapack.nlapackInts.`-2` = -2.asInstanceOf[typings.nlapack.nlapackInts.`-2`]
    
    inline def `-3`: typings.nlapack.nlapackInts.`-3` = -3.asInstanceOf[typings.nlapack.nlapackInts.`-3`]
    
    inline def `-4`: typings.nlapack.nlapackInts.`-4` = -4.asInstanceOf[typings.nlapack.nlapackInts.`-4`]
    
    inline def `-5`: typings.nlapack.nlapackInts.`-5` = -5.asInstanceOf[typings.nlapack.nlapackInts.`-5`]
    
    inline def `-6`: typings.nlapack.nlapackInts.`-6` = -6.asInstanceOf[typings.nlapack.nlapackInts.`-6`]
    
    inline def `0`: typings.nlapack.nlapackInts.`0` = 0.asInstanceOf[typings.nlapack.nlapackInts.`0`]
    
    inline def `1`: typings.nlapack.nlapackInts.`1` = 1.asInstanceOf[typings.nlapack.nlapackInts.`1`]
    
    inline def `2`: typings.nlapack.nlapackInts.`2` = 2.asInstanceOf[typings.nlapack.nlapackInts.`2`]
    
    inline def `3`: typings.nlapack.nlapackInts.`3` = 3.asInstanceOf[typings.nlapack.nlapackInts.`3`]
    
    inline def `4`: typings.nlapack.nlapackInts.`4` = 4.asInstanceOf[typings.nlapack.nlapackInts.`4`]
    
    inline def `5`: typings.nlapack.nlapackInts.`5` = 5.asInstanceOf[typings.nlapack.nlapackInts.`5`]
    
    inline def `6`: typings.nlapack.nlapackInts.`6` = 6.asInstanceOf[typings.nlapack.nlapackInts.`6`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`49`
    - typings.nlapack.nlapackInts.`48`
    - typings.nlapack.nlapackInts.`73`
  */
  trait MatrixNorm extends StObject
  object MatrixNorm {
    
    inline def `48`: typings.nlapack.nlapackInts.`48` = 48.asInstanceOf[typings.nlapack.nlapackInts.`48`]
    
    inline def `49`: typings.nlapack.nlapackInts.`49` = 49.asInstanceOf[typings.nlapack.nlapackInts.`49`]
    
    inline def `73`: typings.nlapack.nlapackInts.`73` = 73.asInstanceOf[typings.nlapack.nlapackInts.`73`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`78`
    - typings.nlapack.nlapackInts.`85`
    - typings.nlapack.nlapackInts.`76`
    - typings.nlapack.nlapackInts.`66`
    - typings.nlapack.nlapackInts.`81`
    - typings.nlapack.nlapackInts.`90`
  */
  trait MatrixPacking extends StObject
  object MatrixPacking {
    
    inline def `66`: typings.nlapack.nlapackInts.`66` = 66.asInstanceOf[typings.nlapack.nlapackInts.`66`]
    
    inline def `76`: typings.nlapack.nlapackInts.`76` = 76.asInstanceOf[typings.nlapack.nlapackInts.`76`]
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `81`: typings.nlapack.nlapackInts.`81` = 81.asInstanceOf[typings.nlapack.nlapackInts.`81`]
    
    inline def `85`: typings.nlapack.nlapackInts.`85` = 85.asInstanceOf[typings.nlapack.nlapackInts.`85`]
    
    inline def `90`: typings.nlapack.nlapackInts.`90` = 90.asInstanceOf[typings.nlapack.nlapackInts.`90`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`83`
    - typings.nlapack.nlapackInts.`72`
    - typings.nlapack.nlapackInts.`80`
    - typings.nlapack.nlapackInts.`78`
  */
  trait MatrixSymmetry extends StObject
  object MatrixSymmetry {
    
    inline def `72`: typings.nlapack.nlapackInts.`72` = 72.asInstanceOf[typings.nlapack.nlapackInts.`72`]
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `80`: typings.nlapack.nlapackInts.`80` = 80.asInstanceOf[typings.nlapack.nlapackInts.`80`]
    
    inline def `83`: typings.nlapack.nlapackInts.`83` = 83.asInstanceOf[typings.nlapack.nlapackInts.`83`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`78`
    - typings.nlapack.nlapackInts.`84`
    - typings.nlapack.nlapackInts.`67`
  */
  trait MatrixTrans extends StObject
  object MatrixTrans {
    
    inline def `67`: typings.nlapack.nlapackInts.`67` = 67.asInstanceOf[typings.nlapack.nlapackInts.`67`]
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `84`: typings.nlapack.nlapackInts.`84` = 84.asInstanceOf[typings.nlapack.nlapackInts.`84`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`78`
    - typings.nlapack.nlapackInts.`85`
  */
  trait MatrixUnit extends StObject
  object MatrixUnit {
    
    inline def `78`: typings.nlapack.nlapackInts.`78` = 78.asInstanceOf[typings.nlapack.nlapackInts.`78`]
    
    inline def `85`: typings.nlapack.nlapackInts.`85` = 85.asInstanceOf[typings.nlapack.nlapackInts.`85`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nlapack.nlapackInts.`85`
    - typings.nlapack.nlapackInts.`76`
  */
  trait MatrixUpperLower extends StObject
  object MatrixUpperLower {
    
    inline def `76`: typings.nlapack.nlapackInts.`76` = 76.asInstanceOf[typings.nlapack.nlapackInts.`76`]
    
    inline def `85`: typings.nlapack.nlapackInts.`85` = 85.asInstanceOf[typings.nlapack.nlapackInts.`85`]
  }
}
