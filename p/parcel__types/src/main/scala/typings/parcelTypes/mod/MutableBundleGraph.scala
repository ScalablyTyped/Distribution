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
  
  def addBundleToBundleGroup(arg0: Bundle, arg1: BundleGroup): Unit = js.native
  
  def addEntryToBundle(arg0: Asset, arg1: Bundle): Unit = js.native
  def addEntryToBundle(arg0: Asset, arg1: Bundle, shouldSkipDependency: js.Function1[/* arg0 */ Dependency, Boolean]): Unit = js.native
  
  def createAssetReference(arg0: Dependency, arg1: Asset, arg2: Bundle): Unit = js.native
  
  def createBundle(arg0: CreateBundleOpts): Bundle = js.native
  
  /** Turns an edge (Dependency -> Asset-s) into (Dependency -> BundleGroup -> Asset-s) */
  def createBundleGroup(arg0: Dependency, arg1: Target): BundleGroup = js.native
  
  def createBundleReference(arg0: Bundle, arg1: Bundle): Unit = js.native
  
  def getDependencyAssets(arg0: Dependency): js.Array[Asset] = js.native
  
  def getParentBundlesOfBundleGroup(arg0: BundleGroup): js.Array[Bundle] = js.native
  
  def getTotalSize(arg0: Asset): Double = js.native
  
  /** Turns a dependency to a different bundle into a dependency to an asset inside <code>bundle</code>. */
  def internalizeAsyncDependency(bundle: Bundle, dependency: Dependency): Unit = js.native
  
  /** Remove all "contains" edges from the bundle to the nodes in the asset's subgraph. */
  def removeAssetGraphFromBundle(arg0: Asset, arg1: Bundle): Unit = js.native
  
  def removeBundleGroup(bundleGroup: BundleGroup): Unit = js.native
}
