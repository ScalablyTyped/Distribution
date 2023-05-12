package typings.mkdirp

import typings.mkdirp.distMjsOptsArgMod.MkdirpOptions
import typings.node.fsMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    def sync(path: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
  }
  
  @js.native
  trait `1` extends StObject {
    
    def sync(): Boolean = js.native
    def sync(opts: MkdirpOptions): Boolean = js.native
  }
  
  @js.native
  trait `2` extends StObject {
    
    def sync(path: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: Unit, made: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: Unit, made: Unit): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions, made: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions, made: Unit): js.UndefOr[String | Unit] = js.native
  }
  
  /* Inlined node.fs.MakeDirectoryOptions & {  recursive :boolean | undefined} */
  trait MakeDirectoryOptionsrecur extends StObject {
    
    /**
      * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
      * @default 0o777
      */
    var mode: js.UndefOr[Mode] = js.undefined
    
    /**
      * Indicates whether parent folders should be created.
      * If a folder was created, the path to the first created folder will be returned.
      * @default false
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object MakeDirectoryOptionsrecur {
    
    inline def apply(): MakeDirectoryOptionsrecur = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeDirectoryOptionsrecur]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MakeDirectoryOptionsrecur] (val x: Self) extends AnyVal {
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  @js.native
  trait Manual extends StObject {
    
    def manual(path: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def manual(path: String, options: Unit, made: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def manual(path: String, options: Unit, made: Unit): js.Promise[js.UndefOr[String | Unit]] = js.native
    def manual(path: String, options: MkdirpOptions): js.Promise[js.UndefOr[String | Unit]] = js.native
    def manual(path: String, options: MkdirpOptions, made: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def manual(path: String, options: MkdirpOptions, made: Unit): js.Promise[js.UndefOr[String | Unit]] = js.native
    
    def manualSync(path: String): js.UndefOr[String | Unit] = js.native
    def manualSync(path: String, options: Unit, made: String): js.UndefOr[String | Unit] = js.native
    def manualSync(path: String, options: Unit, made: Unit): js.UndefOr[String | Unit] = js.native
    def manualSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
    def manualSync(path: String, options: MkdirpOptions, made: String): js.UndefOr[String | Unit] = js.native
    def manualSync(path: String, options: MkdirpOptions, made: Unit): js.UndefOr[String | Unit] = js.native
    
    @JSName("manual")
    var manual_Original: (js.Function3[
        /* path */ String, 
        /* options */ js.UndefOr[MkdirpOptions], 
        /* made */ js.UndefOr[String | Unit], 
        js.Promise[js.UndefOr[String | Unit]]
      ]) & `2` = js.native
    
    def mkdirpManual(path: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def mkdirpManual(path: String, options: Unit, made: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def mkdirpManual(path: String, options: Unit, made: Unit): js.Promise[js.UndefOr[String | Unit]] = js.native
    def mkdirpManual(path: String, options: MkdirpOptions): js.Promise[js.UndefOr[String | Unit]] = js.native
    def mkdirpManual(path: String, options: MkdirpOptions, made: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def mkdirpManual(path: String, options: MkdirpOptions, made: Unit): js.Promise[js.UndefOr[String | Unit]] = js.native
    
    def mkdirpManualSync(path: String): js.UndefOr[String | Unit] = js.native
    def mkdirpManualSync(path: String, options: Unit, made: String): js.UndefOr[String | Unit] = js.native
    def mkdirpManualSync(path: String, options: Unit, made: Unit): js.UndefOr[String | Unit] = js.native
    def mkdirpManualSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
    def mkdirpManualSync(path: String, options: MkdirpOptions, made: String): js.UndefOr[String | Unit] = js.native
    def mkdirpManualSync(path: String, options: MkdirpOptions, made: Unit): js.UndefOr[String | Unit] = js.native
    
    @JSName("mkdirpManual")
    var mkdirpManual_Original: (js.Function3[
        /* path */ String, 
        /* options */ js.UndefOr[MkdirpOptions], 
        /* made */ js.UndefOr[String | Unit], 
        js.Promise[js.UndefOr[String | Unit]]
      ]) & `2` = js.native
    
    def mkdirpNative(path: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def mkdirpNative(path: String, options: MkdirpOptions): js.Promise[js.UndefOr[String | Unit]] = js.native
    
    def mkdirpNativeSync(path: String): js.UndefOr[String | Unit] = js.native
    def mkdirpNativeSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
    
    @JSName("mkdirpNative")
    var mkdirpNative_Original: (js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[MkdirpOptions], 
        js.Promise[js.UndefOr[String | Unit]]
      ]) & `0` = js.native
    
    def mkdirpSync(path: String): String | Unit = js.native
    def mkdirpSync(path: String, opts: MkdirpOptions): String | Unit = js.native
    
    def native(path: String): js.Promise[js.UndefOr[String | Unit]] = js.native
    def native(path: String, options: MkdirpOptions): js.Promise[js.UndefOr[String | Unit]] = js.native
    
    def nativeSync(path: String): js.UndefOr[String | Unit] = js.native
    def nativeSync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
    
    @JSName("native")
    var native_Original: (js.Function2[
        /* path */ String, 
        /* options */ js.UndefOr[MkdirpOptions], 
        js.Promise[js.UndefOr[String | Unit]]
      ]) & `0` = js.native
    
    def sync(path: String): String | Unit = js.native
    def sync(path: String, opts: MkdirpOptions): String | Unit = js.native
    
    def useNative(): Boolean = js.native
    def useNative(opts: MkdirpOptions): Boolean = js.native
    
    def useNativeSync(): Boolean = js.native
    def useNativeSync(opts: MkdirpOptions): Boolean = js.native
    
    @JSName("useNative")
    var useNative_Original: (js.Function1[/* opts */ js.UndefOr[MkdirpOptions], Boolean]) & `1` = js.native
  }
  
  @js.native
  trait Sync extends StObject {
    
    def sync(path: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: Unit, made: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: Unit, made: Unit): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions, made: String): js.UndefOr[String | Unit] = js.native
    def sync(path: String, options: MkdirpOptions, made: Unit): js.UndefOr[String | Unit] = js.native
  }
}
