package typings.moveConcurrently.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[T /* <: js.Thenable[Unit] */] extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options[_], T /* <: js.Thenable[Unit] */] (val x: Self with Options[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPromise(value: Instantiable1[/* args (repeated) */ js.Any, T]): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setFs(value: js.Any): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setGetuid(value: js.Any): Self = this.set("getuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetuid: Self = this.set("getuid", js.undefined)
    
    @scala.inline
    def setIsWindows(value: Boolean): Self = this.set("isWindows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWindows: Self = this.set("isWindows", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: Double): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
    
    @scala.inline
    def setWriteStreamAtomic(value: js.Any): Self = this.set("writeStreamAtomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteStreamAtomic: Self = this.set("writeStreamAtomic", js.undefined)
  }
}
