package typings.mrmlncReaddirEnhanced

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.Stats
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
  @js.native
  def apply(root: String): js.Promise[js.Array[String]] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
  @js.native
  def apply(root: String, callback: CallbackString): Unit = js.native
  @JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
  @js.native
  def apply(root: String, options: Options): js.Promise[js.Array[String]] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
  @js.native
  def apply(root: String, options: Options, callback: CallbackString): Unit = js.native
  
  object async {
    
    @JSImport("@mrmlnc/readdir-enhanced", "async")
    @js.native
    def apply(root: String): js.Promise[js.Array[String]] = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "async")
    @js.native
    def apply(root: String, callback: CallbackString): Unit = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "async")
    @js.native
    def apply(root: String, options: Options): js.Promise[js.Array[String]] = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "async")
    @js.native
    def apply(root: String, options: Options, callback: CallbackString): Unit = js.native
    
    @JSImport("@mrmlnc/readdir-enhanced", "async.stat")
    @js.native
    def stat(root: String): js.Promise[js.Array[Entry]] = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "async.stat")
    @js.native
    def stat(root: String, callback: CallbackEntry): Unit = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "async.stat")
    @js.native
    def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "async.stat")
    @js.native
    def stat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
  }
  
  @JSImport("@mrmlnc/readdir-enhanced", "readdirAsyncStat")
  @js.native
  def readdirAsyncStat(root: String): js.Promise[js.Array[Entry]] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "readdirAsyncStat")
  @js.native
  def readdirAsyncStat(root: String, callback: CallbackEntry): Unit = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "readdirAsyncStat")
  @js.native
  def readdirAsyncStat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "readdirAsyncStat")
  @js.native
  def readdirAsyncStat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
  
  @JSImport("@mrmlnc/readdir-enhanced", "readdirStreamStat")
  @js.native
  def readdirStreamStat(root: String): ReadableStream = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "readdirStreamStat")
  @js.native
  def readdirStreamStat(root: String, options: Options): ReadableStream = js.native
  
  @JSImport("@mrmlnc/readdir-enhanced", "readdirSyncStat")
  @js.native
  def readdirSyncStat(root: String): js.Array[Entry] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "readdirSyncStat")
  @js.native
  def readdirSyncStat(root: String, options: Options): js.Array[Entry] = js.native
  
  @JSImport("@mrmlnc/readdir-enhanced", "stat")
  @js.native
  def stat(root: String): js.Promise[js.Array[Entry]] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "stat")
  @js.native
  def stat(root: String, callback: CallbackEntry): Unit = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "stat")
  @js.native
  def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  @JSImport("@mrmlnc/readdir-enhanced", "stat")
  @js.native
  def stat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
  
  object stream {
    
    @JSImport("@mrmlnc/readdir-enhanced", "stream")
    @js.native
    def apply(root: String): ReadableStream = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "stream")
    @js.native
    def apply(root: String, options: Options): ReadableStream = js.native
    
    @JSImport("@mrmlnc/readdir-enhanced", "stream.stat")
    @js.native
    def stat(root: String): ReadableStream = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "stream.stat")
    @js.native
    def stat(root: String, options: Options): ReadableStream = js.native
  }
  
  object sync {
    
    @JSImport("@mrmlnc/readdir-enhanced", "sync")
    @js.native
    def apply(root: String): js.Array[String] = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "sync")
    @js.native
    def apply(root: String, options: Options): js.Array[String] = js.native
    
    @JSImport("@mrmlnc/readdir-enhanced", "sync.stat")
    @js.native
    def stat(root: String): js.Array[Entry] = js.native
    @JSImport("@mrmlnc/readdir-enhanced", "sync.stat")
    @js.native
    def stat(root: String, options: Options): js.Array[Entry] = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ ErrnoException, /* result */ T, Unit]
  
  type CallbackEntry = Callback[js.Array[Entry]]
  
  type CallbackString = Callback[js.Array[String]]
  
  @js.native
  trait Entry extends Stats {
    
    var depth: Double = js.native
    
    var path: String = js.native
  }
  
  @js.native
  trait FileSystem extends StObject {
    
    var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.native
    
    var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.native
    
    var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.native
  }
  object FileSystem {
    
    @scala.inline
    def apply(): FileSystem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystem]
    }
    
    @scala.inline
    implicit class FileSystemMutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLstat(value: (/* path */ String, /* callback */ Callback[Stats]) => Unit): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setReaddir(value: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReaddirUndefined: Self = StObject.set(x, "readdir", js.undefined)
      
      @scala.inline
      def setStat(value: (/* path */ String, /* callback */ Callback[Stats]) => Unit): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  type FilterFunction = js.Function1[/* stat */ Entry, Boolean]
  
  @js.native
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.native
    
    var deep: js.UndefOr[Boolean | Double | RegExp | FilterFunction] = js.native
    
    var filter: js.UndefOr[String | RegExp | FilterFunction] = js.native
    
    var fs: js.UndefOr[FileSystem] = js.native
    
    var sep: js.UndefOr[String] = js.native
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
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean | Double | RegExp | FilterFunction): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepFunction1(value: /* stat */ Entry => Boolean): Self = StObject.set(x, "deep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      @scala.inline
      def setFilter(value: String | RegExp | FilterFunction): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* stat */ Entry => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFs(value: FileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
}
