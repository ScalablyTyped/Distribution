package typings.pica.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PicaOptions extends js.Object {
  
  // max webworkers pool size. Default is autodetected CPU count, but not more than 4.
  var concurrency: js.UndefOr[Double] = js.native
  
  // list of features to use.
  // Default is [ 'js', 'wasm', 'ww' ]. Can be [ 'js', 'wasm', 'cib', 'ww' ] or [ 'all' ].
  // Note, resize via createImageBitmap() ('cib') disabled by default due problems with quality.
  var features: js.UndefOr[js.Array[String]] = js.native
  
  // cache timeout, ms. Webworkers create is not fast.
  // This option allow reuse webworkers effectively. Default 2000.
  var idle: js.UndefOr[Double] = js.native
  
  // tile width/height.
  // Images are processed by regions, to restrict peak memory use. Default 1024.
  var tile: js.UndefOr[Double] = js.native
}
object PicaOptions {
  
  @scala.inline
  def apply(): PicaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicaOptions]
  }
  
  @scala.inline
  implicit class PicaOptionsOps[Self <: PicaOptions] (val x: Self) extends AnyVal {
    
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
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setIdle(value: Double): Self = this.set("idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdle: Self = this.set("idle", js.undefined)
    
    @scala.inline
    def setTile(value: Double): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
}
