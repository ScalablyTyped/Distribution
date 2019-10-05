package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "scheduledevents")
@js.native
object scheduledevents extends js.Object {
  @js.native
  class IntervalType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.scheduledevents.IntervalType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
    */
  @js.native
  class ScheduledEvent protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.scheduledevents.ScheduledEvent {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class TimeZoneEnum ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.scheduledevents.TimeZoneEnum
  
  /* static members */
  @js.native
  object IntervalType extends js.Object {
    var Day: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    var Hour: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    var Minute: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    var Month: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    var Second: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    var Week: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
    var Year: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType = js.native
  }
  
  /* static members */
  @js.native
  object ScheduledEvent extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenScheduledeventsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ScheduledEvent unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.ScheduledEvent = js.native
  }
  
  /* static members */
  @js.native
  object TimeZoneEnum extends js.Object {
    var Server: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    var UTC: typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
  }
  
}

