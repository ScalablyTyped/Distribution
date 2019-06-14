package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - mfilesLib.mfilesLibNumbers.`0`
  - mfilesLib.mfilesLibNumbers.`2`
  - mfilesLib.mfilesLibNumbers.`4`
  - mfilesLib.mfilesLibNumbers.`8`
  - mfilesLib.mfilesLibNumbers.`32`
  - mfilesLib.mfilesLibNumbers.`64`
  - mfilesLib.mfilesLibNumbers.`128`
  - mfilesLib.mfilesLibNumbers.`1024`
*/
trait MFExportContentFlag extends js.Object

object MFExportContentFlag {
  @scala.inline
  def ClearArchivalMarker: mfilesLib.mfilesLibNumbers.`8` = this.cast(8)
  @scala.inline
  def DestroyAfterExport: mfilesLib.mfilesLibNumbers.`4` = this.cast(4)
  @scala.inline
  def ExportInformationOnDestroyedData: mfilesLib.mfilesLibNumbers.`64` = this.cast(64)
  @scala.inline
  def IndicateDropouts: mfilesLib.mfilesLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def LatestVersionsOnly: mfilesLib.mfilesLibNumbers.`2` = this.cast(2)
  @scala.inline
  def None: mfilesLib.mfilesLibNumbers.`0` = this.cast(0)
  @scala.inline
  def SaveFilesAlsoAsPDFA: mfilesLib.mfilesLibNumbers.`32` = this.cast(32)
  @scala.inline
  def UseMultipleContentPackages: mfilesLib.mfilesLibNumbers.`128` = this.cast(128)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

