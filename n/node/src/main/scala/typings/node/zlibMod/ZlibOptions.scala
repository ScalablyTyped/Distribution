package typings.node.zlibMod

import typings.node.NodeJS.ArrayBufferView
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZlibOptions extends js.Object {
  
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
   // compression only
  var dictionary: js.UndefOr[ArrayBufferView | ArrayBuffer] = js.native
  
  /**
    * @default constants.Z_FINISH
    */
  var finishFlush: js.UndefOr[Double] = js.native
  
  /**
    * @default constants.Z_NO_FLUSH
    */
  var flush: js.UndefOr[Double] = js.native
  
   // deflate/inflate only, empty dictionary by default
  var info: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var maxOutputLength: js.UndefOr[Double] = js.native
  
   // compression only
  var memLevel: js.UndefOr[Double] = js.native
  
   // compression only
  var strategy: js.UndefOr[Double] = js.native
  
  var windowBits: js.UndefOr[Double] = js.native
}
object ZlibOptions {
  
  @scala.inline
  def apply(): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZlibOptions]
  }
  
  @scala.inline
  implicit class ZlibOptionsOps[Self <: ZlibOptions] (val x: Self) extends AnyVal {
    
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setDictionary(value: ArrayBufferView | ArrayBuffer): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    
    @scala.inline
    def setFinishFlush(value: Double): Self = this.set("finishFlush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishFlush: Self = this.set("finishFlush", js.undefined)
    
    @scala.inline
    def setFlush(value: Double): Self = this.set("flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMaxOutputLength(value: Double): Self = this.set("maxOutputLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOutputLength: Self = this.set("maxOutputLength", js.undefined)
    
    @scala.inline
    def setMemLevel(value: Double): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
}
