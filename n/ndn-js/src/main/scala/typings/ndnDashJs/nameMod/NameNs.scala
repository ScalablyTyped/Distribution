package typings.ndnDashJs.nameMod

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.nameMod.NameNs.Component
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/name", "Name")
@js.native
object NameNs extends js.Object {
  @js.native
  class Component () extends js.Object {
    def this(component: Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: Blob) = this()
    def this(value: ArrayBuffer) = this()
    def this(value: Uint8Array) = this()
    def this(value: String, `type`: ComponentType) = this()
    def this(value: js.Array[Double], `type`: ComponentType) = this()
    def this(value: Blob, `type`: ComponentType) = this()
    def this(value: ArrayBuffer, `type`: ComponentType) = this()
    def this(value: Uint8Array, `type`: ComponentType) = this()
    def this(value: String, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: Blob, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double) = this()
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
  
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: Blob): Component = js.native
    def fromNumber(number: Double): Component = js.native
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

