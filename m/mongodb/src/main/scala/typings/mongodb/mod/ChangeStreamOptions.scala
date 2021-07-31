package typings.mongodb.mod

import typings.mongodb.mongodbStrings.default_
import typings.mongodb.mongodbStrings.updateLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamOptions extends StObject {
  
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var fullDocument: js.UndefOr[default_ | updateLookup] = js.undefined
  
  var maxAwaitTimeMS: js.UndefOr[scala.Double] = js.undefined
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  
  var startAtOperationTime: js.UndefOr[typings.bson.mod.Timestamp] = js.undefined
}
object ChangeStreamOptions {
  
  @scala.inline
  def apply(): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptions]
  }
  
  @scala.inline
  implicit class ChangeStreamOptionsMutableBuilder[Self <: ChangeStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
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
    def setMaxAwaitTimeMS(value: scala.Double): Self = StObject.set(x, "maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
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
    def setStartAfter(value: ResumeToken): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    @scala.inline
    def setStartAtOperationTime(value: typings.bson.mod.Timestamp): Self = StObject.set(x, "startAtOperationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAtOperationTimeUndefined: Self = StObject.set(x, "startAtOperationTime", js.undefined)
  }
}
