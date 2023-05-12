package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableBundleGraph
  extends StObject
     with BundleGraph[Bundle] {
  
  /** Add asset and all child nodes to the bundle. */
  def addAssetGraphToBundle(arg0: Asset, arg1: Bundle): Unit = js.native
  def addAssetGraphToBundle(arg0: Asset, arg1: Bundle, shouldSkipDependency: js.Function1[/* arg0 */ Dependency, Boolean]): Unit = js.native
  
  def addAssetToBundle(arg0: Asset, arg1: Bundle): Unit = js.native
  
  /** Adds the Bundle to the BundleGroup, loading it along with others in the group */
  def addBundleToBundleGroup(arg0: Bundle, arg1: BundleGroup): Unit = js.native
  
  /**
    * Adds an asset as an entry to a bundle. Entry assets are executed immediately
    * when the bundle is loaded.
    */
  def addEntryToBundle(arg0: Asset, arg1: Bundle): Unit = js.native
  def addEntryToBundle(arg0: Asset, arg1: Bundle, shouldSkipDependency: js.Function1[/* arg0 */ Dependency, Boolean]): Unit = js.native
  
  def createAssetReference(arg0: Dependency, arg1: Asset, arg2: Bundle): Unit = js.native
  
  def createBundle(arg0: CreateBundleOpts): Bundle = js.native
  
  /** Turns an edge (Dependency -> Asset-s) into (Dependency -> BundleGroup -> Asset-s) */
  def createBundleGroup(arg0: Dependency, arg1: Target): BundleGroup = js.native
  
  def createBundleReference(arg0: Bundle, arg1: Bundle): Unit = js.native
  
  /** @returns all Asset-s attached to the Dependency */
  def getDependencyAssets(arg0: Dependency): js.Array[Asset] = js.native
  
  /** Get Bundles that load this bundle asynchronously. */
  def getParentBundlesOfBundleGroup(arg0: BundleGroup): js.Array[Bundle] = js.native
  
  /** @returns the size in bytes of an asset and all assets in its subgraph */
  def getTotalSize(arg0: Asset): Double = js.native
  
  /** Turns a dependency to a different bundle into a dependency to an asset inside <code>bundle</code>. */
  def internalizeAsyncDependency(bundle: Bundle, dependency: Dependency): Unit = js.native
  
  /**
    * Recursively removes an asset and its dependencies from a bundle. Stops at
    * bundle group boundaries.
    */
  def removeAssetGraphFromBundle(arg0: Asset, arg1: Bundle): Unit = js.native
  
  /**
    * Removes a BundleGroup from the graph. If any of the group's Bundle-s no
    * longer exist in the graph, those are removed as well.
    */
  def removeBundleGroup(bundleGroup: BundleGroup): Unit = js.native
}
