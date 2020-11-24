package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2FileNode extends js.Object {
  
  /** The digest of the file's content. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /** True if file is executable, false otherwise. */
  var isExecutable: js.UndefOr[Boolean] = js.native
  
  /** The name of the file. */
  var name: js.UndefOr[String] = js.native
  
  /** The node properties of the FileNode. */
  var nodeProperties: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2NodeProperty]] = js.native
}
object BuildBazelRemoteExecutionV2FileNode {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2FileNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2FileNode]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2FileNodeOps[Self <: BuildBazelRemoteExecutionV2FileNode] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = this.set("isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExecutable: Self = this.set("isExecutable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodePropertiesVarargs(value: BuildBazelRemoteExecutionV2NodeProperty*): Self = this.set("nodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setNodeProperties(value: js.Array[BuildBazelRemoteExecutionV2NodeProperty]): Self = this.set("nodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeProperties: Self = this.set("nodeProperties", js.undefined)
  }
}
