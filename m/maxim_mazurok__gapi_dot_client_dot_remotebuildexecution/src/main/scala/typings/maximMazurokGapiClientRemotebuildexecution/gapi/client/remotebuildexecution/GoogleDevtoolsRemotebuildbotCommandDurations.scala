package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemotebuildbotCommandDurations extends StObject {
  
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
  implicit class GoogleDevtoolsRemotebuildbotCommandDurationsMutableBuilder[Self <: GoogleDevtoolsRemotebuildbotCommandDurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDockerPrep(value: String): Self = StObject.set(x, "dockerPrep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerPrepStartTime(value: String): Self = StObject.set(x, "dockerPrepStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockerPrepStartTimeUndefined: Self = StObject.set(x, "dockerPrepStartTime", js.undefined)
    
    @scala.inline
    def setDockerPrepUndefined: Self = StObject.set(x, "dockerPrep", js.undefined)
    
    @scala.inline
    def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadStartTime(value: String): Self = StObject.set(x, "downloadStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadStartTimeUndefined: Self = StObject.set(x, "downloadStartTime", js.undefined)
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setExecStartTime(value: String): Self = StObject.set(x, "execStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecStartTimeUndefined: Self = StObject.set(x, "execStartTime", js.undefined)
    
    @scala.inline
    def setExecution(value: String): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    @scala.inline
    def setIsoPrepDone(value: String): Self = StObject.set(x, "isoPrepDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoPrepDoneUndefined: Self = StObject.set(x, "isoPrepDone", js.undefined)
    
    @scala.inline
    def setOverall(value: String): Self = StObject.set(x, "overall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverallUndefined: Self = StObject.set(x, "overall", js.undefined)
    
    @scala.inline
    def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    @scala.inline
    def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStartTime(value: String): Self = StObject.set(x, "uploadStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadStartTimeUndefined: Self = StObject.set(x, "uploadStartTime", js.undefined)
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
