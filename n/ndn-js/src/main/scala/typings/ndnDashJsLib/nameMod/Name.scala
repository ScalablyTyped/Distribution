package typings
package ndnDashJsLib.nameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/name", "Name")
@js.native
class Name () extends js.Object {
  def this(components: js.Array[ndnDashJsLib.nameMod.NameNs.Component | stdLib.Uint8Array]) = this()
  def this(name: java.lang.String) = this()
  def this(name: Name) = this()
  def append(components: Name): Name = js.native
  def append(components: ndnDashJsLib.nameMod.NameNs.Component): Name = js.native
  def append(value: java.lang.String): Name = js.native
  def append(value: java.lang.String, `type`: ComponentType): Name = js.native
  def append(value: java.lang.String, `type`: ComponentType, otherTypeCode: scala.Double): Name = js.native
  def append(value: js.Array[scala.Double]): Name = js.native
  def append(value: js.Array[scala.Double], `type`: ComponentType): Name = js.native
  def append(value: js.Array[scala.Double], `type`: ComponentType, otherTypeCode: scala.Double): Name = js.native
  def append(value: ndnDashJsLib.blobMod.Blob): Name = js.native
  def append(value: ndnDashJsLib.blobMod.Blob, `type`: ComponentType): Name = js.native
  def append(value: ndnDashJsLib.blobMod.Blob, `type`: ComponentType, otherTypeCode: scala.Double): Name = js.native
  def append(value: stdLib.ArrayBuffer): Name = js.native
  def append(value: stdLib.ArrayBuffer, `type`: ComponentType): Name = js.native
  def append(value: stdLib.ArrayBuffer, `type`: ComponentType, otherTypeCode: scala.Double): Name = js.native
  def append(value: stdLib.Uint8Array): Name = js.native
  def append(value: stdLib.Uint8Array, `type`: ComponentType): Name = js.native
  def append(value: stdLib.Uint8Array, `type`: ComponentType, otherTypeCode: scala.Double): Name = js.native
  def appendImplicitSha256Digest(digest: ndnDashJsLib.blobMod.Blob): Name = js.native
  def appendParametersSha256Digest(digest: ndnDashJsLib.blobMod.Blob): Name = js.native
  def appendSegment(segment: scala.Double): Name = js.native
  def appendSegmentOffset(segmentOffset: scala.Double): Name = js.native
  def appendSequenceNumber(sequenceNumber: scala.Double): Name = js.native
  def appendTimestamp(timestamp: scala.Double): Name = js.native
  def appendVersion(version: scala.Double): Name = js.native
  def clear(): scala.Unit = js.native
  def compare(iStartComponent: scala.Double, nComponents: scala.Double, other: Name): CompareResult = js.native
  def compare(
    iStartComponent: scala.Double,
    nComponents: scala.Double,
    other: Name,
    iOtherStartComponent: scala.Double
  ): CompareResult = js.native
  def compare(
    iStartComponent: scala.Double,
    nComponents: scala.Double,
    other: Name,
    iOtherStartComponent: scala.Double,
    nOtherComponents: scala.Double
  ): CompareResult = js.native
  def compare(other: Name): CompareResult = js.native
  def equals(other: Name): scala.Boolean = js.native
  def get(i: scala.Double): ndnDashJsLib.nameMod.NameNs.Component = js.native
  def getPrefix(nComponents: scala.Double): Name = js.native
  def getSubName(iStartComponent: scala.Double): Name = js.native
  def getSubName(iStartComponent: scala.Double, nComponents: scala.Double): Name = js.native
  def getSuccessor(): Name = js.native
  def `match`(name: Name): scala.Boolean = js.native
  def set(uri: java.lang.String): scala.Unit = js.native
  def size(): scala.Double = js.native
  def toUri(): java.lang.String = js.native
  def toUri(includeScheme: scala.Boolean): java.lang.String = js.native
  def wireDecode(input: ndnDashJsLib.blobMod.Blob): scala.Unit = js.native
  def wireDecode(input: nodeLib.Buffer): scala.Unit = js.native
  def wireEncode(): ndnDashJsLib.blobMod.Blob = js.native
}

/* static members */
@JSImport("ndn-js/name", "Name")
@js.native
object Name extends js.Object {
  def fromEscapedString(uri: java.lang.String): ndnDashJsLib.nameMod.Name = js.native
}

