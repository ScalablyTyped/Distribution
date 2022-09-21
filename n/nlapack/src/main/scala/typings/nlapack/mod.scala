package typings.nlapack

import typings.nlapack.typesMod.MatrixDistribution
import typings.nlapack.typesMod.MatrixEigenvector
import typings.nlapack.typesMod.MatrixEquilibration
import typings.nlapack.typesMod.MatrixMode
import typings.nlapack.typesMod.MatrixNorm
import typings.nlapack.typesMod.MatrixPacking
import typings.nlapack.typesMod.MatrixSymmetry
import typings.nlapack.typesMod.MatrixTrans
import typings.nlapack.typesMod.MatrixUnit
import typings.nlapack.typesMod.MatrixUpperLower
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlapack", "BandPacking")
  @js.native
  val BandPacking: MatrixPacking = js.native
  
  @JSImport("nlapack", "BothEquilibration")
  @js.native
  val BothEquilibration: MatrixEquilibration = js.native
  
  @JSImport("nlapack", "ColumnEquilibration")
  @js.native
  val ColumnEquilibration: MatrixEquilibration = js.native
  
  @JSImport("nlapack", "ConjTrans")
  @js.native
  val ConjTrans: MatrixTrans = js.native
  
  @JSImport("nlapack", "Eigenvector")
  @js.native
  val Eigenvector: MatrixEigenvector = js.native
  
  @JSImport("nlapack", "Hermitian")
  @js.native
  val Hermitian: MatrixSymmetry = js.native
  
  @JSImport("nlapack", "InfinityNorm")
  @js.native
  val InfinityNorm: MatrixNorm = js.native
  
  @JSImport("nlapack", "Lower")
  @js.native
  val Lower: MatrixUpperLower = js.native
  
  @JSImport("nlapack", "LowerBandPacking")
  @js.native
  val LowerBandPacking: MatrixPacking = js.native
  
  @JSImport("nlapack", "LowerPacking")
  @js.native
  val LowerPacking: MatrixPacking = js.native
  
  @JSImport("nlapack", "NoEigenvector")
  @js.native
  val NoEigenvector: MatrixEigenvector = js.native
  
  @JSImport("nlapack", "NoEquilibration")
  @js.native
  val NoEquilibration: MatrixEquilibration = js.native
  
  @JSImport("nlapack", "NoPacking")
  @js.native
  val NoPacking: MatrixPacking = js.native
  
  @JSImport("nlapack", "NoTrans")
  @js.native
  val NoTrans: MatrixTrans = js.native
  
  @JSImport("nlapack", "NonSymmetric")
  @js.native
  val NonSymmetric: MatrixSymmetry = js.native
  
  @JSImport("nlapack", "NonUnit")
  @js.native
  val NonUnit: MatrixUnit = js.native
  
  @JSImport("nlapack", "NormalDistribution")
  @js.native
  val NormalDistribution: MatrixDistribution = js.native
  
  @JSImport("nlapack", "OneNorm")
  @js.native
  val OneNorm: MatrixNorm = js.native
  
  @JSImport("nlapack", "Positive")
  @js.native
  val Positive: MatrixSymmetry = js.native
  
  @JSImport("nlapack", "RowEquilibration")
  @js.native
  val RowEquilibration: MatrixEquilibration = js.native
  
  @JSImport("nlapack", "Symmetric")
  @js.native
  val Symmetric: MatrixSymmetry = js.native
  
  @JSImport("nlapack", "SymmetricDistribution")
  @js.native
  val SymmetricDistribution: MatrixDistribution = js.native
  
  @JSImport("nlapack", "Trans")
  @js.native
  val Trans: MatrixTrans = js.native
  
  @JSImport("nlapack", "UniformDistribution")
  @js.native
  val UniformDistribution: MatrixDistribution = js.native
  
  @JSImport("nlapack", "Unit")
  @js.native
  val Unit: MatrixUnit = js.native
  
  @JSImport("nlapack", "Upper")
  @js.native
  val Upper: MatrixUpperLower = js.native
  
  @JSImport("nlapack", "UpperBandPacking")
  @js.native
  val UpperBandPacking: MatrixPacking = js.native
  
  @JSImport("nlapack", "UpperPacking")
  @js.native
  val UpperPacking: MatrixPacking = js.native
  
  @JSImport("nlapack", "dgbcon")
  @js.native
  val dgbcon: js.Function9[
    /* norm */ MatrixNorm, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgbequ")
  @js.native
  val dgbequ: js.Function11[
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* r */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* rowcnd */ js.typedarray.Float64Array, 
    /* colcnd */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgbequb")
  @js.native
  val dgbequb: js.Function11[
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* r */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* rowcnd */ js.typedarray.Float64Array, 
    /* colcnd */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgbrfs")
  @js.native
  val dgbrfs: js.Function16[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* afb */ js.typedarray.Float64Array, 
    /* ldafb */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgbrfsx")
  @js.native
  val dgbrfsx: js.Function = js.native
  
  @JSImport("nlapack", "dgbtrf")
  @js.native
  val dgbtrf: js.Function7[
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ js.typedarray.Float64Array, 
    /* ku */ js.typedarray.Float64Array, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgbtrs")
  @js.native
  val dgbtrs: js.Function10[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgecon")
  @js.native
  val dgecon: js.Function6[
    /* norm */ MatrixNorm, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgeequ")
  @js.native
  val dgeequ: js.Function9[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* r */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* rowcnd */ js.typedarray.Float64Array, 
    /* colcnd */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgeequb")
  @js.native
  val dgeequb: js.Function9[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* r */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* rowcnd */ js.typedarray.Float64Array, 
    /* colcnd */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgeev")
  @js.native
  val dgeev: js.Function11[
    /* jobvl */ MatrixEigenvector, 
    /* jobvr */ MatrixEigenvector, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* wr */ js.typedarray.Float64Array, 
    /* wi */ js.typedarray.Float64Array, 
    /* vl */ js.typedarray.Float64Array, 
    /* ldvl */ Double, 
    /* vr */ js.typedarray.Float64Array, 
    /* ldvr */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgerfs")
  @js.native
  val dgerfs: js.Function14[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float64Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgerfsx")
  @js.native
  val dgerfsx: js.Function22[
    /* trans */ MatrixTrans, 
    /* equed */ MatrixEquilibration, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float64Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* r */ js.typedarray.Float64Array, 
    /* c */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    /* n_err_bnds */ Double, 
    /* err_bnds_norm */ js.typedarray.Float64Array, 
    /* err_bnds_comp */ js.typedarray.Float64Array, 
    /* nparams */ Double, 
    /* params */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgesv")
  @js.native
  val dgesv: js.Function7[
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgetrf")
  @js.native
  val dgetrf: js.Function5[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgetrf2")
  @js.native
  val dgetrf2: js.Function5[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgetri")
  @js.native
  val dgetri: js.Function4[
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgetrs")
  @js.native
  val dgetrs: js.Function8[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgtcon")
  @js.native
  val dgtcon: js.Function9[
    /* norm */ MatrixNorm, 
    /* n */ Double, 
    /* dl */ js.typedarray.Float64Array, 
    /* d */ js.typedarray.Float64Array, 
    /* du */ js.typedarray.Float64Array, 
    /* du2 */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgtrfs")
  @js.native
  val dgtrfs: js.Function17[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* dl */ js.typedarray.Float64Array, 
    /* d */ js.typedarray.Float64Array, 
    /* du */ js.typedarray.Float64Array, 
    /* dlf */ js.typedarray.Float64Array, 
    /* df */ js.typedarray.Float64Array, 
    /* duf */ js.typedarray.Float64Array, 
    /* du2 */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgttrf")
  @js.native
  val dgttrf: js.Function6[
    /* n */ Double, 
    /* dl */ js.typedarray.Float64Array, 
    /* d */ js.typedarray.Float64Array, 
    /* du */ js.typedarray.Float64Array, 
    /* du2 */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dgttrs")
  @js.native
  val dgttrs: js.Function10[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* dl */ js.typedarray.Float64Array, 
    /* d */ js.typedarray.Float64Array, 
    /* du */ js.typedarray.Float64Array, 
    /* du2 */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dlatms")
  @js.native
  val dlatms: js.Function14[
    /* m */ Double, 
    /* n */ Double, 
    /* dist */ MatrixDistribution, 
    /* iseed */ js.typedarray.Int32Array, 
    /* sym */ MatrixSymmetry, 
    /* d */ js.typedarray.Float64Array, 
    /* mode */ MatrixMode, 
    /* cond */ Double, 
    /* dmax */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* pack */ MatrixPacking, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpbcon")
  @js.native
  val dpbcon: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpbequ")
  @js.native
  val dpbequ: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* s */ js.typedarray.Float64Array, 
    /* scond */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpbrfs")
  @js.native
  val dpbrfs: js.Function14[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* afb */ js.typedarray.Float64Array, 
    /* ldafb */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpbtrf")
  @js.native
  val dpbtrf: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ js.typedarray.Float64Array, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpbtrs")
  @js.native
  val dpbtrs: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpftrf")
  @js.native
  val dpftrf: js.Function4[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpftri")
  @js.native
  val dpftri: js.Function4[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpftrs")
  @js.native
  val dpftrs: js.Function7[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpocon")
  @js.native
  val dpocon: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpoequ")
  @js.native
  val dpoequ: js.Function6[
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* s */ js.typedarray.Float64Array, 
    /* scond */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpoequb")
  @js.native
  val dpoequb: js.Function6[
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* s */ js.typedarray.Float64Array, 
    /* scond */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dporfs")
  @js.native
  val dporfs: js.Function13[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float64Array, 
    /* ldaf */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dporfsx")
  @js.native
  val dporfsx: js.Function20[
    /* uplo */ MatrixUpperLower, 
    /* equed */ MatrixEquilibration, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float64Array, 
    /* ldaf */ Double, 
    /* s */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    /* n_err_bnds */ Double, 
    /* err_bnds_norm */ js.typedarray.Float64Array, 
    /* err_bnds_comp */ js.typedarray.Float64Array, 
    /* nparams */ Double, 
    /* params */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpotrf")
  @js.native
  val dpotrf: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpotrf2")
  @js.native
  val dpotrf2: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpotri")
  @js.native
  val dpotri: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpotrs")
  @js.native
  val dpotrs: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dppcon")
  @js.native
  val dppcon: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dppequ")
  @js.native
  val dppequ: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* s */ js.typedarray.Float64Array, 
    /* scond */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpprfs")
  @js.native
  val dpprfs: js.Function11[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* afp */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpptrf")
  @js.native
  val dpptrf: js.Function3[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpptri")
  @js.native
  val dpptri: js.Function3[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpptrs")
  @js.native
  val dpptrs: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpstrf")
  @js.native
  val dpstrf: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* piv */ js.typedarray.Int32Array, 
    /* rank */ js.typedarray.Int32Array, 
    /* tol */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dptcon")
  @js.native
  val dptcon: js.Function5[
    /* n */ Double, 
    /* d */ js.typedarray.Float64Array, 
    /* e */ js.typedarray.Float64Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dptrfs")
  @js.native
  val dptrfs: js.Function12[
    /* n */ Double, 
    /* nrhs */ Double, 
    /* d */ js.typedarray.Float64Array, 
    /* e */ js.typedarray.Float64Array, 
    /* df */ js.typedarray.Float64Array, 
    /* ef */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpttrf")
  @js.native
  val dpttrf: js.Function3[
    /* n */ Double, 
    /* d */ js.typedarray.Float64Array, 
    /* e */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dpttrs")
  @js.native
  val dpttrs: js.Function6[
    /* n */ Double, 
    /* nrhs */ Double, 
    /* d */ js.typedarray.Float64Array, 
    /* e */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dspcon")
  @js.native
  val dspcon: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsprfs")
  @js.native
  val dsprfs: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* afp */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsptrf")
  @js.native
  val dsptrf: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsptri")
  @js.native
  val dsptri: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsptrs")
  @js.native
  val dsptrs: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsycon")
  @js.native
  val dsycon: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsyequb")
  @js.native
  val dsyequb: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* s */ js.typedarray.Float64Array, 
    /* scond */ js.typedarray.Float64Array, 
    /* amax */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsyrfs")
  @js.native
  val dsyrfs: js.Function14[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float64Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsyrfsx")
  @js.native
  val dsyrfsx: js.Function21[
    /* uplo */ MatrixUpperLower, 
    /* equed */ MatrixEquilibration, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float64Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* s */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    /* n_err_bnds */ Double, 
    /* err_bnds_norm */ js.typedarray.Float64Array, 
    /* err_bnds_comp */ js.typedarray.Float64Array, 
    /* nparams */ Double, 
    /* params */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrf")
  @js.native
  val dsytrf: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrf_aa")
  @js.native
  val dsytrfAa: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrf_rook")
  @js.native
  val dsytrfRook: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytri")
  @js.native
  val dsytri: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytri2")
  @js.native
  val dsytri2: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytri2x")
  @js.native
  val dsytri2x: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytri_rook")
  @js.native
  val dsytriRook: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrs")
  @js.native
  val dsytrs: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrs2")
  @js.native
  val dsytrs2: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrs_aa")
  @js.native
  val dsytrsAa: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dsytrs_rook")
  @js.native
  val dsytrsRook: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtbcon")
  @js.native
  val dtbcon: js.Function8[
    /* norm */ MatrixNorm, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* kd */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtbrfs")
  @js.native
  val dtbrfs: js.Function13[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtbtrs")
  @js.native
  val dtbtrs: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* kd */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float64Array, 
    /* ldab */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtftri")
  @js.native
  val dtftri: js.Function4[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* a */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtpcon")
  @js.native
  val dtpcon: js.Function6[
    /* norm */ MatrixNorm, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtprfs")
  @js.native
  val dtprfs: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtptri")
  @js.native
  val dtptri: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtptrs")
  @js.native
  val dtptrs: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float64Array, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtrcon")
  @js.native
  val dtrcon: js.Function7[
    /* norm */ MatrixNorm, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtrrfs")
  @js.native
  val dtrrfs: js.Function13[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float64Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float64Array, 
    /* berr */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtrtri")
  @js.native
  val dtrtri: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "dtrtrs")
  @js.native
  val dtrtrs: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float64Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ilaver")
  @js.native
  val ilaver: js.Function3[
    /* vers_major */ js.typedarray.Int32Array, 
    /* vers_minor */ js.typedarray.Int32Array, 
    /* vers_patch */ js.typedarray.Int32Array, 
    scala.Unit
  ] = js.native
  
  @JSImport("nlapack", "sgbcon")
  @js.native
  val sgbcon: js.Function9[
    /* norm */ MatrixNorm, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgbequ")
  @js.native
  val sgbequ: js.Function11[
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* r */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* rowcnd */ js.typedarray.Float32Array, 
    /* colcnd */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgbequb")
  @js.native
  val sgbequb: js.Function11[
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* r */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* rowcnd */ js.typedarray.Float32Array, 
    /* colcnd */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgbrfs")
  @js.native
  val sgbrfs: js.Function16[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* afb */ js.typedarray.Float32Array, 
    /* ldafb */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgbrfsx")
  @js.native
  val sgbrfsx: js.Function = js.native
  
  @JSImport("nlapack", "sgbtrf")
  @js.native
  val sgbtrf: js.Function7[
    /* m */ Double, 
    /* n */ Double, 
    /* kl */ js.typedarray.Float32Array, 
    /* ku */ js.typedarray.Float32Array, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgbtrs")
  @js.native
  val sgbtrs: js.Function10[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgecon")
  @js.native
  val sgecon: js.Function6[
    /* norm */ MatrixNorm, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgeequ")
  @js.native
  val sgeequ: js.Function9[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    /* r */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* rowcnd */ js.typedarray.Float32Array, 
    /* colcnd */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgeequb")
  @js.native
  val sgeequb: js.Function9[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* r */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* rowcnd */ js.typedarray.Float32Array, 
    /* colcnd */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgeev")
  @js.native
  val sgeev: js.Function11[
    /* jobvl */ MatrixEigenvector, 
    /* jobvr */ MatrixEigenvector, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* wr */ js.typedarray.Float32Array, 
    /* wi */ js.typedarray.Float32Array, 
    /* vl */ js.typedarray.Float32Array, 
    /* ldvl */ Double, 
    /* vr */ js.typedarray.Float32Array, 
    /* ldvr */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgerfs")
  @js.native
  val sgerfs: js.Function14[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float32Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgerfsx")
  @js.native
  val sgerfsx: js.Function22[
    /* trans */ MatrixTrans, 
    /* equed */ MatrixEquilibration, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float32Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* r */ js.typedarray.Float32Array, 
    /* c */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    /* n_err_bnds */ Double, 
    /* err_bnds_norm */ js.typedarray.Float32Array, 
    /* err_bnds_comp */ js.typedarray.Float32Array, 
    /* nparams */ Double, 
    /* params */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgesv")
  @js.native
  val sgesv: js.Function7[
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgetrf")
  @js.native
  val sgetrf: js.Function5[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgetrf2")
  @js.native
  val sgetrf2: js.Function5[
    /* m */ Double, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgetri")
  @js.native
  val sgetri: js.Function4[
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgetrs")
  @js.native
  val sgetrs: js.Function8[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgtcon")
  @js.native
  val sgtcon: js.Function9[
    /* norm */ MatrixNorm, 
    /* n */ Double, 
    /* dl */ js.typedarray.Float32Array, 
    /* d */ js.typedarray.Float32Array, 
    /* du */ js.typedarray.Float32Array, 
    /* du2 */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgtrfs")
  @js.native
  val sgtrfs: js.Function17[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* dl */ js.typedarray.Float32Array, 
    /* d */ js.typedarray.Float32Array, 
    /* du */ js.typedarray.Float32Array, 
    /* dlf */ js.typedarray.Float32Array, 
    /* df */ js.typedarray.Float32Array, 
    /* duf */ js.typedarray.Float32Array, 
    /* du2 */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgttrf")
  @js.native
  val sgttrf: js.Function6[
    /* n */ Double, 
    /* dl */ js.typedarray.Float32Array, 
    /* d */ js.typedarray.Float32Array, 
    /* du */ js.typedarray.Float32Array, 
    /* du2 */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sgttrs")
  @js.native
  val sgttrs: js.Function10[
    /* trans */ MatrixTrans, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* dl */ js.typedarray.Float32Array, 
    /* d */ js.typedarray.Float32Array, 
    /* du */ js.typedarray.Float32Array, 
    /* du2 */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "slatms")
  @js.native
  val slatms: js.Function14[
    /* m */ Double, 
    /* n */ Double, 
    /* dist */ MatrixDistribution, 
    /* iseed */ js.typedarray.Int32Array, 
    /* sym */ MatrixSymmetry, 
    /* d */ js.typedarray.Float32Array, 
    /* mode */ MatrixMode, 
    /* cond */ Double, 
    /* dmax */ Double, 
    /* kl */ Double, 
    /* ku */ Double, 
    /* pack */ MatrixPacking, 
    /* a */ js.typedarray.Float64Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spbcon")
  @js.native
  val spbcon: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spbequ")
  @js.native
  val spbequ: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* s */ js.typedarray.Float32Array, 
    /* scond */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spbrfs")
  @js.native
  val spbrfs: js.Function14[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* afb */ js.typedarray.Float32Array, 
    /* ldafb */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spbtrf")
  @js.native
  val spbtrf: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ js.typedarray.Float32Array, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spbtrs")
  @js.native
  val spbtrs: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* kd */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spftrf")
  @js.native
  val spftrf: js.Function4[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spftri")
  @js.native
  val spftri: js.Function4[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spftrs")
  @js.native
  val spftrs: js.Function7[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spocon")
  @js.native
  val spocon: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spoequ")
  @js.native
  val spoequ: js.Function6[
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* s */ js.typedarray.Float32Array, 
    /* scond */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spoequb")
  @js.native
  val spoequb: js.Function6[
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* s */ js.typedarray.Float32Array, 
    /* scond */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sporfs")
  @js.native
  val sporfs: js.Function13[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float32Array, 
    /* ldaf */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sporfsx")
  @js.native
  val sporfsx: js.Function20[
    /* uplo */ MatrixUpperLower, 
    /* equed */ MatrixEquilibration, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float32Array, 
    /* ldaf */ Double, 
    /* s */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    /* n_err_bnds */ Double, 
    /* err_bnds_norm */ js.typedarray.Float32Array, 
    /* err_bnds_comp */ js.typedarray.Float32Array, 
    /* nparams */ Double, 
    /* params */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spotrf")
  @js.native
  val spotrf: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spotrf2")
  @js.native
  val spotrf2: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spotri")
  @js.native
  val spotri: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spotrs")
  @js.native
  val spotrs: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sppcon")
  @js.native
  val sppcon: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sppequ")
  @js.native
  val sppequ: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* s */ js.typedarray.Float32Array, 
    /* scond */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spprfs")
  @js.native
  val spprfs: js.Function11[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* afp */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spptrf")
  @js.native
  val spptrf: js.Function3[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spptri")
  @js.native
  val spptri: js.Function3[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spptrs")
  @js.native
  val spptrs: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spstrf")
  @js.native
  val spstrf: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* piv */ js.typedarray.Int32Array, 
    /* rank */ js.typedarray.Int32Array, 
    /* tol */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sptcon")
  @js.native
  val sptcon: js.Function5[
    /* n */ Double, 
    /* d */ js.typedarray.Float32Array, 
    /* e */ js.typedarray.Float32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sptrfs")
  @js.native
  val sptrfs: js.Function12[
    /* n */ Double, 
    /* nrhs */ Double, 
    /* d */ js.typedarray.Float32Array, 
    /* e */ js.typedarray.Float32Array, 
    /* df */ js.typedarray.Float32Array, 
    /* ef */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spttrf")
  @js.native
  val spttrf: js.Function3[
    /* n */ Double, 
    /* d */ js.typedarray.Float32Array, 
    /* e */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "spttrs")
  @js.native
  val spttrs: js.Function6[
    /* n */ Double, 
    /* nrhs */ Double, 
    /* d */ js.typedarray.Float32Array, 
    /* e */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "sspcon")
  @js.native
  val sspcon: js.Function6[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssprfs")
  @js.native
  val ssprfs: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* afp */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssptrf")
  @js.native
  val ssptrf: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssptri")
  @js.native
  val ssptri: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssptrs")
  @js.native
  val ssptrs: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssycon")
  @js.native
  val ssycon: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* anorm */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssyequb")
  @js.native
  val ssyequb: js.Function7[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* s */ js.typedarray.Float32Array, 
    /* scond */ js.typedarray.Float32Array, 
    /* amax */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssyrfs")
  @js.native
  val ssyrfs: js.Function14[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float32Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssyrfsx")
  @js.native
  val ssyrfsx: js.Function21[
    /* uplo */ MatrixUpperLower, 
    /* equed */ MatrixEquilibration, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* af */ js.typedarray.Float32Array, 
    /* ldaf */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* s */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    /* n_err_bnds */ Double, 
    /* err_bnds_norm */ js.typedarray.Float32Array, 
    /* err_bnds_comp */ js.typedarray.Float32Array, 
    /* nparams */ Double, 
    /* params */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrf")
  @js.native
  val ssytrf: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrf_aa")
  @js.native
  val ssytrfAa: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrf_rook")
  @js.native
  val ssytrfRook: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytri")
  @js.native
  val ssytri: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytri2")
  @js.native
  val ssytri2: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytri2x")
  @js.native
  val ssytri2x: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytri_rook")
  @js.native
  val ssytriRook: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrs")
  @js.native
  val ssytrs: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrs2")
  @js.native
  val ssytrs2: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrs_aa")
  @js.native
  val ssytrsAa: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "ssytrs_rook")
  @js.native
  val ssytrsRook: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* ipiv */ js.typedarray.Int32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stbcon")
  @js.native
  val stbcon: js.Function8[
    /* norm */ MatrixNorm, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* kd */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stbrfs")
  @js.native
  val stbrfs: js.Function13[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stbtrs")
  @js.native
  val stbtrs: js.Function10[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* kd */ Double, 
    /* nrhs */ Double, 
    /* ab */ js.typedarray.Float32Array, 
    /* ldab */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stftri")
  @js.native
  val stftri: js.Function4[
    /* transr */ MatrixTrans, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* a */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stpcon")
  @js.native
  val stpcon: js.Function6[
    /* norm */ MatrixNorm, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* rcond */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stprfs")
  @js.native
  val stprfs: js.Function12[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stptri")
  @js.native
  val stptri: js.Function4[
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "stptrs")
  @js.native
  val stptrs: js.Function8[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* ap */ js.typedarray.Float32Array, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "strcon")
  @js.native
  val strcon: js.Function7[
    /* norm */ MatrixNorm, 
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* rcond */ js.typedarray.Float64Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "strrfs")
  @js.native
  val strrfs: js.Function13[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    /* x */ js.typedarray.Float32Array, 
    /* ldx */ Double, 
    /* ferr */ js.typedarray.Float32Array, 
    /* berr */ js.typedarray.Float32Array, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "strtri")
  @js.native
  val strtri: js.Function5[
    /* uplo */ MatrixUpperLower, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    Double
  ] = js.native
  
  @JSImport("nlapack", "strtrs")
  @js.native
  val strtrs: js.Function9[
    /* uplo */ MatrixUpperLower, 
    /* trans */ MatrixTrans, 
    /* diag */ MatrixUnit, 
    /* n */ Double, 
    /* nrhs */ Double, 
    /* a */ js.typedarray.Float32Array, 
    /* lda */ Double, 
    /* b */ js.typedarray.Float32Array, 
    /* ldb */ Double, 
    Double
  ] = js.native
}
