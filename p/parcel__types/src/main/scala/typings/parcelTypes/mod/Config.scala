package typings.parcelTypes.mod

import typings.parcelTypes.anon.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  /**
    * Adds a dev dependency to the config. If the dev dependency or any of its
    * dependencies change, the config will be invalidated.
    */
  def addDevDependency(arg0: DevDepOptions): Unit = js.native
  
  /** The environment */
  val env: Environment = js.native
  
  /**
    * Searches for config files with the given names in all parent directories
    * of the config's searchPath.
    */
  def getConfig[T](filePaths: js.Array[FilePath]): js.Promise[js.UndefOr[ConfigResultWithFilePath[T] | Null]] = js.native
  def getConfig[T](filePaths: js.Array[FilePath], options: Exclude): js.Promise[js.UndefOr[ConfigResultWithFilePath[T] | Null]] = js.native
  
  /**
    * Searches for config files with the given names in all parent directories
    * of the passed searchPath.
    */
  def getConfigFrom[T](searchPath: FilePath, filePaths: js.Array[FilePath]): js.Promise[js.UndefOr[ConfigResultWithFilePath[T] | Null]] = js.native
  def getConfigFrom[T](searchPath: FilePath, filePaths: js.Array[FilePath], options: Exclude): js.Promise[js.UndefOr[ConfigResultWithFilePath[T] | Null]] = js.native
  
  /** Finds the nearest package.json from the config's searchPath. */
  def getPackage(): js.Promise[js.UndefOr[PackageJSON | Null]] = js.native
  
  /** Invalidates the config when the given environment variable changes. */
  def invalidateOnEnvChange(arg0: String): Unit = js.native
  
  /** Invalidates the config when the given file is modified or deleted. */
  def invalidateOnFileChange(arg0: FilePath): Unit = js.native
  
  /** Invalidates the config when matched files are created. */
  def invalidateOnFileCreate(arg0: FileCreateInvalidation): Unit = js.native
  
  /** Invalidates the config when Parcel restarts. */
  def invalidateOnStartup(): Unit = js.native
  
  /**
    * Whether this config is part of the project, and not an external dependency (e.g. in node_modules).
    * This indicates that transformation using the project's configuration should be applied.
    */
  val isSource: Boolean = js.native
  
  /** The path of the file to start searching for config from. */
  val searchPath: FilePath = js.native
  
  /**
    * Sets the cache key for the config. By default, this is computed as a hash of the
    * files passed to invalidateOnFileChange or loaded by getConfig. If none, then a
    * hash of the result returned from loadConfig is used. This method can be used to
    * override this behavior and explicitly control the cache key. This can be useful
    * in cases where only part of a file is used to avoid unnecessary invalidations,
    * or when the result is not hashable (i.e. contains non-serializable properties like functions).
    */
  def setCacheKey(arg0: String): Unit = js.native
}
