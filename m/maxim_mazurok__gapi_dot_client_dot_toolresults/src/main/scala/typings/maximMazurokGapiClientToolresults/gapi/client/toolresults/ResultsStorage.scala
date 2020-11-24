package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultsStorage extends js.Object {
  
  /** The root directory for test results. */
  var resultsStoragePath: js.UndefOr[FileReference] = js.native
  
  /** The path to the Xunit XML file. */
  var xunitXmlFile: js.UndefOr[FileReference] = js.native
}
object ResultsStorage {
  
  @scala.inline
  def apply(): ResultsStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsStorage]
  }
  
  @scala.inline
  implicit class ResultsStorageOps[Self <: ResultsStorage] (val x: Self) extends AnyVal {
    
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
    def setResultsStoragePath(value: FileReference): Self = this.set("resultsStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsStoragePath: Self = this.set("resultsStoragePath", js.undefined)
    
    @scala.inline
    def setXunitXmlFile(value: FileReference): Self = this.set("xunitXmlFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXunitXmlFile: Self = this.set("xunitXmlFile", js.undefined)
  }
}
