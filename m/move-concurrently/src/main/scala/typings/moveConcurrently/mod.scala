package typings.moveConcurrently

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: PromiseLike[Unit] */](from: String, to: String): T = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T /* <: PromiseLike[Unit] */](from: String, to: String, opts: Options[T]): T = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("move-concurrently", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[T /* <: PromiseLike[Unit] */] extends StObject {
    
    /**
      * (Default: global.Promise) The promise implementation to use, defaults to Node's.
      */
    var Promise: js.UndefOr[Instantiable1[/* args (repeated) */ Any, js.UndefOr[T]]] = js.undefined
    
    /**
      * (Default: require('fs')) The filesystem module to use. Can be used to use graceful-fs or to inject a mock.
      */
    var fs: js.UndefOr[Any] = js.undefined
    
    /**
      * (Default: process.getuid) A function that returns the current UID. Used to inject a mock.
      */
    var getuid: js.UndefOr[Any] = js.undefined
    
    /**
      * (Default: process.platform === 'win32') If true enables Windows symlink semantics.
      * This requires an extra stat to determine if the destination of a symlink is a file or directory.
      * If symlinking a directory fails then we'll try making a junction instead.
      */
    var isWindows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Default: 1) The maximum number of concurrent copies to do at once.
      */
    var maxConcurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * (Default: require('fs-write-stream-atomic')) The implementation of writeStreamAtomic to use. Used to inject a mock.
      */
    var writeStreamAtomic: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply[T /* <: PromiseLike[Unit] */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T /* <: PromiseLike[Unit] */] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setGetuid(value: Any): Self = StObject.set(x, "getuid", value.asInstanceOf[js.Any])
      
      inline def setGetuidUndefined: Self = StObject.set(x, "getuid", js.undefined)
      
      inline def setIsWindows(value: Boolean): Self = StObject.set(x, "isWindows", value.asInstanceOf[js.Any])
      
      inline def setIsWindowsUndefined: Self = StObject.set(x, "isWindows", js.undefined)
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      inline def setPromise(value: Instantiable1[/* args (repeated) */ Any, js.UndefOr[T]]): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setWriteStreamAtomic(value: Any): Self = StObject.set(x, "writeStreamAtomic", value.asInstanceOf[js.Any])
      
      inline def setWriteStreamAtomicUndefined: Self = StObject.set(x, "writeStreamAtomic", js.undefined)
    }
  }
}
