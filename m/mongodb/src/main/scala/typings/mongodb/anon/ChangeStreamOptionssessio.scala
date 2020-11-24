package typings.mongodb.anon

import typings.bson.mod.Timestamp
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollationDocument
import typings.mongodb.mod.ReadPreferenceOrMode
import typings.mongodb.mod.ResumeToken
import typings.mongodb.mongodbStrings.default_
import typings.mongodb.mongodbStrings.updateLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mongodb.mongodb.ChangeStreamOptions & {  session :mongodb.mongodb.ClientSession | undefined} */
@js.native
trait ChangeStreamOptionssessio extends js.Object {
  
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
  implicit class ChangeStreamOptionssessioOps[Self <: ChangeStreamOptionssessio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setFullDocument(value: default_ | updateLookup): Self = this.set("fullDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullDocument: Self = this.set("fullDocument", js.undefined)
    
    @scala.inline
    def setMaxAwaitTimeMS(value: Double): Self = this.set("maxAwaitTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAwaitTimeMS: Self = this.set("maxAwaitTimeMS", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setResumeAfter(value: ResumeToken): Self = this.set("resumeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeAfter: Self = this.set("resumeAfter", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setStartAfter(value: ResumeToken): Self = this.set("startAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAfter: Self = this.set("startAfter", js.undefined)
    
    @scala.inline
    def setStartAtOperationTime(value: Timestamp): Self = this.set("startAtOperationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAtOperationTime: Self = this.set("startAtOperationTime", js.undefined)
  }
}
