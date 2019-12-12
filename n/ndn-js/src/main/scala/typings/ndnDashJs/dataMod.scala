package typings.ndnDashJs

import org.scalablytyped.runtime.TopLevel
import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.dataMod.ContentType
import typings.ndnDashJs.dataMod.ContentType.BLOB
import typings.ndnDashJs.dataMod.ContentType.KEY
import typings.ndnDashJs.dataMod.ContentType.LINK
import typings.ndnDashJs.dataMod.ContentType.NACK
import typings.ndnDashJs.dataMod.ContentType.OTHER_CODE
import typings.ndnDashJs.dataMod.Data
import typings.ndnDashJs.dataMod.MetaInfo
import typings.ndnDashJs.nameMod.Name
import typings.ndnDashJs.nameMod.Name.Component
import typings.ndnDashJs.signatureMod.Signature
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/data", JSImport.Namespace)
@js.native
object dataMod extends js.Object {
  @js.native
  sealed trait ContentType extends js.Object
  
  @js.native
  class Data () extends js.Object {
    def this(data: Data) = this()
    def this(name: String) = this()
    def this(name: Name) = this()
    def getCongestionMark(): Double = js.native
    def getContent(): Blob = js.native
    def getFullName(): Name = js.native
    def getIncomingFaceId(): Double = js.native
    def getMetaInfo(): MetaInfo = js.native
    def getName(): Name = js.native
    def getSignature(): Signature = js.native
    def setContent(content: Blob): Data = js.native
    def setContent(content: Buffer): Data = js.native
    def setMetaInfo(meta: MetaInfo): Data = js.native
    def setName(name: Name): Data = js.native
    def setSignature(sig: Signature): Data = js.native
    def wireDecode(input: Blob): Unit = js.native
    def wireDecode(input: Buffer): Unit = js.native
    def wireEncode(): Blob = js.native
  }
  
  @js.native
  class MetaInfo () extends js.Object {
    def this(meta: MetaInfo) = this()
    def getFinalBlockId(): Component = js.native
    def getFreshnessPeriod(): Double = js.native
    def getOtherTypeCode(): Double = js.native
    def getType(): ContentType = js.native
    def setFinalBlockId(comp: Component): Unit = js.native
    def setFreshnessPeriod(freshness: Double): Unit = js.native
    def setOtherTypeCode(otherTypeCode: Double): Unit = js.native
    def setType(`type`: ContentType): Unit = js.native
  }
  
  @js.native
  object ContentType extends js.Object {
    @js.native
    sealed trait BLOB extends ContentType
    
    @js.native
    sealed trait KEY extends ContentType
    
    @js.native
    sealed trait LINK extends ContentType
    
    @js.native
    sealed trait NACK extends ContentType
    
    @js.native
    sealed trait OTHER_CODE extends ContentType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType with Double] = js.native
    /* 0 */ @js.native
    object BLOB extends TopLevel[BLOB with Double]
    
    /* 2 */ @js.native
    object KEY extends TopLevel[KEY with Double]
    
    /* 1 */ @js.native
    object LINK extends TopLevel[LINK with Double]
    
    /* 3 */ @js.native
    object NACK extends TopLevel[NACK with Double]
    
    /* 0x7fff */ @js.native
    object OTHER_CODE extends TopLevel[OTHER_CODE with Double]
    
  }
  
}

