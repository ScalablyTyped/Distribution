package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.IStructure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionChecksMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def apply(value: Double): js.UndefOr[LifeCycleState & Double] = js.native
    
    @js.native
    sealed trait AVAILABLE
      extends StObject
         with LifeCycleState
    /* 1 */ val AVAILABLE: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.AVAILABLE & Double = js.native
    
    @js.native
    sealed trait REMOVED
      extends StObject
         with LifeCycleState
    /* 2 */ val REMOVED: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.REMOVED & Double = js.native
    
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with LifeCycleState
    /* 0 */ val UNAVAILABLE: typings.mendixmodelsdk.versionChecksMod.LifeCycleState.UNAVAILABLE & Double = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "ModifierValueHistory")
  @js.native
  class ModifierValueHistory protected () extends StObject {
    def this(lifecycle: Null, defaultFallback: Boolean) = this()
    def this(lifecycle: Unit, defaultFallback: Boolean) = this()
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
    def apply(value: Double): js.UndefOr[StructureType & Double] = js.native
    
    @js.native
    sealed trait Element
      extends StObject
         with StructureType
    /* 2 */ val Element: typings.mendixmodelsdk.versionChecksMod.StructureType.Element & Double = js.native
    
    @js.native
    sealed trait ModelUnit
      extends StObject
         with StructureType
    /* 1 */ val ModelUnit: typings.mendixmodelsdk.versionChecksMod.StructureType.ModelUnit & Double = js.native
    
    @js.native
    sealed trait StructuralUnit
      extends StObject
         with StructureType
    /* 0 */ val StructuralUnit: typings.mendixmodelsdk.versionChecksMod.StructureType.StructuralUnit & Double = js.native
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
    inline def memoisMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoisMap")(x.asInstanceOf[js.Any])
    
    /**
      * Parses and @returns the given string as a Version object.
      *
      * This function is memoised to keep memory and time consumption low,
      * given that only a handful of versions exist at any time anyway.
      */
    inline def parse(versionString: String): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(versionString.asInstanceOf[js.Any]).asInstanceOf[Version]
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "VersionInfo")
  @js.native
  abstract class VersionInfo () extends StObject {
    
    def checkSameModelVersion(model: IAbstractModel, otherModel: IAbstractModel): Unit = js.native
  }
  
  inline def contains(range: IVersionRange, version: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(range.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createInVersionCheck(model: IAbstractModel, structureTypeName: String, versionRange: IVersionRange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createInVersionCheck")(model.asInstanceOf[js.Any], structureTypeName.asInstanceOf[js.Any], versionRange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAtLeast(versionString: String, model: IAbstractModel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAtLeast")(versionString.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseAsNormalizedVersion(versionString: String): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAsNormalizedVersion")(versionString.asInstanceOf[js.Any]).asInstanceOf[Version]
  
  trait ILifeCycle extends StObject {
    
    var deleted: js.UndefOr[String] = js.undefined
    
    var deletionMessage: js.UndefOr[String | Null] = js.undefined
    
    var deprecated: js.UndefOr[String] = js.undefined
    
    var deprecationMessage: js.UndefOr[String | Null] = js.undefined
    
    var introduced: js.UndefOr[String] = js.undefined
  }
  object ILifeCycle {
    
    inline def apply(): ILifeCycle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILifeCycle]
    }
    
    extension [Self <: ILifeCycle](x: Self) {
      
      inline def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
      
      inline def setDeletionMessage(value: String): Self = StObject.set(x, "deletionMessage", value.asInstanceOf[js.Any])
      
      inline def setDeletionMessageNull: Self = StObject.set(x, "deletionMessage", null)
      
      inline def setDeletionMessageUndefined: Self = StObject.set(x, "deletionMessage", js.undefined)
      
      inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setDeprecationMessage(value: String): Self = StObject.set(x, "deprecationMessage", value.asInstanceOf[js.Any])
      
      inline def setDeprecationMessageNull: Self = StObject.set(x, "deprecationMessage", null)
      
      inline def setDeprecationMessageUndefined: Self = StObject.set(x, "deprecationMessage", js.undefined)
      
      inline def setIntroduced(value: String): Self = StObject.set(x, "introduced", value.asInstanceOf[js.Any])
      
      inline def setIntroducedUndefined: Self = StObject.set(x, "introduced", js.undefined)
    }
  }
  
  trait IModifierValueHistory extends StObject {
    
    /** descending list of change in previous meta model versions */
    var changedIn: js.UndefOr[js.Array[String]] = js.undefined
    
    var currentValue: Boolean
  }
  object IModifierValueHistory {
    
    inline def apply(currentValue: Boolean): IModifierValueHistory = {
      val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModifierValueHistory]
    }
    
    extension [Self <: IModifierValueHistory](x: Self) {
      
      inline def setChangedIn(value: js.Array[String]): Self = StObject.set(x, "changedIn", value.asInstanceOf[js.Any])
      
      inline def setChangedInUndefined: Self = StObject.set(x, "changedIn", js.undefined)
      
      inline def setChangedInVarargs(value: String*): Self = StObject.set(x, "changedIn", js.Array(value :_*))
      
      inline def setCurrentValue(value: Boolean): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPropertyVersionInfo
    extends StObject
       with ILifeCycle {
    
    var public: js.UndefOr[IModifierValueHistory] = js.undefined
    
    var required: js.UndefOr[IModifierValueHistory] = js.undefined
  }
  object IPropertyVersionInfo {
    
    inline def apply(): IPropertyVersionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPropertyVersionInfo]
    }
    
    extension [Self <: IPropertyVersionInfo](x: Self) {
      
      inline def setPublic(value: IModifierValueHistory): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setRequired(value: IModifierValueHistory): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait IStructureVersionInfo
    extends StObject
       with ILifeCycle {
    
    var experimental: js.UndefOr[IModifierValueHistory] = js.undefined
    
    var properties: js.UndefOr[StringDictionary[IPropertyVersionInfo]] = js.undefined
    
    var public: js.UndefOr[IModifierValueHistory] = js.undefined
  }
  object IStructureVersionInfo {
    
    inline def apply(): IStructureVersionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStructureVersionInfo]
    }
    
    extension [Self <: IStructureVersionInfo](x: Self) {
      
      inline def setExperimental(value: IModifierValueHistory): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
      
      inline def setProperties(value: StringDictionary[IPropertyVersionInfo]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPublic(value: IModifierValueHistory): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
  
  trait IVersionRange extends StObject {
    
    var end: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[String] = js.undefined
  }
  object IVersionRange {
    
    inline def apply(): IVersionRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IVersionRange]
    }
    
    extension [Self <: IVersionRange](x: Self) {
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
