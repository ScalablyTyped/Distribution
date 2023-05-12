package typings.mkdirp

import typings.mkdirp.anon.MakeDirectoryOptionsrecur
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsOptsArgMod {
  
  @JSImport("mkdirp/dist/mjs/opts-arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def optsArg(): MkdirpOptionsResolved = ^.asInstanceOf[js.Dynamic].applyDynamic("optsArg")().asInstanceOf[MkdirpOptionsResolved]
  inline def optsArg(opts: MkdirpOptions): MkdirpOptionsResolved = ^.asInstanceOf[js.Dynamic].applyDynamic("optsArg")(opts.asInstanceOf[js.Any]).asInstanceOf[MkdirpOptionsResolved]
  
  trait FsProvider extends StObject {
    
    var mkdir: js.UndefOr[
        js.Function3[
          /* path */ String, 
          /* opts */ MakeDirectoryOptionsrecur, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* made */ js.UndefOr[String], Any], 
          Any
        ]
      ] = js.undefined
    
    var mkdirSync: js.UndefOr[
        js.Function2[/* path */ String, /* opts */ MakeDirectoryOptionsrecur, js.UndefOr[String]]
      ] = js.undefined
    
    var stat: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Any], 
          Any
        ]
      ] = js.undefined
    
    var statSync: js.UndefOr[js.Function1[/* path */ String, Stats]] = js.undefined
  }
  object FsProvider {
    
    inline def apply(): FsProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FsProvider] (val x: Self) extends AnyVal {
      
      inline def setMkdir(
        value: (/* path */ String, /* opts */ MakeDirectoryOptionsrecur, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* made */ js.UndefOr[String], Any]) => Any
      ): Self = StObject.set(x, "mkdir", js.Any.fromFunction3(value))
      
      inline def setMkdirSync(value: (/* path */ String, /* opts */ MakeDirectoryOptionsrecur) => js.UndefOr[String]): Self = StObject.set(x, "mkdirSync", js.Any.fromFunction2(value))
      
      inline def setMkdirSyncUndefined: Self = StObject.set(x, "mkdirSync", js.undefined)
      
      inline def setMkdirUndefined: Self = StObject.set(x, "mkdir", js.undefined)
      
      inline def setStat(
        value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Any]) => Any
      ): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      inline def setStatSync(value: /* path */ String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
      
      inline def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  type MkdirpOptions = Options | Double | String
  
  trait MkdirpOptionsResolved extends StObject {
    
    var fs: FsProvider
    
    def mkdir(
      path: String,
      opts: MakeDirectoryOptionsrecur,
      callback: js.Function2[/* err */ ErrnoException | Null, /* made */ js.UndefOr[String], Any]
    ): Any
    
    def mkdirAsync(path: String, opts: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]]
    
    def mkdirSync(path: String, opts: MakeDirectoryOptionsrecur): js.UndefOr[String]
    
    var mode: Double
    
    var recursive: js.UndefOr[Boolean] = js.undefined
    
    def stat(path: String, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Any]): Any
    
    def statAsync(path: String): js.Promise[Stats]
    
    def statSync(path: String): Stats
  }
  object MkdirpOptionsResolved {
    
    inline def apply(
      fs: FsProvider,
      mkdir: (String, MakeDirectoryOptionsrecur, js.Function2[/* err */ ErrnoException | Null, /* made */ js.UndefOr[String], Any]) => Any,
      mkdirAsync: (String, MakeDirectoryOptionsrecur) => js.Promise[js.UndefOr[String]],
      mkdirSync: (String, MakeDirectoryOptionsrecur) => js.UndefOr[String],
      mode: Double,
      stat: (String, js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Any]) => Any,
      statAsync: String => js.Promise[Stats],
      statSync: String => Stats
    ): MkdirpOptionsResolved = {
      val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], mkdir = js.Any.fromFunction3(mkdir), mkdirAsync = js.Any.fromFunction2(mkdirAsync), mkdirSync = js.Any.fromFunction2(mkdirSync), mode = mode.asInstanceOf[js.Any], stat = js.Any.fromFunction2(stat), statAsync = js.Any.fromFunction1(statAsync), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[MkdirpOptionsResolved]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MkdirpOptionsResolved] (val x: Self) extends AnyVal {
      
      inline def setFs(value: FsProvider): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setMkdir(
        value: (String, MakeDirectoryOptionsrecur, js.Function2[/* err */ ErrnoException | Null, /* made */ js.UndefOr[String], Any]) => Any
      ): Self = StObject.set(x, "mkdir", js.Any.fromFunction3(value))
      
      inline def setMkdirAsync(value: (String, MakeDirectoryOptionsrecur) => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "mkdirAsync", js.Any.fromFunction2(value))
      
      inline def setMkdirSync(value: (String, MakeDirectoryOptionsrecur) => js.UndefOr[String]): Self = StObject.set(x, "mkdirSync", js.Any.fromFunction2(value))
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      inline def setStat(value: (String, js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Any]) => Any): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
      
      inline def setStatAsync(value: String => js.Promise[Stats]): Self = StObject.set(x, "statAsync", js.Any.fromFunction1(value))
      
      inline def setStatSync(value: String => Stats): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
  
  trait Options
    extends StObject
       with FsProvider {
    
    var fs: js.UndefOr[FsProvider] = js.undefined
    
    var mkdirAsync: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* opts */ MakeDirectoryOptionsrecur, 
          js.Promise[js.UndefOr[String]]
        ]
      ] = js.undefined
    
    var mode: js.UndefOr[Double | String] = js.undefined
    
    var statAsync: js.UndefOr[js.Function1[/* path */ String, js.Promise[Stats]]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFs(value: FsProvider): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMkdirAsync(value: (/* path */ String, /* opts */ MakeDirectoryOptionsrecur) => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "mkdirAsync", js.Any.fromFunction2(value))
      
      inline def setMkdirAsyncUndefined: Self = StObject.set(x, "mkdirAsync", js.undefined)
      
      inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setStatAsync(value: /* path */ String => js.Promise[Stats]): Self = StObject.set(x, "statAsync", js.Any.fromFunction1(value))
      
      inline def setStatAsyncUndefined: Self = StObject.set(x, "statAsync", js.undefined)
    }
  }
}
