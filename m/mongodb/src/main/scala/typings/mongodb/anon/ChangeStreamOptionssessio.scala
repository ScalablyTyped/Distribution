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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.ChangeStreamOptions & {  session :mongodb.mongodb.ClientSession | undefined} */
@js.native
trait ChangeStreamOptionssessio extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var fullDocument: js.UndefOr[default_ | updateLookup] = js.native
  
  var maxAwaitTimeMS: js.UndefOr[Double] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var resumeAfter: js.UndefOr[ResumeToken] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
  
  var startAfter: js.UndefOr[ResumeToken] = js.native
  
  var startAtOperationTime: js.UndefOr[Timestamp] = js.native
}
object ChangeStreamOptionssessio {
  
  @scala.inline
  def apply(): ChangeStreamOptionssessio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptionssessio]
  }
  
  @scala.inline
  implicit class ChangeStreamOptionssessioMutableBuilder[Self <: ChangeStreamOptionssessio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setFullDocument(value: default_ | updateLookup): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    @scala.inline
    def setMaxAwaitTimeMS(value: Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAwaitTimeMSUndefined: Self = StObject.set(x, "maxAwaitTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setResumeAfter(value: ResumeToken): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    @scala.inline
    def setStartAfter(value: ResumeToken): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    @scala.inline
    def setStartAtOperationTime(value: Timestamp): Self = StObject.set(x, "startAtOperationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAtOperationTimeUndefined: Self = StObject.set(x, "startAtOperationTime", js.undefined)
  }
}
