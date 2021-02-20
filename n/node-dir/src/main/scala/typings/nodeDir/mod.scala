package typings.nodeDir

import typings.node.Buffer
import typings.node.fsMod.ReadStream
import typings.nodeDir.anon.Sync
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-dir", "files")
  @js.native
  def files(dir: String, callback: js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]): Unit = js.native
  @JSImport("node-dir", "files")
  @js.native
  def files(dir: String, syncOption: Sync): js.Array[String] = js.native
  
  @JSImport("node-dir", "paths")
  @js.native
  def paths(dir: String, callback: js.Function2[/* error */ js.Any, /* paths */ PathsResult, Unit]): Unit = js.native
  @JSImport("node-dir", "paths")
  @js.native
  def paths(
    dir: String,
    combine: Boolean,
    callback: js.Function2[/* error */ js.Any, /* paths */ js.Array[String] | PathsResult, Unit]
  ): Unit = js.native
  
  @JSImport("node-dir", "promiseFiles")
  @js.native
  def promiseFiles(dir: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, fileCallback: FileCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, fileCallback: FileNamedCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, options: Options, fileCallback: FileCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, options: Options, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, options: Options, fileCallback: FileNamedCallback): Unit = js.native
  @JSImport("node-dir", "readFiles")
  @js.native
  def readFiles(dir: String, options: Options, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = js.native
  
  @JSImport("node-dir", "readFilesStream")
  @js.native
  def readFilesStream(dir: String, options: Options, streamCallback: StreamCallback): Unit = js.native
  @JSImport("node-dir", "readFilesStream")
  @js.native
  def readFilesStream(dir: String, options: Options, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = js.native
  @JSImport("node-dir", "readFilesStream")
  @js.native
  def readFilesStream(dir: String, streamCallback: StreamCallback): Unit = js.native
  @JSImport("node-dir", "readFilesStream")
  @js.native
  def readFilesStream(dir: String, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = js.native
  
  @JSImport("node-dir", "subdirs")
  @js.native
  def subdirs(dir: String, callback: js.Function2[/* error */ js.Any, /* subdirs */ js.Array[String], Unit]): Unit = js.native
  
  type FileCallback = js.Function3[/* error */ js.Any, /* content */ String | Buffer, /* next */ js.Function0[Unit], Unit]
  
  type FileNamedCallback = js.Function4[
    /* error */ js.Any, 
    /* content */ String | Buffer, 
    /* filename */ String, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  
  type FinishedCallback = js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]
  
  @js.native
  trait Options extends StObject {
    
    // control if done function called on error (defaults to true)
    var doneOnErr: js.UndefOr[Boolean] = js.native
    
    // file encoding (defaults to 'utf8')
    var encoding: js.UndefOr[String] = js.native
    
    // a regex pattern or array to specify filenames to ignore
    var exclude: js.UndefOr[RegExp | js.Array[String]] = js.native
    
    // a regex pattern or array to specify directories to ignore
    var excludeDir: js.UndefOr[RegExp | js.Array[String]] = js.native
    
    // a regex pattern or array to specify filenames to operate on
    var `match`: js.UndefOr[RegExp | js.Array[String]] = js.native
    
    // a regex pattern or array to specify directories to recurse
    var matchDir: js.UndefOr[RegExp | js.Array[String]] = js.native
    
    // whether to recurse subdirectories when reading files (defaults to true)
    var recursive: js.UndefOr[Boolean] = js.native
    
    // sort files in each directory in descending order
    var reverse: js.UndefOr[Boolean] = js.native
    
    // whether to aggregate only the base filename rather than the full filepath
    var shortName: js.UndefOr[Boolean] = js.native
    
    // sort files in each directory in ascending order (defaults to true)
    var sort: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoneOnErr(value: Boolean): Self = StObject.set(x, "doneOnErr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoneOnErrUndefined: Self = StObject.set(x, "doneOnErr", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExclude(value: RegExp | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeDir(value: RegExp | js.Array[String]): Self = StObject.set(x, "excludeDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeDirUndefined: Self = StObject.set(x, "excludeDir", js.undefined)
      
      @scala.inline
      def setExcludeDirVarargs(value: String*): Self = StObject.set(x, "excludeDir", js.Array(value :_*))
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setMatch(value: RegExp | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchDir(value: RegExp | js.Array[String]): Self = StObject.set(x, "matchDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchDirUndefined: Self = StObject.set(x, "matchDir", js.undefined)
      
      @scala.inline
      def setMatchDirVarargs(value: String*): Self = StObject.set(x, "matchDir", js.Array(value :_*))
      
      @scala.inline
      def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      @scala.inline
      def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setShortName(value: Boolean): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait PathsResult extends StObject {
    
    var dirs: js.Array[String] = js.native
    
    var files: js.Array[String] = js.native
  }
  object PathsResult {
    
    @scala.inline
    def apply(dirs: js.Array[String], files: js.Array[String]): PathsResult = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathsResult]
    }
    
    @scala.inline
    implicit class PathsResultMutableBuilder[Self <: PathsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirs(value: js.Array[String]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirsVarargs(value: String*): Self = StObject.set(x, "dirs", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  type StreamCallback = js.Function3[/* error */ js.Any, /* stream */ ReadStream, /* next */ js.Function0[Unit], Unit]
}
