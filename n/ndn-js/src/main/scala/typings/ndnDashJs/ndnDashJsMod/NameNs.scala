package typings.ndnDashJs.ndnDashJsMod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
object NameNs extends js.Object {
  @js.native
  class Component ()
    extends typings.ndnDashJs.nameMod.NameNs.Component {
    def this(component: typings.ndnDashJs.nameMod.NameNs.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typings.ndnDashJs.blobMod.Blob) = this()
    def this(value: ArrayBuffer) = this()
    def this(value: Uint8Array) = this()
    def this(value: String, `type`: typings.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typings.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: typings.ndnDashJs.blobMod.Blob, `type`: typings.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: ArrayBuffer, `type`: typings.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: Uint8Array, `type`: typings.ndnDashJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: typings.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: typings.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(
      value: typings.ndnDashJs.blobMod.Blob,
      `type`: typings.ndnDashJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: ArrayBuffer, `type`: typings.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: typings.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double) = this()
  }
  
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: typings.ndnDashJs.blobMod.Blob): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromNumber(number: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromNumber(number: Double, `type`: typings.ndnDashJs.nameMod.ComponentType): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromNumber(number: Double, `type`: typings.ndnDashJs.nameMod.ComponentType, otherTypeCode: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromParametersSha256Digest(digest: typings.ndnDashJs.blobMod.Blob): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromSegment(segment: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromSegmentOffset(segmentOffset: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromTimestamp(timestamp: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
    def fromVersion(version: Double): typings.ndnDashJs.nameMod.NameNs.Component = js.native
  }
  
}

