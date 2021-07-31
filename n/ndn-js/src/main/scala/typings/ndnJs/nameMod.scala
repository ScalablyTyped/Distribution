package typings.ndnJs

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.nameMod.Name.Component
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nameMod {
  
  @js.native
  sealed trait ComponentType extends StObject
  @JSImport("ndn-js/name", "ComponentType")
  @js.native
  object ComponentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ComponentType & Double] = js.native
    
    @js.native
    sealed trait GENERIC
      extends StObject
         with ComponentType
    /* 8 */ val GENERIC: typings.ndnJs.nameMod.ComponentType.GENERIC & Double = js.native
    
    @js.native
    sealed trait IMPLICIT_SHA256_DIGEST
      extends StObject
         with ComponentType
    /* 1 */ val IMPLICIT_SHA256_DIGEST: typings.ndnJs.nameMod.ComponentType.IMPLICIT_SHA256_DIGEST & Double = js.native
    
    @js.native
    sealed trait OTHER_CODE
      extends StObject
         with ComponentType
    /* 0x7fff */ val OTHER_CODE: typings.ndnJs.nameMod.ComponentType.OTHER_CODE & Double = js.native
    
    @js.native
    sealed trait PARAMETERS_SHA256_DIGEST
      extends StObject
         with ComponentType
    /* 2 */ val PARAMETERS_SHA256_DIGEST: typings.ndnJs.nameMod.ComponentType.PARAMETERS_SHA256_DIGEST & Double = js.native
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
    def append(value: String, `type`: Unit, otherTypeCode: Double): Name = js.native
    def append(value: String, `type`: ComponentType): Name = js.native
    def append(value: String, `type`: ComponentType, otherTypeCode: Double): Name = js.native
    def append(value: js.Array[Double]): Name = js.native
    def append(value: js.Array[Double], `type`: Unit, otherTypeCode: Double): Name = js.native
    def append(value: js.Array[Double], `type`: ComponentType): Name = js.native
    def append(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double): Name = js.native
    def append(value: Blob): Name = js.native
    def append(value: Blob, `type`: Unit, otherTypeCode: Double): Name = js.native
    def append(value: Blob, `type`: ComponentType): Name = js.native
    def append(value: Blob, `type`: ComponentType, otherTypeCode: Double): Name = js.native
    def append(value: ArrayBuffer): Name = js.native
    def append(value: ArrayBuffer, `type`: Unit, otherTypeCode: Double): Name = js.native
    def append(value: ArrayBuffer, `type`: ComponentType): Name = js.native
    def append(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double): Name = js.native
    def append(value: Uint8Array): Name = js.native
    def append(value: Uint8Array, `type`: Unit, otherTypeCode: Double): Name = js.native
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
    def compare(
      iStartComponent: Double,
      nComponents: Double,
      other: Name,
      iOtherStartComponent: Unit,
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
    
    @JSImport("ndn-js/name", "Name")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ndn-js/name", "Name.Component")
    @js.native
    class Component () extends StObject {
      def this(component: Component) = this()
      def this(value: String) = this()
      def this(value: js.Array[Double]) = this()
      def this(value: Blob) = this()
      def this(value: ArrayBuffer) = this()
      def this(value: Uint8Array) = this()
      def this(value: String, `type`: ComponentType) = this()
      def this(value: js.Array[Double], `type`: ComponentType) = this()
      def this(value: Unit, `type`: ComponentType) = this()
      def this(value: Blob, `type`: ComponentType) = this()
      def this(value: ArrayBuffer, `type`: ComponentType) = this()
      def this(value: Uint8Array, `type`: ComponentType) = this()
      def this(value: String, `type`: Unit, otherTypeCode: Double) = this()
      def this(value: String, `type`: ComponentType, otherTypeCode: Double) = this()
      def this(value: js.Array[Double], `type`: Unit, otherTypeCode: Double) = this()
      def this(value: js.Array[Double], `type`: ComponentType, otherTypeCode: Double) = this()
      def this(value: Unit, `type`: Unit, otherTypeCode: Double) = this()
      def this(value: Unit, `type`: ComponentType, otherTypeCode: Double) = this()
      def this(value: Blob, `type`: Unit, otherTypeCode: Double) = this()
      def this(value: Blob, `type`: ComponentType, otherTypeCode: Double) = this()
      def this(value: ArrayBuffer, `type`: Unit, otherTypeCode: Double) = this()
      def this(value: ArrayBuffer, `type`: ComponentType, otherTypeCode: Double) = this()
      def this(value: Uint8Array, `type`: Unit, otherTypeCode: Double) = this()
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
      
      @JSImport("ndn-js/name", "Name.Component")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @scala.inline
      def fromImplicitSha256Digest(digest: Blob): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImplicitSha256Digest")(digest.asInstanceOf[js.Any]).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromNumber(number: Double): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[Component]
      @scala.inline
      def fromNumber(number: Double, `type`: Unit, otherTypeCode: Double): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], otherTypeCode.asInstanceOf[js.Any])).asInstanceOf[Component]
      @scala.inline
      def fromNumber(number: Double, `type`: ComponentType): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Component]
      @scala.inline
      def fromNumber(number: Double, `type`: ComponentType, otherTypeCode: Double): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], otherTypeCode.asInstanceOf[js.Any])).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromNumberWithMarker(number: Double, marker: Double): Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumberWithMarker")(number.asInstanceOf[js.Any], marker.asInstanceOf[js.Any])).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromParametersSha256Digest(digest: Blob): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParametersSha256Digest")(digest.asInstanceOf[js.Any]).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromSegment(segment: Double): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegment")(segment.asInstanceOf[js.Any]).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromSegmentOffset(segmentOffset: Double): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegmentOffset")(segmentOffset.asInstanceOf[js.Any]).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromSequenceNumber(sequenceNumber: Double): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSequenceNumber")(sequenceNumber.asInstanceOf[js.Any]).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromTimestamp(timestamp: Double): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTimestamp")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Component]
      
      /* static member */
      @scala.inline
      def fromVersion(version: Double): Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Component]
    }
    
    @scala.inline
    def fromEscapedString(uri: String): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEscapedString")(uri.asInstanceOf[js.Any]).asInstanceOf[Name]
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
