package typings.moveConcurrently

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: js.Thenable[Unit] */](from: String, to: String): T = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def apply[T /* <: js.Thenable[Unit] */](from: String, to: String, opts: Options[T]): T = (^.asInstanceOf[js.Dynamic].apply(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("move-concurrently", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[T /* <: js.Thenable[Unit] */] extends StObject {
    
    /**
      * (Default: global.Promise) The promise implementation to use, defaults to Node's.
      */
    var Promise: js.UndefOr[Instantiable1[/* args (repeated) */ js.Any, T]] = js.undefined
    
    /**
      * (Default: require('fs')) The filesystem module to use. Can be used to use graceful-fs or to inject a mock.
      */
    var fs: js.UndefOr[js.Any] = js.undefined
    
    /**
      * (Default: process.getuid) A function that returns the current UID. Used to inject a mock.
      */
    var getuid: js.UndefOr[js.Any] = js.undefined
    
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
    var writeStreamAtomic: js.UndefOr[js.Any] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[T /* <: js.Thenable[Unit] */](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], T /* <: js.Thenable[Unit] */] (val x: Self & Options[T]) extends AnyVal {
      
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
