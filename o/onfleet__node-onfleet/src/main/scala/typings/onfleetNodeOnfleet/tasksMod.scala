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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tasksMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Tasks", JSImport.Namespace)
  @js.native
  class ^ () extends Task
  
  @js.native
  trait Barcode extends StObject {
    
    /** Whether the worker must capture this data prior to task completion, defaults to false */
    var blockCompletion: js.UndefOr[Boolean] = js.native
    
    /** Base64 representation of the data encoded within the barcode to be captured, max length of 500 characters */
    var data: js.UndefOr[String] = js.native
  }
  object Barcode {
    
    @scala.inline
    def apply(): Barcode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Barcode]
    }
    
    @scala.inline
    implicit class BarcodeMutableBuilder[Self <: Barcode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockCompletion(value: Boolean): Self = StObject.set(x, "blockCompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockCompletionUndefined: Self = StObject.set(x, "blockCompletion", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  @js.native
  trait CapturedBarcode extends StObject {
    
    /** The base64 string of the data contained in the captured barcode */
    var data: js.UndefOr[String] = js.native
    
    /** The ID of the captured barcode */
    var id: String = js.native
    
    /** The [ lon, lat ] coordinates where the barcode capture took place */
    var location: js.Tuple2[Double, Double] = js.native
    
    /** The symbology that was captured */
    var symbology: String = js.native
    
    /** The time at which the barcode capture happened */
    var time: Double = js.native
    
    /** Whether the barcode was captured as a result of a barcode request */
    var wasRequested: Boolean = js.native
  }
  object CapturedBarcode {
    
    @scala.inline
    def apply(
      id: String,
      location: js.Tuple2[Double, Double],
      symbology: String,
      time: Double,
      wasRequested: Boolean
    ): CapturedBarcode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], symbology = symbology.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], wasRequested = wasRequested.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapturedBarcode]
    }
    
    @scala.inline
    implicit class CapturedBarcodeMutableBuilder[Self <: CapturedBarcode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbology(value: String): Self = StObject.set(x, "symbology", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasRequested(value: Boolean): Self = StObject.set(x, "wasRequested", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloneTaskOptions extends StObject {
    
    var includeBarCodes: Boolean = js.native
    
    var includeDependencies: Boolean = js.native
    
    var includeMetadata: Boolean = js.native
    
    var overrides: js.UndefOr[CompleteAfter] = js.native
  }
  object CloneTaskOptions {
    
    @scala.inline
    def apply(includeBarCodes: Boolean, includeDependencies: Boolean, includeMetadata: Boolean): CloneTaskOptions = {
      val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneTaskOptions]
    }
    
    @scala.inline
    implicit class CloneTaskOptionsMutableBuilder[Self <: CloneTaskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeBarCodes(value: Boolean): Self = StObject.set(x, "includeBarCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDependencies(value: Boolean): Self = StObject.set(x, "includeDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeMetadata(value: Boolean): Self = StObject.set(x, "includeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: CompleteAfter): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait CreateTaskProps extends StObject {
    
    var autoAssign: js.UndefOr[TaskAutoAssign] = js.native
    
    var barcodes: js.UndefOr[js.Array[Barcode]] = js.native
    
    var capacity: js.UndefOr[Double] = js.native
    
    var completeAfter: js.UndefOr[Double] = js.native
    
    var completeBefore: js.UndefOr[Double] = js.native
    
    var dependencies: js.UndefOr[js.Array[String]] = js.native
    
    var destination: String | CreateDestinationProps = js.native
    
    var executor: js.UndefOr[String] = js.native
    
    var merchant: js.UndefOr[String] = js.native
    
    var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.native
    
    var notes: js.UndefOr[String] = js.native
    
    var pickupTask: js.UndefOr[Boolean] = js.native
    
    var quantity: js.UndefOr[Double] = js.native
    
    var recipientName: js.UndefOr[String] = js.native
    
    var recipientNotes: js.UndefOr[String] = js.native
    
    var recipientSkipSMSNotifications: js.UndefOr[Boolean] = js.native
    
    var recipients: js.Array[CreateRecipientProps | String] = js.native
    
    var requirements: js.UndefOr[TaskCompletionRequirements] = js.native
  }
  object CreateTaskProps {
    
    @scala.inline
    def apply(destination: String | CreateDestinationProps, recipients: js.Array[CreateRecipientProps | String]): CreateTaskProps = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTaskProps]
    }
    
    @scala.inline
    implicit class CreateTaskPropsMutableBuilder[Self <: CreateTaskProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAssign(value: TaskAutoAssign): Self = StObject.set(x, "autoAssign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignUndefined: Self = StObject.set(x, "autoAssign", js.undefined)
      
      @scala.inline
      def setBarcodes(value: js.Array[Barcode]): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
      
      @scala.inline
      def setBarcodesVarargs(value: Barcode*): Self = StObject.set(x, "barcodes", js.Array(value :_*))
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      @scala.inline
      def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteAfterUndefined: Self = StObject.set(x, "completeAfter", js.undefined)
      
      @scala.inline
      def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteBeforeUndefined: Self = StObject.set(x, "completeBefore", js.undefined)
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setDestination(value: String | CreateDestinationProps): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutorUndefined: Self = StObject.set(x, "executor", js.undefined)
      
      @scala.inline
      def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchantUndefined: Self = StObject.set(x, "merchant", js.undefined)
      
      @scala.inline
      def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickupTaskUndefined: Self = StObject.set(x, "pickupTask", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setRecipientName(value: String): Self = StObject.set(x, "recipientName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientNameUndefined: Self = StObject.set(x, "recipientName", js.undefined)
      
      @scala.inline
      def setRecipientNotes(value: String): Self = StObject.set(x, "recipientNotes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientNotesUndefined: Self = StObject.set(x, "recipientNotes", js.undefined)
      
      @scala.inline
      def setRecipientSkipSMSNotifications(value: Boolean): Self = StObject.set(x, "recipientSkipSMSNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientSkipSMSNotificationsUndefined: Self = StObject.set(x, "recipientSkipSMSNotifications", js.undefined)
      
      @scala.inline
      def setRecipients(value: js.Array[CreateRecipientProps | String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsVarargs(value: (CreateRecipientProps | String)*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      @scala.inline
      def setRequirements(value: TaskCompletionRequirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    }
  }
  
  @js.native
  trait OnfleetTask extends StObject {
    
    var barcodes: js.UndefOr[Captured] = js.native
    
    var completeAfter: Double = js.native
    
    var completeBefore: Double = js.native
    
    var completionDetails: Actions = js.native
    
    var container: Organization = js.native
    
    var creator: String = js.native
    
    var dependencies: js.Array[String] = js.native
    
    var destination: OnfleetDestination = js.native
    
    var didAutoAssign: Boolean = js.native
    
    var executor: String = js.native
    
    var feedback: js.Array[_] = js.native
    
    var id: String = js.native
    
    var identity: Checksum = js.native
    
    var merchant: String = js.native
    
    var metadata: js.Array[OnfleetMetadata] = js.native
    
    var notes: String = js.native
    
    var organization: String = js.native
    
    var overrides: RecipientName = js.native
    
    var pickupTask: Boolean = js.native
    
    var quantity: Double = js.native
    
    var recipients: js.Array[OnfleetRecipient] = js.native
    
    var serviceTime: Double = js.native
    
    var shortId: String = js.native
    
    var state: Double = js.native
    
    var timeCreated: Double = js.native
    
    var timeLastModified: Double = js.native
    
    var trackingURL: String = js.native
    
    var trackingViewed: Boolean = js.native
    
    var worker: String | Null = js.native
  }
  object OnfleetTask {
    
    @scala.inline
    def apply(
      completeAfter: Double,
      completeBefore: Double,
      completionDetails: Actions,
      container: Organization,
      creator: String,
      dependencies: js.Array[String],
      destination: OnfleetDestination,
      didAutoAssign: Boolean,
      executor: String,
      feedback: js.Array[_],
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
      val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetTask]
    }
    
    @scala.inline
    implicit class OnfleetTaskMutableBuilder[Self <: OnfleetTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarcodes(value: Captured): Self = StObject.set(x, "barcodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarcodesUndefined: Self = StObject.set(x, "barcodes", js.undefined)
      
      @scala.inline
      def setCompleteAfter(value: Double): Self = StObject.set(x, "completeAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteBefore(value: Double): Self = StObject.set(x, "completeBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionDetails(value: Actions): Self = StObject.set(x, "completionDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: Organization): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setDestination(value: OnfleetDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidAutoAssign(value: Boolean): Self = StObject.set(x, "didAutoAssign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutor(value: String): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback(value: js.Array[_]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedbackVarargs(value: js.Any*): Self = StObject.set(x, "feedback", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Checksum): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerchant(value: String): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: RecipientName): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPickupTask(value: Boolean): Self = StObject.set(x, "pickupTask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipients(value: js.Array[OnfleetRecipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientsVarargs(value: OnfleetRecipient*): Self = StObject.set(x, "recipients", js.Array(value :_*))
      
      @scala.inline
      def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingURL(value: String): Self = StObject.set(x, "trackingURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingViewed(value: Boolean): Self = StObject.set(x, "trackingViewed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerNull: Self = StObject.set(x, "worker", null)
    }
  }
  
  @js.native
  trait Task extends StObject {
    
    def autoAssign(tasks: js.Array[OnfleetTask]): js.Promise[_] = js.native
    
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
  
  @js.native
  trait TaskAutoAssign extends StObject {
    
    var considerDependencies: js.UndefOr[Boolean] = js.native
    
    var excludeWorkerIds: js.UndefOr[js.Array[String]] = js.native
    
    var maxAssignedTaskCount: js.UndefOr[Double] = js.native
    
    var mode: String = js.native
    
    var team: js.UndefOr[String] = js.native
  }
  object TaskAutoAssign {
    
    @scala.inline
    def apply(mode: String): TaskAutoAssign = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskAutoAssign]
    }
    
    @scala.inline
    implicit class TaskAutoAssignMutableBuilder[Self <: TaskAutoAssign] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConsiderDependencies(value: Boolean): Self = StObject.set(x, "considerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsiderDependenciesUndefined: Self = StObject.set(x, "considerDependencies", js.undefined)
      
      @scala.inline
      def setExcludeWorkerIds(value: js.Array[String]): Self = StObject.set(x, "excludeWorkerIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeWorkerIdsUndefined: Self = StObject.set(x, "excludeWorkerIds", js.undefined)
      
      @scala.inline
      def setExcludeWorkerIdsVarargs(value: String*): Self = StObject.set(x, "excludeWorkerIds", js.Array(value :_*))
      
      @scala.inline
      def setMaxAssignedTaskCount(value: Double): Self = StObject.set(x, "maxAssignedTaskCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAssignedTaskCountUndefined: Self = StObject.set(x, "maxAssignedTaskCount", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamUndefined: Self = StObject.set(x, "team", js.undefined)
    }
  }
  
  @js.native
  trait TaskCompletionRequirements extends StObject {
    
    var minimumAge: js.UndefOr[Double] = js.native
    
    var notes: js.UndefOr[Boolean] = js.native
    
    var photo: js.UndefOr[Boolean] = js.native
    
    var signature: js.UndefOr[Boolean] = js.native
  }
  object TaskCompletionRequirements {
    
    @scala.inline
    def apply(): TaskCompletionRequirements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskCompletionRequirements]
    }
    
    @scala.inline
    implicit class TaskCompletionRequirementsMutableBuilder[Self <: TaskCompletionRequirements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimumAge(value: Double): Self = StObject.set(x, "minimumAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumAgeUndefined: Self = StObject.set(x, "minimumAge", js.undefined)
      
      @scala.inline
      def setNotes(value: Boolean): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
      
      @scala.inline
      def setPhoto(value: Boolean): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
      
      @scala.inline
      def setSignature(value: Boolean): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    }
  }
  
  type TaskQueryKey = shortId
  
  @js.native
  trait TaskQueryParam extends StObject {
    
    var completeAfterAfter: js.UndefOr[Double] = js.native
    
    var completeBeforeBefore: js.UndefOr[Double] = js.native
    
    var dependencies: js.UndefOr[String] = js.native
    
    var from: Double = js.native
    
    var lastId: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[Double] = js.native
    
    var worker: js.UndefOr[String] = js.native
  }
  object TaskQueryParam {
    
    @scala.inline
    def apply(from: Double): TaskQueryParam = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskQueryParam]
    }
    
    @scala.inline
    implicit class TaskQueryParamMutableBuilder[Self <: TaskQueryParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleteAfterAfter(value: Double): Self = StObject.set(x, "completeAfterAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteAfterAfterUndefined: Self = StObject.set(x, "completeAfterAfter", js.undefined)
      
      @scala.inline
      def setCompleteBeforeBefore(value: Double): Self = StObject.set(x, "completeBeforeBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteBeforeBeforeUndefined: Self = StObject.set(x, "completeBeforeBefore", js.undefined)
      
      @scala.inline
      def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastId(value: String): Self = StObject.set(x, "lastId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIdUndefined: Self = StObject.set(x, "lastId", js.undefined)
      
      @scala.inline
      def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  @js.native
  trait UpdateTaskResult extends OnfleetTask {
    
    var estimatedArrivalTime: Double | Null = js.native
    
    var estimatedCompletionTime: Double | Null = js.native
    
    var eta: Double = js.native
  }
  object UpdateTaskResult {
    
    @scala.inline
    def apply(
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
      feedback: js.Array[_],
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
      val __obj = js.Dynamic.literal(completeAfter = completeAfter.asInstanceOf[js.Any], completeBefore = completeBefore.asInstanceOf[js.Any], completionDetails = completionDetails.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], didAutoAssign = didAutoAssign.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], pickupTask = pickupTask.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], shortId = shortId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], trackingURL = trackingURL.asInstanceOf[js.Any], trackingViewed = trackingViewed.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTaskResult]
    }
    
    @scala.inline
    implicit class UpdateTaskResultMutableBuilder[Self <: UpdateTaskResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEstimatedArrivalTime(value: Double): Self = StObject.set(x, "estimatedArrivalTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedArrivalTimeNull: Self = StObject.set(x, "estimatedArrivalTime", null)
      
      @scala.inline
      def setEstimatedCompletionTime(value: Double): Self = StObject.set(x, "estimatedCompletionTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimatedCompletionTimeNull: Self = StObject.set(x, "estimatedCompletionTime", null)
      
      @scala.inline
      def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    }
  }
}
