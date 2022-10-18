package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenScheduledeventsMod {
  
  @JSImport("mendixmodelsdk/src/gen/scheduledevents", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object scheduledevents {
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySchedule")
    @js.native
    open class DaySchedule protected () extends Schedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def hourOfDay: Double = js.native
      def hourOfDay_=(newValue: Double): Unit = js.native
      
      def minuteOfHour: Double = js.native
      def minuteOfHour_=(newValue: Double): Unit = js.native
    }
    object DaySchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DaySchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DaySchedule]
      
      /**
        * Creates and returns a new DaySchedule instance in the SDK and on the server.
        * The new DaySchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): DaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DaySchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector")
    @js.native
    open class DaySelector protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DaySelector {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector.First")
      @js.native
      def First: DaySelector = js.native
      inline def First_=(x: DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("First")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector.Fourth")
      @js.native
      def Fourth: DaySelector = js.native
      inline def Fourth_=(x: DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fourth")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector.Last")
      @js.native
      def Last: DaySelector = js.native
      inline def Last_=(x: DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector.Second")
      @js.native
      def Second: DaySelector = js.native
      inline def Second_=(x: DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Second")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.DaySelector.Third")
      @js.native
      def Third: DaySelector = js.native
      inline def Third_=(x: DaySelector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Third")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.HourSchedule")
    @js.native
    open class HourSchedule protected () extends Schedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def minuteOffset: Double = js.native
      def minuteOffset_=(newValue: Double): Unit = js.native
      
      def multiplier: Double = js.native
      def multiplier_=(newValue: Double): Unit = js.native
    }
    object HourSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.HourSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new HourSchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): HourSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[HourSchedule]
      
      /**
        * Creates and returns a new HourSchedule instance in the SDK and on the server.
        * The new HourSchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): HourSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[HourSchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.HourSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.HourSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType")
    @js.native
    open class IntervalType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object IntervalType {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Day")
      @js.native
      def Day: IntervalType = js.native
      inline def Day_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Hour")
      @js.native
      def Hour: IntervalType = js.native
      inline def Hour_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hour")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Minute")
      @js.native
      def Minute: IntervalType = js.native
      inline def Minute_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minute")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Month")
      @js.native
      def Month: IntervalType = js.native
      inline def Month_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Second")
      @js.native
      def Second: IntervalType = js.native
      inline def Second_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Second")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Week")
      @js.native
      def Week: IntervalType = js.native
      inline def Week_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.IntervalType.Year")
      @js.native
      def Year: IntervalType = js.native
      inline def Year_=(x: IntervalType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MinuteSchedule")
    @js.native
    open class MinuteSchedule protected () extends Schedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def multiplier: Double = js.native
      def multiplier_=(newValue: Double): Unit = js.native
    }
    object MinuteSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MinuteSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MinuteSchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MinuteSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MinuteSchedule]
      
      /**
        * Creates and returns a new MinuteSchedule instance in the SDK and on the server.
        * The new MinuteSchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): MinuteSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MinuteSchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MinuteSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MinuteSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthDateSchedule")
    @js.native
    open class MonthDateSchedule protected () extends MonthSchedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def dayOfMonth: Double = js.native
      def dayOfMonth_=(newValue: Double): Unit = js.native
    }
    object MonthDateSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthDateSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MonthDateSchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MonthDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MonthDateSchedule]
      
      /**
        * Creates and returns a new MonthDateSchedule instance in the SDK and on the server.
        * The new MonthDateSchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): MonthDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MonthDateSchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthDateSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthDateSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthSchedule")
    @js.native
    open class MonthSchedule protected () extends Schedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def hourOfDay: Double = js.native
      def hourOfDay_=(newValue: Double): Unit = js.native
      
      def minuteOfHour: Double = js.native
      def minuteOfHour_=(newValue: Double): Unit = js.native
      
      def monthOffset: Double = js.native
      def monthOffset_=(newValue: Double): Unit = js.native
      
      def multiplier: Double = js.native
      def multiplier_=(newValue: Double): Unit = js.native
    }
    object MonthSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthWeekdaySchedule")
    @js.native
    open class MonthWeekdaySchedule protected () extends MonthSchedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def daySelector: DaySelector = js.native
      def daySelector_=(newValue: DaySelector): Unit = js.native
      
      def weekday: Weekday = js.native
      def weekday_=(newValue: Weekday): Unit = js.native
    }
    object MonthWeekdaySchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthWeekdaySchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new MonthWeekdaySchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): MonthWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MonthWeekdaySchedule]
      
      /**
        * Creates and returns a new MonthWeekdaySchedule instance in the SDK and on the server.
        * The new MonthWeekdaySchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): MonthWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[MonthWeekdaySchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthWeekdaySchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.MonthWeekdaySchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.OverlapStrategy")
    @js.native
    open class OverlapStrategy protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object OverlapStrategy {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.OverlapStrategy")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.OverlapStrategy.DelayNext")
      @js.native
      def DelayNext: OverlapStrategy = js.native
      inline def DelayNext_=(x: OverlapStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DelayNext")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.OverlapStrategy.SkipNext")
      @js.native
      def SkipNext: OverlapStrategy = js.native
      inline def SkipNext_=(x: OverlapStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkipNext")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ScheduledEvents`.
      */
    /**
      * In version 9.12.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Schedule")
    @js.native
    open class Schedule protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsScheduledEvent: ScheduledEvent = js.native
    }
    object Schedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Schedule")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Schedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Schedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenScheduledeventsMod.scheduledevents.IScheduledEvent because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.ScheduledEvent")
    @js.native
    open class ScheduledEvent protected () extends Document {
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
      
      /**
        * In version 9.12.0: introduced
        */
      def onOverlap: OverlapStrategy = js.native
      def onOverlap_=(newValue: OverlapStrategy): Unit = js.native
      
      /**
        * In version 9.12.0: introduced
        */
      def schedule: Schedule | Null = js.native
      def schedule_=(newValue: Schedule | Null): Unit = js.native
      
      def startDateTime: String = js.native
      def startDateTime_=(newValue: String): Unit = js.native
      
      def timeZone: TimeZoneEnum = js.native
      def timeZone_=(newValue: TimeZoneEnum): Unit = js.native
    }
    object ScheduledEvent {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.ScheduledEvent")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ScheduledEvent unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): ScheduledEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ScheduledEvent]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.ScheduledEvent.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.ScheduledEvent.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.TimeZoneEnum")
    @js.native
    open class TimeZoneEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object TimeZoneEnum {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.TimeZoneEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.TimeZoneEnum.Server")
      @js.native
      def Server: TimeZoneEnum = js.native
      inline def Server_=(x: TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Server")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.TimeZoneEnum.UTC")
      @js.native
      def UTC: TimeZoneEnum = js.native
      inline def UTC_=(x: TimeZoneEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.WeekSchedule")
    @js.native
    open class WeekSchedule protected () extends Schedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def friday: Boolean = js.native
      def friday_=(newValue: Boolean): Unit = js.native
      
      def hourOfDay: Double = js.native
      def hourOfDay_=(newValue: Double): Unit = js.native
      
      def minuteOfHour: Double = js.native
      def minuteOfHour_=(newValue: Double): Unit = js.native
      
      def monday: Boolean = js.native
      def monday_=(newValue: Boolean): Unit = js.native
      
      def saturday: Boolean = js.native
      def saturday_=(newValue: Boolean): Unit = js.native
      
      def sunday: Boolean = js.native
      def sunday_=(newValue: Boolean): Unit = js.native
      
      def thursday: Boolean = js.native
      def thursday_=(newValue: Boolean): Unit = js.native
      
      def tuesday: Boolean = js.native
      def tuesday_=(newValue: Boolean): Unit = js.native
      
      def wednesday: Boolean = js.native
      def wednesday_=(newValue: Boolean): Unit = js.native
    }
    object WeekSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.WeekSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new WeekSchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): WeekSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WeekSchedule]
      
      /**
        * Creates and returns a new WeekSchedule instance in the SDK and on the server.
        * The new WeekSchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): WeekSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WeekSchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.WeekSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.WeekSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday")
    @js.native
    open class Weekday protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object Weekday {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Friday")
      @js.native
      def Friday: Weekday = js.native
      inline def Friday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Friday")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Monday")
      @js.native
      def Monday: Weekday = js.native
      inline def Monday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Monday")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Saturday")
      @js.native
      def Saturday: Weekday = js.native
      inline def Saturday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Saturday")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Sunday")
      @js.native
      def Sunday: Weekday = js.native
      inline def Sunday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sunday")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Thursday")
      @js.native
      def Thursday: Weekday = js.native
      inline def Thursday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Thursday")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Tuesday")
      @js.native
      def Tuesday: Weekday = js.native
      inline def Tuesday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tuesday")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.Weekday.Wednesday")
      @js.native
      def Wednesday: Weekday = js.native
      inline def Wednesday_=(x: Weekday): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wednesday")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearDateSchedule")
    @js.native
    open class YearDateSchedule protected () extends YearSchedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def dayOfMonth: Double = js.native
      def dayOfMonth_=(newValue: Double): Unit = js.native
    }
    object YearDateSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearDateSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new YearDateSchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): YearDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[YearDateSchedule]
      
      /**
        * Creates and returns a new YearDateSchedule instance in the SDK and on the server.
        * The new YearDateSchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): YearDateSchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[YearDateSchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearDateSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearDateSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearSchedule")
    @js.native
    open class YearSchedule protected () extends Schedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def hourOfDay: Double = js.native
      def hourOfDay_=(newValue: Double): Unit = js.native
      
      def minuteOfHour: Double = js.native
      def minuteOfHour_=(newValue: Double): Unit = js.native
      
      def month: Double = js.native
      def month_=(newValue: Double): Unit = js.native
    }
    object YearSchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearSchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearSchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearSchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.12.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearWeekdaySchedule")
    @js.native
    open class YearWeekdaySchedule protected () extends YearSchedule {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def daySelector: DaySelector = js.native
      def daySelector_=(newValue: DaySelector): Unit = js.native
      
      def weekday: Weekday = js.native
      def weekday_=(newValue: Weekday): Unit = js.native
    }
    object YearWeekdaySchedule {
      
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearWeekdaySchedule")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new YearWeekdaySchedule instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): YearWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[YearWeekdaySchedule]
      
      /**
        * Creates and returns a new YearWeekdaySchedule instance in the SDK and on the server.
        * The new YearWeekdaySchedule will be automatically stored in the 'schedule' property
        * of the parent ScheduledEvent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.12.0 and higher
        */
      /* static member */
      inline def createIn(container: ScheduledEvent): YearWeekdaySchedule = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[YearWeekdaySchedule]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearWeekdaySchedule.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/scheduledevents", "scheduledevents.YearWeekdaySchedule.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/scheduled-events relevant section in reference guide}
      */
    @js.native
    trait IScheduledEvent
      extends StObject
         with IDocument
  }
}
