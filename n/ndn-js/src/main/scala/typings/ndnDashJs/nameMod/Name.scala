package typings.ndnDashJs.nameMod

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.nameMod.NameNs.Component
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/name", "Name")
@js.native
class Name () extends js.Object {
  def this(components: js.Array[Component | Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: Name) = this()
  def append(components: Name): Name = js.native
  def append(components: Component): Name = js.native
  def append(value: String): Name = js.native
  def append(value: String, `type`: ComponentType): Name = js.native
  def append(value: String, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: js.Array[Double]): Name = js.native
  def append(value: js.Array[Double], `type`: ComponentType): Name = js.native
  def append(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: Blob): Name = js.native
  def append(value: Blob, `type`: ComponentType): Name = js.native
  def append(value: Blob, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: ArrayBuffer): Name = js.native
  def append(value: ArrayBuffer, `type`: ComponentType): Name = js.native
  def append(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: Uint8Array): Name = js.native
  def append(value: Uint8Array, `type`: ComponentType): Name = js.native
  def append(value: Uint8Array, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def appendImplicitSha256Digest(digest: Blob): Name = js.native
  def appendParametersSha256Digest(digest: Blob): Name = js.native
  def appendSegment(segment: Double): Name = js.native
  def appendSegmentOffset(segmentOffset: Double): Name = js.native
  def appendSequenceNumber(sequenceNumber: Double): Name = js.native
  def appendTimestamp(timestamp: Double): Name = js.native
  def appendVersion(version: Double): Name = js.native
  def clear(): Unit = js.native
  def compare(iStartComponent: Double, nComponents: Double, other: Name): CompareResult = js.native
  def compare(iStartComponent: Double, nComponents: Double, other: Name, iOtherStartComponent: Double): CompareResult = js.native
  def compare(
    iStartComponent: Double,
    nComponents: Double,
    other: Name,
    iOtherStartComponent: Double,
    nOtherComponents: Double
  ): CompareResult = js.native
  def compare(other: Name): CompareResult = js.native
  def equals(other: Name): Boolean = js.native
  def get(i: Double): Component = js.native
  def getPrefix(nComponents: Double): Name = js.native
  def getSubName(iStartComponent: Double): Name = js.native
  def getSubName(iStartComponent: Double, nComponents: Double): Name = js.native
  def getSuccessor(): Name = js.native
  def `match`(name: Name): Boolean = js.native
  def set(uri: String): Unit = js.native
  def size(): Double = js.native
  def toUri(): String = js.native
  def toUri(includeScheme: Boolean): String = js.native
  def wireDecode(input: Blob): Unit = js.native
  def wireDecode(input: Buffer): Unit = js.native
  def wireEncode(): Blob = js.native
}

/* static members */
@JSImport("ndn-js/name", "Name")
@js.native
object Name extends js.Object {
  def fromEscapedString(uri: String): Name = js.native
}

