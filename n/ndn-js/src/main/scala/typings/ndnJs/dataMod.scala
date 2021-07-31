package typings.ndnJs

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.nameMod.Name
import typings.ndnJs.nameMod.Name.Component
import typings.ndnJs.signatureMod.Signature
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @js.native
  sealed trait ContentType extends StObject
  @JSImport("ndn-js/data", "ContentType")
  @js.native
  object ContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentType & Double] = js.native
    
    @js.native
    sealed trait BLOB
      extends StObject
         with ContentType
    /* 0 */ val BLOB: typings.ndnJs.dataMod.ContentType.BLOB & Double = js.native
    
    @js.native
    sealed trait KEY
      extends StObject
         with ContentType
    /* 2 */ val KEY: typings.ndnJs.dataMod.ContentType.KEY & Double = js.native
    
    @js.native
    sealed trait LINK
      extends StObject
         with ContentType
    /* 1 */ val LINK: typings.ndnJs.dataMod.ContentType.LINK & Double = js.native
    
    @js.native
    sealed trait NACK
      extends StObject
         with ContentType
    /* 3 */ val NACK: typings.ndnJs.dataMod.ContentType.NACK & Double = js.native
    
    @js.native
    sealed trait OTHER_CODE
      extends StObject
         with ContentType
    /* 0x7fff */ val OTHER_CODE: typings.ndnJs.dataMod.ContentType.OTHER_CODE & Double = js.native
  }
  
  @JSImport("ndn-js/data", "Data")
  @js.native
  class Data () extends StObject {
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
  
  @JSImport("ndn-js/data", "MetaInfo")
  @js.native
  class MetaInfo () extends StObject {
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
}
