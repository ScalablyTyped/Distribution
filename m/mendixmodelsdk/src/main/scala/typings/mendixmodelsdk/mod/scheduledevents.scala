package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduledevents {
  
  @JSImport("mendixmodelsdk", "scheduledevents.IntervalType")
  @js.native
  class IntervalType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.scheduledevents.IntervalType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IntervalType {
    
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Day")
    @js.native
    def Day: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Day_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Hour")
    @js.native
    def Hour: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Hour_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hour")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Minute")
    @js.native
    def Minute: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Minute_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Month")
    @js.native
    def Month: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Month_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Second")
    @js.native
    def Second: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Second_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Second")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Week")
    @js.native
    def Week: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Week_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.IntervalType.Year")
    @js.native
    def Year: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType = js.native
    inline def Year_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent")
  @js.native
  class ScheduledEvent protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.scheduledevents.ScheduledEvent {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ScheduledEvent {
    
    @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ScheduledEvent unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.ScheduledEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.ScheduledEvent]
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.ScheduledEvent.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.scheduledeventsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.scheduledeventsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum")
  @js.native
  class TimeZoneEnum protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.scheduledevents.TimeZoneEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object TimeZoneEnum {
    
    @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum.Server")
    @js.native
    def Server: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    inline def Server_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "scheduledevents.TimeZoneEnum.UTC")
    @js.native
    def UTC: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum = js.native
    inline def UTC_=(x: typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  }
}
