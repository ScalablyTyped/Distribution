package typings.nginstackEngine

import typings.nginstackEngine.anon.OnlyFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIoFileMod {
  
  inline def apply(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].apply(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(fileName: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileName.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fileName: String, mode: String, encoding: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileName.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(fileName: String, mode: Unit, encoding: String): Unit = (^.asInstanceOf[js.Dynamic].apply(fileName.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/io/File", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with File {
    def this(fileName: String) = this()
    def this(fileName: String, mode: String) = this()
    def this(fileName: String, mode: String, encoding: String) = this()
    def this(fileName: String, mode: Unit, encoding: String) = this()
  }
  @JSImport("@nginstack/engine/lib/io/File", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeFileExtension(fileName: String, `extension`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeFileExtension")(fileName.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def copyDirectory(sourceDir: String, targetDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirectory")(sourceDir.asInstanceOf[js.Any], targetDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirectory(sourceDir: String, targetDir: String, opt_replace: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirectory")(sourceDir.asInstanceOf[js.Any], targetDir.asInstanceOf[js.Any], opt_replace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyFile(existingFileName: String, newFileName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(existingFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createDirectory(dirName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createDirectory")(dirName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def createTempDirName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createTempDirName")().asInstanceOf[String]
  
  inline def createTempFile(): typings.std.File = ^.asInstanceOf[js.Dynamic].applyDynamic("createTempFile")().asInstanceOf[typings.std.File]
  
  inline def deleteDirectory(dirName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDirectory")(dirName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def deleteDirectory(dirName: String, recursive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDirectory")(dirName.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deleteFile(fileName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def directoryExists(dirName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("directoryExists")(dirName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def extractFileName(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractFilePath(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFilePath")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileExists(fileName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(fileName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fileFromString(fileName: String, content: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromString")(fileName.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fileFromString(fileName: String, content: String, opt_encoding: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromString")(fileName.asInstanceOf[js.Any], content.asInstanceOf[js.Any], opt_encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findClose(searchRecord: SearchRecord): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("findClose")(searchRecord.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def findFirst(fileName: String): SearchRecord = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(fileName.asInstanceOf[js.Any]).asInstanceOf[SearchRecord]
  inline def findFirst(fileName: String, opt_attributes: String): SearchRecord = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(fileName.asInstanceOf[js.Any], opt_attributes.asInstanceOf[js.Any])).asInstanceOf[SearchRecord]
  
  inline def findNext(searchRecord: SearchRecord): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("findNext")(searchRecord.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getSize(fileName: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(fileName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTempFileName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTempFileName")().asInstanceOf[String]
  
  inline def listEntries(path: String): js.Array[FileListEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("listEntries")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[FileListEntry]]
  inline def listEntries(path: String, opt_options: OnlyFiles): js.Array[FileListEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("listEntries")(path.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[js.Array[FileListEntry]]
  
  inline def moveFile(existingFileName: String, newFileName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(existingFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def openForRead(path: String): typings.std.File = ^.asInstanceOf[js.Dynamic].applyDynamic("openForRead")(path.asInstanceOf[js.Any]).asInstanceOf[typings.std.File]
  
  inline def pathAppend(path: String, append: js.Array[js.Array[String] | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pathAppend")(path.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@nginstack/engine/lib/io/File", "pathSeparator")
  @js.native
  def pathSeparator: String = js.native
  inline def pathSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathSeparator")(x.asInstanceOf[js.Any])
  
  inline def stringFromFile(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringFromFile")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringFromFile(fileName: String, opt_encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringFromFile")(fileName.asInstanceOf[js.Any], opt_encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait File extends StObject {
    
    def clear(): Unit = js.native
    
    def close(): Unit = js.native
    
    def flush(): Unit = js.native
    
    var modified: js.Date = js.native
    
    var position: Double = js.native
    
    def read(): String = js.native
    def read(opt_count: Double): String = js.native
    
    def readln(): String = js.native
    
    var size: Double = js.native
    
    def write(data: String): Unit = js.native
    def write(data: js.typedarray.ArrayBuffer): Unit = js.native
    def write(data: js.typedarray.Uint8Array): Unit = js.native
    
    def writeln(data: String): Unit = js.native
  }
  
  trait FileListEntry extends StObject {
    
    var isDirectory: Boolean
    
    var modified: js.Date
    
    var name: String
    
    var path: String
    
    var relativePath: String
    
    var size: Double
  }
  object FileListEntry {
    
    inline def apply(
      isDirectory: Boolean,
      modified: js.Date,
      name: String,
      path: String,
      relativePath: String,
      size: Double
    ): FileListEntry = {
      val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileListEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileListEntry] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setModified(value: js.Date): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type SearchRecord = typings.nginstackEngine.libIoSearchRecordMod.^
}
