package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle extends StObject {
  
  /**
    * Controls the behavior of the bundle.
    * to determine when the bundle is loaded.
    *   - inline: Inline bundles are not written to a separate file, but embedded into the parent bundle.
    *   - isolated: The bundle will be isolated from its parents. Shared assets will be duplicated.
    */
  val bundleBehavior: js.UndefOr[BundleBehavior | Null] = js.native
  
  /** The environment of the bundle. */
  val env: Environment = js.native
  
  /**
    * Returns the assets that are executed immediately when the bundle is loaded.
    * Some bundles may not have any entry assets, for example, shared bundles.
    */
  def getEntryAssets(): js.Array[Asset] = js.native
  
  /**
    * Returns the main entry of the bundle, which will provide the bundle's exports.
    * Some bundles do not have a main entry, for example, shared bundles.
    */
  def getMainEntry(): js.UndefOr[Asset | Null] = js.native
  
  /** Returns whether the bundle includes the given asset. */
  def hasAsset(arg0: Asset): Boolean = js.native
  
  /** Returns whether the bundle includes the given dependency. */
  def hasDependency(arg0: Dependency): Boolean = js.native
  
  /**
    * A placeholder for the bundle's content hash that can be used in the bundle's name or the contents of another
    * bundle. Hash references are replaced with a content hash of the bundle after packaging and optimizing.
    */
  val hashReference: String = js.native
  
  /** The bundle id. */
  val id: String = js.native
  
  /**
    * Whether the bundle can be split. If false, then all dependencies of the bundle will be kept
    * internal to the bundle, rather than referring to other bundles. This may result in assets
    * being duplicated between multiple bundles, but can be useful for things like server side rendering.
    */
  val isSplittable: js.UndefOr[Boolean | Null] = js.native
  
  /** Assets that run when the bundle is loaded (e.g. runtimes could be added). VERIFY */
  /**
    * Indicates that the bundle's file name should be stable over time, even when the content of the bundle
    * changes. This is useful for entries that a user would manually enter the URL for, as well as for things
    * like service workers or RSS feeds, where the URL must remain consistent over time.
    */
  val needsStableName: js.UndefOr[Boolean | Null] = js.native
  
  /** The bundle's target. */
  val target: Target = js.native
  
  /** Traverses assets and dependencies in the bundle. */
  def traverse[TContext](visit: GraphVisitor[BundleTraversable, TContext]): js.UndefOr[TContext | Null] = js.native
  
  /** Traverses the assets in the bundle. */
  def traverseAssets[TContext](visit: GraphVisitor[Asset, TContext]): js.UndefOr[TContext | Null] = js.native
  def traverseAssets[TContext](visit: GraphVisitor[Asset, TContext], startAsset: Asset): js.UndefOr[TContext | Null] = js.native
  
  /** The type of the bundle. */
  val `type`: String = js.native
}
