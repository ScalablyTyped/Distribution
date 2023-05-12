package typings.mirada.distSrcTypesOpencvHacksMod

import typings.mirada.distSrcTypesOpencvCoreArrayMod.NormTypes
import typings.mirada.distSrcTypesOpencvHacksMod.^
import typings.mirada.distSrcTypesOpencvImgprocDrawMod.LineTypes
import typings.mirada.distSrcTypesOpencvMod.RotatedRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CV_16S: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16S").asInstanceOf[CVDataType]

inline def CV_16SC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16SC1").asInstanceOf[CVDataType]

inline def CV_16SC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16SC2").asInstanceOf[CVDataType]

inline def CV_16SC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16SC3").asInstanceOf[CVDataType]

inline def CV_16SC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16SC4").asInstanceOf[CVDataType]

inline def CV_16U: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16U").asInstanceOf[CVDataType]

inline def CV_16UC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16UC1").asInstanceOf[CVDataType]

inline def CV_16UC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16UC2").asInstanceOf[CVDataType]

inline def CV_16UC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16UC3").asInstanceOf[CVDataType]

inline def CV_16UC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_16UC4").asInstanceOf[CVDataType]

inline def CV_32F: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32F").asInstanceOf[CVDataType]

inline def CV_32FC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32FC1").asInstanceOf[CVDataType]

inline def CV_32FC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32FC2").asInstanceOf[CVDataType]

inline def CV_32FC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32FC3").asInstanceOf[CVDataType]

inline def CV_32FC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32FC4").asInstanceOf[CVDataType]

inline def CV_32S: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32S").asInstanceOf[CVDataType]

inline def CV_32SC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32SC1").asInstanceOf[CVDataType]

inline def CV_32SC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32SC2").asInstanceOf[CVDataType]

inline def CV_32SC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32SC3").asInstanceOf[CVDataType]

inline def CV_32SC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_32SC4").asInstanceOf[CVDataType]

inline def CV_64F: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_64F").asInstanceOf[CVDataType]

inline def CV_64FC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_64FC1").asInstanceOf[CVDataType]

inline def CV_64FC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_64FC2").asInstanceOf[CVDataType]

inline def CV_64FC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_64FC3").asInstanceOf[CVDataType]

inline def CV_64FC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_64FC4").asInstanceOf[CVDataType]

inline def CV_8S: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8S").asInstanceOf[CVDataType]

inline def CV_8SC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8SC1").asInstanceOf[CVDataType]

inline def CV_8SC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8SC2").asInstanceOf[CVDataType]

inline def CV_8SC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8SC3").asInstanceOf[CVDataType]

inline def CV_8SC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8SC4").asInstanceOf[CVDataType]

inline def CV_8U: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8U").asInstanceOf[CVDataType]

inline def CV_8UC1: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8UC1").asInstanceOf[CVDataType]

inline def CV_8UC2: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8UC2").asInstanceOf[CVDataType]

inline def CV_8UC3: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8UC3").asInstanceOf[CVDataType]

inline def CV_8UC4: CVDataType = ^.asInstanceOf[js.Dynamic].selectDynamic("CV_8UC4").asInstanceOf[CVDataType]

inline def FSCreateDataFile(
  arg0: String,
  path: String,
  data: js.typedarray.Uint8Array,
  arg3: Boolean,
  arg4: Boolean,
  arg5: Boolean
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("FS_createDataFile")(arg0.asInstanceOf[js.Any], path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any], arg4.asInstanceOf[js.Any], arg5.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def TermCriteriaCOUNT: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("TermCriteria_COUNT").asInstanceOf[Any]

inline def TermCriteriaEPS: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("TermCriteria_EPS").asInstanceOf[Any]

inline def TermCriteriaMAXITER: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("TermCriteria_MAX_ITER").asInstanceOf[Any]

inline def ellipse1(
  dst: typings.mirada.distSrcTypesOpencvMod.Mat,
  rotatedRect: RotatedRect,
  ellipseColor: Scalar,
  arg0: Double,
  line: LineTypes
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipse1")(dst.asInstanceOf[js.Any], rotatedRect.asInstanceOf[js.Any], ellipseColor.asInstanceOf[js.Any], arg0.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def exceptionFromPtr(err: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("exceptionFromPtr")(err.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def flushPendingDeletes(a: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flushPendingDeletes")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

inline def getInheritedInstanceCount(a: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInheritedInstanceCount")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

inline def getLiveInheritedInstances(a: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLiveInheritedInstances")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

inline def imread(canvasOrImageHtmlElement: String): typings.mirada.distSrcTypesOpencvMod.Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("imread")(canvasOrImageHtmlElement.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvMod.Mat]
inline def imread(canvasOrImageHtmlElement: HTMLElement): typings.mirada.distSrcTypesOpencvMod.Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("imread")(canvasOrImageHtmlElement.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvMod.Mat]

inline def imshow(canvasSource: String, mat: typings.mirada.distSrcTypesOpencvMod.Mat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imshow")(canvasSource.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def imshow(canvasSource: HTMLElement, mat: typings.mirada.distSrcTypesOpencvMod.Mat): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imshow")(canvasSource.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def matFromArray(rows: Double, cols: Double, `type`: Any, array: js.Array[Double]): typings.mirada.distSrcTypesOpencvMod.Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("matFromArray")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvMod.Mat]
inline def matFromArray(rows: Double, cols: Double, `type`: Any, array: js.typedarray.ArrayBufferView): typings.mirada.distSrcTypesOpencvMod.Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("matFromArray")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvMod.Mat]
inline def matFromArray(rows: Double, cols: Double, `type`: Any, array: Any): typings.mirada.distSrcTypesOpencvMod.Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("matFromArray")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvMod.Mat]

inline def matFromImageData(imageData: ImageData): typings.mirada.distSrcTypesOpencvMod.Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("matFromImageData")(imageData.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvMod.Mat]

inline def norm1(
  a: typings.mirada.distSrcTypesOpencvMod.Mat,
  b: typings.mirada.distSrcTypesOpencvMod.Mat,
  `type`: NormTypes
): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("norm1")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def onRuntimeInitialized(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("onRuntimeInitialized")().asInstanceOf[Any]

inline def setDelayFunction(a: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setDelayFunction")(a.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]

type AccessFlag = Any

type AsyncArray = Any

type Bucket = Any

type BucketKey = Any

type CVDataType = Any

type EqPredicate = Any

type ErrorCallback = Any

type FileNode = Any

type FileStorage = Any

type LshStats = Any

type Mat3 = Any

type Mat4 = Any

type MatAllocator = Any

type MatCommaInitializer = Any

type MatConstIterator = Any

type MatIterator = Any

type MatSize = js.Function0[Size]

type MatStep = Any

type Matrix = Any

type MatxAddOp = Any

type MatxDivOp = Any

type MatxMatMulOp = Any

type MatxMulOp = Any

type MatxScaleOp = Any

type MatxSubOp = Any

type MatxTOp = Any

type Moments = Any

type Net = Any

type Point3 = Any

type Point_ = Any

type Ptr = Any

type Tp = Any

type UMat = Any

type UMatData = Any

type UMatUsageFlags = Any

type Vec = Any

type Vec3 = Any

type _T2 = Any

type bool = Boolean

type cvhalDFT = Any

type diagType = Any

type double = Double

type float = Double

type float16T = Any

type floatType = Any

type int = Double

type int32T = Any

type int64 = Any

type int64T = Any

type schar = Any

type short = Any

type sizeT = Any

type typename = Any

type uchar = Any

type uint32T = Any

type uint64 = Any

type uint64T = Any

type unsigned = Any

type ushort = Any
