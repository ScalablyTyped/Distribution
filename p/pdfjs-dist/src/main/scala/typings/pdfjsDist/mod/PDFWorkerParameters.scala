package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFWorkerParameters extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[js.Any] = js.native
  
  var verbosity: js.UndefOr[VerbosityLevel] = js.native
}
object PDFWorkerParameters {
  
  @scala.inline
  def apply(): PDFWorkerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFWorkerParameters]
  }
  
  @scala.inline
  implicit class PDFWorkerParametersOps[Self <: PDFWorkerParameters] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPort(value: js.Any): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setVerbosity(value: VerbosityLevel): Self = this.set("verbosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbosity: Self = this.set("verbosity", js.undefined)
  }
}
