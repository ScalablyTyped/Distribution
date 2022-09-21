package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.AppVersion
import typings.onfleetNodeOnfleet.anon.Entries
import typings.onfleetNodeOnfleet.anon.Tasks
import typings.onfleetNodeOnfleet.anon.Workers
import typings.onfleetNodeOnfleet.destinationsMod.Location
import typings.onfleetNodeOnfleet.metadataMod.MatchMetadata
import typings.onfleetNodeOnfleet.metadataMod.MatchMetadataResult
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.BICYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.CAR
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.MOTORCYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TRUCK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workersMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Workers", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Worker
  
  /**
    * @prop name - The worker’s complete name.
    * @prop phone - A valid phone number as per the worker’s organization’s country.
    * @prop teams - One or more team IDs of which the worker is a member.
    * @prop vehicle - Optional. The worker’s vehicle; providing no vehicle details is equivalent to the worker being on foot.
    * @prop capacity - Optional. The maximum number of units this worker can carry, for route optimization purposes.
    * @prop displayName - Optional. This value is used in place of the worker's actual name within sms notifications,
    * delivery tracking pages, and across organization boundaries (connections).
    */
  trait CreateWorkerProps extends StObject {
    
    var capacity: js.UndefOr[Double] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var phone: String
    
    var teams: String
    
    var vehicle: js.UndefOr[Vehicle] = js.undefined
  }
  object CreateWorkerProps {
    
    inline def apply(name: String, phone: String, teams: String): CreateWorkerProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateWorkerProps]
    }
    
    extension [Self <: CreateWorkerProps](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: String): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setVehicle(value: Vehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      inline def setVehicleUndefined: Self = StObject.set(x, "vehicle", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped [@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Longitude, @onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Destinations.Latitude] */ trait GetWorkerByLocationProps extends StObject {
    
    var radius: js.UndefOr[Double] = js.undefined
  }
  object GetWorkerByLocationProps {
    
    inline def apply(): GetWorkerByLocationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWorkerByLocationProps]
    }
    
    extension [Self <: GetWorkerByLocationProps](x: Self) {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    }
  }
  
  /**
    * @prop filter - Optional. A comma-separated list of fields to return, if all are not desired. For example, name, location
    * @prop phones - Optional. A comma-separated list of workers' phone numbers.
    * @prop states - Optional. A comma-separated list of worker states, where 0 is off-duty,
    * 1 is idle (on-duty, no active task) and 2 is active (on-duty, active task).
    * @prop teams - Optional. A comma-separated list of the team IDs that workers must be part of.
    */
  trait GetWorkerQueryProps extends StObject {
    
    var filter: js.UndefOr[String] = js.undefined
    
    var phones: js.UndefOr[String] = js.undefined
    
    var states: js.UndefOr[String] = js.undefined
    
    var teams: js.UndefOr[String] = js.undefined
  }
  object GetWorkerQueryProps {
    
    inline def apply(): GetWorkerQueryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWorkerQueryProps]
    }
    
    extension [Self <: GetWorkerQueryProps](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPhones(value: String): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
      
      inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
      
      inline def setStates(value: String): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
      
      inline def setTeams(value: String): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    }
  }
  
  trait OnfleetWorker extends StObject {
    
    var accountStatus: String
    
    var activeTask: String | Null
    
    var capacity: Double
    
    var delayTime: Double | Null
    
    var displayName: String
    
    var id: String
    
    var imageUrl: String | Null
    
    var location: Location
    
    var metadata: js.Array[OnfleetMetadata]
    
    var name: String
    
    var onDuty: Boolean
    
    var organization: String
    
    var phone: String
    
    var tasks: js.Array[String]
    
    var teams: js.Array[String]
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var timeLastSeen: Double
    
    var userData: AppVersion
    
    var vehicle: Vehicle | Null
  }
  object OnfleetWorker {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(accountStatus = accountStatus.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onDuty = onDuty.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], timeLastSeen = timeLastSeen.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], activeTask = null, delayTime = null, imageUrl = null, vehicle = null)
      __obj.asInstanceOf[OnfleetWorker]
    }
    
    extension [Self <: OnfleetWorker](x: Self) {
      
      inline def setAccountStatus(value: String): Self = StObject.set(x, "accountStatus", value.asInstanceOf[js.Any])
      
      inline def setActiveTask(value: String): Self = StObject.set(x, "activeTask", value.asInstanceOf[js.Any])
      
      inline def setActiveTaskNull: Self = StObject.set(x, "activeTask", null)
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
      
      inline def setDelayTimeNull: Self = StObject.set(x, "delayTime", null)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDuty(value: Boolean): Self = StObject.set(x, "onDuty", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
      
      inline def setTeams(value: js.Array[String]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setTeamsVarargs(value: String*): Self = StObject.set(x, "teams", js.Array(value*))
      
      inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      inline def setTimeLastSeen(value: Double): Self = StObject.set(x, "timeLastSeen", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: AppVersion): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setVehicle(value: Vehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      inline def setVehicleNull: Self = StObject.set(x, "vehicle", null)
    }
  }
  
  trait UpdateWorkerProps extends StObject {
    
    var capacity: js.UndefOr[Double] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[OnfleetMetadata] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var teams: js.UndefOr[String] = js.undefined
    
    var vehicle: js.UndefOr[Vehicle] = js.undefined
  }
  object UpdateWorkerProps {
    
    inline def apply(): UpdateWorkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWorkerProps]
    }
    
    extension [Self <: UpdateWorkerProps](x: Self) {
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setMetadata(value: OnfleetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTeams(value: String): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
      
      inline def setVehicle(value: Vehicle): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      inline def setVehicleUndefined: Self = StObject.set(x, "vehicle", js.undefined)
    }
  }
  
  trait Vehicle extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var licensePlate: js.UndefOr[String] = js.undefined
    
    var `type`: BICYCLE | CAR | MOTORCYCLE | TRUCK
  }
  object Vehicle {
    
    inline def apply(`type`: BICYCLE | CAR | MOTORCYCLE | TRUCK): Vehicle = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vehicle]
    }
    
    extension [Self <: Vehicle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLicensePlate(value: String): Self = StObject.set(x, "licensePlate", value.asInstanceOf[js.Any])
      
      inline def setLicensePlateUndefined: Self = StObject.set(x, "licensePlate", js.undefined)
      
      inline def setType(value: BICYCLE | CAR | MOTORCYCLE | TRUCK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    def matchMetadata(obj: js.Array[OnfleetMetadata]): js.Promise[js.Array[MatchMetadataResult]] = js.native
    @JSName("matchMetadata")
    var matchMetadata_Original: MatchMetadata[js.Array[OnfleetMetadata]] = js.native
    
    def setSchedule(id: String, schedule: WorkerSchedule): js.Promise[Entries] = js.native
    
    def update(id: String, worker: UpdateWorkerProps): js.Promise[OnfleetWorker] = js.native
  }
  
  trait WorkerSchedule extends StObject {
    
    var date: String
    
    var shifts: js.Array[js.Tuple2[Double, Double]]
    
    var timezone: String
  }
  object WorkerSchedule {
    
    inline def apply(date: String, shifts: js.Array[js.Tuple2[Double, Double]], timezone: String): WorkerSchedule = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], shifts = shifts.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerSchedule]
    }
    
    extension [Self <: WorkerSchedule](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setShifts(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "shifts", value.asInstanceOf[js.Any])
      
      inline def setShiftsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "shifts", js.Array(value*))
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    }
  }
}
