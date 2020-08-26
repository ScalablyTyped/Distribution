package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/scheduledevents", JSImport.Namespace)
@js.native
object scheduledeventsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
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
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.scheduledeventsMod.scheduledevents.IScheduledEvent because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class ScheduledEvent protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FScheduledEvent: IModel = js.native
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

