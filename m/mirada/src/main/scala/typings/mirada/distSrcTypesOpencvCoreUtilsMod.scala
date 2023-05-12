package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.AsyncArray
import typings.mirada.distSrcTypesOpencvHacksMod.ErrorCallback
import typings.mirada.distSrcTypesOpencvHacksMod.Tp
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvHacksMod.float16T
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.int64
import typings.mirada.distSrcTypesOpencvHacksMod.schar
import typings.mirada.distSrcTypesOpencvHacksMod.short
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvHacksMod.uchar
import typings.mirada.distSrcTypesOpencvHacksMod.uint64
import typings.mirada.distSrcTypesOpencvHacksMod.unsigned
import typings.mirada.distSrcTypesOpencvHacksMod.ushort
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArrayOfArrays
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvCoreUtilsMod {
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX")
  @js.native
  val CPU_AVX: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX2")
  @js.native
  val CPU_AVX2: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_CEL")
  @js.native
  val CPU_AVX512_CEL: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_CNL")
  @js.native
  val CPU_AVX512_CNL: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_COMMON")
  @js.native
  val CPU_AVX512_COMMON: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_ICL")
  @js.native
  val CPU_AVX512_ICL: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_KNL")
  @js.native
  val CPU_AVX512_KNL: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_KNM")
  @js.native
  val CPU_AVX512_KNM: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX512_SKX")
  @js.native
  val CPU_AVX512_SKX: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_5124FMAPS")
  @js.native
  val CPU_AVX_5124FMAPS: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_5124VNNIW")
  @js.native
  val CPU_AVX_5124VNNIW: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512BITALG")
  @js.native
  val CPU_AVX_512BITALG: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512BW")
  @js.native
  val CPU_AVX_512BW: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512CD")
  @js.native
  val CPU_AVX_512CD: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512DQ")
  @js.native
  val CPU_AVX_512DQ: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512ER")
  @js.native
  val CPU_AVX_512ER: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512F")
  @js.native
  val CPU_AVX_512F: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512IFMA")
  @js.native
  val CPU_AVX_512IFMA: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512IFMA512")
  @js.native
  val CPU_AVX_512IFMA512: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512PF")
  @js.native
  val CPU_AVX_512PF: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512VBMI")
  @js.native
  val CPU_AVX_512VBMI: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512VBMI2")
  @js.native
  val CPU_AVX_512VBMI2: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512VL")
  @js.native
  val CPU_AVX_512VL: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512VNNI")
  @js.native
  val CPU_AVX_512VNNI: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_AVX_512VPOPCNTDQ")
  @js.native
  val CPU_AVX_512VPOPCNTDQ: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_FMA3")
  @js.native
  val CPU_FMA3: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_FP16")
  @js.native
  val CPU_FP16: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_MAX_FEATURE")
  @js.native
  val CPU_MAX_FEATURE: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_MMX")
  @js.native
  val CPU_MMX: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_NEON")
  @js.native
  val CPU_NEON: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_POPCNT")
  @js.native
  val CPU_POPCNT: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_SSE")
  @js.native
  val CPU_SSE: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_SSE2")
  @js.native
  val CPU_SSE2: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_SSE3")
  @js.native
  val CPU_SSE3: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_SSE4_1")
  @js.native
  val CPU_SSE4_1: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_SSE4_2")
  @js.native
  val CPU_SSE4_2: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_SSSE3")
  @js.native
  val CPU_SSSE3: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_VSX")
  @js.native
  val CPU_VSX: CpuFeatures = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "CPU_VSX3")
  @js.native
  val CPU_VSX3: CpuFeatures = js.native
  
  inline def CV_XADD(addr: Any, delta: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("CV_XADD")(addr.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def Cholesky(A: Any, astep: sizeT, m: int, b: Any, bstep: sizeT, n: int): bool = (^.asInstanceOf[js.Dynamic].applyDynamic("Cholesky")(A.asInstanceOf[js.Any], astep.asInstanceOf[js.Any], m.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bstep.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[bool]
  
  inline def LU(A: Any, astep: sizeT, m: int, b: Any, bstep: sizeT, n: int): int = (^.asInstanceOf[js.Dynamic].applyDynamic("LU")(A.asInstanceOf[js.Any], astep.asInstanceOf[js.Any], m.asInstanceOf[js.Any], b.asInstanceOf[js.Any], bstep.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[int]
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "SORT_ASCENDING")
  @js.native
  val SORT_ASCENDING: SortFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "SORT_DESCENDING")
  @js.native
  val SORT_DESCENDING: SortFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "SORT_EVERY_COLUMN")
  @js.native
  val SORT_EVERY_COLUMN: SortFlags = js.native
  
  @JSImport("mirada/dist/src/types/opencv/core_utils", "SORT_EVERY_ROW")
  @js.native
  val SORT_EVERY_ROW: SortFlags = js.native
  
  inline def alignPtr(arg92: Any, ptr: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alignPtr")(arg92.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def alignPtr(arg92: Any, ptr: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("alignPtr")(arg92.asInstanceOf[js.Any], ptr.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def alignSize(sz: sizeT, n: int): sizeT = (^.asInstanceOf[js.Dynamic].applyDynamic("alignSize")(sz.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[sizeT]
  
  inline def checkHardwareSupport(feature: int): bool = ^.asInstanceOf[js.Dynamic].applyDynamic("checkHardwareSupport")(feature.asInstanceOf[js.Any]).asInstanceOf[bool]
  
  inline def cubeRoot(`val`: float): float = ^.asInstanceOf[js.Dynamic].applyDynamic("cubeRoot")(`val`.asInstanceOf[js.Any]).asInstanceOf[float]
  
  inline def cvAbs(arg93: Any, x: Tp): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cv_abs")(arg93.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def cvAbs(x: ushort): ushort = ^.asInstanceOf[js.Dynamic].applyDynamic("cv_abs")(x.asInstanceOf[js.Any]).asInstanceOf[ushort]
  
  inline def cvAbs_int(x: short): int = ^.asInstanceOf[js.Dynamic].applyDynamic("cv_abs")(x.asInstanceOf[js.Any]).asInstanceOf[int]
  
  inline def cvAbs_schar(x: schar): schar = ^.asInstanceOf[js.Dynamic].applyDynamic("cv_abs")(x.asInstanceOf[js.Any]).asInstanceOf[schar]
  
  inline def cvAbs_uchar(x: uchar): uchar = ^.asInstanceOf[js.Dynamic].applyDynamic("cv_abs")(x.asInstanceOf[js.Any]).asInstanceOf[uchar]
  
  inline def cvCeil(value: double | float | int): int = ^.asInstanceOf[js.Dynamic].applyDynamic("cvCeil")(value.asInstanceOf[js.Any]).asInstanceOf[int]
  
  inline def cvFloor(value: double | float | int): int = ^.asInstanceOf[js.Dynamic].applyDynamic("cvFloor")(value.asInstanceOf[js.Any]).asInstanceOf[int]
  
  inline def cvIsInf(value: double | float): int = ^.asInstanceOf[js.Dynamic].applyDynamic("cvIsInf")(value.asInstanceOf[js.Any]).asInstanceOf[int]
  
  inline def cvIsNaN(value: double | float): int = ^.asInstanceOf[js.Dynamic].applyDynamic("cvIsNaN")(value.asInstanceOf[js.Any]).asInstanceOf[int]
  
  inline def cvRound(value: double | float | int): int = ^.asInstanceOf[js.Dynamic].applyDynamic("cvRound")(value.asInstanceOf[js.Any]).asInstanceOf[int]
  
  inline def divUp(a: int, b: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("divUp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def divUp(a: sizeT, b: Any): sizeT = (^.asInstanceOf[js.Dynamic].applyDynamic("divUp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[sizeT]
  
  inline def dumpInputArray(argument: InputArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpInputArray")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dumpInputArrayOfArrays(argument: InputArrayOfArrays): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpInputArrayOfArrays")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dumpInputOutputArray(argument: InputOutputArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpInputOutputArray")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dumpInputOutputArrayOfArrays(argument: InputOutputArrayOfArrays): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpInputOutputArrayOfArrays")(argument.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def error(_code: int, _err: Any, _func: Any, _file: Any, _line: int): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(_code.asInstanceOf[js.Any], _err.asInstanceOf[js.Any], _func.asInstanceOf[js.Any], _file.asInstanceOf[js.Any], _line.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def error(exc: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(exc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fastAtan2(y: float, x: float): float = (^.asInstanceOf[js.Dynamic].applyDynamic("fastAtan2")(y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[float]
  
  inline def fastFree(ptr: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fastFree")(ptr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fastMalloc(bufSize: sizeT): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fastMalloc")(bufSize.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def forEachImpl(arg94: Any, arg95: Any, operation: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach_impl")(arg94.asInstanceOf[js.Any], arg95.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getBuildInformation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuildInformation")().asInstanceOf[Any]
  
  inline def getCPUFeaturesLine(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCPUFeaturesLine")().asInstanceOf[Any]
  
  inline def getCPUTickCount(): int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("getCPUTickCount")().asInstanceOf[int64]
  
  inline def getElemSize(`type`: int): sizeT = ^.asInstanceOf[js.Dynamic].applyDynamic("getElemSize")(`type`.asInstanceOf[js.Any]).asInstanceOf[sizeT]
  
  inline def getHardwareFeatureName(feature: int): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHardwareFeatureName")(feature.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getNumThreads(): int = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumThreads")().asInstanceOf[int]
  
  inline def getNumberOfCPUs(): int = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfCPUs")().asInstanceOf[int]
  
  inline def getThreadNum(): int = ^.asInstanceOf[js.Dynamic].applyDynamic("getThreadNum")().asInstanceOf[int]
  
  inline def getTickCount(): int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickCount")().asInstanceOf[int64]
  
  inline def getTickFrequency(): double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickFrequency")().asInstanceOf[double]
  
  inline def getVersionMajor(): int = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionMajor")().asInstanceOf[int]
  
  inline def getVersionMinor(): int = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionMinor")().asInstanceOf[int]
  
  inline def getVersionRevision(): int = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionRevision")().asInstanceOf[int]
  
  inline def getVersionString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionString")().asInstanceOf[String]
  
  inline def glob(pattern: String, result: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def glob(pattern: String, result: Any, recursive: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], result.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normInf(arg96: Any, arg97: Any, a: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normInf")(arg96.asInstanceOf[js.Any], arg97.asInstanceOf[js.Any], a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normInf(arg98: Any, arg99: Any, a: Any, b: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normInf")(arg98.asInstanceOf[js.Any], arg99.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def normL1(arg100: Any, arg101: Any, a: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normL1")(arg100.asInstanceOf[js.Any], arg101.asInstanceOf[js.Any], a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normL1(arg102: Any, arg103: Any, a: Any, b: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normL1")(arg102.asInstanceOf[js.Any], arg103.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normL1(a: Any, b: Any, n: int): float = (^.asInstanceOf[js.Dynamic].applyDynamic("normL1")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[float]
  
  inline def normL1_uchar(a: uchar, b: uchar, n: int): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("normL1")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[uchar]
  
  inline def normL2Sqr(arg104: Any, arg105: Any, a: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normL2Sqr")(arg104.asInstanceOf[js.Any], arg105.asInstanceOf[js.Any], a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normL2Sqr(arg106: Any, arg107: Any, a: Any, b: Any, n: int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normL2Sqr")(arg106.asInstanceOf[js.Any], arg107.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normL2Sqr(a: Any, b: Any, n: int): float = (^.asInstanceOf[js.Dynamic].applyDynamic("normL2Sqr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[float]
  
  inline def parallelFor(range: Any, body: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel_for_")(range.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parallelFor(range: Any, body: Any, nstripes: double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel_for_")(range.asInstanceOf[js.Any], body.asInstanceOf[js.Any], nstripes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def redirectError(errCallback: ErrorCallback): ErrorCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectError")(errCallback.asInstanceOf[js.Any]).asInstanceOf[ErrorCallback]
  inline def redirectError(errCallback: ErrorCallback, userdata: Any): ErrorCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("redirectError")(errCallback.asInstanceOf[js.Any], userdata.asInstanceOf[js.Any])).asInstanceOf[ErrorCallback]
  inline def redirectError(errCallback: ErrorCallback, userdata: Any, prevUserdata: Any): ErrorCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("redirectError")(errCallback.asInstanceOf[js.Any], userdata.asInstanceOf[js.Any], prevUserdata.asInstanceOf[js.Any])).asInstanceOf[ErrorCallback]
  inline def redirectError(errCallback: ErrorCallback, userdata: Unit, prevUserdata: Any): ErrorCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("redirectError")(errCallback.asInstanceOf[js.Any], userdata.asInstanceOf[js.Any], prevUserdata.asInstanceOf[js.Any])).asInstanceOf[ErrorCallback]
  
  inline def roundUp(a: int, b: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("roundUp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[int]
  inline def roundUp(a: sizeT, b: Any): sizeT = (^.asInstanceOf[js.Dynamic].applyDynamic("roundUp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[sizeT]
  
  inline def saturateCast(arg113: Any, v: double | float | int): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg113.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def saturateCast(arg116: Any, v: int64): int64 = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg116.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[int64]
  
  inline def saturateCast_Any(arg111: Any, v: float16T | short | unsigned): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg111.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def saturateCast_schar(arg109: Any, v: schar): schar = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg109.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[schar]
  
  inline def saturateCast_uchar(arg108: Any, v: uchar): uchar = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg108.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[uchar]
  
  inline def saturateCast_uint64(arg117: Any, v: uint64): uint64 = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg117.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[uint64]
  
  inline def saturateCast_ushort(arg110: Any, v: ushort): ushort = (^.asInstanceOf[js.Dynamic].applyDynamic("saturate_cast")(arg110.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ushort]
  
  inline def setBreakOnError(flag: bool): bool = ^.asInstanceOf[js.Dynamic].applyDynamic("setBreakOnError")(flag.asInstanceOf[js.Any]).asInstanceOf[bool]
  
  inline def setNumThreads(nthreads: int): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNumThreads")(nthreads.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUseOptimized(onoff: bool): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseOptimized")(onoff.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tempfile(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tempfile")().asInstanceOf[String]
  inline def tempfile(suffix: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tempfile")(suffix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def testAsyncArray(argument: InputArray): AsyncArray = ^.asInstanceOf[js.Dynamic].applyDynamic("testAsyncArray")(argument.asInstanceOf[js.Any]).asInstanceOf[AsyncArray]
  
  inline def testAsyncException(): AsyncArray = ^.asInstanceOf[js.Dynamic].applyDynamic("testAsyncException")().asInstanceOf[AsyncArray]
  
  inline def useOptimized(): bool = ^.asInstanceOf[js.Dynamic].applyDynamic("useOptimized")().asInstanceOf[bool]
  
  type CpuFeatures = Any
  
  type SortFlags = Any
}
