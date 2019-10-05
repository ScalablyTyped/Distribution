package typings.ndnDashJs.ndnDashJsMod

import typings.ndnDashJs.nameMod.ComponentType
import typings.ndnDashJs.nameMod.Name.Component
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typings.ndnDashJs.nameMod.Name {
  def this(components: js.Array[Component | Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typings.ndnDashJs.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  @js.native
  class Component ()
    extends typings.ndnDashJs.nameMod.Name.Component {
    def this(component: typings.ndnDashJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typings.ndnDashJs.blobMod.Blob) = this()
    def this(value: ArrayBuffer) = this()
    def this(value: Uint8Array) = this()
    def this(value: String, `type`: ComponentType) = this()
    def this(value: js.Array[Double], `type`: ComponentType) = this()
    def this(value: typings.ndnDashJs.blobMod.Blob, `type`: ComponentType) = this()
    def this(value: ArrayBuffer, `type`: ComponentType) = this()
    def this(value: Uint8Array, `type`: ComponentType) = this()
    def this(value: String, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: typings.ndnDashJs.blobMod.Blob, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: ComponentType, otherTypeCode: Double) = this()
  }
  
  def fromEscapedString(uri: String): typings.ndnDashJs.nameMod.Name = js.native
  /* static members */
  @js.native
  object Component extends js.Object {
    def fromImplicitSha256Digest(digest: typings.ndnDashJs.blobMod.Blob): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: ComponentType): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumber(number: Double, `type`: ComponentType, otherTypeCode: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromNumberWithMarker(number: Double, marker: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromParametersSha256Digest(digest: typings.ndnDashJs.blobMod.Blob): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromSegment(segment: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromSegmentOffset(segmentOffset: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromSequenceNumber(sequenceNumber: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromTimestamp(timestamp: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
    def fromVersion(version: Double): typings.ndnDashJs.nameMod.Name.Component = js.native
  }
  
}

