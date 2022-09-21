package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Tasks
import typings.onfleetNodeOnfleet.destinationsMod.Location
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.BICYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.CAR
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.MOTORCYCLE
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.TRUCK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teamsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Teams", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Team
  
  trait AutoDispatchTeamProps extends StObject {
    
    /**
      * Time in Minutes a task can be late.
      * Default value is 10, must be above 0.
      */
    var maxAllowedDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Total number of tasks allowed on a route. Cannot be negative Integer. Default 100, cannot exceed 200.
      */
    var maxTasksPerRoute: js.UndefOr[Double] = js.undefined
    
    /**
      * Where the route will end. Valid values and their meaning:
      * * "teams://DEFAULT" - Team’s hub
      * * "workers://ROUTING_ADDRESS" - worker routing address
      * * "hub://" - return to a specific hub
      * * "null" - end anywhere
      */
    var routeEnd: js.UndefOr[String] = js.undefined
    
    /**
      * This is the Driver's scheduled time window.
      * Param must be an array of length 2 in unix time in seconds precision, [start, end].
      * The default value is is [now, now + 6 hours].
      * The start value cannot start more than 3 hours ago in the past.
      * The ending value cannot be in the past and cannot end more than 16 hours into the future.
      * The total time frame cannot be longer than 16 hours.
      */
    var scheduleTimeWindow: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /**
      * The default service time to apply in Minutes to the tasks when no task service time exists.
      * Default is 2.
      */
    var serviceTime: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the time window of tasks to include in the optimization.
      * Param must be an array of length 2 in unix time in seconds precision, [start, end].
      * The default value is [now - 4 hours, now + 4 hours].
      * The end time cannot be in the past and cannot be more than 12 hours into the future.
      * The total time frame cannot be longer than 16 hours.
      */
    var taskTimeWindow: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object AutoDispatchTeamProps {
    
    inline def apply(): AutoDispatchTeamProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoDispatchTeamProps]
    }
    
    extension [Self <: AutoDispatchTeamProps](x: Self) {
      
      inline def setMaxAllowedDelay(value: Double): Self = StObject.set(x, "maxAllowedDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxAllowedDelayUndefined: Self = StObject.set(x, "maxAllowedDelay", js.undefined)
      
      inline def setMaxTasksPerRoute(value: Double): Self = StObject.set(x, "maxTasksPerRoute", value.asInstanceOf[js.Any])
      
      inline def setMaxTasksPerRouteUndefined: Self = StObject.set(x, "maxTasksPerRoute", js.undefined)
      
      inline def setRouteEnd(value: String): Self = StObject.set(x, "routeEnd", value.asInstanceOf[js.Any])
      
      inline def setRouteEndUndefined: Self = StObject.set(x, "routeEnd", js.undefined)
      
      inline def setScheduleTimeWindow(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scheduleTimeWindow", value.asInstanceOf[js.Any])
      
      inline def setScheduleTimeWindowUndefined: Self = StObject.set(x, "scheduleTimeWindow", js.undefined)
      
      inline def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
      
      inline def setServiceTimeUndefined: Self = StObject.set(x, "serviceTime", js.undefined)
      
      inline def setTaskTimeWindow(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "taskTimeWindow", value.asInstanceOf[js.Any])
      
      inline def setTaskTimeWindowUndefined: Self = StObject.set(x, "taskTimeWindow", js.undefined)
    }
  }
  
  trait AutoDispatchTeamResult extends StObject {
    
    var dispatchId: String
  }
  object AutoDispatchTeamResult {
    
    inline def apply(dispatchId: String): AutoDispatchTeamResult = {
      val __obj = js.Dynamic.literal(dispatchId = dispatchId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoDispatchTeamResult]
    }
    
    extension [Self <: AutoDispatchTeamResult](x: Self) {
      
      inline def setDispatchId(value: String): Self = StObject.set(x, "dispatchId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @prop managers - An array of managing administrator IDs.
    * @prop name - A unique name for the team.
    * @prop workers - An array of worker IDs.
    * @prop hub - Optional. The ID of the team's hub.
    */
  trait CreateTeamProps extends StObject {
    
    var hub: js.UndefOr[String] = js.undefined
    
    var managers: js.Array[String]
    
    var name: String
    
    var workers: js.Array[String]
  }
  object CreateTeamProps {
    
    inline def apply(managers: js.Array[String], name: String, workers: js.Array[String]): CreateTeamProps = {
      val __obj = js.Dynamic.literal(managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateTeamProps]
    }
    
    extension [Self <: CreateTeamProps](x: Self) {
      
      inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value*))
    }
  }
  
  trait GetWorkerETAProps extends StObject {
    
    /**
      * Must be in the format: longitude,latitude.
      * Request must have at least 1 of: dropoffLocation or pickupLocation
      */
    var dropoffLocation: js.UndefOr[String] = js.undefined
    
    /**
      * Must be in the format: longitude,latitude.
      * Request must have at least 1 of: dropoffLocation or pickupLocation
      */
    var pickupLocation: js.UndefOr[String] = js.undefined
    
    /**
      * If the request includes pickupLocation, pickupTime must be present if the time is fewer than 3 hours in the future.
      * Format: unix epoch time.
      */
    var pickupTime: js.UndefOr[Double] = js.undefined
    
    /**
      * Vehicle types to ignore in the query. Valid vehicle types are CAR, MOTORCYCLE, BICYCLE, TRUCK
      */
    var restrictedVehicleTypes: js.UndefOr[BICYCLE | CAR | MOTORCYCLE | TRUCK] = js.undefined
    
    /**
      * The expected time a worker will take at the pickupLocation, dropoffLocation,
      * or both (as applicable)
      * * Unit: seconds
      * * Default: 120
      */
    var serviceTime: js.UndefOr[Double] = js.undefined
  }
  object GetWorkerETAProps {
    
    inline def apply(): GetWorkerETAProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWorkerETAProps]
    }
    
    extension [Self <: GetWorkerETAProps](x: Self) {
      
      inline def setDropoffLocation(value: String): Self = StObject.set(x, "dropoffLocation", value.asInstanceOf[js.Any])
      
      inline def setDropoffLocationUndefined: Self = StObject.set(x, "dropoffLocation", js.undefined)
      
      inline def setPickupLocation(value: String): Self = StObject.set(x, "pickupLocation", value.asInstanceOf[js.Any])
      
      inline def setPickupLocationUndefined: Self = StObject.set(x, "pickupLocation", js.undefined)
      
      inline def setPickupTime(value: Double): Self = StObject.set(x, "pickupTime", value.asInstanceOf[js.Any])
      
      inline def setPickupTimeUndefined: Self = StObject.set(x, "pickupTime", js.undefined)
      
      inline def setRestrictedVehicleTypes(value: BICYCLE | CAR | MOTORCYCLE | TRUCK): Self = StObject.set(x, "restrictedVehicleTypes", value.asInstanceOf[js.Any])
      
      inline def setRestrictedVehicleTypesUndefined: Self = StObject.set(x, "restrictedVehicleTypes", js.undefined)
      
      inline def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
      
      inline def setServiceTimeUndefined: Self = StObject.set(x, "serviceTime", js.undefined)
    }
  }
  
  trait GetWorkerEtaResult extends StObject {
    
    var steps: js.Array[NavigationStep]
    
    var vehicle: BICYCLE | CAR | MOTORCYCLE | TRUCK
    
    var workerId: String
  }
  object GetWorkerEtaResult {
    
    inline def apply(steps: js.Array[NavigationStep], vehicle: BICYCLE | CAR | MOTORCYCLE | TRUCK, workerId: String): GetWorkerEtaResult = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWorkerEtaResult]
    }
    
    extension [Self <: GetWorkerEtaResult](x: Self) {
      
      inline def setSteps(value: js.Array[NavigationStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: NavigationStep*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setVehicle(value: BICYCLE | CAR | MOTORCYCLE | TRUCK): Self = StObject.set(x, "vehicle", value.asInstanceOf[js.Any])
      
      inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationStep extends StObject {
    
    var arrivalTime: Double
    
    var completionTime: Double
    
    var distance: Double
    
    var location: Location
    
    var serviceTime: Double
    
    var travelTime: Double
  }
  object NavigationStep {
    
    inline def apply(
      arrivalTime: Double,
      completionTime: Double,
      distance: Double,
      location: Location,
      serviceTime: Double,
      travelTime: Double
    ): NavigationStep = {
      val __obj = js.Dynamic.literal(arrivalTime = arrivalTime.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], serviceTime = serviceTime.asInstanceOf[js.Any], travelTime = travelTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationStep]
    }
    
    extension [Self <: NavigationStep](x: Self) {
      
      inline def setArrivalTime(value: Double): Self = StObject.set(x, "arrivalTime", value.asInstanceOf[js.Any])
      
      inline def setCompletionTime(value: Double): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setServiceTime(value: Double): Self = StObject.set(x, "serviceTime", value.asInstanceOf[js.Any])
      
      inline def setTravelTime(value: Double): Self = StObject.set(x, "travelTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnfleetTeam extends StObject {
    
    var hub: String
    
    var id: String
    
    var managers: js.Array[String]
    
    var name: String
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var workers: js.Array[String]
  }
  object OnfleetTeam {
    
    inline def apply(
      hub: String,
      id: String,
      managers: js.Array[String],
      name: String,
      timeCreated: Double,
      timeLastModified: Double,
      workers: js.Array[String]
    ): OnfleetTeam = {
      val __obj = js.Dynamic.literal(hub = hub.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any], workers = workers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetTeam]
    }
    
    extension [Self <: OnfleetTeam](x: Self) {
      
      inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      inline def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value*))
    }
  }
  
  @js.native
  trait Team extends StObject {
    
    def autoDispatch(id: String): js.Promise[AutoDispatchTeamResult] = js.native
    def autoDispatch(id: String, obj: AutoDispatchTeamProps): js.Promise[AutoDispatchTeamResult] = js.native
    
    def create(obj: Any): js.Promise[OnfleetTeam] = js.native
    
    def deleteOne(id: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[js.Array[OnfleetTeam]] = js.native
    def get(id: String): js.Promise[OnfleetTeam] = js.native
    
    def getWorkerEta(id: String): js.Promise[GetWorkerEtaResult] = js.native
    def getWorkerEta(id: String, obj: GetWorkerETAProps): js.Promise[GetWorkerEtaResult] = js.native
    
    def insertTask(id: String, obj: Tasks): js.Promise[OnfleetTeam] = js.native
    
    def update(id: String, obj: UpdateTeamProps): js.Promise[OnfleetTeam] = js.native
  }
  
  trait UpdateTeamProps extends StObject {
    
    var hub: js.UndefOr[String] = js.undefined
    
    var managers: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var workers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UpdateTeamProps {
    
    inline def apply(): UpdateTeamProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTeamProps]
    }
    
    extension [Self <: UpdateTeamProps](x: Self) {
      
      inline def setHub(value: String): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersUndefined: Self = StObject.set(x, "managers", js.undefined)
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setWorkers(value: js.Array[String]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
      
      inline def setWorkersVarargs(value: String*): Self = StObject.set(x, "workers", js.Array(value*))
    }
  }
}
