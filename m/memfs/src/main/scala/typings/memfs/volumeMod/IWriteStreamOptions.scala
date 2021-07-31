package typings.memfs.volumeMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWriteStreamOptions extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var fd: js.UndefOr[Double] = js.undefined
  
  var flags: js.UndefOr[TFlags] = js.undefined
  
  var mode: js.UndefOr[TMode] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object IWriteStreamOptions {
  
  @scala.inline
  def apply(): IWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriteStreamOptions]
  }
  
  @scala.inline
  implicit class IWriteStreamOptionsMutableBuilder[Self <: IWriteStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    @scala.inline
    def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    @scala.inline
    def setFlags(value: TFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setMode(value: TMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
