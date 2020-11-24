package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Defined in lib.d.ts
interface File {
  fullPath: string;
  type: string;
  size: number;
}
*/
@js.native
trait FileWriter extends js.Object {
  
  def abort(): Unit = js.native
  
  var error: FileError = js.native
  
  var fileName: String = js.native
  
  var length: Double = js.native
  
  var onabort: js.Function = js.native
  
  var onerror: js.Function = js.native
  
  var onprogress: js.Function = js.native
  
  var onwrite: js.Function = js.native
  
  var onwriteend: js.Function = js.native
  
  var onwritestart: js.Function = js.native
  
  var position: Double = js.native
  
  var readyState: js.Any = js.native
  
  def seek(arg: Double): Unit = js.native
  
  def truncate(arg: Double): Unit = js.native
  
  def write(arg: js.Any): Unit = js.native
}
object FileWriter {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    error: FileError,
    fileName: String,
    length: Double,
    onabort: js.Function,
    onerror: js.Function,
    onprogress: js.Function,
    onwrite: js.Function,
    onwriteend: js.Function,
    onwritestart: js.Function,
    position: Double,
    readyState: js.Any,
    seek: Double => Unit,
    truncate: Double => Unit,
    write: js.Any => Unit
  ): FileWriter = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), error = error.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onabort = onabort.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onwrite = onwrite.asInstanceOf[js.Any], onwriteend = onwriteend.asInstanceOf[js.Any], onwritestart = onwritestart.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), truncate = js.Any.fromFunction1(truncate), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[FileWriter]
  }
  
  @scala.inline
  implicit class FileWriterOps[Self <: FileWriter] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: FileError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnabort(value: js.Function): Self = this.set("onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnerror(value: js.Function): Self = this.set("onerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogress(value: js.Function): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwrite(value: js.Function): Self = this.set("onwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwriteend(value: js.Function): Self = this.set("onwriteend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwritestart(value: js.Function): Self = this.set("onwritestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: js.Any): Self = this.set("readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTruncate(value: Double => Unit): Self = this.set("truncate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: js.Any => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
