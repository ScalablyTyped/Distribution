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
  
  trait RuleConfiguration extends StObject {
    
    var async: Boolean
    
    var audiences: js.Array[
        Audiences | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Audiences * / any */ String)
      ]
    
    var categories: js.Array[
        Categories | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Categories * / any */ String)
      ]
    
    var check: String
    
    var description: String
    
    var id: String
    
    var minversion: String
    
    var resolution: String
    
    var resolutionurls: String
    
    var title: String
  }
  object RuleConfiguration {
    
    inline def apply(
      async: Boolean,
      audiences: js.Array[
          Audiences | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Audiences * / any */ String)
        ],
      categories: js.Array[
          Categories | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Categories * / any */ String)
        ],
      check: String,
      description: String,
      id: String,
      minversion: String,
      resolution: String,
      resolutionurls: String,
      title: String
    ): RuleConfiguration = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], audiences = audiences.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], check = check.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], minversion = minversion.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], resolutionurls = resolutionurls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAudiences(
        value: js.Array[
              Audiences | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Audiences * / any */ String)
            ]
      ): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
      
      inline def setAudiencesVarargs(
        value: (Audiences | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Audiences * / any */ String))*
      ): Self = StObject.set(x, "audiences", js.Array(value*))
      
      inline def setCategories(
        value: js.Array[
              Categories | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Categories * / any */ String)
            ]
      ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesVarargs(
        value: (Categories | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Categories * / any */ String))*
      ): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCheck(value: String): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMinversion(value: String): Self = StObject.set(x, "minversion", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionurls(value: String): Self = StObject.set(x, "resolutionurls", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
