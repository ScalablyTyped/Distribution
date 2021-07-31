package typings.mkdirp

import typings.mkdirp.anon.FnCall
import typings.mkdirp.anon.FnCallPathOptions
import typings.mkdirp.anon.Typeofmkdir
import typings.mkdirp.anon.Typeofstat
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new directory and any necessary subdirectories at dir with octal
    * permission string `opts.mode`. If opts is a string or number, it will be
    * treated as the `opts.mode`. If opts.mode isn't specified, it defaults to
    * 0o777 & (~`process.umask()`).
    *
    * Promise resolves to first directory made that had to be created, or
    * undefined if everything already exists. Promise rejects if any errors are
    * encountered. Note that, in the case of promise rejection, some directories
    * may have been created, as recursive directory creation is not an atomic operation.
    * You can optionally pass in an alternate fs implementation by passing in
    * opts.fs.
    *
    * Your implementation should have `opts.fs.mkdir(path, opts, cb)` and
    * `opts.fs.stat(path, cb)`.
    *
    * You can also override just one or the other of mkdir and stat by passing in
    * `opts.stat` or `opts.mkdir`, or providing an fs option that only overrides one
    * of these.
    */
  @scala.inline
  def apply(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def apply(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def apply(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  @JSImport("mkdirp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  @scala.inline
  def manual(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("manual")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def manual(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("manual")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def manual(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("manual")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  @scala.inline
  def manualSync(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def manualSync(dir: String, opts: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def manualSync(dir: String, opts: OptionsSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("manualSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  @scala.inline
  def native(dir: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def native(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  @scala.inline
  def native(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  @scala.inline
  def nativeSync(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def nativeSync(dir: String, opts: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def nativeSync(dir: String, opts: OptionsSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeSync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Synchronously create a new directory and any necessary subdirectories at
    * dir with octal permission string `opts.mode`. If opts is a string or number,
    * it will be treated as the `opts.mode`. If `opts.mode` isn't specified, it
    * defaults to 0o777 & (~`process.umask()`).
    * You can optionally pass in an alternate fs implementation by passing in
    * `opts.fs`. Your implementation should have `opts.fs.mkdirSync(path, mode)`
    * and `opts.fs.statSync(path)`. You can also override just one or the other
    * of `mkdirSync` and `statSync` by passing in `opts.statSync` or `opts.mkdirSync`,
    * or providing an fs option that only overrides one of these.
    * @returns Returns the first directory that had to be created, or undefined if everything already exists.
    */
  @scala.inline
  def sync(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sync(dir: String, opts: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def sync(dir: String, opts: OptionsSync): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait FsImplementation extends StObject {
    
    var mkdir: Typeofmkdir
    
    var stat: Typeofstat
  }
  object FsImplementation {
    
    @scala.inline
    def apply(mkdir: Typeofmkdir, stat: Typeofstat): FsImplementation = {
      val __obj = js.Dynamic.literal(mkdir = mkdir.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsImplementation]
    }
    
    @scala.inline
    implicit class FsImplementationMutableBuilder[Self <: FsImplementation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMkdir(value: Typeofmkdir): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Typeofstat): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait FsImplementationSync extends StObject {
    
    def mkdirSync(path: PathLike): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: typings.node.fsMod.Mode): js.UndefOr[String]
    @JSName("mkdirSync")
    var mkdirSync_Original: FnCall
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: typings.node.fsMod.Mode): Unit
    
    def statSync(path: PathLike): Stats
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats
    @JSName("statSync")
    var statSync_Original: FnCallPathOptions
  }
  object FsImplementationSync {
    
    @scala.inline
    def apply(mkdirSync: FnCall, statSync: FnCallPathOptions): FsImplementationSync = {
      val __obj = js.Dynamic.literal(mkdirSync = mkdirSync.asInstanceOf[js.Any], statSync = statSync.asInstanceOf[js.Any])
      __obj.asInstanceOf[FsImplementationSync]
    }
    
    @scala.inline
    implicit class FsImplementationSyncMutableBuilder[Self <: FsImplementationSync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMkdirSync(value: FnCall): Self = StObject.set(x, "mkdirSync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatSync(value: FnCallPathOptions): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
    }
  }
  
  type Mode = js.UndefOr[Double | String]
  
  trait Options extends StObject {
    
    var fs: js.UndefOr[FsImplementation] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
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
      def setFs(value: FsImplementation): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait OptionsSync extends StObject {
    
    var fs: js.UndefOr[FsImplementationSync] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
  }
  object OptionsSync {
    
    @scala.inline
    def apply(): OptionsSync = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSync]
    }
    
    @scala.inline
    implicit class OptionsSyncMutableBuilder[Self <: OptionsSync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: FsImplementationSync): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
