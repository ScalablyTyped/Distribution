package typings.mrmlncReaddirEnhanced

import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.Stats
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(root: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(root: String, callback: CallbackString): Unit = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(root: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  @scala.inline
  def apply(root: String, options: Options, callback: CallbackString): Unit = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object async {
    
    @scala.inline
    def apply(root: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    @scala.inline
    def apply(root: String, callback: CallbackString): Unit = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(root: String, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    @scala.inline
    def apply(root: String, options: Options, callback: CallbackString): Unit = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@mrmlnc/readdir-enhanced", "async")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def stat(root: String): js.Promise[js.Array[Entry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Entry]]]
    @scala.inline
    def stat(root: String, callback: CallbackEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Entry]]]
    @scala.inline
    def stat(root: String, options: Options, callback: CallbackEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @scala.inline
  def readdirAsyncStat(root: String): js.Promise[js.Array[Entry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsyncStat")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Entry]]]
  @scala.inline
  def readdirAsyncStat(root: String, callback: CallbackEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsyncStat")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdirAsyncStat(root: String, options: Options): js.Promise[js.Array[Entry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsyncStat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Entry]]]
  @scala.inline
  def readdirAsyncStat(root: String, options: Options, callback: CallbackEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsyncStat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readdirStreamStat(root: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirStreamStat")(root.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  @scala.inline
  def readdirStreamStat(root: String, options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirStreamStat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  
  @scala.inline
  def readdirSyncStat(root: String): js.Array[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSyncStat")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entry]]
  @scala.inline
  def readdirSyncStat(root: String, options: Options): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSyncStat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  
  @scala.inline
  def stat(root: String): js.Promise[js.Array[Entry]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Entry]]]
  @scala.inline
  def stat(root: String, callback: CallbackEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Entry]]]
  @scala.inline
  def stat(root: String, options: Options, callback: CallbackEntry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object stream {
    
    @scala.inline
    def apply(root: String): ReadableStream = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
    @scala.inline
    def apply(root: String, options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
    
    @JSImport("@mrmlnc/readdir-enhanced", "stream")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def stat(root: String): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
    @scala.inline
    def stat(root: String, options: Options): ReadableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadableStream]
  }
  
  object sync {
    
    @scala.inline
    def apply(root: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def apply(root: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    @JSImport("@mrmlnc/readdir-enhanced", "sync")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def stat(root: String): js.Array[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entry]]
    @scala.inline
    def stat(root: String, options: Options): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  }
  
  type Callback[T] = js.Function2[/* err */ ErrnoException, /* result */ T, Unit]
  
  type CallbackEntry = Callback[js.Array[Entry]]
  
  type CallbackString = Callback[js.Array[String]]
  
  @js.native
  trait Entry extends Stats {
    
    var depth: Double = js.native
    
    var path: String = js.native
  }
  
  trait FileSystem extends StObject {
    
    var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
    
    var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.undefined
    
    var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
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
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var deep: js.UndefOr[Boolean | Double | RegExp | FilterFunction] = js.undefined
    
    var filter: js.UndefOr[String | RegExp | FilterFunction] = js.undefined
    
    var fs: js.UndefOr[FileSystem] = js.undefined
    
    var sep: js.UndefOr[String] = js.undefined
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
