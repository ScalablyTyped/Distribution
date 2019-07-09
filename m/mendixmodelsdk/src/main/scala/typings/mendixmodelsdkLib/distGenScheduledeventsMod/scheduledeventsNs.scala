package typings
package mendixmodelsdkLib.distGenScheduledeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents")
@js.native
object scheduledeventsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
    */
  @js.native
  trait IScheduledEvent
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  @js.native
  class IntervalType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.IScheduledEvent because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class ScheduledEvent protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var enabled: scala.Boolean = js.native
    var interval: scala.Double = js.native
    var intervalType: IntervalType = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    var startDateTime: java.lang.String = js.native
    var timeZone: TimeZoneEnum = js.native
  }
  
  @js.native
  class TimeZoneEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object TimeZoneEnum extends js.Object {
    var Server: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.TimeZoneEnum = js.native
    var UTC: mendixmodelsdkLib.distGenScheduledeventsMod.scheduledeventsNs.TimeZoneEnum = js.native
  }
  
}

