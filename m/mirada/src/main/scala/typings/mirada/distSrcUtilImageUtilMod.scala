package typings.mirada

import typings.mirada.anon.Data
import typings.mirada.distSrcFileMod.File
import typings.mirada.distSrcTypesOpencvMod.EmscriptenEmbindInstance
import typings.mirada.distSrcTypesOpencvMod.Mat
import typings.mirada.distSrcTypesOpencvMod.Point
import typings.mirada.distSrcTypesOpencvMod.Scalar
import typings.mirada.distSrcTypesOpencvMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilImageUtilMod {
  
  @JSImport("mirada/dist/src/util/imageUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/util/imageUtil", "asImageData")
  @js.native
  val asImageData: js.Function1[/* img */ Mat, Data] = js.native
  
  inline def asMat(f: File): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("asMat")(f.asInstanceOf[js.Any]).asInstanceOf[Mat]
  inline def asMat(f: Mat): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("asMat")(f.asInstanceOf[js.Any]).asInstanceOf[Mat]
  
  inline def compareL2(f1: File, f2: File): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: File, f2: File, destroyBoth: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], destroyBoth.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: File, f2: Mat): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: File, f2: Mat, destroyBoth: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], destroyBoth.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: Mat, f2: File): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: Mat, f2: File, destroyBoth: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], destroyBoth.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: Mat, f2: Mat): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compareL2(f1: Mat, f2: Mat, destroyBoth: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareL2")(f1.asInstanceOf[js.Any], f2.asInstanceOf[js.Any], destroyBoth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def data2mat(d: MatData): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("data2mat")(d.asInstanceOf[js.Any]).asInstanceOf[Mat]
  
  inline def del(m: EmscriptenEmbindInstance*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(m.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def fromArrayBuffer(a: js.typedarray.ArrayBuffer): js.Promise[Mat] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mat]]
  
  inline def fromFile(f: String): js.Promise[Mat] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mat]]
  
  inline def fromUrl(f: String): js.Promise[Mat] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mat]]
  
  inline def get(m: Mat, x: Double, y: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(m.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def isMat(m: Any): /* is mirada.mirada/dist/src/types/opencv.Mat */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMat")(m.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/types/opencv.Mat */ Boolean]
  
  inline def isMatData(d: Any): /* is mirada.mirada/dist/src/util/imageUtil.MatData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatData")(d.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/util/imageUtil.MatData */ Boolean]
  
  inline def isSize(size: Any): /* is mirada.mirada/dist/src/types/opencv.Size */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSize")(size.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/types/opencv.Size */ Boolean]
  
  inline def jsonParseWithMat(d: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonParseWithMat")(d.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def jsonStringifyWithMat(s: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonStringifyWithMat")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def map(mat: Mat, dst: Mat, fn: js.Function3[/* p */ Scalar, /* x */ Double, /* y */ Double, Scalar]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(mat.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mat2data(m: Mat): MatData = ^.asInstanceOf[js.Dynamic].applyDynamic("mat2data")(m.asInstanceOf[js.Any]).asInstanceOf[MatData]
  
  inline def noArray(): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("noArray")().asInstanceOf[Mat]
  
  inline def pointToSize(p: Point): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("pointToSize")(p.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def set(m: Mat, x: Double, y: Double, `val`: Scalar): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(m.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sizeToPoint(s: Size): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeToPoint")(s.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def toImageData(img: Mat): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("toImageData")(img.asInstanceOf[js.Any]).asInstanceOf[Data]
  
  inline def toRgba(mat: Mat): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("toRgba")(mat.asInstanceOf[js.Any]).asInstanceOf[Mat]
  inline def toRgba(mat: Mat, dst: Mat): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("toRgba")(mat.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Mat]
  
  trait MatData extends StObject {
    
    var cols: Double
    
    var data: String
    
    var rows: Double
    
    var `type`: Any
  }
  object MatData {
    
    inline def apply(cols: Double, data: String, rows: Double, `type`: Any): MatData = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatData] (val x: Self) extends AnyVal {
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
