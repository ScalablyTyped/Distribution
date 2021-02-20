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
import scala.scalajs.js.`|`
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
  @JSImport("mkdirp", JSImport.Namespace)
  @js.native
  def apply(dir: String): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("mkdirp", JSImport.Namespace)
  @js.native
  def apply(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("mkdirp", JSImport.Namespace)
  @js.native
  def apply(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  @JSImport("mkdirp", "manual")
  @js.native
  def manual(dir: String): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("mkdirp", "manual")
  @js.native
  def manual(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("mkdirp", "manual")
  @js.native
  def manual(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  @JSImport("mkdirp", "manualSync")
  @js.native
  def manualSync(dir: String): js.UndefOr[String] = js.native
  @JSImport("mkdirp", "manualSync")
  @js.native
  def manualSync(dir: String, opts: Mode): js.UndefOr[String] = js.native
  @JSImport("mkdirp", "manualSync")
  @js.native
  def manualSync(dir: String, opts: OptionsSync): js.UndefOr[String] = js.native
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  @JSImport("mkdirp", "native")
  @js.native
  def native(dir: String): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("mkdirp", "native")
  @js.native
  def native(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = js.native
  @JSImport("mkdirp", "native")
  @js.native
  def native(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  @JSImport("mkdirp", "nativeSync")
  @js.native
  def nativeSync(dir: String): js.UndefOr[String] = js.native
  @JSImport("mkdirp", "nativeSync")
  @js.native
  def nativeSync(dir: String, opts: Mode): js.UndefOr[String] = js.native
  @JSImport("mkdirp", "nativeSync")
  @js.native
  def nativeSync(dir: String, opts: OptionsSync): js.UndefOr[String] = js.native
  
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
  @JSImport("mkdirp", "sync")
  @js.native
  def sync(dir: String): js.UndefOr[String] = js.native
  @JSImport("mkdirp", "sync")
  @js.native
  def sync(dir: String, opts: Mode): js.UndefOr[String] = js.native
  @JSImport("mkdirp", "sync")
  @js.native
  def sync(dir: String, opts: OptionsSync): js.UndefOr[String] = js.native
  
  @js.native
  trait FsImplementation extends StObject {
    
    var mkdir: Typeofmkdir = js.native
    
    var stat: Typeofstat = js.native
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
  
  @js.native
  trait FsImplementationSync extends StObject {
    
    def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: typings.node.fsMod.Mode): js.UndefOr[String] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: FnCall = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: typings.node.fsMod.Mode): Unit = js.native
    
    def statSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @JSName("statSync")
    var statSync_Original: FnCallPathOptions = js.native
  }
  
  type Mode = js.UndefOr[Double | String]
  
  @js.native
  trait Options extends StObject {
    
    var fs: js.UndefOr[FsImplementation] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
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
  
  @js.native
  trait OptionsSync extends StObject {
    
    var fs: js.UndefOr[FsImplementationSync] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
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
