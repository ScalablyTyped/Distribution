package typings.onfleetNodeOnfleet.workersMod

import typings.onfleetNodeOnfleet.anon.AppVersion
import typings.onfleetNodeOnfleet.destinationsMod.Location
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfleetWorker extends js.Object {
  
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
  implicit class OnfleetWorkerOps[Self <: OnfleetWorker] (val x: Self) extends AnyVal {
    
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
    def setAccountStatus(value: String): Self = this.set("accountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataVarargs(value: OnfleetMetadata*): Self = this.set("metadata", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: js.Array[OnfleetMetadata]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDuty(value: Boolean): Self = this.set("onDuty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: String*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: js.Array[String]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamsVarargs(value: String*): Self = this.set("teams", js.Array(value :_*))
    
    @scala.inline
    def setTeams(value: js.Array[String]): Self = this.set("teams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreated(value: Double): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLastModified(value: Double): Self = this.set("timeLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLastSeen(value: Double): Self = this.set("timeLastSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: AppVersion): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTask(value: String): Self = this.set("activeTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTaskNull: Self = this.set("activeTask", null)
    
    @scala.inline
    def setDelayTime(value: Double): Self = this.set("delayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayTimeNull: Self = this.set("delayTime", null)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlNull: Self = this.set("imageUrl", null)
    
    @scala.inline
    def setVehicle(value: Vehicle): Self = this.set("vehicle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleNull: Self = this.set("vehicle", null)
  }
}
