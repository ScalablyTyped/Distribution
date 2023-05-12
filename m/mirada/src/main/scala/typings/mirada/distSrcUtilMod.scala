package typings.mirada

import typings.mirada.anon.Data
import typings.mirada.distSrcFileMod.File
import typings.mirada.distSrcTypesEmscriptenMod.FS
import typings.mirada.distSrcTypesOpencvMod.EmscriptenEmbindInstance
import typings.mirada.distSrcTypesOpencvMod.Mat
import typings.mirada.distSrcTypesOpencvMod.Point
import typings.mirada.distSrcTypesOpencvMod.Scalar
import typings.mirada.distSrcTypesOpencvMod.Size
import typings.mirada.distSrcUtilGrabCutMod.GrabCutObsoleteOptions
import typings.mirada.distSrcUtilGrabCutMod.GrabCutOsoleteResult
import typings.mirada.distSrcUtilImageUtilMod.MatData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilMod {
  
  @JSImport("mirada/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/util", "asImageData")
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
  
  object file {
    
    @JSImport("mirada/dist/src/util", "file")
    @js.native
    val ^ : js.Any = js.native
    
    object fileUtil {
      
      @JSImport("mirada/dist/src/util", "file.fileUtil")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.getFileName")
      @js.native
      def getFileName: js.Function1[/* path */ String, String] = js.native
      inline def getFileName(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileName")(path.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def getFileName_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(x.asInstanceOf[js.Any])
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.getFilePath")
      @js.native
      def getFilePath: js.Function1[/* path */ String, String] = js.native
      inline def getFilePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def getFilePath_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFilePath")(x.asInstanceOf[js.Any])
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.isDir")
      @js.native
      def isDir: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean] = js.native
      inline def isDir(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isDir(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def isDir_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDir")(x.asInstanceOf[js.Any])
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.isFile")
      @js.native
      def isFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean] = js.native
      inline def isFile(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isFile(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def isFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFile")(x.asInstanceOf[js.Any])
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.readFile")
      @js.native
      def readFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], js.typedarray.ArrayBufferView] = js.native
      inline def readFile(f: String): js.typedarray.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBufferView]
      inline def readFile(f: String, FS: FS): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
      inline def readFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], js.typedarray.ArrayBufferView]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFile")(x.asInstanceOf[js.Any])
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.removeFile")
      @js.native
      def removeFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Unit] = js.native
      inline def removeFile(f: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def removeFile(f: String, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(x.asInstanceOf[js.Any])
      
      @JSImport("mirada/dist/src/util", "file.fileUtil.writeFile")
      @js.native
      def writeFile: js.Function3[
            /* name */ String, 
            /* f */ js.typedarray.ArrayBufferView, 
            /* FS */ js.UndefOr[FS], 
            Unit
          ] = js.native
      inline def writeFile(name: String, f: js.typedarray.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def writeFile(name: String, f: js.typedarray.ArrayBufferView, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def writeFile_=(
        x: js.Function3[
              /* name */ String, 
              /* f */ js.typedarray.ArrayBufferView, 
              /* FS */ js.UndefOr[FS], 
              Unit
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(x.asInstanceOf[js.Any])
    }
    
    inline def getFileName(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileName")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getFilePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isDir(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isDir(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isFile(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isFile(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def loadDataFile(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDataFile")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def loadDataFile(url: String, name: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadDataFile")(url.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def readFile(f: String): js.typedarray.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBufferView]
    inline def readFile(f: String, FS: FS): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
    
    inline def removeFile(f: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeFile(f: String, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeFile(name: String, f: js.typedarray.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile(name: String, f: js.typedarray.ArrayBufferView, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object fileUtil {
    
    @JSImport("mirada/dist/src/util", "fileUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mirada/dist/src/util", "fileUtil.getFileName")
    @js.native
    def getFileName: js.Function1[/* path */ String, String] = js.native
    inline def getFileName(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileName")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getFileName_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util", "fileUtil.getFilePath")
    @js.native
    def getFilePath: js.Function1[/* path */ String, String] = js.native
    inline def getFilePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getFilePath_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFilePath")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util", "fileUtil.isDir")
    @js.native
    def isDir: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean] = js.native
    inline def isDir(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isDir(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isDir_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDir")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util", "fileUtil.isFile")
    @js.native
    def isFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean] = js.native
    inline def isFile(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isFile(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFile")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util", "fileUtil.readFile")
    @js.native
    def readFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], js.typedarray.ArrayBufferView] = js.native
    inline def readFile(f: String): js.typedarray.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBufferView]
    inline def readFile(f: String, FS: FS): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
    inline def readFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], js.typedarray.ArrayBufferView]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFile")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util", "fileUtil.removeFile")
    @js.native
    def removeFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Unit] = js.native
    inline def removeFile(f: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeFile(f: String, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util", "fileUtil.writeFile")
    @js.native
    def writeFile: js.Function3[
        /* name */ String, 
        /* f */ js.typedarray.ArrayBufferView, 
        /* FS */ js.UndefOr[FS], 
        Unit
      ] = js.native
    inline def writeFile(name: String, f: js.typedarray.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile(name: String, f: js.typedarray.ArrayBufferView, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFile_=(
      x: js.Function3[
          /* name */ String, 
          /* f */ js.typedarray.ArrayBufferView, 
          /* FS */ js.UndefOr[FS], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(x.asInstanceOf[js.Any])
  }
  
  inline def fromArrayBuffer(a: js.typedarray.ArrayBuffer): js.Promise[Mat] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mat]]
  
  inline def fromFile(f: String): js.Promise[Mat] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mat]]
  
  inline def fromUrl(f: String): js.Promise[Mat] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(f.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Mat]]
  
  inline def get(m: Mat, x: Double, y: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(m.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def grabCutObsolete(o: GrabCutObsoleteOptions): js.Promise[GrabCutOsoleteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("grabCut_obsolete")(o.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GrabCutOsoleteResult]]
  
  inline def isMat(m: Any): /* is mirada.mirada/dist/src/types/opencv.Mat */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMat")(m.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/types/opencv.Mat */ Boolean]
  
  inline def isMatData(d: Any): /* is mirada.mirada/dist/src/util/imageUtil.MatData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatData")(d.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/util/imageUtil.MatData */ Boolean]
  
  inline def isSize(size: Any): /* is mirada.mirada/dist/src/types/opencv.Size */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSize")(size.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/types/opencv.Size */ Boolean]
  
  inline def jsonParseWithMat(d: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonParseWithMat")(d.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def jsonStringifyWithMat(s: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonStringifyWithMat")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadDataFile(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadDataFile")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def loadDataFile(url: String, name: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadDataFile")(url.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def map(mat: Mat, dst: Mat, fn: js.Function3[/* p */ Scalar, /* x */ Double, /* y */ Double, Scalar]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(mat.asInstanceOf[js.Any], dst.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mat2data(m: Mat): MatData = ^.asInstanceOf[js.Dynamic].applyDynamic("mat2data")(m.asInstanceOf[js.Any]).asInstanceOf[MatData]
  
  inline def noArray(): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("noArray")().asInstanceOf[Mat]
  
  inline def pointToSize(p: Point): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("pointToSize")(p.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def set(m: Mat, x: Double, y: Double, `val`: Scalar): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(m.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sizeToPoint(s: Size): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeToPoint")(s.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def toImageData(img: Mat): Data = ^.asInstanceOf[js.Dynamic].applyDynamic("toImageData")(img.asInstanceOf[js.Any]).asInstanceOf[Data]
  
  inline def toRgba(mat: Mat): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("toRgba")(mat.asInstanceOf[js.Any]).asInstanceOf[Mat]
  inline def toRgba(mat: Mat, dst: Mat): Mat = (^.asInstanceOf[js.Dynamic].applyDynamic("toRgba")(mat.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[Mat]
}
