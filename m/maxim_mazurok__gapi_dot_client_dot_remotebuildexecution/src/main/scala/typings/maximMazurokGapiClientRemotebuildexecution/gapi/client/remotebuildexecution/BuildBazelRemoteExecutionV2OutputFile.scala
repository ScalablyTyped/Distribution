package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2OutputFile extends js.Object {
  
  /**
    * The contents of the file if inlining was requested. The server SHOULD NOT inline file contents unless requested by the client in the GetActionResultRequest message. The server MAY
    * omit inlining, even if requested, and MUST do so if inlining would cause the response to exceed message size limits.
    */
  var contents: js.UndefOr[String] = js.native
  
  /** The digest of the file's content. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /** True if file is executable, false otherwise. */
  var isExecutable: js.UndefOr[Boolean] = js.native
  
  /** The supported node properties of the OutputFile, if requested by the Action. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.native
  
  /**
    * The full path of the file relative to the working directory, including the filename. The path separator is a forward slash `/`. Since this is a relative path, it MUST NOT begin with
    * a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2OutputFile {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2OutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2OutputFile]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2OutputFileOps[Self <: BuildBazelRemoteExecutionV2OutputFile] (val x: Self) extends AnyVal {
    
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = this.set("isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExecutable: Self = this.set("isExecutable", js.undefined)
    
    @scala.inline
    def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = this.set("nodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = this.set("nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeProperties: Self = this.set("nodeProperties", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
