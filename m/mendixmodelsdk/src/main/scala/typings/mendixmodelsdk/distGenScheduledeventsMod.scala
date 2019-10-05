package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenScheduledeventsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IntervalType
import typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.ScheduledEvent
import typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.TimeZoneEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/scheduledevents", JSImport.Namespace)
@js.native
object distGenScheduledeventsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object scheduledevents extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
      */
    @js.native
    trait IScheduledEvent extends IDocument
    
    @js.native
    class IntervalType () extends AbstractEnum
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/scheduled-events relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenScheduledeventsMod.scheduledevents.IScheduledEvent because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
    class ScheduledEvent protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      var enabled: Boolean = js.native
      var interval: Double = js.native
      var intervalType: IntervalType = js.native
      var microflow: IMicroflow | Null = js.native
      val microflowQualifiedName: String | Null = js.native
      var startDateTime: String = js.native
      var timeZone: TimeZoneEnum = js.native
    }
    
    @js.native
    class TimeZoneEnum () extends AbstractEnum
    
    /* static members */
    @js.native
    object IntervalType extends js.Object {
      var Day: IntervalType = js.native
      var Hour: IntervalType = js.native
      var Minute: IntervalType = js.native
      var Month: IntervalType = js.native
      var Second: IntervalType = js.native
      var Week: IntervalType = js.native
      var Year: IntervalType = js.native
    }
    
    /* static members */
    @js.native
    object ScheduledEvent extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new ScheduledEvent unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ScheduledEvent = js.native
    }
    
    /* static members */
    @js.native
    object TimeZoneEnum extends js.Object {
      var Server: TimeZoneEnum = js.native
      var UTC: TimeZoneEnum = js.native
    }
    
  }
  
}

