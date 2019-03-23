package typings
package ndnDashJsLib.nameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/name", "Name")
@js.native
object NameNs extends js.Object {
  @js.native
  class Component () extends js.Object {
    def this(component: Component) = this()
    def this(value: java.lang.String) = this()
    def this(value: js.Array[scala.Double]) = this()
    def this(value: ndnDashJsLib.blobMod.Blob) = this()
    def this(value: stdLib.ArrayBuffer) = this()
    def this(value: stdLib.Uint8Array) = this()
    def this(value: java.lang.String, `type`: ndnDashJsLib.nameMod.ComponentType) = this()
    def this(value: js.Array[scala.Double], `type`: ndnDashJsLib.nameMod.ComponentType) = this()
    def this(value: ndnDashJsLib.blobMod.Blob, `type`: ndnDashJsLib.nameMod.ComponentType) = this()
    def this(value: stdLib.ArrayBuffer, `type`: ndnDashJsLib.nameMod.ComponentType) = this()
    def this(value: stdLib.Uint8Array, `type`: ndnDashJsLib.nameMod.ComponentType) = this()
    def this(value: java.lang.String, `type`: ndnDashJsLib.nameMod.ComponentType, otherTypeCode: scala.Double) = this()
    def this(value: js.Array[scala.Double], `type`: ndnDashJsLib.nameMod.ComponentType, otherTypeCode: scala.Double) = this()
    def this(value: ndnDashJsLib.blobMod.Blob, `type`: ndnDashJsLib.nameMod.ComponentType, otherTypeCode: scala.Double) = this()
    def this(value: stdLib.ArrayBuffer, `type`: ndnDashJsLib.nameMod.ComponentType, otherTypeCode: scala.Double) = this()
    def this(value: stdLib.Uint8Array, `type`: ndnDashJsLib.nameMod.ComponentType, otherTypeCode: scala.Double) = this()
    def compare(other: Component): ndnDashJsLib.nameMod.CompareResult = js.native
    def equals(other: Component): scala.Boolean = js.native
    def getOtherTypeCode(): scala.Double = js.native
    def getSuccessor(): Component = js.native
    def getType(): ndnDashJsLib.nameMod.ComponentType = js.native
    def getValue(): ndnDashJsLib.blobMod.Blob = js.native
    def isGeneric(): scala.Boolean = js.native
    def isImplicitSha256Digest(): scala.Boolean = js.native
    def isParametersSha256Digest(): scala.Boolean = js.native
    def isSegment(): scala.Boolean = js.native
    def isSegmentOffset(): scala.Boolean = js.native
    def isSequenceNumber(): scala.Boolean = js.native
    def isTimestamp(): scala.Boolean = js.native
    def isVersion(): scala.Boolean = js.native
    def toEscapedString(): java.lang.String = js.native
    def toNumber(): scala.Double = js.native
    def toNumberWithMarker(marker: scala.Double): scala.Double = js.native
    def toSegment(): scala.Double = js.native
    def toSegmentOffset(): scala.Double = js.native
    def toSequenceNumber(): scala.Double = js.native
    def toTimestamp(): scala.Double = js.native
    def toVersion(): scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: ndnDashJsLib.blobMod.Blob): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromNumber(number: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromNumber(number: scala.Double, `type`: ndnDashJsLib.nameMod.ComponentType): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromNumber(number: scala.Double, `type`: ndnDashJsLib.nameMod.ComponentType, otherTypeCode: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromNumberWithMarker(number: scala.Double, marker: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromParametersSha256Digest(digest: ndnDashJsLib.blobMod.Blob): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromSegment(segment: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromSegmentOffset(segmentOffset: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromSequenceNumber(sequenceNumber: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromTimestamp(timestamp: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
    def fromVersion(version: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
  }
  
}

