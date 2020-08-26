package typings.ndnJs.nameMod

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.nameMod.Name.Component
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
  def append(value: String, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Name = js.native
  def append(value: String, `type`: ComponentType): Name = js.native
  def append(value: String, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: js.Array[Double]): Name = js.native
  def append(value: js.Array[Double], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Name = js.native
  def append(value: js.Array[Double], `type`: ComponentType): Name = js.native
  def append(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: Blob): Name = js.native
  def append(value: Blob, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Name = js.native
  def append(value: Blob, `type`: ComponentType): Name = js.native
  def append(value: Blob, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: ArrayBuffer): Name = js.native
  def append(value: ArrayBuffer, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Name = js.native
  def append(value: ArrayBuffer, `type`: ComponentType): Name = js.native
  def append(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double): Name = js.native
  def append(value: Uint8Array): Name = js.native
  def append(value: Uint8Array, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Name = js.native
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
  def compare(
    iStartComponent: Double,
    nComponents: Double,
    other: Name,
    iOtherStartComponent: js.UndefOr[scala.Nothing],
    nOtherComponents: Double
  ): CompareResult = js.native
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
  @js.native
  class Component () extends js.Object {
    def this(component: Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: Blob) = this()
    def this(value: ArrayBuffer) = this()
    def this(value: Uint8Array) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: ComponentType) = this()
    def this(value: String, `type`: ComponentType) = this()
    def this(value: js.Array[Double], `type`: ComponentType) = this()
    def this(value: Blob, `type`: ComponentType) = this()
    def this(value: ArrayBuffer, `type`: ComponentType) = this()
    def this(value: Uint8Array, `type`: ComponentType) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: String, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: String, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: Blob, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: Blob, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: ArrayBuffer, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: ComponentType, otherTypeCode: Double) = this()
    def compare(other: Component): CompareResult = js.native
    def equals(other: Component): Boolean = js.native
    def getOtherTypeCode(): Double = js.native
    def getSuccessor(): Component = js.native
    def getType(): ComponentType = js.native
    def getValue(): Blob = js.native
    def isGeneric(): Boolean = js.native
    def isImplicitSha256Digest(): Boolean = js.native
    def isParametersSha256Digest(): Boolean = js.native
    def isSegment(): Boolean = js.native
    def isSegmentOffset(): Boolean = js.native
    def isSequenceNumber(): Boolean = js.native
    def isTimestamp(): Boolean = js.native
    def isVersion(): Boolean = js.native
    def toEscapedString(): String = js.native
    def toNumber(): Double = js.native
    def toNumberWithMarker(marker: Double): Double = js.native
    def toSegment(): Double = js.native
    def toSegmentOffset(): Double = js.native
    def toSequenceNumber(): Double = js.native
    def toTimestamp(): Double = js.native
    def toVersion(): Double = js.native
  }
  
  def fromEscapedString(uri: String): Name = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: Blob): Component = js.native
    def fromNumber(number: Double): Component = js.native
    def fromNumber(number: Double, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Component = js.native
    def fromNumber(number: Double, `type`: ComponentType): Component = js.native
    def fromNumber(number: Double, `type`: ComponentType, otherTypeCode: Double): Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): Component = js.native
    def fromParametersSha256Digest(digest: Blob): Component = js.native
    def fromSegment(segment: Double): Component = js.native
    def fromSegmentOffset(segmentOffset: Double): Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): Component = js.native
    def fromTimestamp(timestamp: Double): Component = js.native
    def fromVersion(version: Double): Component = js.native
  }
  
}

