package typings.mirada

import typings.mirada.distSrcTypesEmscriptenMod.FS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilFileUtilMod {
  
  @JSImport("mirada/dist/src/util/fileUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object fileUtil {
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.getFileName")
    @js.native
    def getFileName: js.Function1[/* path */ String, String] = js.native
    inline def getFileName(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileName")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getFileName_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFileName")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.getFilePath")
    @js.native
    def getFilePath: js.Function1[/* path */ String, String] = js.native
    inline def getFilePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getFilePath_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFilePath")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.isDir")
    @js.native
    def isDir: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean] = js.native
    inline def isDir(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isDir(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDir")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isDir_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDir")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.isFile")
    @js.native
    def isFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean] = js.native
    inline def isFile(f: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isFile(f: String, FS: FS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFile")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.readFile")
    @js.native
    def readFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], js.typedarray.ArrayBufferView] = js.native
    inline def readFile(f: String): js.typedarray.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBufferView]
    inline def readFile(f: String, FS: FS): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
    inline def readFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], js.typedarray.ArrayBufferView]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFile")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.removeFile")
    @js.native
    def removeFile: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Unit] = js.native
    inline def removeFile(f: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeFile(f: String, FS: FS): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFile")(f.asInstanceOf[js.Any], FS.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def removeFile_=(x: js.Function2[/* f */ String, /* FS */ js.UndefOr[FS], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeFile")(x.asInstanceOf[js.Any])
    
    @JSImport("mirada/dist/src/util/fileUtil", "fileUtil.writeFile")
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
