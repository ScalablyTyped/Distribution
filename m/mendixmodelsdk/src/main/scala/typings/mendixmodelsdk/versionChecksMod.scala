package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.IStructure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionChecksMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "LifeCycle")
  @js.native
  class LifeCycle () extends StObject {
    def this(info: ILifeCycle) = this()
    
    var deleted: Version | Null = js.native
    
    var deletionMessage: String = js.native
    
    var deprecationMessage: String = js.native
    
    def getCurrentState(version: Version): LifeCycleState = js.native
    
    var introduced: Version | Null = js.native
    
    /**
      * Yields true if this feature is available in the specified version, that is:
      * - it was in base, or added before the specified version
      * - it was not removed yet in the given version
      * - deprecation statues does not influence it results
      */
    def isAvailableIn(version: Version): Boolean = js.native
    
    /**
      * Yields true only if this version was actively removed in the given version.
      * Doesn't yield true if the feature was not yet introduced in the given version (see isAvailableIn for that)
      */
    def isRemovedIn(version: Version): Boolean = js.native
    
    /**
      * Checks a version based on this lifecycle.
      * Returns true if something is thrown or warned, otherwise false
      */
    def reportVersionIssues(version: Version, aboutWhatMessage: String): Boolean = js.native
  }
  
  @js.native
  sealed trait LifeCycleState extends StObject
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "LifeCycleState")
  @js.native
  object LifeCycleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LifeCycleState with Double] = js.native
    
    @js.native
    sealed trait AVAILABLE extends LifeCycleState
    /* 1 */ val AVAILABLE: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.AVAILABLE with Double = js.native
    
    @js.native
    sealed trait REMOVED extends LifeCycleState
    /* 2 */ val REMOVED: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.REMOVED with Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE extends LifeCycleState
    /* 0 */ val UNAVAILABLE: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.UNAVAILABLE with Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "ModifierValueHistory")
  @js.native
  class ModifierValueHistory protected () extends StObject {
    def this(lifecycle: js.UndefOr[scala.Nothing], defaultFallback: Boolean) = this()
    def this(lifecycle: Null, defaultFallback: Boolean) = this()
    /**
      * defaultFallback indiciates whether the absence of a lifecycle yields true or false
      */
    def this(lifecycle: IModifierValueHistory, defaultFallback: Boolean) = this()
    
    /**
      * ordered from low to high
      */
    var changedIn: js.Array[Version] = js.native
    
    def isEnabledIn(version: Version): Boolean = js.native
    
    var latestValue: Boolean = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "PropertyVersionInfo")
  @js.native
  class PropertyVersionInfo protected () extends VersionInfo {
    def this(info: Null, publicByDefault: Boolean) = this()
    def this(info: IPropertyVersionInfo, publicByDefault: Boolean) = this()
    
    var availability: LifeCycle = js.native
    
    var isPublic: ModifierValueHistory = js.native
    
    var isRequired: ModifierValueHistory = js.native
  }
  
  @js.native
  sealed trait StructureType extends StObject
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "StructureType")
  @js.native
  object StructureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StructureType with Double] = js.native
    
    @js.native
    sealed trait Element extends StructureType
    /* 2 */ val Element: typings.mendixmodelsdk.versionChecksMod.StructureType.Element with Double = js.native
    
    @js.native
    sealed trait ModelUnit extends StructureType
    /* 1 */ val ModelUnit: typings.mendixmodelsdk.versionChecksMod.StructureType.ModelUnit with Double = js.native
    
    @js.native
    sealed trait StructuralUnit extends StructureType
    /* 0 */ val StructuralUnit: typings.mendixmodelsdk.versionChecksMod.StructureType.StructuralUnit with Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected () extends VersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
    
    var availability: LifeCycle = js.native
    
    def checkStructureVersion(instance: IStructure): Unit = js.native
    
    var defaultPropertyInfo: PropertyVersionInfo = js.native
    
    def getPropertyVersionInfo(name: String): PropertyVersionInfo = js.native
    
    var isExperimental: ModifierValueHistory = js.native
    
    var isPublic: ModifierValueHistory = js.native
    
    var properties: StringDictionary[PropertyVersionInfo] = js.native
    
    var structureType: StructureType = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "Version")
  @js.native
  class Version protected () extends StObject {
    def this(major: Double, minor: Double, patch: Double) = this()
    
    /**
      * Returns 0 if this version is equal to the other version.
      * Returns a negative integer if this version is strictly smaller than the other version.
      * Returns a positive integer if this version is strictly larger than the other version.
      */
    def compare(other: Version): Double = js.native
    
    /**
      * Returns true if this version is strictly larger than the provided version.
      */
    def isAfter(other: Version): Boolean = js.native
    
    def isAfterOrEqual(other: Version): Boolean = js.native
    
    /**
      * Returns true if this version is strictly smaller compared to the provided version.
      */
    def isBefore(other: Version): Boolean = js.native
    
    def isBeforeOrEqual(other: Version): Boolean = js.native
    
    def isEqualTo(other: Version): Boolean = js.native
    
    var major: Double = js.native
    
    var minor: Double = js.native
    
    var patch: Double = js.native
  }
  /* static members */
  object Version {
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "Version")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "Version.memoisMap")
    @js.native
    def memoisMap: js.Any = js.native
    @scala.inline
    def memoisMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
    
    /**
      * Parses and @returns the given string as a Version object.
      *
      * This function is memoised to keep memory and time consumption low,
      * given that only a handful of versions exist at any time anyway.
      */
    @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "Version.parse")
    @js.native
    def parse(versionString: String): Version = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "VersionInfo")
  @js.native
  abstract class VersionInfo () extends StObject {
    
    def checkSameModelVersion(model: IAbstractModel, otherModel: IAbstractModel): Unit = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "contains")
  @js.native
  def contains(range: IVersionRange, version: Version): Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "createInVersionCheck")
  @js.native
  def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "isAtLeast")
  @js.native
  def isAtLeast(versionString: String, model: IAbstractModel): Boolean = js.native
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "parseAsNormalizedVersion")
  @js.native
  def parseAsNormalizedVersion(versionString: String): Version = js.native
  
  @js.native
  trait ILifeCycle extends StObject {
    
    var deleted: js.UndefOr[String] = js.native
    
    var deletionMessage: js.UndefOr[String | Null] = js.native
    
    var deprecated: js.UndefOr[String] = js.native
    
    var deprecationMessage: js.UndefOr[String | Null] = js.native
    
    var introduced: js.UndefOr[String] = js.native
  }
  object ILifeCycle {
    
    @scala.inline
    def apply(): ILifeCycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILifeCycle]
    }
    
    @scala.inline
    implicit class ILifeCycleMutableBuilder[Self <: ILifeCycle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
      
      @scala.inline
      def setDeletionMessage(value: String): Self = StObject.set(x, "deletionMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletionMessageNull: Self = StObject.set(x, "deletionMessage", null)
      
      @scala.inline
      def setDeletionMessageUndefined: Self = StObject.set(x, "deletionMessage", js.undefined)
      
      @scala.inline
      def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      @scala.inline
      def setDeprecationMessage(value: String): Self = StObject.set(x, "deprecationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecationMessageNull: Self = StObject.set(x, "deprecationMessage", null)
      
      @scala.inline
      def setDeprecationMessageUndefined: Self = StObject.set(x, "deprecationMessage", js.undefined)
      
      @scala.inline
      def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntroducedUndefined: Self = StObject.set(x, "introduced", js.undefined)
    }
  }
  
  @js.native
  trait IModifierValueHistory extends StObject {
    
    /** descending list of change in previous meta model versions */
    var changedIn: js.UndefOr[js.Array[String]] = js.native
    
    var currentValue: Boolean = js.native
  }
  object IModifierValueHistory {
    
    @scala.inline
    def apply(currentValue: Boolean): IModifierValueHistory = {
      val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModifierValueHistory]
    }
    
    @scala.inline
    implicit class IModifierValueHistoryMutableBuilder[Self <: IModifierValueHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangedIn(value: js.Array[String]): Self = StObject.set(x, "changedIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedInUndefined: Self = StObject.set(x, "changedIn", js.undefined)
      
      @scala.inline
      def setChangedInVarargs(value: String*): Self = StObject.set(x, "changedIn", js.Array(value :_*))
      
      @scala.inline
      def setCurrentValue(value: Boolean): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPropertyVersionInfo extends ILifeCycle {
    
    var public: js.UndefOr[IModifierValueHistory] = js.native
    
    var required: js.UndefOr[IModifierValueHistory] = js.native
  }
  object IPropertyVersionInfo {
    
    @scala.inline
    def apply(): IPropertyVersionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPropertyVersionInfo]
    }
    
    @scala.inline
    implicit class IPropertyVersionInfoMutableBuilder[Self <: IPropertyVersionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublic(value: IModifierValueHistory): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setRequired(value: IModifierValueHistory): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait IStructureVersionInfo extends ILifeCycle {
    
    var experimental: js.UndefOr[IModifierValueHistory] = js.native
    
    var properties: js.UndefOr[StringDictionary[IPropertyVersionInfo]] = js.native
    
    var public: js.UndefOr[IModifierValueHistory] = js.native
  }
  object IStructureVersionInfo {
    
    @scala.inline
    def apply(): IStructureVersionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStructureVersionInfo]
    }
    
    @scala.inline
    implicit class IStructureVersionInfoMutableBuilder[Self <: IStructureVersionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExperimental(value: IModifierValueHistory): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[IPropertyVersionInfo]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPublic(value: IModifierValueHistory): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
  
  @js.native
  trait IVersionRange extends StObject {
    
    var end: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[String] = js.native
  }
  object IVersionRange {
    
    @scala.inline
    def apply(): IVersionRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVersionRange]
    }
    
    @scala.inline
    implicit class IVersionRangeMutableBuilder[Self <: IVersionRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
