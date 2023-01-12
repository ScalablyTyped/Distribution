package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeOptions extends StObject {
  
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  var collation: js.UndefOr[CollationOptions] = js.undefined
  
  var fullDocument: js.UndefOr[String] = js.undefined
  
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreference] = js.undefined
  
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var startAtOperationTime: js.UndefOr[typings.bson.mod.Timestamp] = js.undefined
}
object ResumeOptions {
  
  inline def apply(): ResumeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeOptions] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setCollation(value: CollationOptions): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFullDocument(value: String): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    inline def setMaxAwaitTimeMS(value: scala.Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    inline def setReadPreference(value: ReadPreference): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setResumeAfter(value: ResumeToken): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    inline def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
    
    inline def setStartAfter(value: ResumeToken): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    inline def setStartAtOperationTime(value: typings.bson.mod.Timestamp): Self = StObject.set(x, "startAtOperationTime", value.asInstanceOf[js.Any])
    
    inline def setStartAtOperationTimeUndefined: Self = StObject.set(x, "startAtOperationTime", js.undefined)
  }
}
