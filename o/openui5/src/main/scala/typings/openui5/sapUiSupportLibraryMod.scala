package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiSupportLibraryMod {
  
  @js.native
  sealed trait Audiences extends StObject
  @JSImport("sap/ui/support/library", "Audiences")
  @js.native
  object Audiences extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Audiences & String] = js.native
    
    /**
      * Audience just on Application level.
      */
    @js.native
    sealed trait Application
      extends StObject
         with Audiences
    /* "Application" */ val Application: typings.openui5.sapUiSupportLibraryMod.Audiences.Application & String = js.native
    
    /**
      * Audience just on Control level.
      */
    @js.native
    sealed trait Control
      extends StObject
         with Audiences
    /* "Control" */ val Control: typings.openui5.sapUiSupportLibraryMod.Audiences.Control & String = js.native
    
    /**
      * Audience just on Internal level.
      */
    @js.native
    sealed trait Internal
      extends StObject
         with Audiences
    /* "Internal" */ val Internal: typings.openui5.sapUiSupportLibraryMod.Audiences.Internal & String = js.native
  }
  
  @js.native
  sealed trait Categories extends StObject
  @JSImport("sap/ui/support/library", "Categories")
  @js.native
  object Categories extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Categories & String] = js.native
    
    /**
      * Accessibility issue category.
      */
    @js.native
    sealed trait Accessibility
      extends StObject
         with Categories
    /* "Accessibility" */ val Accessibility: typings.openui5.sapUiSupportLibraryMod.Categories.Accessibility & String = js.native
    
    /**
      * Binding issue category.
      */
    @js.native
    sealed trait Bindings
      extends StObject
         with Categories
    /* "Bindings" */ val Bindings: typings.openui5.sapUiSupportLibraryMod.Categories.Bindings & String = js.native
    
    /**
      * Consistency issue category.
      */
    @js.native
    sealed trait Consistency
      extends StObject
         with Categories
    /* "Consistency" */ val Consistency: typings.openui5.sapUiSupportLibraryMod.Categories.Consistency & String = js.native
    
    /**
      * DataModel issue category.
      */
    @js.native
    sealed trait DataModel
      extends StObject
         with Categories
    /* "DataModel" */ val DataModel: typings.openui5.sapUiSupportLibraryMod.Categories.DataModel & String = js.native
    
    /**
      * @SINCE 1.58
      *
      * Fiori Guidelines issue category.
      */
    @js.native
    sealed trait FioriGuidelines
      extends StObject
         with Categories
    /* "FioriGuidelines" */ val FioriGuidelines: typings.openui5.sapUiSupportLibraryMod.Categories.FioriGuidelines & String = js.native
    
    /**
      * Functionality issue category.
      */
    @js.native
    sealed trait Functionality
      extends StObject
         with Categories
    /* "Functionality" */ val Functionality: typings.openui5.sapUiSupportLibraryMod.Categories.Functionality & String = js.native
    
    /**
      * Memory issue category.
      */
    @js.native
    sealed trait Memory
      extends StObject
         with Categories
    /* "Memory" */ val Memory: typings.openui5.sapUiSupportLibraryMod.Categories.Memory & String = js.native
    
    /**
      * @SINCE 1.60
      *
      * Modularization issue category.
      */
    @js.native
    sealed trait Modularization
      extends StObject
         with Categories
    /* "Modularization" */ val Modularization: typings.openui5.sapUiSupportLibraryMod.Categories.Modularization & String = js.native
    
    /**
      * Other issue category.
      */
    @js.native
    sealed trait Other
      extends StObject
         with Categories
    /* "Other" */ val Other: typings.openui5.sapUiSupportLibraryMod.Categories.Other & String = js.native
    
    /**
      * Performance issue category.
      */
    @js.native
    sealed trait Performance
      extends StObject
         with Categories
    /* "Performance" */ val Performance: typings.openui5.sapUiSupportLibraryMod.Categories.Performance & String = js.native
    
    /**
      * Usability issue category.
      */
    @js.native
    sealed trait Usability
      extends StObject
         with Categories
    /* "Usability" */ val Usability: typings.openui5.sapUiSupportLibraryMod.Categories.Usability & String = js.native
    
    /**
      * Usage issue category.
      */
    @js.native
    sealed trait Usage
      extends StObject
         with Categories
    /* "Usage" */ val Usage: typings.openui5.sapUiSupportLibraryMod.Categories.Usage & String = js.native
  }
  
  @js.native
  sealed trait HistoryFormats extends StObject
  @JSImport("sap/ui/support/library", "HistoryFormats")
  @js.native
  object HistoryFormats extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[HistoryFormats & java.lang.String] = js.native
    
    /**
      * ABAP history format.
      */
    @js.native
    sealed trait Abap
      extends StObject
         with HistoryFormats
    /* "Abap" */ val Abap: typings.openui5.sapUiSupportLibraryMod.HistoryFormats.Abap & java.lang.String = js.native
    
    /**
      * String history format.
      */
    @js.native
    sealed trait String
      extends StObject
         with HistoryFormats
    /* "String" */ val String: typings.openui5.sapUiSupportLibraryMod.HistoryFormats.String & java.lang.String = js.native
  }
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("sap/ui/support/library", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity & String] = js.native
    
    /**
      * High issue severity.
      */
    @js.native
    sealed trait High
      extends StObject
         with Severity
    /* "High" */ val High: typings.openui5.sapUiSupportLibraryMod.Severity.High & String = js.native
    
    /**
      * Low issue severity.
      */
    @js.native
    sealed trait Low
      extends StObject
         with Severity
    /* "Low" */ val Low: typings.openui5.sapUiSupportLibraryMod.Severity.Low & String = js.native
    
    /**
      * Medium issue severity.
      */
    @js.native
    sealed trait Medium
      extends StObject
         with Severity
    /* "Medium" */ val Medium: typings.openui5.sapUiSupportLibraryMod.Severity.Medium & String = js.native
  }
  
  @js.native
  sealed trait SystemPresets extends StObject
  @JSImport("sap/ui/support/library", "SystemPresets")
  @js.native
  object SystemPresets extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SystemPresets & String] = js.native
    
    /**
      * The accessibility preset.
      */
    @js.native
    sealed trait Accessibility
      extends StObject
         with SystemPresets
    /* "undefined" */ val Accessibility: typings.openui5.sapUiSupportLibraryMod.SystemPresets.Accessibility & String = js.native
  }
}
