package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ActionResult extends js.Object {
  
  /** The details of the execution that originally produced this result. */
  var executionMetadata: js.UndefOr[BuildBazelRemoteExecutionV2ExecutedActionMetadata] = js.native
  
  /** The exit code of the command. */
  var exitCode: js.UndefOr[Double] = js.native
  
  /**
    * The output directories of the action. For each output directory requested in the `output_directories` or `output_paths` field of the Action, if the corresponding directory existed
    * after the action completed, a single entry will be present in the output list, which will contain the digest of a Tree message containing the directory tree, and the path equal
    * exactly to the corresponding Action output_directories member. As an example, suppose the Action had an output directory `a/b/dir` and the execution produced the following contents
    * in `a/b/dir`: a file named `bar` and a directory named `foo` with an executable file named `baz`. Then, output_directory will contain (hashes shortened for readability): ```json //
    * OutputDirectory proto: { path: "a/b/dir" tree_digest: { hash: "4a73bc9d03...", size: 55 } } // Tree proto with hash "4a73bc9d03..." and size 55: { root: { files: [ { name: "bar",
    * digest: { hash: "4a73bc9d03...", size: 65534 } } ], directories: [ { name: "foo", digest: { hash: "4cf2eda940...", size: 43 } } ] } children : { // (Directory proto with hash
    * "4cf2eda940..." and size 43) files: [ { name: "baz", digest: { hash: "b2c941073e...", size: 1294, }, is_executable: true } ] } } ``` If an output of the same name as listed in
    * `output_files` of the Command was found in `output_directories`, but was not a directory, the server will return a FAILED_PRECONDITION.
    */
  var outputDirectories: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2OutputDirectory]] = js.native
  
  /**
    * The output directories of the action that are symbolic links to other directories. Those may be links to other output directories, or input directories, or even absolute paths
    * outside of the working directory, if the server supports SymlinkAbsolutePathStrategy.ALLOWED. For each output directory requested in the `output_directories` field of the Action, if
    * the directory existed after the action completed, a single entry will be present either in this field, or in the `output_directories` field, if the directory was not a symbolic
    * link. If an output of the same name was found, but was a symbolic link to a file instead of a directory, the server will return a FAILED_PRECONDITION. If the action does not produce
    * the requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired; clients MUST NOT assume that the output list is
    * sorted. DEPRECATED as of v2.1. Servers that wish to be compatible with v2.0 API should still populate this field in addition to `output_symlinks`.
    */
  var outputDirectorySymlinks: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2OutputSymlink]] = js.native
  
  /**
    * The output files of the action that are symbolic links to other files. Those may be links to other output files, or input files, or even absolute paths outside of the working
    * directory, if the server supports SymlinkAbsolutePathStrategy.ALLOWED. For each output file requested in the `output_files` or `output_paths` field of the Action, if the
    * corresponding file existed after the action completed, a single entry will be present either in this field, or in the `output_files` field, if the file was not a symbolic link. If
    * an output symbolic link of the same name as listed in `output_files` of the Command was found, but its target type was not a regular file, the server will return a
    * FAILED_PRECONDITION. If the action does not produce the requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired;
    * clients MUST NOT assume that the output list is sorted. DEPRECATED as of v2.1. Servers that wish to be compatible with v2.0 API should still populate this field in addition to
    * `output_symlinks`.
    */
  var outputFileSymlinks: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2OutputSymlink]] = js.native
  
  /**
    * The output files of the action. For each output file requested in the `output_files` or `output_paths` field of the Action, if the corresponding file existed after the action
    * completed, a single entry will be present either in this field, or the `output_file_symlinks` field if the file was a symbolic link to another file (`output_symlinks` field after
    * v2.1). If an output listed in `output_files` was found, but was a directory rather than a regular file, the server will return a FAILED_PRECONDITION. If the action does not produce
    * the requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired; clients MUST NOT assume that the output list is
    * sorted.
    */
  var outputFiles: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2OutputFile]] = js.native
  
  /**
    * New in v2.1: this field will only be populated if the command `output_paths` field was used, and not the pre v2.1 `output_files` or `output_directories` fields. The output paths of
    * the action that are symbolic links to other paths. Those may be links to other outputs, or inputs, or even absolute paths outside of the working directory, if the server supports
    * SymlinkAbsolutePathStrategy.ALLOWED. A single entry for each output requested in `output_paths` field of the Action, if the corresponding path existed after the action completed and
    * was a symbolic link. If the action does not produce a requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired;
    * clients MUST NOT assume that the output list is sorted.
    */
  var outputSymlinks: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2OutputSymlink]] = js.native
  
  /** The digest for a blob containing the standard error of the action, which can be retrieved from the ContentAddressableStorage. */
  var stderrDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * The standard error buffer of the action. The server SHOULD NOT inline stderr unless requested by the client in the GetActionResultRequest message. The server MAY omit inlining, even
    * if requested, and MUST do so if inlining would cause the response to exceed message size limits.
    */
  var stderrRaw: js.UndefOr[String] = js.native
  
  /** The digest for a blob containing the standard output of the action, which can be retrieved from the ContentAddressableStorage. */
  var stdoutDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * The standard output buffer of the action. The server SHOULD NOT inline stdout unless requested by the client in the GetActionResultRequest message. The server MAY omit inlining,
    * even if requested, and MUST do so if inlining would cause the response to exceed message size limits.
    */
  var stdoutRaw: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2ActionResult {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ActionResult]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ActionResultOps[Self <: BuildBazelRemoteExecutionV2ActionResult] (val x: Self) extends AnyVal {
    
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
    def setExecutionMetadata(value: BuildBazelRemoteExecutionV2ExecutedActionMetadata): Self = this.set("executionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionMetadata: Self = this.set("executionMetadata", js.undefined)
    
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCode: Self = this.set("exitCode", js.undefined)
    
    @scala.inline
    def setOutputDirectoriesVarargs(value: BuildBazelRemoteExecutionV2OutputDirectory*): Self = this.set("outputDirectories", js.Array(value :_*))
    
    @scala.inline
    def setOutputDirectories(value: js.Array[BuildBazelRemoteExecutionV2OutputDirectory]): Self = this.set("outputDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDirectories: Self = this.set("outputDirectories", js.undefined)
    
    @scala.inline
    def setOutputDirectorySymlinksVarargs(value: BuildBazelRemoteExecutionV2OutputSymlink*): Self = this.set("outputDirectorySymlinks", js.Array(value :_*))
    
    @scala.inline
    def setOutputDirectorySymlinks(value: js.Array[BuildBazelRemoteExecutionV2OutputSymlink]): Self = this.set("outputDirectorySymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDirectorySymlinks: Self = this.set("outputDirectorySymlinks", js.undefined)
    
    @scala.inline
    def setOutputFileSymlinksVarargs(value: BuildBazelRemoteExecutionV2OutputSymlink*): Self = this.set("outputFileSymlinks", js.Array(value :_*))
    
    @scala.inline
    def setOutputFileSymlinks(value: js.Array[BuildBazelRemoteExecutionV2OutputSymlink]): Self = this.set("outputFileSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFileSymlinks: Self = this.set("outputFileSymlinks", js.undefined)
    
    @scala.inline
    def setOutputFilesVarargs(value: BuildBazelRemoteExecutionV2OutputFile*): Self = this.set("outputFiles", js.Array(value :_*))
    
    @scala.inline
    def setOutputFiles(value: js.Array[BuildBazelRemoteExecutionV2OutputFile]): Self = this.set("outputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFiles: Self = this.set("outputFiles", js.undefined)
    
    @scala.inline
    def setOutputSymlinksVarargs(value: BuildBazelRemoteExecutionV2OutputSymlink*): Self = this.set("outputSymlinks", js.Array(value :_*))
    
    @scala.inline
    def setOutputSymlinks(value: js.Array[BuildBazelRemoteExecutionV2OutputSymlink]): Self = this.set("outputSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSymlinks: Self = this.set("outputSymlinks", js.undefined)
    
    @scala.inline
    def setStderrDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("stderrDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderrDigest: Self = this.set("stderrDigest", js.undefined)
    
    @scala.inline
    def setStderrRaw(value: String): Self = this.set("stderrRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderrRaw: Self = this.set("stderrRaw", js.undefined)
    
    @scala.inline
    def setStdoutDigest(value: BuildBazelRemoteExecutionV2Digest): Self = this.set("stdoutDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdoutDigest: Self = this.set("stdoutDigest", js.undefined)
    
    @scala.inline
    def setStdoutRaw(value: String): Self = this.set("stdoutRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdoutRaw: Self = this.set("stdoutRaw", js.undefined)
  }
}
