package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
object NameNs extends js.Object {
  @js.native
  class Component ()
    extends ndnDashJsLib.nameMod.NameNs.Component {
    def this(component: ndnDashJsLib.nameMod.NameNs.Component) = this()
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

