package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotCommandDurations extends js.Object {
  
  /** The time spent preparing the command to be run in a Docker container (includes pulling the Docker image, if necessary). */
  var dockerPrep: js.UndefOr[String] = js.native
  
  /** The timestamp when docker preparation begins. */
  var dockerPrepStartTime: js.UndefOr[String] = js.native
  
  /** The time spent downloading the input files and constructing the working directory. */
  var download: js.UndefOr[String] = js.native
  
  /** The timestamp when downloading the input files begins. */
  var downloadStartTime: js.UndefOr[String] = js.native
  
  /** The timestamp when execution begins. */
  var execStartTime: js.UndefOr[String] = js.native
  
  /** The time spent executing the command (i.e., doing useful work). */
  var execution: js.UndefOr[String] = js.native
  
  /** The timestamp when preparation is done and bot starts downloading files. */
  var isoPrepDone: js.UndefOr[String] = js.native
  
  /** The time spent completing the command, in total. */
  var overall: js.UndefOr[String] = js.native
  
  /** The time spent uploading the stdout logs. */
  var stdout: js.UndefOr[String] = js.native
  
  /** The time spent uploading the output files. */
  var upload: js.UndefOr[String] = js.native
  
  /** The timestamp when uploading the output files begins. */
  var uploadStartTime: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemotebuildbotCommandDurations {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemotebuildbotCommandDurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildbotCommandDurations]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemotebuildbotCommandDurationsOps[Self <: GoogleDevtoolsRemotebuildbotCommandDurations] (val x: Self) extends AnyVal {
    
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
    def setDockerPrep(value: String): Self = this.set("dockerPrep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerPrep: Self = this.set("dockerPrep", js.undefined)
    
    @scala.inline
    def setDockerPrepStartTime(value: String): Self = this.set("dockerPrepStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockerPrepStartTime: Self = this.set("dockerPrepStartTime", js.undefined)
    
    @scala.inline
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    
    @scala.inline
    def setDownloadStartTime(value: String): Self = this.set("downloadStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadStartTime: Self = this.set("downloadStartTime", js.undefined)
    
    @scala.inline
    def setExecStartTime(value: String): Self = this.set("execStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecStartTime: Self = this.set("execStartTime", js.undefined)
    
    @scala.inline
    def setExecution(value: String): Self = this.set("execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecution: Self = this.set("execution", js.undefined)
    
    @scala.inline
    def setIsoPrepDone(value: String): Self = this.set("isoPrepDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsoPrepDone: Self = this.set("isoPrepDone", js.undefined)
    
    @scala.inline
    def setOverall(value: String): Self = this.set("overall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverall: Self = this.set("overall", js.undefined)
    
    @scala.inline
    def setStdout(value: String): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    
    @scala.inline
    def setUpload(value: String): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    
    @scala.inline
    def setUploadStartTime(value: String): Self = this.set("uploadStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadStartTime: Self = this.set("uploadStartTime", js.undefined)
  }
}
