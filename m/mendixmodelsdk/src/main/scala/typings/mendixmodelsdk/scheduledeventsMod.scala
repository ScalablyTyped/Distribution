package typings.mendixmodelsdk

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduledeventsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object scheduledevents {
    
    @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType")
    @js.native
    class IntervalType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object IntervalType {
      
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Day")
      @js.native
      def Day: IntervalType = js.native
      @scala.inline
      def Day_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Hour")
      @js.native
      def Hour: IntervalType = js.native
      @scala.inline
      def Hour_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hour")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Minute")
      @js.native
      def Minute: IntervalType = js.native
      @scala.inline
      def Minute_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minute")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Month")
      @js.native
      def Month: IntervalType = js.native
      @scala.inline
      def Month_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Second")
      @js.native
      def Second: IntervalType = js.native
      @scala.inline
      def Second_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Second")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Week")
      @js.native
      def Week: IntervalType = js.native
      @scala.inline
      def Week_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.IntervalType.Year")
      @js.native
      def Year: IntervalType = js.native
      @scala.inline
      def Year_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IScheduledEvent because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.ScheduledEvent")
    @js.native
    class ScheduledEvent protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MScheduledEvent: FolderBase = js.native
      
      def enabled: Boolean = js.native
      def enabled_=(newValue: Boolean): Unit = js.native
      
      def interval: Double = js.native
      
      def intervalType: IntervalType = js.native
      def intervalType_=(newValue: IntervalType): Unit = js.native
      
      def interval_=(newValue: Double): Unit = js.native
      
      def microflow: IMicroflow | Null = js.native
      
      def microflowQualifiedName: String | Null = js.native
      
      def microflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      def startDateTime: String = js.native
      def startDateTime_=(newValue: String): Unit = js.native
      
      def timeZone: TimeZoneEnum = js.native
      def timeZone_=(newValue: TimeZoneEnum): Unit = js.native
    }
    object ScheduledEvent {
      
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.ScheduledEvent")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ScheduledEvent unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.ScheduledEvent.createIn")
      @js.native
      def createIn(container: IFolderBase): ScheduledEvent = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.ScheduledEvent.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.ScheduledEvent.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.TimeZoneEnum")
    @js.native
    class TimeZoneEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object TimeZoneEnum {
      
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.TimeZoneEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.TimeZoneEnum.Server")
      @js.native
      def Server: TimeZoneEnum = js.native
      @scala.inline
      def Server_=(x: TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/scheduledevents", "scheduledevents.TimeZoneEnum.UTC")
      @js.native
      def UTC: TimeZoneEnum = js.native
      @scala.inline
      def UTC_=(x: TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
      */
    @js.native
    trait IScheduledEvent extends IDocument
  }
}
