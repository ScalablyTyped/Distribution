package typings.nodeSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncOptions extends Options {
  
  @JSName("functions")
  var functions_SyncOptions: js.UndefOr[FunctionDeclarations[SyncSassFunction]] = js.native
  
  @JSName("importer")
  var importer_SyncOptions: js.UndefOr[SyncImporter | js.Array[SyncImporter]] = js.native
}
object SyncOptions {
  
  @scala.inline
  def apply(): SyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncOptions]
  }
  
  @scala.inline
  implicit class SyncOptionsOps[Self <: SyncOptions] (val x: Self) extends AnyVal {
    
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
    def setFunctions(value: FunctionDeclarations[SyncSassFunction]): Self = this.set("functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    
    @scala.inline
    def setImporterVarargs(value: SyncImporter*): Self = this.set("importer", js.Array(value :_*))
    
    @scala.inline
    def setImporter(value: SyncImporter | js.Array[SyncImporter]): Self = this.set("importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImporter: Self = this.set("importer", js.undefined)
  }
}
