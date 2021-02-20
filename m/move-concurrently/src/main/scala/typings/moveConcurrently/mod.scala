package typings.moveConcurrently

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("move-concurrently", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Thenable[Unit] */](from: String, to: String): T = js.native
  @JSImport("move-concurrently", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Thenable[Unit] */](from: String, to: String, opts: Options[T]): T = js.native
  
  @js.native
  trait Options[T /* <: js.Thenable[Unit] */] extends StObject {
    
    /**
      * (Default: global.Promise) The promise implementation to use, defaults to Node's.
      */
    var Promise: js.UndefOr[Instantiable1[/* args (repeated) */ js.Any, T]] = js.native
    
    /**
      * (Default: require('fs')) The filesystem module to use. Can be used to use graceful-fs or to inject a mock.
      */
    var fs: js.UndefOr[js.Any] = js.native
    
    /**
      * (Default: process.getuid) A function that returns the current UID. Used to inject a mock.
      */
    var getuid: js.UndefOr[js.Any] = js.native
    
    /**
      * (Default: process.platform === 'win32') If true enables Windows symlink semantics.
      * This requires an extra stat to determine if the destination of a symlink is a file or directory.
      * If symlinking a directory fails then we'll try making a junction instead.
      */
    var isWindows: js.UndefOr[Boolean] = js.native
    
    /**
      * (Default: 1) The maximum number of concurrent copies to do at once.
      */
    var maxConcurrency: js.UndefOr[Double] = js.native
    
    /**
      * (Default: require('fs-write-stream-atomic')) The implementation of writeStreamAtomic to use. Used to inject a mock.
      */
    var writeStreamAtomic: js.UndefOr[js.Any] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[T /* <: js.Thenable[Unit] */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], T /* <: js.Thenable[Unit] */] (val x: Self with Options[T]) extends AnyVal {
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setGetuid(value: js.Any): Self = StObject.set(x, "getuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetuidUndefined: Self = StObject.set(x, "getuid", js.undefined)
      
      @scala.inline
      def setIsWindows(value: Boolean): Self = StObject.set(x, "isWindows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindowsUndefined: Self = StObject.set(x, "isWindows", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      @scala.inline
      def setPromise(value: Instantiable1[/* args (repeated) */ js.Any, T]): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def setWriteStreamAtomic(value: js.Any): Self = StObject.set(x, "writeStreamAtomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteStreamAtomicUndefined: Self = StObject.set(x, "writeStreamAtomic", js.undefined)
    }
  }
}
