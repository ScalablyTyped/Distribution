package typings.ndnJs

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.nameMod.Name.Component
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameMod {
  
  @js.native
  sealed trait ComponentType extends StObject
  @JSImport("ndn-js/name", "ComponentType")
  @js.native
  object ComponentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
    
    @js.native
    sealed trait GENERIC extends ComponentType
    /* 8 */ val GENERIC: typings.ndnJs.nameMod.ComponentType.GENERIC with Double = js.native
    
    @js.native
    sealed trait IMPLICIT_SHA256_DIGEST extends ComponentType
    /* 1 */ val IMPLICIT_SHA256_DIGEST: typings.ndnJs.nameMod.ComponentType.IMPLICIT_SHA256_DIGEST with Double = js.native
    
    @js.native
    sealed trait OTHER_CODE extends ComponentType
    /* 0x7fff */ val OTHER_CODE: typings.ndnJs.nameMod.ComponentType.OTHER_CODE with Double = js.native
    
    @js.native
    sealed trait PARAMETERS_SHA256_DIGEST extends ComponentType
    /* 2 */ val PARAMETERS_SHA256_DIGEST: typings.ndnJs.nameMod.ComponentType.PARAMETERS_SHA256_DIGEST with Double = js.native
  }
  
  @JSImport("ndn-js/name", "Name")
  @js.native
  class Name () extends StObject {
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
  object Name {
    
    @JSImport("ndn-js/name", "Name.Component")
    @js.native
    class Component () extends StObject {
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
    object Component {
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromImplicitSha256Digest")
      @js.native
      def fromImplicitSha256Digest(digest: Blob): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromNumber")
      @js.native
      def fromNumber(number: Double): Component = js.native
      @JSImport("ndn-js/name", "Name.Component.fromNumber")
      @js.native
      def fromNumber(number: Double, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): Component = js.native
      @JSImport("ndn-js/name", "Name.Component.fromNumber")
      @js.native
      def fromNumber(number: Double, `type`: ComponentType): Component = js.native
      @JSImport("ndn-js/name", "Name.Component.fromNumber")
      @js.native
      def fromNumber(number: Double, `type`: ComponentType, otherTypeCode: Double): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromNumberWithMarker")
      @js.native
      def fromNumberWithMarker(number: Double, marker: Double): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromParametersSha256Digest")
      @js.native
      def fromParametersSha256Digest(digest: Blob): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromSegment")
      @js.native
      def fromSegment(segment: Double): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromSegmentOffset")
      @js.native
      def fromSegmentOffset(segmentOffset: Double): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromSequenceNumber")
      @js.native
      def fromSequenceNumber(sequenceNumber: Double): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromTimestamp")
      @js.native
      def fromTimestamp(timestamp: Double): Component = js.native
      
      /* static member */
      @JSImport("ndn-js/name", "Name.Component.fromVersion")
      @js.native
      def fromVersion(version: Double): Component = js.native
    }
    
    @JSImport("ndn-js/name", "Name.fromEscapedString")
    @js.native
    def fromEscapedString(uri: String): Name = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ndnJs.ndnJsNumbers.`-1`
    - typings.ndnJs.ndnJsNumbers.`0`
    - typings.ndnJs.ndnJsNumbers.`1`
  */
  trait CompareResult extends StObject
  object CompareResult {
    
    @scala.inline
    def `-1`: typings.ndnJs.ndnJsNumbers.`-1` = -1.asInstanceOf[typings.ndnJs.ndnJsNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.ndnJs.ndnJsNumbers.`0` = 0.asInstanceOf[typings.ndnJs.ndnJsNumbers.`0`]
    
    @scala.inline
    def `1`: typings.ndnJs.ndnJsNumbers.`1` = 1.asInstanceOf[typings.ndnJs.ndnJsNumbers.`1`]
  }
}
