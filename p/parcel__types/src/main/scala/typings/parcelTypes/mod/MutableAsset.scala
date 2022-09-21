package typings.parcelTypes.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.parcelSourceMap.mod.default
import typings.parcelTypes.anon.ShapeDependencyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableAsset
  extends StObject
     with BaseAsset {
  
  /** Adds a dependency to the asset. */
  def addDependency(arg0: DependencyOptions): String = js.native
  
  /**
    * Adds a url dependency to the asset.
    * This is a shortcut for addDependency that sets the specifierType to 'url' and priority to 'lazy'.
    */
  def addURLDependency(url: String, opts: ShapeDependencyOptions): String = js.native
  
  /** Invalidates the transformation when the given environment variable changes. */
  def invalidateOnEnvChange(arg0: String): Unit = js.native
  
  /** Invalidates the transformation when the given file is modified or deleted. */
  def invalidateOnFileChange(arg0: FilePath): Unit = js.native
  
  /** Invalidates the transformation when matched files are created. */
  def invalidateOnFileCreate(arg0: FileCreateInvalidation): Unit = js.native
  
  /** Returns whether the AST has been modified. */
  def isASTDirty(): Boolean = js.native
  
  /** Sets the asset's AST. */
  def setAST(arg0: AST): Unit = js.native
  
  /** Sets the asset contents as a buffer. */
  def setBuffer(arg0: Buffer): Unit = js.native
  
  /** Sets the asset contents as a string. */
  def setCode(arg0: String): Unit = js.native
  
  def setEnvironment(opts: EnvironmentOptions): Unit = js.native
  
  /** Sets the asset's source map. */
  def setMap(): Unit = js.native
  def setMap(arg0: default): Unit = js.native
  
  /** Sets the asset contents as a stream. */
  def setStream(arg0: Readable): Unit = js.native
  
  /** The symbols that the asset exports. */
  @JSName("symbols")
  val symbols_MutableAsset: MutableAssetSymbols = js.native
}
