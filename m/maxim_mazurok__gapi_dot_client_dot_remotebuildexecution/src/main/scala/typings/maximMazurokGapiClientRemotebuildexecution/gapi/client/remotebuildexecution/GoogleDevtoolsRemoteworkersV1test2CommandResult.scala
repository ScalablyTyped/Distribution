package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2CommandResult extends StObject {
  
  /**
    * The elapsed time between calling Accept and Complete. The server will also have its own idea of what this should be, but this excludes the overhead of the RPCs and the bot response
    * time.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /** The exit code of the process. An exit code of "0" should only be trusted if `status` has a code of OK (otherwise it may simply be unset). */
  var exitCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Implementation-dependent metadata about the task. Both servers and bots may define messages which can be encoded here; bots are free to provide metadata in multiple formats, and
    * servers are free to choose one or more of the values to process and ignore others. In particular, it is *not* considered an error for the bot to provide the server with a field that
    * it doesn't know about.
    */
  var metadata: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemoteworkersV1test2CommandResult & TopLevel[js.Any]
    ]
  ] = js.undefined
  
  /**
    * The output files. The blob referenced by the digest should contain one of the following (implementation-dependent): * A marshalled DirectoryMetadata of the returned filesystem * A
    * LUCI-style .isolated file
    */
  var outputs: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
  
  /** The amount of time *not* spent executing the command (ie uploading/downloading files). */
  var overhead: js.UndefOr[String] = js.undefined
  
  /**
    * An overall status for the command. For example, if the command timed out, this might have a code of DEADLINE_EXCEEDED; if it was killed by the OS for memory exhaustion, it might
    * have a code of RESOURCE_EXHAUSTED.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2CommandResult {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2CommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandResult]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2CommandResultMutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2CommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemoteworkersV1test2CommandResult & TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMetadataVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.GoogleDevtoolsRemoteworkersV1test2CommandResult & TopLevel[js.Any])*
    ): Self = StObject.set(x, "metadata", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOverhead(value: String): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
    
    @scala.inline
    def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
