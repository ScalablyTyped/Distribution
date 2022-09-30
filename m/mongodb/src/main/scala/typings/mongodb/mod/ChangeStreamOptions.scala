package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamOptions
  extends StObject
     with AggregateOptions {
  
  /**
    * Allowed values: 'updateLookup', 'whenAvailable', 'required'.
    *
    * When set to 'updateLookup', the change notification for partial updates
    * will include both a delta describing the changes to the document as well
    * as a copy of the entire document that was changed from some time after
    * the change occurred.
    *
    * When set to 'whenAvailable', configures the change stream to return the
    * post-image of the modified document for replace and update change events
    * if the post-image for this event is available.
    *
    * When set to 'required', the same behavior as 'whenAvailable' except that
    * an error is raised if the post-image is not available.
    */
  var fullDocument: js.UndefOr[String] = js.undefined
  
  /**
    * Allowed values: 'whenAvailable', 'required', 'off'.
    *
    * The default is to not send a value, which is equivalent to 'off'.
    *
    * When set to 'whenAvailable', configures the change stream to return the
    * pre-image of the modified document for replace, update, and delete change
    * events if it is available.
    *
    * When set to 'required', the same behavior as 'whenAvailable' except that
    * an error is raised if the pre-image is not available.
    */
  var fullDocumentBeforeChange: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to start a changeStream after a specified event.
    * @see https://docs.mongodb.com/manual/changeStreams/#resumeafter-for-change-streams
    */
  var resumeAfter: js.UndefOr[ResumeToken] = js.undefined
  
  /**
    * When enabled, configures the change stream to include extra change events.
    *
    * - createIndexes
    * - dropIndexes
    * - modify
    * - create
    * - shardCollection
    * - reshardCollection
    * - refineCollectionShardKey
    */
  var showExpandedEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Similar to resumeAfter, but will allow you to start after an invalidated event.
    * @see https://docs.mongodb.com/manual/changeStreams/#startafter-for-change-streams
    */
  var startAfter: js.UndefOr[ResumeToken] = js.undefined
  
  /** Will start the changeStream after the specified operationTime. */
  var startAtOperationTime: js.UndefOr[OperationTime] = js.undefined
}
object ChangeStreamOptions {
  
  inline def apply(): ChangeStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeStreamOptions]
  }
  
  extension [Self <: ChangeStreamOptions](x: Self) {
    
    inline def setFullDocument(value: String): Self = StObject.set(x, "fullDocument", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChange(value: String): Self = StObject.set(x, "fullDocumentBeforeChange", value.asInstanceOf[js.Any])
    
    inline def setFullDocumentBeforeChangeUndefined: Self = StObject.set(x, "fullDocumentBeforeChange", js.undefined)
    
    inline def setFullDocumentUndefined: Self = StObject.set(x, "fullDocument", js.undefined)
    
    inline def setResumeAfter(value: ResumeToken): Self = StObject.set(x, "resumeAfter", value.asInstanceOf[js.Any])
    
    inline def setResumeAfterUndefined: Self = StObject.set(x, "resumeAfter", js.undefined)
    
    inline def setShowExpandedEvents(value: Boolean): Self = StObject.set(x, "showExpandedEvents", value.asInstanceOf[js.Any])
    
    inline def setShowExpandedEventsUndefined: Self = StObject.set(x, "showExpandedEvents", js.undefined)
    
    inline def setStartAfter(value: ResumeToken): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    inline def setStartAtOperationTime(value: OperationTime): Self = StObject.set(x, "startAtOperationTime", value.asInstanceOf[js.Any])
    
    inline def setStartAtOperationTimeUndefined: Self = StObject.set(x, "startAtOperationTime", js.undefined)
  }
}
