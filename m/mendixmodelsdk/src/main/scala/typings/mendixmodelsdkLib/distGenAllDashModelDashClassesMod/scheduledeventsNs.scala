package typings
package mendixmodelsdkLib.distGenAllDashModelDashClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "scheduledevents")
@js.native
object scheduledeventsNs extends js.Object {
  @js.native
  class IntervalType ()
    extends mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
       */
  @js.native
  class ScheduledEvent protected ()
    extends mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.ScheduledEvent {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  class TimeZoneEnum ()
    extends mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.TimeZoneEnum
  
  @js.native
  object IntervalType extends js.Object {
    var Day: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
    var Hour: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
    var Minute: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
    var Month: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
    var Second: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
    var Week: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
    var Year: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IntervalType = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
       */
  @js.native
  object ScheduledEvent extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenScheduledeventsMod.StructureVersionInfo = js.native
    /**
             * Creates a new ScheduledEvent unit in the SDK and on the server.
             * Expects one argument, the projects.IFolderBase in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.ScheduledEvent = js.native
  }
  
  @js.native
  object TimeZoneEnum extends js.Object {
    var Server: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.TimeZoneEnum = js.native
    var UTC: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.TimeZoneEnum = js.native
  }
  
}

