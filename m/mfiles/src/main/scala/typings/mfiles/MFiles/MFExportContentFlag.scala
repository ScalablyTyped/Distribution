package typings.mfiles.MFiles

import typings.mfiles.mfilesNumbers.`0`
import typings.mfiles.mfilesNumbers.`1024`
import typings.mfiles.mfilesNumbers.`128`
import typings.mfiles.mfilesNumbers.`2`
import typings.mfiles.mfilesNumbers.`32`
import typings.mfiles.mfilesNumbers.`4`
import typings.mfiles.mfilesNumbers.`64`
import typings.mfiles.mfilesNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mfiles.mfilesNumbers.`0`
  - typings.mfiles.mfilesNumbers.`2`
  - typings.mfiles.mfilesNumbers.`4`
  - typings.mfiles.mfilesNumbers.`8`
  - typings.mfiles.mfilesNumbers.`32`
  - typings.mfiles.mfilesNumbers.`64`
  - typings.mfiles.mfilesNumbers.`128`
  - typings.mfiles.mfilesNumbers.`1024`
*/
trait MFExportContentFlag extends js.Object

object MFExportContentFlag {
  @scala.inline
  def ClearArchivalMarker: `8` = this.cast(8)
  @scala.inline
  def DestroyAfterExport: `4` = this.cast(4)
  @scala.inline
  def ExportInformationOnDestroyedData: `64` = this.cast(64)
  @scala.inline
  def IndicateDropouts: `1024` = this.cast(1024)
  @scala.inline
  def LatestVersionsOnly: `2` = this.cast(2)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def SaveFilesAlsoAsPDFA: `32` = this.cast(32)
  @scala.inline
  def UseMultipleContentPackages: `128` = this.cast(128)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

