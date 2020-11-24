package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2Command extends js.Object {
  
  /**
    * The arguments to the command. The first argument must be the path to the executable, which must be either a relative path, in which case it is evaluated with respect to the input
    * root, or an absolute path.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The environment variables to set when running the program. The worker may provide its own default environment variables; these defaults can be overridden using this field.
    * Additional variables can also be specified. In order to ensure that equivalent Commands always hash to the same value, the environment variables MUST be lexicographically sorted by
    * name. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
    */
  var environmentVariables: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2CommandEnvironmentVariable]] = js.native
  
  /**
    * A list of the output directories that the client expects to retrieve from the action. Only the listed directories will be returned (an entire directory structure will be returned as
    * a Tree message digest, see OutputDirectory), as well as files listed in `output_files`. Other files or directories that may be created during command execution are discarded. The
    * paths are relative to the working directory of the action execution. The paths are specified using a single forward slash (`/`) as a path separator, even if the execution platform
    * natively uses a different separator. The path MUST NOT include a trailing slash, nor a leading slash, being a relative path. The special value of empty string is allowed, although
    * not recommended, and can be used to capture the entire working directory tree, including inputs. In order to ensure consistent hashing of the same Action, the output paths MUST be
    * sorted lexicographically by code point (or, equivalently, by UTF-8 bytes). An output directory cannot be duplicated or have the same path as any of the listed output files. An
    * output directory is allowed to be a parent of another output directory. Directories leading up to the output directories (but not the output directories themselves) are created by
    * the worker prior to execution, even if they are not explicitly part of the input root. DEPRECATED since 2.1: Use `output_paths` instead.
    */
  var outputDirectories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of the output files that the client expects to retrieve from the action. Only the listed files, as well as directories listed in `output_directories`, will be returned to the
    * client as output. Other files or directories that may be created during command execution are discarded. The paths are relative to the working directory of the action execution. The
    * paths are specified using a single forward slash (`/`) as a path separator, even if the execution platform natively uses a different separator. The path MUST NOT include a trailing
    * slash, nor a leading slash, being a relative path. In order to ensure consistent hashing of the same Action, the output paths MUST be sorted lexicographically by code point (or,
    * equivalently, by UTF-8 bytes). An output file cannot be duplicated, be a parent of another output file, or have the same path as any of the listed output directories. Directories
    * leading up to the output files are created by the worker prior to execution, even if they are not explicitly part of the input root. DEPRECATED since v2.1: Use `output_paths`
    * instead.
    */
  var outputFiles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of the output paths that the client expects to retrieve from the action. Only the listed paths will be returned to the client as output. The type of the output (file or
    * directory) is not specified, and will be determined by the server after action execution. If the resulting path is a file, it will be returned in an OutputFile) typed field. If the
    * path is a directory, the entire directory structure will be returned as a Tree message digest, see OutputDirectory) Other files or directories that may be created during command
    * execution are discarded. The paths are relative to the working directory of the action execution. The paths are specified using a single forward slash (`/`) as a path separator,
    * even if the execution platform natively uses a different separator. The path MUST NOT include a trailing slash, nor a leading slash, being a relative path. In order to ensure
    * consistent hashing of the same Action, the output paths MUST be deduplicated and sorted lexicographically by code point (or, equivalently, by UTF-8 bytes). Directories leading up to
    * the output paths are created by the worker prior to execution, even if they are not explicitly part of the input root. New in v2.1: this field supersedes the DEPRECATED
    * `output_files` and `output_directories` fields. If `output_paths` is used, `output_files` and `output_directories` will be ignored!
    */
  var outputPaths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The platform requirements for the execution environment. The server MAY choose to execute the action on any worker satisfying the requirements, so the client SHOULD ensure that
    * running the action on any such worker will have the same result. A detailed lexicon for this can be found in the accompanying platform.md.
    */
  var platform: js.UndefOr[BuildBazelRemoteExecutionV2Platform] = js.native
  
  /**
    * The working directory, relative to the input root, for the command to run in. It must be a directory which exists in the input tree. If it is left empty, then the action is run in
    * the input root.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2Command {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Command]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2CommandOps[Self <: BuildBazelRemoteExecutionV2Command] (val x: Self) extends AnyVal {
    
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: BuildBazelRemoteExecutionV2CommandEnvironmentVariable*): Self = this.set("environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[BuildBazelRemoteExecutionV2CommandEnvironmentVariable]): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    
    @scala.inline
    def setOutputDirectoriesVarargs(value: String*): Self = this.set("outputDirectories", js.Array(value :_*))
    
    @scala.inline
    def setOutputDirectories(value: js.Array[String]): Self = this.set("outputDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDirectories: Self = this.set("outputDirectories", js.undefined)
    
    @scala.inline
    def setOutputFilesVarargs(value: String*): Self = this.set("outputFiles", js.Array(value :_*))
    
    @scala.inline
    def setOutputFiles(value: js.Array[String]): Self = this.set("outputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFiles: Self = this.set("outputFiles", js.undefined)
    
    @scala.inline
    def setOutputPathsVarargs(value: String*): Self = this.set("outputPaths", js.Array(value :_*))
    
    @scala.inline
    def setOutputPaths(value: js.Array[String]): Self = this.set("outputPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPaths: Self = this.set("outputPaths", js.undefined)
    
    @scala.inline
    def setPlatform(value: BuildBazelRemoteExecutionV2Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = this.set("workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDirectory: Self = this.set("workingDirectory", js.undefined)
  }
}
