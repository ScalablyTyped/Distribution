package typings.parcelTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
  val context: EnvironmentContext = js.native
  
  val engines: Engines = js.native
  
  val id: String = js.native
  
  /** Whether to include all/none packages \
    *  (<code>true / false</code>), an array of package names to include, or an object \
    *  (of a package is not specified, it's included).
    */
  val includeNodeModules: Boolean | js.Array[PackageName] | (Record[PackageName, Boolean]) = js.native
  
  /** Whether <code>context</code> specifies a browser context. */
  def isBrowser(): Boolean = js.native
  
  /** Whether <code>context</code> specifies an electron context. */
  def isElectron(): Boolean = js.native
  
  /** Whether <code>context</code> specifies an isolated context (can't access other loaded ancestor bundles). */
  def isIsolated(): Boolean = js.native
  
  /** Whether this is a library build (e.g. less loaders) */
  val isLibrary: Boolean = js.native
  
  /** Whether <code>context</code> specifies a node context. */
  def isNode(): Boolean = js.native
  
  /** Whether <code>context</code> specifies a worker context. */
  def isWorker(): Boolean = js.native
  
  /** Whether <code>context</code> specifies a worklet context. */
  def isWorklet(): Boolean = js.native
  
  val loc: js.UndefOr[SourceLocation | Null] = js.native
  
  def matchesEngines(minVersions: VersionMap): Boolean = js.native
  def matchesEngines(minVersions: VersionMap, defaultValue: Boolean): Boolean = js.native
  
  val outputFormat: OutputFormat = js.native
  
  /** Whether the output should be minified. */
  val shouldOptimize: Boolean = js.native
  
  /** Whether scope hoisting is enabled. */
  val shouldScopeHoist: Boolean = js.native
  
  val sourceMap: js.UndefOr[TargetSourceMapOptions | Null] = js.native
  
  val sourceType: SourceType = js.native
  
  def supports(feature: EnvironmentFeature): Boolean = js.native
  def supports(feature: EnvironmentFeature, defaultValue: Boolean): Boolean = js.native
}
