package typings.parcelFs

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.parcelFs.anon.WithFileTypes
import typings.parcelFs.anon.`0`
import typings.parcelWatcher.mod.AsyncSubscription
import typings.parcelWatcher.mod.Event
import typings.parcelWatcher.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Dirent extends StObject {
    
    def isBlockDevice(): Boolean
    
    def isCharacterDevice(): Boolean
    
    def isDirectory(): Boolean
    
    def isFIFO(): Boolean
    
    def isFile(): Boolean
    
    def isSocket(): Boolean
    
    def isSymbolicLink(): Boolean
    
    val name: String
  }
  object Dirent {
    
    inline def apply(
      isBlockDevice: () => Boolean,
      isCharacterDevice: () => Boolean,
      isDirectory: () => Boolean,
      isFIFO: () => Boolean,
      isFile: () => Boolean,
      isSocket: () => Boolean,
      isSymbolicLink: () => Boolean,
      name: String
    ): Dirent = {
      val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dirent]
    }
    
    extension [Self <: Dirent](x: Self) {
      
      inline def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
      
      inline def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
      
      inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      inline def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
      
      inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      inline def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
      
      inline def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelFs.parcelFsStrings.hex
    - typings.parcelFs.parcelFsStrings.utf8
    - typings.parcelFs.parcelFsStrings.`utf-8`
    - typings.parcelFs.parcelFsStrings.ascii
    - typings.parcelFs.parcelFsStrings.binary
    - typings.parcelFs.parcelFsStrings.base64
    - typings.parcelFs.parcelFsStrings.ucs2
    - typings.parcelFs.parcelFsStrings.`ucs-2`
    - typings.parcelFs.parcelFsStrings.utf16le
    - typings.parcelFs.parcelFsStrings.latin1
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ascii: typings.parcelFs.parcelFsStrings.ascii = "ascii".asInstanceOf[typings.parcelFs.parcelFsStrings.ascii]
    
    inline def base64: typings.parcelFs.parcelFsStrings.base64 = "base64".asInstanceOf[typings.parcelFs.parcelFsStrings.base64]
    
    inline def binary: typings.parcelFs.parcelFsStrings.binary = "binary".asInstanceOf[typings.parcelFs.parcelFsStrings.binary]
    
    inline def hex: typings.parcelFs.parcelFsStrings.hex = "hex".asInstanceOf[typings.parcelFs.parcelFsStrings.hex]
    
    inline def latin1: typings.parcelFs.parcelFsStrings.latin1 = "latin1".asInstanceOf[typings.parcelFs.parcelFsStrings.latin1]
    
    inline def `ucs-2`: typings.parcelFs.parcelFsStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.parcelFs.parcelFsStrings.`ucs-2`]
    
    inline def ucs2: typings.parcelFs.parcelFsStrings.ucs2 = "ucs2".asInstanceOf[typings.parcelFs.parcelFsStrings.ucs2]
    
    inline def `utf-8`: typings.parcelFs.parcelFsStrings.`utf-8` = "utf-8".asInstanceOf[typings.parcelFs.parcelFsStrings.`utf-8`]
    
    inline def utf16le: typings.parcelFs.parcelFsStrings.utf16le = "utf16le".asInstanceOf[typings.parcelFs.parcelFsStrings.utf16le]
    
    inline def utf8: typings.parcelFs.parcelFsStrings.utf8 = "utf8".asInstanceOf[typings.parcelFs.parcelFsStrings.utf8]
  }
  
  trait FileOptions extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
  }
  object FileOptions {
    
    inline def apply(): FileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  @js.native
  trait FileSystem extends StObject {
    
    def chdir(
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Unit = js.native
    
    def copyFile(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Unit] = js.native
    def copyFile(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      flags: Double
    ): js.Promise[Unit] = js.native
    
    def createReadStream(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Readable = js.native
    def createReadStream(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      options: FileOptions
    ): Readable = js.native
    
    def createWriteStream(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Writable = js.native
    def createWriteStream(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      options: FileOptions
    ): Writable = js.native
    
    def cwd(): Any = js.native
    
    def exists(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Boolean] = js.native
    
    def existsSync(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Boolean = js.native
    
    def findAncestorFile(
      fileNames: js.Array[String],
      fromDir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any) | Null
      ] = js.native
    
    def findFirstFile(
      filePaths: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
        ]
    ): js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any) | Null
      ] = js.native
    
    def findNodeModule(
      moduleName: String,
      fromDir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any) | Null
      ] = js.native
    
    def getEventsSince(
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      opts: Options
    ): js.Promise[js.Array[Event]] = js.native
    
    def mkdirp(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Unit] = js.native
    
    def ncp(
      source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      destination: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Unit] = js.native
    
    def readFile(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Buffer] = js.native
    def readFile(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      encoding: Encoding
    ): js.Promise[String] = js.native
    
    def readFileSync(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Buffer = js.native
    def readFileSync(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      encoding: Encoding
    ): String = js.native
    
    def readdir(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
        ]
      ] = js.native
    def readdir(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      opts: WithFileTypes
    ): js.Promise[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
        ]
      ] = js.native
    def readdir(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      opts: `0`
    ): js.Promise[js.Array[Dirent]] = js.native
    
    def readdirSync(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ] = js.native
    def readdirSync(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      opts: WithFileTypes
    ): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ] = js.native
    def readdirSync(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      opts: `0`
    ): js.Array[Dirent] = js.native
    
    def realpath(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
      ] = js.native
    
    def realpathSync(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Any = js.native
    
    def rimraf(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Unit] = js.native
    
    def stat(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Stats] = js.native
    
    def statSync(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): Stats = js.native
    
    def unlink(
      path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any
    ): js.Promise[Unit] = js.native
    
    def watch(
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      fn: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* events */ js.Array[Event], Any],
      opts: Options
    ): js.Promise[AsyncSubscription] = js.native
    
    def writeFile(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      contents: String
    ): js.Promise[Unit] = js.native
    def writeFile(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      contents: String,
      options: FileOptions
    ): js.Promise[Unit] = js.native
    def writeFile(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      contents: Buffer
    ): js.Promise[Unit] = js.native
    def writeFile(
      filePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      contents: Buffer,
      options: FileOptions
    ): js.Promise[Unit] = js.native
    
    def writeSnapshot(
      dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilePath */ Any,
      opts: Options
    ): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parcelFs.anon.WithFileTypes
    - typings.parcelFs.anon.`0`
  */
  trait ReaddirOptions extends StObject
  object ReaddirOptions {
    
    inline def `0`(): typings.parcelFs.anon.`0` = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[typings.parcelFs.anon.`0`]
    }
    
    inline def WithFileTypes(): typings.parcelFs.anon.WithFileTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.parcelFs.anon.WithFileTypes]
    }
  }
  
  trait Stats extends StObject {
    
    var atime: js.Date
    
    var atimeMs: Double
    
    var birthtime: js.Date
    
    var birthtimeMs: Double
    
    var blksize: Double
    
    var blocks: Double
    
    var ctime: js.Date
    
    var ctimeMs: Double
    
    var dev: Double
    
    var gid: Double
    
    var ino: Double
    
    def isBlockDevice(): Boolean
    
    def isCharacterDevice(): Boolean
    
    def isDirectory(): Boolean
    
    def isFIFO(): Boolean
    
    def isFile(): Boolean
    
    def isSocket(): Boolean
    
    def isSymbolicLink(): Boolean
    
    var mode: Double
    
    var mtime: js.Date
    
    var mtimeMs: Double
    
    var nlink: Double
    
    var rdev: Double
    
    var size: Double
    
    var uid: Double
  }
  object Stats {
    
    inline def apply(
      atime: js.Date,
      atimeMs: Double,
      birthtime: js.Date,
      birthtimeMs: Double,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
      ctimeMs: Double,
      dev: Double,
      gid: Double,
      ino: Double,
      isBlockDevice: () => Boolean,
      isCharacterDevice: () => Boolean,
      isDirectory: () => Boolean,
      isFIFO: () => Boolean,
      isFile: () => Boolean,
      isSocket: () => Boolean,
      isSymbolicLink: () => Boolean,
      mode: Double,
      mtime: js.Date,
      mtimeMs: Double,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeMs(value: Double): Self = StObject.set(x, "atimeMs", value.asInstanceOf[js.Any])
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBirthtimeMs(value: Double): Self = StObject.set(x, "birthtimeMs", value.asInstanceOf[js.Any])
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setCtimeMs(value: Double): Self = StObject.set(x, "ctimeMs", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
      
      inline def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
      
      inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      inline def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
      
      inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      inline def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
      
      inline def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeMs(value: Double): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
