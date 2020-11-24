package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "scheduledevents")
@js.native
object scheduledevents extends js.Object {
  
  @js.native
  class IntervalType ()
    extends typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType
  /* static members */
  @js.native
  object IntervalType extends js.Object {
    
    var Day: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Hour: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Minute: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Month: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Second: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Week: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    
    var Year: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
    */
  @js.native
  class ScheduledEvent protected ()
    extends typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.ScheduledEvent {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  /* static members */
  @js.native
  object ScheduledEvent extends js.Object {
    
    /**
      * Creates a new ScheduledEvent unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.ScheduledEvent = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.scheduledeventsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class TimeZoneEnum ()
    extends typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum
  /* static members */
  @js.native
  object TimeZoneEnum extends js.Object {
    
    var Server: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    
    var UTC: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
  }
}
