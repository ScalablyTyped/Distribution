package typings.mnemonist.bloomFilterMod

import typings.std.Iterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BloomFilter extends js.Object {
  // Members
  var capacity: Double = js.native
  var errorRate: Double = js.native
  var hashFunctions: Double = js.native
  def add(string: String): this.type = js.native
  // Methods
  def clear(): Unit = js.native
  // Statics
  def from(iterable: Iterable[String]): BloomFilter = js.native
  def from(iterable: Iterable[String], options: Double): BloomFilter = js.native
  def from(iterable: Iterable[String], options: BloomFilterOptions): BloomFilter = js.native
  def test(string: String): Boolean = js.native
  def toJSON(): Uint8Array = js.native
}

