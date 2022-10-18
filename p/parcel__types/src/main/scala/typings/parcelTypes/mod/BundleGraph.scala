package typings.parcelTypes.mod

import typings.parcelTypes.anon.IncludeInline
import typings.parcelTypes.anon.Recursive
import typings.parcelTypes.anon.Type
import typings.parcelTypes.anon.Value
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleGraph[TBundle /* <: Bundle */] extends StObject {
  
  /** Retrieves an asset by id. */
  def getAssetById(id: String): Asset = js.native
  
  /** Returns the public (short) id for an asset. */
  def getAssetPublicId(asset: Asset): String = js.native
  
  /** Get the asset that created the dependency. */
  def getAssetWithDependency(dep: Dependency): js.UndefOr[Asset | Null] = js.native
  
  /** Returns a list of bundle groups that load the given bundle. */
  def getBundleGroupsContainingBundle(bundle: Bundle): js.Array[BundleGroup] = js.native
  
  /** Returns a list of bundles in the bundle graph. By default, inline bundles are excluded. */
  def getBundles(): js.Array[TBundle] = js.native
  def getBundles(opts: IncludeInline): js.Array[TBundle] = js.native
  
  /** Returns a list of bundles that load together in the given bundle group. */
  def getBundlesInBundleGroup(bundleGroup: BundleGroup): js.Array[TBundle] = js.native
  def getBundlesInBundleGroup(bundleGroup: BundleGroup, opts: IncludeInline): js.Array[TBundle] = js.native
  
  /** Returns a list of bundles that contain the given asset. */
  def getBundlesWithAsset(arg0: Asset): js.Array[TBundle] = js.native
  
  /** Returns a list of bundles that contain the given dependency. */
  def getBundlesWithDependency(arg0: Dependency): js.Array[TBundle] = js.native
  
  /** Returns a list of bundles that this bundle loads asynchronously. */
  def getChildBundles(bundle: Bundle): js.Array[TBundle] = js.native
  
  /** Get the dependencies that the asset requires */
  def getDependencies(asset: Asset): js.Array[Dependency] = js.native
  
  /** Returns the common root directory for the entry assets of a target. */
  def getEntryRoot(target: Target): FilePath = js.native
  
  /** Returns a list of symbols that are exported by the asset, including re-exports. */
  def getExportedSymbols(asset: Asset): js.Array[ExportSymbolResolution] = js.native
  def getExportedSymbols(asset: Asset, boundary: Bundle): js.Array[ExportSymbolResolution] = js.native
  
  /** Get the dependencies that require the asset */
  def getIncomingDependencies(asset: Asset): js.Array[Dependency] = js.native
  
  /** Returns a list of bundles that load this bundle asynchronously. */
  def getParentBundles(bundle: Bundle): js.Array[TBundle] = js.native
  
  /** Returns the bundle that a dependency in a given bundle references, if any. */
  def getReferencedBundle(dependency: Dependency, bundle: Bundle): js.UndefOr[TBundle | Null] = js.native
  
  /** Returns a list of bundles that are referenced by this bundle. By default, inline bundles are excluded. */
  def getReferencedBundles(bundle: Bundle): js.Array[TBundle] = js.native
  def getReferencedBundles(bundle: Bundle, opts: Recursive): js.Array[TBundle] = js.native
  
  /**
    * Returns the asset that the dependency resolved to.
    * If a bundle is given, assets in that bundle are preferred.
    * Returns null if the dependency was excluded.
    */
  def getResolvedAsset(dependency: Dependency): js.UndefOr[Asset | Null] = js.native
  def getResolvedAsset(dependency: Dependency, bundle: Bundle): js.UndefOr[Asset | Null] = js.native
  
  /**
    * Resolves the export `symbol` of `asset` to the source,
    * stopping at the first asset after leaving `bundle`.
    * `symbol === null`: bailout (== caller should do `asset.exports[exportsSymbol]`)
    * `symbol === undefined`: symbol not found
    * `symbol === false`: skipped
    *
    * <code>asset</code> exports <code>symbol</code>, try to find the asset where the \
    * corresponding variable lives (resolves re-exports). Stop resolving transitively once \
    * <code>boundary</code> was left (<code>bundle.hasAsset(asset) === false</code>), then <code>result.symbol</code> is undefined.
    */
  def getSymbolResolution(asset: Asset, symbol: Symbol): SymbolResolution = js.native
  def getSymbolResolution(asset: Asset, symbol: Symbol, boundary: Bundle): SymbolResolution = js.native
  
  /**
    * Returns a list of symbols from an asset or dependency that are referenced by a dependent asset.
    *
    * Returns null if symbol propagation didn't run (so the result is unknown).
    */
  def getUsedSymbols(arg0: Asset): js.UndefOr[ReadonlySet[Symbol] | Null] = js.native
  def getUsedSymbols(arg0: Dependency): js.UndefOr[ReadonlySet[Symbol] | Null] = js.native
  
  /** Returns whether the bundle was loaded by another bundle of the given type. */
  def hasParentBundleOfType(bundle: Bundle, `type`: String): Boolean = js.native
  
  /**
    * Returns whether the given asset is reachable in a sibling, or all possible
    * ancestries of the given bundle. This indicates that the asset may be excluded
    * from the given bundle.
    */
  def isAssetReachableFromBundle(asset: Asset, bundle: Bundle): Boolean = js.native
  
  /** Returns whether an asset is referenced outside the given bundle. */
  def isAssetReferenced(bundle: Bundle, asset: Asset): Boolean = js.native
  
  /** Returns whether a dependency was excluded because it had no used symbols. */
  def isDependencySkipped(dependency: Dependency): Boolean = js.native
  
  /** Returns whether the given bundle group is an entry. */
  def isEntryBundleGroup(bundleGroup: BundleGroup): Boolean = js.native
  
  /**
    * Returns undefined if the specified dependency was excluded or wasn't async \
    * and otherwise the BundleGroup or Asset that the dependency resolves to.
    */
  def resolveAsyncDependency(dependency: Dependency): js.UndefOr[Type | Value | Null] = js.native
  def resolveAsyncDependency(dependency: Dependency, bundle: Bundle): js.UndefOr[Type | Value | Null] = js.native
  
  /** Traverses the assets and dependencies in the bundle graph, in depth first order. */
  def traverse[TContext](visit: GraphVisitor[BundleGraphTraversable, TContext]): js.UndefOr[TContext | Null] = js.native
  def traverse[TContext](visit: GraphVisitor[BundleGraphTraversable, TContext], startAsset: Asset): js.UndefOr[TContext | Null] = js.native
  
  /** Traverses all bundles in the bundle graph, including inline bundles, in depth first order. */
  def traverseBundles[TContext](visit: GraphVisitor[TBundle, TContext]): js.UndefOr[TContext | Null] = js.native
  def traverseBundles[TContext](visit: GraphVisitor[TBundle, TContext], startBundle: Bundle): js.UndefOr[TContext | Null] = js.native
}
