package typings.mnemonist.mod

import typings.mnemonist.bloomFilterMod.BloomFilterOptions
import typings.mnemonist.bloomFilterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "BloomFilter")
@js.native
class BloomFilter protected () extends default {
  // Constructor
  def this(capacity: Double) = this()
  def this(options: BloomFilterOptions) = this()
}

