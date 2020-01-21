package typings.nodeForge.mod.cipher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeForge.nodeForgeStrings.`AES-ECB`
  - typings.nodeForge.nodeForgeStrings.`AES-CBC`
  - typings.nodeForge.nodeForgeStrings.`AES-CFB`
  - typings.nodeForge.nodeForgeStrings.`AES-OFB`
  - typings.nodeForge.nodeForgeStrings.`AES-CTR`
  - typings.nodeForge.nodeForgeStrings.`AES-GCM`
  - typings.nodeForge.nodeForgeStrings.`3DES-ECB`
  - typings.nodeForge.nodeForgeStrings.`3DES-CBC`
  - typings.nodeForge.nodeForgeStrings.`DES-ECB`
  - typings.nodeForge.nodeForgeStrings.`DES-CBC`
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  def `3DES-CBC`: typings.nodeForge.nodeForgeStrings.`3DES-CBC` = this.cast("3DES-CBC")
  @scala.inline
  def `3DES-ECB`: typings.nodeForge.nodeForgeStrings.`3DES-ECB` = this.cast("3DES-ECB")
  @scala.inline
  def `AES-CBC`: typings.nodeForge.nodeForgeStrings.`AES-CBC` = this.cast("AES-CBC")
  @scala.inline
  def `AES-CFB`: typings.nodeForge.nodeForgeStrings.`AES-CFB` = this.cast("AES-CFB")
  @scala.inline
  def `AES-CTR`: typings.nodeForge.nodeForgeStrings.`AES-CTR` = this.cast("AES-CTR")
  @scala.inline
  def `AES-ECB`: typings.nodeForge.nodeForgeStrings.`AES-ECB` = this.cast("AES-ECB")
  @scala.inline
  def `AES-GCM`: typings.nodeForge.nodeForgeStrings.`AES-GCM` = this.cast("AES-GCM")
  @scala.inline
  def `AES-OFB`: typings.nodeForge.nodeForgeStrings.`AES-OFB` = this.cast("AES-OFB")
  @scala.inline
  def `DES-CBC`: typings.nodeForge.nodeForgeStrings.`DES-CBC` = this.cast("DES-CBC")
  @scala.inline
  def `DES-ECB`: typings.nodeForge.nodeForgeStrings.`DES-ECB` = this.cast("DES-ECB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

