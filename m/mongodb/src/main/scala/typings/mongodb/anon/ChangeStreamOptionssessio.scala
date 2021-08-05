package typings.mongodb.anon

import typings.bson.mod.Timestamp
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollationDocument
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.ResumeToken
import typings.mongodb.mongodbStrings.default_
import typings.mongodb.mongodbStrings.updateLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.ChangeStreamOptions & {  session :mongodb.mongodb.ClientSession | undefined} */
trait ChangeStreamOptionssessio extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var fullDocument: js.UndefOr[default_ | updateLookup] = js.undefined
  
  var maxAwaitTimeMS: js.UndefOr[Double] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
  
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var startAtOperationTime: js.UndefOr[Timestamp] = js.undefined
}
object ChangeStreamOptionssessio {
  
  inline def apply(): ChangeStreamOptionssessio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptionssessio]
  }
  
  extension [Self <: ChangeStreamOptionssessio](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFullDocument(value: default_ | updateLookup): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    inline def setMaxAwaitTimeMS(value: Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setResumeAfter(value: ResumeToken): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    inline def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setStartAfter(value: ResumeToken): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    inline def setStartAtOperationTime(value: Timestamp): Self = StObject.set(x, "startAtOperationTime", value.asInstanceOf[js.Any])
    
    inline def setStartAtOperationTimeUndefined: Self = StObject.set(x, "startAtOperationTime", js.undefined)
  }
}
