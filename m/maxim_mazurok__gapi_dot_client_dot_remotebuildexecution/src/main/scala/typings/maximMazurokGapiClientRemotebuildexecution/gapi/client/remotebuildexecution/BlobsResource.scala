package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Hash
import typings.maximMazurokGapiClientRemotebuildexecution.anon.InstanceName
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Key
import typings.maximMazurokGapiClientRemotebuildexecution.anon.Oauthtoken
import typings.maximMazurokGapiClientRemotebuildexecution.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobsResource extends StObject {
  
  def batchRead(request: InstanceName, body: BuildBazelRemoteExecutionV2BatchReadBlobsRequest): Request[BuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  /**
    * Download many blobs at once. The server may enforce a limit of the combined total size of blobs to be downloaded using this API. This limit may be obtained using the Capabilities
    * API. Requests exceeding the limit should either be split into smaller chunks or downloaded using the ByteStream API, as appropriate. This request is equivalent to calling a
    * Bytestream `Read` request on each individual blob, in parallel. The requests may succeed or fail independently. Errors: * `INVALID_ARGUMENT`: The client attempted to read more than
    * the server supported limit. Every error on individual read will be returned in the corresponding digest status.
    */
  def batchRead(request: Key): Request[BuildBazelRemoteExecutionV2BatchReadBlobsResponse] = js.native
  
  def batchUpdate(request: InstanceName, body: BuildBazelRemoteExecutionV2BatchUpdateBlobsRequest): Request[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  /**
    * Upload many blobs at once. The server may enforce a limit of the combined total size of blobs to be uploaded using this API. This limit may be obtained using the Capabilities API.
    * Requests exceeding the limit should either be split into smaller chunks or uploaded using the ByteStream API, as appropriate. This request is equivalent to calling a Bytestream
    * `Write` request on each individual blob, in parallel. The requests may succeed or fail independently. Errors: * `INVALID_ARGUMENT`: The client attempted to upload more than the
    * server supported limit. Individual requests may return the following errors, additionally: * `RESOURCE_EXHAUSTED`: There is insufficient disk quota to store the blob. *
    * `INVALID_ARGUMENT`: The Digest does not match the provided data.
    */
  def batchUpdate(request: Oauthtoken): Request[BuildBazelRemoteExecutionV2BatchUpdateBlobsResponse] = js.native
  
  def findMissing(request: InstanceName, body: BuildBazelRemoteExecutionV2FindMissingBlobsRequest): Request[BuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  /**
    * Determine if blobs are present in the CAS. Clients can use this API before uploading blobs to determine which ones are already present in the CAS and do not need to be uploaded
    * again. Servers SHOULD increase the TTLs of the referenced blobs if necessary and applicable. There are no method-specific errors.
    */
  def findMissing(request: PrettyPrint): Request[BuildBazelRemoteExecutionV2FindMissingBlobsResponse] = js.native
  
  /**
    * Fetch the entire directory tree rooted at a node. This request must be targeted at a Directory stored in the ContentAddressableStorage (CAS). The server will enumerate the
    * `Directory` tree recursively and return every node descended from the root. The GetTreeRequest.page_token parameter can be used to skip ahead in the stream (e.g. when retrying a
    * partially completed and aborted request), by setting it to a value taken from GetTreeResponse.next_page_token of the last successfully processed GetTreeResponse). The exact
    * traversal order is unspecified and, unless retrieving subsequent pages from an earlier request, is not guaranteed to be stable across multiple invocations of `GetTree`. If part of
    * the tree is missing from the CAS, the server will return the portion present and omit the rest. Errors: * `NOT_FOUND`: The requested tree root is not present in the CAS.
    */
  def getTree(): Request[BuildBazelRemoteExecutionV2GetTreeResponse] = js.native
  def getTree(request: Hash): Request[BuildBazelRemoteExecutionV2GetTreeResponse] = js.native
}
