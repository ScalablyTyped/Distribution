package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GdataCompositeMedia extends StObject {
  
  /** gdata */
  var blobRef: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var blobstore2Info: js.UndefOr[GdataBlobstore2Info] = js.undefined
  
  /** gdata */
  var cosmoBinaryReference: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var crc32cHash: js.UndefOr[Double] = js.undefined
  
  /** gdata */
  var `inline`: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var length: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var md5Hash: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var objectId: js.UndefOr[GdataObjectId] = js.undefined
  
  /** gdata */
  var path: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var referenceType: js.UndefOr[String] = js.undefined
  
  /** gdata */
  var sha1Hash: js.UndefOr[String] = js.undefined
}
object GdataCompositeMedia {
  
  inline def apply(): GdataCompositeMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataCompositeMedia]
  }
  
  extension [Self <: GdataCompositeMedia](x: Self) {
    
    inline def setBlobRef(value: String): Self = StObject.set(x, "blobRef", value.asInstanceOf[js.Any])
    
    inline def setBlobRefUndefined: Self = StObject.set(x, "blobRef", js.undefined)
    
    inline def setBlobstore2Info(value: GdataBlobstore2Info): Self = StObject.set(x, "blobstore2Info", value.asInstanceOf[js.Any])
    
    inline def setBlobstore2InfoUndefined: Self = StObject.set(x, "blobstore2Info", js.undefined)
    
    inline def setCosmoBinaryReference(value: String): Self = StObject.set(x, "cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    inline def setCosmoBinaryReferenceUndefined: Self = StObject.set(x, "cosmoBinaryReference", js.undefined)
    
    inline def setCrc32cHash(value: Double): Self = StObject.set(x, "crc32cHash", value.asInstanceOf[js.Any])
    
    inline def setCrc32cHashUndefined: Self = StObject.set(x, "crc32cHash", js.undefined)
    
    inline def setInline(value: String): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setObjectId(value: GdataObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReferenceType(value: String): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
    
    inline def setReferenceTypeUndefined: Self = StObject.set(x, "referenceType", js.undefined)
    
    inline def setSha1Hash(value: String): Self = StObject.set(x, "sha1Hash", value.asInstanceOf[js.Any])
    
    inline def setSha1HashUndefined: Self = StObject.set(x, "sha1Hash", js.undefined)
  }
}
