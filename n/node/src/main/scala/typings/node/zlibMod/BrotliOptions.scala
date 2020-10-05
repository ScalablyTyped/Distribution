package typings.node.zlibMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrotliOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[Double] = js.native
  /**
    * @default constants.BROTLI_OPERATION_FINISH
    */
  var finishFlush: js.UndefOr[Double] = js.native
  /**
    * @default constants.BROTLI_OPERATION_PROCESS
    */
  var flush: js.UndefOr[Double] = js.native
  var params: js.UndefOr[
    /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  NumberDictionary[Boolean | Double]
  ] = js.native
}

object BrotliOptions {
  @scala.inline
  def apply(): BrotliOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrotliOptions]
  }
  @scala.inline
  implicit class BrotliOptionsOps[Self <: BrotliOptions] (val x: Self) extends AnyVal {
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
    def setFinishFlush(value: Double): Self = this.set("finishFlush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishFlush: Self = this.set("finishFlush", js.undefined)
    @scala.inline
    def setFlush(value: Double): Self = this.set("flush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    @scala.inline
    def setParams(
      value: /**
      * Each key is a `constants.BROTLI_*` constant.
      */
    NumberDictionary[Boolean | Double]
    ): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

