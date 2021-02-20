package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.AppVersion
import typings.onfleetNodeOnfleet.anon.Entries
import typings.onfleetNodeOnfleet.anon.Tasks
import typings.onfleetNodeOnfleet.anon.Workers
import typings.onfleetNodeOnfleet.destinationsMod.Location
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.BICYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.CAR
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.MOTORCYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TRUCK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workersMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Workers", JSImport.Namespace)
  @js.native
  class ^ () extends Worker
  
  /**
    * @prop name - The worker’s complete name.
    * @prop phone - A valid phone number as per the worker’s organization’s country.
    * @prop teams - One or more team IDs of which the worker is a member.
    * @prop vehicle - Optional. The worker’s vehicle; providing no vehicle details is equivalent to the worker being on foot.
    * @prop capacity - Optional. The maximum number of units this worker can carry, for route optimization purposes.
    * @prop displayName - Optional. This value is used in place of the worker's actual name within sms notifications,
    * delivery tracking pages, and across organization boundaries (connections).
    */
  @js.native
  trait CreateWorkerProps extends StObject {
    
    var capacity: js.UndefOr[Double] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var phone: String = js.native
    
    var teams: String = js.native
    
    var vehicle: js.UndefOr[Vehicle] = js.native
  }
  object CreateWorkerProps {
    
    @scala.inline
    def apply(name: String, phone: String, teams: String): CreateWorkerProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateWorkerProps]
    }
    
    @scala.inline
    implicit class CreateWorkerPropsMutableBuilder[Self <: CreateWorkerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeams(value: String): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicle(value: Vehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicleUndefined: Self = StObject.set(x, "vehicle", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped [@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Longitude, @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Latitude] */ @js.native
  trait GetWorkerByLocationProps extends StObject {
    
    var radius: js.UndefOr[Double] = js.native
  }
  object GetWorkerByLocationProps {
    
    @scala.inline
    def apply(): GetWorkerByLocationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWorkerByLocationProps]
    }
    
    @scala.inline
    implicit class GetWorkerByLocationPropsMutableBuilder[Self <: GetWorkerByLocationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  /**
    * @prop filter - Optional. A comma-separated list of fields to return, if all are not desired. For example, name, location
    * @prop phones - Optional. A comma-separated list of workers' phone numbers.
    * @prop states - Optional. A comma-separated list of worker states, where 0 is off-duty,
    * 1 is idle (on-duty, no active task) and 2 is active (on-duty, active task).
    * @prop teams - Optional. A comma-separated list of the team IDs that workers must be part of.
    */
  @js.native
  trait GetWorkerQueryProps extends StObject {
    
    var filter: js.UndefOr[String] = js.native
    
    var phones: js.UndefOr[String] = js.native
    
    var states: js.UndefOr[String] = js.native
    
    var teams: js.UndefOr[String] = js.native
  }
  object GetWorkerQueryProps {
    
    @scala.inline
    def apply(): GetWorkerQueryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWorkerQueryProps]
    }
    
    @scala.inline
    implicit class GetWorkerQueryPropsMutableBuilder[Self <: GetWorkerQueryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setPhones(value: String): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
      
      @scala.inline
      def setStates(value: String): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
      
      @scala.inline
      def setTeams(value: String): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    }
  }
  
  @js.native
  trait OnfleetWorker extends StObject {
    
    var accountStatus: String = js.native
    
    var activeTask: String | Null = js.native
    
    var capacity: Double = js.native
    
    var delayTime: Double | Null = js.native
    
    var displayName: String = js.native
    
    var id: String = js.native
    
    var imageUrl: String | Null = js.native
    
    var location: Location = js.native
    
    var metadata: js.Array[OnfleetMetadata] = js.native
    
    var name: String = js.native
    
    var onDuty: Boolean = js.native
    
    var organization: String = js.native
    
    var phone: String = js.native
    
    var tasks: js.Array[String] = js.native
    
    var teams: js.Array[String] = js.native
    
    var timeCreated: Double = js.native
    
    var timeLastModified: Double = js.native
    
    var timeLastSeen: Double = js.native
    
    var userData: AppVersion = js.native
    
    var vehicle: Vehicle | Null = js.native
  }
  object OnfleetWorker {
    
    @scala.inline
    def apply(
      accountStatus: String,
      capacity: Double,
      displayName: String,
      id: String,
      location: Location,
      metadata: js.Array[OnfleetMetadata],
      name: String,
      onDuty: Boolean,
      organization: String,
      phone: String,
      tasks: js.Array[String],
      teams: js.Array[String],
      timeCreated: Double,
      timeLastModified: Double,
      timeLastSeen: Double,
      userData: AppVersion
    ): OnfleetWorker = {
      val __obj = js.Dynamic.literal(accountStatus = accountStatus.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onDuty = onDuty.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timeLastSeen = timeLastSeen.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetWorker]
    }
    
    @scala.inline
    implicit class OnfleetWorkerMutableBuilder[Self <: OnfleetWorker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountStatus(value: String): Self = StObject.set(x, "accountStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTask(value: String): Self = StObject.set(x, "activeTask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTaskNull: Self = StObject.set(x, "activeTask", null)
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTimeNull: Self = StObject.set(x, "delayTime", null)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDuty(value: Boolean): Self = StObject.set(x, "onDuty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value :_*))
      
      @scala.inline
      def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value :_*))
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastSeen(value: Double): Self = StObject.set(x, "timeLastSeen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserData(value: AppVersion): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicle(value: Vehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicleNull: Self = StObject.set(x, "vehicle", null)
    }
  }
  
  @js.native
  trait UpdateWorkerProps extends StObject {
    
    var capacity: js.UndefOr[Double] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var metadata: js.UndefOr[OnfleetMetadata] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var teams: js.UndefOr[String] = js.native
    
    var vehicle: js.UndefOr[Vehicle] = js.native
  }
  object UpdateWorkerProps {
    
    @scala.inline
    def apply(): UpdateWorkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWorkerProps]
    }
    
    @scala.inline
    implicit class UpdateWorkerPropsMutableBuilder[Self <: UpdateWorkerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setMetadata(value: OnfleetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTeams(value: String): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
      
      @scala.inline
      def setVehicle(value: Vehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVehicleUndefined: Self = StObject.set(x, "vehicle", js.undefined)
    }
  }
  
  @js.native
  trait Vehicle extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var licensePlate: js.UndefOr[String] = js.native
    
    var `type`: BICYCLE | CAR | MOTORCYCLE | TRUCK = js.native
  }
  object Vehicle {
    
    @scala.inline
    def apply(`type`: BICYCLE | CAR | MOTORCYCLE | TRUCK): Vehicle = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vehicle]
    }
    
    @scala.inline
    implicit class VehicleMutableBuilder[Self <: Vehicle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLicensePlate(value: String): Self = StObject.set(x, "licensePlate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicensePlateUndefined: Self = StObject.set(x, "licensePlate", js.undefined)
      
      @scala.inline
      def setType(value: BICYCLE | CAR | MOTORCYCLE | TRUCK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Worker extends StObject {
    
    def create(worker: CreateWorkerProps): js.Promise[OnfleetWorker] = js.native
    
    def deleteOne(id: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[js.Array[OnfleetWorker]] = js.native
    def get(id: String): js.Promise[OnfleetWorker] = js.native
    def get(id: String, query: GetWorkerQueryProps): js.Promise[OnfleetWorker] = js.native
    
    def getByLocation(location: GetWorkerByLocationProps): js.Promise[Workers] = js.native
    
    def getSchedule(id: String): js.Promise[Entries] = js.native
    
    def insertTask(id: String, obj: Tasks): js.Promise[OnfleetWorker] = js.native
    
    def setSchedule(id: String, schedule: WorkerSchedule): js.Promise[Entries] = js.native
    
    def update(id: String, worker: UpdateWorkerProps): js.Promise[OnfleetWorker] = js.native
  }
  
  @js.native
  trait WorkerSchedule extends StObject {
    
    var date: String = js.native
    
    var shifts: js.Array[js.Tuple2[Double, Double]] = js.native
    
    var timezone: String = js.native
  }
  object WorkerSchedule {
    
    @scala.inline
    def apply(date: String, shifts: js.Array[js.Tuple2[Double, Double]], timezone: String): WorkerSchedule = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], shifts = shifts.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerSchedule]
    }
    
    @scala.inline
    implicit class WorkerScheduleMutableBuilder[Self <: WorkerSchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShifts(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "shifts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "shifts", js.Array(value :_*))
      
      @scala.inline
      def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
