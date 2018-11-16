package typings
package parcelDashBundlerLib.parcelDashBundlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ParcelBundler extends js.Object {
  def addAssetType(extension: java.lang.String, path: java.lang.String): scala.Unit
  def addPackager(`type`: java.lang.String, packager: java.lang.String): scala.Unit
  def bundle(): stdLib.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle]
}

