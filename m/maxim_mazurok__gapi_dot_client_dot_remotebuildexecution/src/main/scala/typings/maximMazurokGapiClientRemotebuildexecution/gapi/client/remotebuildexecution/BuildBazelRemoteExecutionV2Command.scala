package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Command extends StObject {
  
  /**
    * The arguments to the command. The first argument must be the path to the executable, which must be either a relative path, in which case it is evaluated with respect to the input
    * root, or an absolute path.
    */
  var arguments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The environment variables to set when running the program. The worker may provide its own default environment variables; these defaults can be overridden using this field.
    * Additional variables can also be specified. In order to ensure that equivalent Commands always hash to the same value, the environment variables MUST be lexicographically sorted by
    * name. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes.
    */
  var environmentVariables: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2CommandEnvironmentVariable]] = js.undefined
  
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
  var outputDirectories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of the output files that the client expects to retrieve from the action. Only the listed files, as well as directories listed in `output_directories`, will be returned to the
    * client as output. Other files or directories that may be created during command execution are discarded. The paths are relative to the working directory of the action execution. The
    * paths are specified using a single forward slash (`/`) as a path separator, even if the execution platform natively uses a different separator. The path MUST NOT include a trailing
    * slash, nor a leading slash, being a relative path. In order to ensure consistent hashing of the same Action, the output paths MUST be sorted lexicographically by code point (or,
    * equivalently, by UTF-8 bytes). An output file cannot be duplicated, be a parent of another output file, or have the same path as any of the listed output directories. Directories
    * leading up to the output files are created by the worker prior to execution, even if they are not explicitly part of the input root. DEPRECATED since v2.1: Use `output_paths`
    * instead.
    */
  var outputFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of keys for node properties the client expects to retrieve for output files and directories. Keys are either names of string-based NodeProperty or names of fields in
    * NodeProperties. In order to ensure that equivalent `Action`s always hash to the same value, the node properties MUST be lexicographically sorted by name. Sorting of strings is done
    * by code point, equivalently, by the UTF-8 bytes. The interpretation of string-based properties is server-dependent. If a property is not recognized by the server, the server will
    * return an `INVALID_ARGUMENT`.
    */
  var outputNodeProperties: js.UndefOr[js.Array[String]] = js.undefined
  
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
  var outputPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The platform requirements for the execution environment. The server MAY choose to execute the action on any worker satisfying the requirements, so the client SHOULD ensure that
    * running the action on any such worker will have the same result. A detailed lexicon for this can be found in the accompanying platform.md. DEPRECATED as of v2.2: platform properties
    * are now specified directly in the action. See documentation note in the Action for migration.
    */
  var platform: js.UndefOr[BuildBazelRemoteExecutionV2Platform] = js.undefined
  
  /**
    * The working directory, relative to the input root, for the command to run in. It must be a directory which exists in the input tree. If it is left empty, then the action is run in
    * the input root.
    */
  var workingDirectory: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2Command {
  
  inline def apply(): BuildBazelRemoteExecutionV2Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Command]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2Command](x: Self) {
    
    inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setEnvironmentVariables(value: js.Array[BuildBazelRemoteExecutionV2CommandEnvironmentVariable]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setEnvironmentVariablesVarargs(value: BuildBazelRemoteExecutionV2CommandEnvironmentVariable*): Self = StObject.set(x, "environmentVariables", js.Array(value*))
    
    inline def setOutputDirectories(value: js.Array[String]): Self = StObject.set(x, "outputDirectories", value.asInstanceOf[js.Any])
    
    inline def setOutputDirectoriesUndefined: Self = StObject.set(x, "outputDirectories", js.undefined)
    
    inline def setOutputDirectoriesVarargs(value: String*): Self = StObject.set(x, "outputDirectories", js.Array(value*))
    
    inline def setOutputFiles(value: js.Array[String]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    inline def setOutputFilesUndefined: Self = StObject.set(x, "outputFiles", js.undefined)
    
    inline def setOutputFilesVarargs(value: String*): Self = StObject.set(x, "outputFiles", js.Array(value*))
    
    inline def setOutputNodeProperties(value: js.Array[String]): Self = StObject.set(x, "outputNodeProperties", value.asInstanceOf[js.Any])
    
    inline def setOutputNodePropertiesUndefined: Self = StObject.set(x, "outputNodeProperties", js.undefined)
    
    inline def setOutputNodePropertiesVarargs(value: String*): Self = StObject.set(x, "outputNodeProperties", js.Array(value*))
    
    inline def setOutputPaths(value: js.Array[String]): Self = StObject.set(x, "outputPaths", value.asInstanceOf[js.Any])
    
    inline def setOutputPathsUndefined: Self = StObject.set(x, "outputPaths", js.undefined)
    
    inline def setOutputPathsVarargs(value: String*): Self = StObject.set(x, "outputPaths", js.Array(value*))
    
    inline def setPlatform(value: BuildBazelRemoteExecutionV2Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
