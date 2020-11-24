package typings.poi.mod.Config

import typings.poi.mod.Config.Output.FileNames
import typings.poi.mod.Config.Output.Html
import typings.poi.poiStrings.`async-node`
import typings.poi.poiStrings.`electron-main`
import typings.poi.poiStrings.`electron-renderer`
import typings.poi.poiStrings.`node-webkit`
import typings.poi.poiStrings.cjs
import typings.poi.poiStrings.electron
import typings.poi.poiStrings.iife
import typings.poi.poiStrings.node
import typings.poi.poiStrings.umd
import typings.poi.poiStrings.web
import typings.poi.poiStrings.webworker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output_ extends js.Object {
  
  var clean: js.UndefOr[Boolean] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var fileNames: js.UndefOr[FileNames] = js.native
  
  var format: js.UndefOr[iife | cjs | umd] = js.native
  
  var html: js.UndefOr[Html] = js.native
  
  var minimize: js.UndefOr[Boolean] = js.native
  
  var moduleName: js.UndefOr[String] = js.native
  
  var publicUrl: js.UndefOr[String] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[
    web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
  ] = js.native
}
object Output_ {
  
  @scala.inline
  def apply(): Output_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output_]
  }
  
  @scala.inline
  implicit class Output_Ops[Self <: Output_] (val x: Self) extends AnyVal {
    
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
    def setClean(value: Boolean): Self = this.set("clean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClean: Self = this.set("clean", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setFileNames(value: FileNames): Self = this.set("fileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileNames: Self = this.set("fileNames", js.undefined)
    
    @scala.inline
    def setFormat(value: iife | cjs | umd): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHtml(value: Html): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleName: Self = this.set("moduleName", js.undefined)
    
    @scala.inline
    def setPublicUrl(value: String): Self = this.set("publicUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicUrl: Self = this.set("publicUrl", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setTarget(
      value: web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
    ): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
