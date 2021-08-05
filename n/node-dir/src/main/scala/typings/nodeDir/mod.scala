package typings.nodeDir

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import typings.nodeDir.anon.Sync
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-dir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def files(dir: String, callback: js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def files(dir: String, syncOption: Sync): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(dir.asInstanceOf[js.Any], syncOption.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def paths(dir: String, callback: js.Function2[/* error */ js.Any, /* paths */ PathsResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paths")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def paths(
    dir: String,
    combine: Boolean,
    callback: js.Function2[/* error */ js.Any, /* paths */ js.Array[String] | PathsResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paths")(dir.asInstanceOf[js.Any], combine.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promiseFiles(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseFiles")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def readFiles(dir: String, fileCallback: FileCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any], finishedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, fileCallback: FileNamedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any], finishedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, options: Options, fileCallback: FileCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, options: Options, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any], finishedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, options: Options, fileCallback: FileNamedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFiles(dir: String, options: Options, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFiles")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fileCallback.asInstanceOf[js.Any], finishedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readFilesStream(dir: String, options: Options, streamCallback: StreamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFilesStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], streamCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFilesStream(dir: String, options: Options, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFilesStream")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], streamCallback.asInstanceOf[js.Any], finishedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFilesStream(dir: String, streamCallback: StreamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFilesStream")(dir.asInstanceOf[js.Any], streamCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFilesStream(dir: String, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFilesStream")(dir.asInstanceOf[js.Any], streamCallback.asInstanceOf[js.Any], finishedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def subdirs(dir: String, callback: js.Function2[/* error */ js.Any, /* subdirs */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subdirs")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type FileCallback = js.Function3[/* error */ js.Any, /* content */ String | Buffer, /* next */ js.Function0[Unit], Unit]
  
  type FileNamedCallback = js.Function4[
    /* error */ js.Any, 
    /* content */ String | Buffer, 
    /* filename */ String, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  
  type FinishedCallback = js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]
  
  trait Options extends StObject {
    
    // control if done function called on error (defaults to true)
    var doneOnErr: js.UndefOr[Boolean] = js.undefined
    
    // file encoding (defaults to 'utf8')
    var encoding: js.UndefOr[String] = js.undefined
    
    // a regex pattern or array to specify filenames to ignore
    var exclude: js.UndefOr[RegExp | js.Array[String]] = js.undefined
    
    // a regex pattern or array to specify directories to ignore
    var excludeDir: js.UndefOr[RegExp | js.Array[String]] = js.undefined
    
    // a regex pattern or array to specify filenames to operate on
    var `match`: js.UndefOr[RegExp | js.Array[String]] = js.undefined
    
    // a regex pattern or array to specify directories to recurse
    var matchDir: js.UndefOr[RegExp | js.Array[String]] = js.undefined
    
    // whether to recurse subdirectories when reading files (defaults to true)
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    // sort files in each directory in descending order
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    // whether to aggregate only the base filename rather than the full filepath
    var shortName: js.UndefOr[Boolean] = js.undefined
    
    // sort files in each directory in ascending order (defaults to true)
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDoneOnErr(value: Boolean): Self = StObject.set(x, "doneOnErr", value.asInstanceOf[js.Any])
      
      inline def setDoneOnErrUndefined: Self = StObject.set(x, "doneOnErr", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExclude(value: RegExp | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeDir(value: RegExp | js.Array[String]): Self = StObject.set(x, "excludeDir", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirUndefined: Self = StObject.set(x, "excludeDir", js.undefined)
      
      inline def setExcludeDirVarargs(value: String*): Self = StObject.set(x, "excludeDir", js.Array(value :_*))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setMatch(value: RegExp | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchDir(value: RegExp | js.Array[String]): Self = StObject.set(x, "matchDir", value.asInstanceOf[js.Any])
      
      inline def setMatchDirUndefined: Self = StObject.set(x, "matchDir", js.undefined)
      
      inline def setMatchDirVarargs(value: String*): Self = StObject.set(x, "matchDir", js.Array(value :_*))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShortName(value: Boolean): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait PathsResult extends StObject {
    
    var dirs: js.Array[String]
    
    var files: js.Array[String]
  }
  object PathsResult {
    
    inline def apply(dirs: js.Array[String], files: js.Array[String]): PathsResult = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathsResult]
    }
    
    extension [Self <: PathsResult](x: Self) {
      
      inline def setDirs(value: js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      inline def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value :_*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  type StreamCallback = js.Function3[/* error */ js.Any, /* stream */ ReadStream, /* next */ js.Function0[Unit], Unit]
}
