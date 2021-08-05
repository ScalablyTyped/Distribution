package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Actions
import typings.onfleetNodeOnfleet.anon.Captured
import typings.onfleetNodeOnfleet.anon.Checksum
import typings.onfleetNodeOnfleet.anon.CompleteAfter
import typings.onfleetNodeOnfleet.anon.Organization
import typings.onfleetNodeOnfleet.anon.PartialCreateTaskProps
import typings.onfleetNodeOnfleet.anon.RecipientName
import typings.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps
import typings.onfleetNodeOnfleet.destinationsMod.OnfleetDestination
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.shortId
import typings.onfleetNodeOnfleet.recipientsMod.CreateRecipientProps
import typings.onfleetNodeOnfleet.recipientsMod.OnfleetRecipient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Tasks", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Task
  
  trait Barcode extends StObject {
    
    /** Whether the worker must capture this data prior to task completion, defaults to false */
    var blockCompletion: js.UndefOr[Boolean] = js.undefined
    
    /** Base64 representation of the data encoded within the barcode to be captured, max length of 500 characters */
    var data: js.UndefOr[String] = js.undefined
  }
  object Barcode {
    
    inline def apply(): Barcode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Barcode]
    }
    
    extension [Self <: Barcode](x: Self) {
      
      inline def setBlockCompletion(value: Boolean): Self = StObject.set(x, "blockCompletion", value.asInstanceOf[js.Any])
      
      inline def setBlockCompletionUndefined: Self = StObject.set(x, "blockCompletion", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  trait CapturedBarcode extends StObject {
    
    /** The base64 string of the data contained in the captured barcode */
    var data: js.UndefOr[String] = js.undefined
    
    /** The ID of the captured barcode */
    var id: String
    
    /** The [ lon, lat ] coordinates where the barcode capture took place */
    var location: js.Tuple2[Double, Double]
    
    /** The symbology that was captured */
    var symbology: String
    
    /** The time at which the barcode capture happened */
    var time: Double
    
    /** Whether the barcode was captured as a result of a barcode request */
    var wasRequested: Boolean
  }
  object CapturedBarcode {
    
    inline def apply(
      id: String,
      location: js.Tuple2[Double, Double],
      symbology: String,
      time: Double,
      wasRequested: Boolean
    ): CapturedBarcode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], symbology = symbology.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], wasRequested = wasRequested.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapturedBarcode]
    }
    
    extension [Self <: CapturedBarcode](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setSymbology(value: String): Self = StObject.set(x, "symbology", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setWasRequested(value: Boolean): Self = StObject.set(x, "wasRequested", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloneTaskOptions extends StObject {
    
    var includeBarCodes: Boolean
    
    var includeDependencies: Boolean
    
    var includeMetadata: Boolean
    
    var overrides: js.UndefOr[CompleteAfter] = js.undefined
  }
  object CloneTaskOptions {
    
    inline def apply(includeBarCodes: Boolean, includeDependencies: Boolean, includeMetadata: Boolean): CloneTaskOptions = {
      val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneTaskOptions]
    }
    
    extension [Self <: CloneTaskOptions](x: Self) {
      
      inline def setIncludeBarCodes(value: Boolean): Self = StObject.set(x, "includeBarCodes", value.asInstanceOf[js.Any])
      
      inline def setIncludeDependencies(value: Boolean): Self = StObject.set(x, "includeDependencies", value.asInstanceOf[js.Any])
      
      inline def setIncludeMetadata(value: Boolean): Self = StObject.set(x, "includeMetadata", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: CompleteAfter): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait CreateTaskProps extends StObject {
    
    var autoAssign: js.UndefOr[TaskAutoAssign] = js.undefined
    
    var barcodes: js.UndefOr[js.Array[Barcode]] = js.undefined
    
    var capacity: js.UndefOr[Double] = js.undefined
    
    var completeAfter: js.UndefOr[Double] = js.undefined
    
    var completeBefore: js.UndefOr[Double] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var destination: String | CreateDestinationProps
    
    var executor: js.UndefOr[String] = js.undefined
    
    var merchant: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
    
    var notes: js.UndefOr[String] = js.undefined
    
    var pickupTask: js.UndefOr[Boolean] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
    
    var recipientName: js.UndefOr[String] = js.undefined
    
    var recipientNotes: js.UndefOr[String] = js.undefined
    
    var recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.undefined
    
    var recipients: js.Array[CreateRecipientProps | String]
    
    var requirements: js.UndefOr[TaskCompletionRequirements] = js.undefined
  }
  object CreateTaskProps {
    
    inline def apply(destination: String | CreateDestinationProps, recipients: js.Array[CreateRecipientProps | String]): CreateTaskProps = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTaskProps]
    }
    
    extension [Self <: CreateTaskProps](x: Self) {
      
      inline def setAutoAssign(value: TaskAutoAssign): Self = StObject.set(x, "autoAssign", value.asInstanceOf[js.Any])
      
      inline def setAutoAssignUndefined: Self = StObject.set(x, "autoAssign", js.undefined)
      
      inline def setBarcodes(value: js.Array[Barcode]): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
      
      inline def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
      
      inline def setBarcodesVarargs(value: Barcode*): Self = StObject.set(x, "barcodes", js.Array(value :_*))
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
      
      inline def setCompleteAfterUndefined: Self = StObject.set(x, "completeAfter", js.undefined)
      
      inline def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
      
      inline def setCompleteBeforeUndefined: Self = StObject.set(x, "completeBefore", js.undefined)
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setDestination(value: String | CreateDestinationProps): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      inline def setExecutorUndefined: Self = StObject.set(x, "executor", js.undefined)
      
      inline def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
      
      inline def setMerchantUndefined: Self = StObject.set(x, "merchant", js.undefined)
      
      inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
      
      inline def setPickupTaskUndefined: Self = StObject.set(x, "pickupTask", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
      
      inline def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
      
      inline def setRecipientNotes(value: String): Self = StObject.set(x, "recipientNotes", value.asInstanceOf[js.Any])
      
      inline def setRecipientNotesUndefined: Self = StObject.set(x, "recipientNotes", js.undefined)
      
      inline def setRecipientSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
      
      inline def setRecipientSkipSMSNotificationsUndefined: Self = StObject.set(x, "recipientSkipSMSNotifications", js.undefined)
      
      inline def setRecipients(value: js.Array[CreateRecipientProps | String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsVarargs(value: (CreateRecipientProps | String)*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      inline def setRequirements(value: TaskCompletionRequirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    }
  }
  
  trait OnfleetTask extends StObject {
    
    var barcodes: js.UndefOr[Captured] = js.undefined
    
    var completeAfter: Double
    
    var completeBefore: Double
    
    var completionDetails: Actions
    
    var container: Organization
    
    var creator: String
    
    var dependencies: js.Array[String]
    
    var destination: OnfleetDestination
    
    var didAutoAssign: Boolean
    
    var executor: String
    
    var feedback: js.Array[js.Any]
    
    var id: String
    
    var identity: Checksum
    
    var merchant: String
    
    var metadata: js.Array[OnfleetMetadata]
    
    var notes: String
    
    var organization: String
    
    var overrides: RecipientName
    
    var pickupTask: Boolean
    
    var quantity: Double
    
    var recipients: js.Array[OnfleetRecipient]
    
    var serviceTime: Double
    
    var shortId: String
    
    var state: Double
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var trackingURL: String
    
    var trackingViewed: Boolean
    
    var worker: String | Null
  }
  object OnfleetTask {
    
    inline def apply(
      completeAfter: Double,
      completeBefore: Double,
      completionDetails: Actions,
      container: Organization,
      creator: String,
      dependencies: js.Array[String],
      destination: OnfleetDestination,
      didAutoAssign: Boolean,
      executor: String,
      feedback: js.Array[js.Any],
      id: String,
      identity: Checksum,
      merchant: String,
      metadata: js.Array[OnfleetMetadata],
      notes: String,
      organization: String,
      overrides: RecipientName,
      pickupTask: Boolean,
      quantity: Double,
      recipients: js.Array[OnfleetRecipient],
      serviceTime: Double,
      shortId: String,
      state: Double,
      timeCreated: Double,
      timeLastModified: Double,
      trackingURL: String,
      trackingViewed: Boolean
    ): OnfleetTask = {
      val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any], worker = null)
      __obj.asInstanceOf[OnfleetTask]
    }
    
    extension [Self <: OnfleetTask](x: Self) {
      
      inline def setBarcodes(value: Captured): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
      
      inline def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
      
      inline def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
      
      inline def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
      
      inline def setCompletionDetails(value: Actions): Self = StObject.set(x, "completionDetails", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: Organization): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setDestination(value: OnfleetDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDidAutoAssign(value: Boolean): Self = StObject.set(x, "didAutoAssign", value.asInstanceOf[js.Any])
      
      inline def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      inline def setFeedback(value: js.Array[js.Any]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
      
      inline def setFeedbackVarargs(value: js.Any*): Self = StObject.set(x, "feedback", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Checksum): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: RecipientName): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setRecipients(value: js.Array[OnfleetRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsVarargs(value: OnfleetRecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      inline def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
      
      inline def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
      
      inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      inline def setTrackingURL(value: String): Self = StObject.set(x, "trackingURL", value.asInstanceOf[js.Any])
      
      inline def setTrackingViewed(value: Boolean): Self = StObject.set(x, "trackingViewed", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerNull: Self = StObject.set(x, "worker", null)
    }
  }
  
  @js.native
  trait Task extends StObject {
    
    def autoAssign(tasks: js.Array[OnfleetTask]): js.Promise[js.Any] = js.native
    
    // TODO need to confirm response
    def batchCreate(tasks: js.Array[CreateTaskProps]): js.Promise[js.Array[OnfleetTask]] = js.native
    
    def clone(id: String): js.Promise[OnfleetTask] = js.native
    
    def create(task: CreateTaskProps): js.Promise[OnfleetTask] = js.native
    
    def deleteOne(id: String): js.Promise[Double] = js.native
    
    def forceComplete(id: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[js.Array[OnfleetTask]] = js.native
    def get(queryOrId: String): js.Promise[OnfleetTask] = js.native
    def get(queryOrId: String, queryKey: TaskQueryKey): js.Promise[OnfleetTask] = js.native
    def get(queryParams: TaskQueryParam): js.Promise[js.Array[OnfleetTask]] = js.native
    
    def update(id: String, task: PartialCreateTaskProps): js.Promise[UpdateTaskResult] = js.native
  }
  
  trait TaskAutoAssign extends StObject {
    
    var considerDependencies: js.UndefOr[Boolean] = js.undefined
    
    var excludeWorkerIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxAssignedTaskCount: js.UndefOr[Double] = js.undefined
    
    var mode: String
    
    var team: js.UndefOr[String] = js.undefined
  }
  object TaskAutoAssign {
    
    inline def apply(mode: String): TaskAutoAssign = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskAutoAssign]
    }
    
    extension [Self <: TaskAutoAssign](x: Self) {
      
      inline def setConsiderDependencies(value: Boolean): Self = StObject.set(x, "considerDependencies", value.asInstanceOf[js.Any])
      
      inline def setConsiderDependenciesUndefined: Self = StObject.set(x, "considerDependencies", js.undefined)
      
      inline def setExcludeWorkerIds(value: js.Array[String]): Self = StObject.set(x, "excludeWorkerIds", value.asInstanceOf[js.Any])
      
      inline def setExcludeWorkerIdsUndefined: Self = StObject.set(x, "excludeWorkerIds", js.undefined)
      
      inline def setExcludeWorkerIdsVarargs(value: String*): Self = StObject.set(x, "excludeWorkerIds", js.Array(value :_*))
      
      inline def setMaxAssignedTaskCount(value: Double): Self = StObject.set(x, "maxAssignedTaskCount", value.asInstanceOf[js.Any])
      
      inline def setMaxAssignedTaskCountUndefined: Self = StObject.set(x, "maxAssignedTaskCount", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      inline def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  trait TaskCompletionRequirements extends StObject {
    
    var minimumAge: js.UndefOr[Double] = js.undefined
    
    var notes: js.UndefOr[Boolean] = js.undefined
    
    var photo: js.UndefOr[Boolean] = js.undefined
    
    var signature: js.UndefOr[Boolean] = js.undefined
  }
  object TaskCompletionRequirements {
    
    inline def apply(): TaskCompletionRequirements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskCompletionRequirements]
    }
    
    extension [Self <: TaskCompletionRequirements](x: Self) {
      
      inline def setMinimumAge(value: Double): Self = StObject.set(x, "minimumAge", value.asInstanceOf[js.Any])
      
      inline def setMinimumAgeUndefined: Self = StObject.set(x, "minimumAge", js.undefined)
      
      inline def setNotes(value: Boolean): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      inline def setPhoto(value: Boolean): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
      
      inline def setSignature(value: Boolean): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    }
  }
  
  type TaskQueryKey = shortId
  
  trait TaskQueryParam extends StObject {
    
    var completeAfterAfter: js.UndefOr[Double] = js.undefined
    
    var completeBeforeBefore: js.UndefOr[Double] = js.undefined
    
    var dependencies: js.UndefOr[String] = js.undefined
    
    var from: Double
    
    var lastId: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
    
    var worker: js.UndefOr[String] = js.undefined
  }
  object TaskQueryParam {
    
    inline def apply(from: Double): TaskQueryParam = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueryParam]
    }
    
    extension [Self <: TaskQueryParam](x: Self) {
      
      inline def setCompleteAfterAfter(value: Double): Self = StObject.set(x, "completeAfterAfter", value.asInstanceOf[js.Any])
      
      inline def setCompleteAfterAfterUndefined: Self = StObject.set(x, "completeAfterAfter", js.undefined)
      
      inline def setCompleteBeforeBefore(value: Double): Self = StObject.set(x, "completeBeforeBefore", value.asInstanceOf[js.Any])
      
      inline def setCompleteBeforeBeforeUndefined: Self = StObject.set(x, "completeBeforeBefore", js.undefined)
      
      inline def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setLastId(value: String): Self = StObject.set(x, "lastId", value.asInstanceOf[js.Any])
      
      inline def setLastIdUndefined: Self = StObject.set(x, "lastId", js.undefined)
      
      inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  trait UpdateTaskResult
    extends StObject
       with OnfleetTask {
    
    var estimatedArrivalTime: Double | Null
    
    var estimatedCompletionTime: Double | Null
    
    var eta: Double
  }
  object UpdateTaskResult {
    
    inline def apply(
      completeAfter: Double,
      completeBefore: Double,
      completionDetails: Actions,
      container: Organization,
      creator: String,
      dependencies: js.Array[String],
      destination: OnfleetDestination,
      didAutoAssign: Boolean,
      eta: Double,
      executor: String,
      feedback: js.Array[js.Any],
      id: String,
      identity: Checksum,
      merchant: String,
      metadata: js.Array[OnfleetMetadata],
      notes: String,
      organization: String,
      overrides: RecipientName,
      pickupTask: Boolean,
      quantity: Double,
      recipients: js.Array[OnfleetRecipient],
      serviceTime: Double,
      shortId: String,
      state: Double,
      timeCreated: Double,
      timeLastModified: Double,
      trackingURL: String,
      trackingViewed: Boolean
    ): UpdateTaskResult = {
      val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any], estimatedArrivalTime = null, estimatedCompletionTime = null, worker = null)
      __obj.asInstanceOf[UpdateTaskResult]
    }
    
    extension [Self <: UpdateTaskResult](x: Self) {
      
      inline def setEstimatedArrivalTime(value: Double): Self = StObject.set(x, "estimatedArrivalTime", value.asInstanceOf[js.Any])
      
      inline def setEstimatedArrivalTimeNull: Self = StObject.set(x, "estimatedArrivalTime", null)
      
      inline def setEstimatedCompletionTime(value: Double): Self = StObject.set(x, "estimatedCompletionTime", value.asInstanceOf[js.Any])
      
      inline def setEstimatedCompletionTimeNull: Self = StObject.set(x, "estimatedCompletionTime", null)
      
      inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    }
  }
}
