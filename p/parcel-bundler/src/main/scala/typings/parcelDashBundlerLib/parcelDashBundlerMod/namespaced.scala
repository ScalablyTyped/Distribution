package typings
package parcelDashBundlerLib.parcelDashBundlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parcel-bundler", JSImport.Namespace)
@js.native
class namespaced () extends ParcelBundler {
  def this(entryFiles: java.lang.String) = this()
  def this(entryFiles: js.Array[java.lang.String]) = this()
  def this(entryFiles: java.lang.String, options: parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelOptions) = this()
  def this(entryFiles: js.Array[java.lang.String], options: parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelOptions) = this()
  /* CompleteClass */
  override def addAssetType(extension: java.lang.String, path: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def addPackager(`type`: java.lang.String, packager: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def bundle(): js.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle] = js.native
}

