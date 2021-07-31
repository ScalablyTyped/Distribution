package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2DirectoryNode extends StObject {
  
  /** The digest of the Directory object represented. See Digest for information about how to take the digest of a proto message. */
  var digest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /** The name of the directory. */
  var name: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2DirectoryNode {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2DirectoryNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2DirectoryNode]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2DirectoryNodeMutableBuilder[Self <: BuildBazelRemoteExecutionV2DirectoryNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
