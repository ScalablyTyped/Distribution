package typings.openui5

import typings.openui5.anon.ActualExpected
import typings.openui5.anon.ExecutionScope
import typings.openui5.anon.Expected
import typings.openui5.anon.HistoryFormat
import typings.openui5.anon.Result
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreSupportRuleEngineOpaExtensionMod {
  
  @JSImport("sap/ui/core/support/RuleEngineOpaExtension", JSImport.Default)
  @js.native
  open class default () extends RuleEngineOpaExtension
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/support/RuleEngineOpaExtension", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.support.RuleEngineOpaExtension with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RuleEngineOpaExtension]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RuleEngineOpaExtension],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.support.RuleEngineOpaExtension.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait RuleEngineOpaAssertions extends StObject {
    
    var __implements__sap_ui_core_support_RuleEngineOpaAssertions: Boolean = js.native
    
    /**
      * If there are issues found the assertion result will be false and a report with all the issues will be
      * generated in the message of the test. If no issues were found the assertion result will be true and no
      * report will be generated.
      *
      * If "sap-skip-rules-issues=true" is set as an URI parameter, assertion result will be always positive.
      *
      * @returns Promise.
      */
    def getFinalReport(): js.Promise[Expected] = js.native
    
    /**
      * Stores analysis history (if such) as last element in window._$files array. Accessing this array gives
      * an opportunity to store this history in a file.
      *
      * @returns Promise.
      */
    def getReportAsFileInFormat(): js.Promise[Result] = js.native
    def getReportAsFileInFormat(/**
      * The options used to configure reporting.
      */
    options: HistoryFormat): js.Promise[Result] = js.native
    
    /**
      * Run the Support Assistant and analyze against a specific state of the application. Depending on the options
      * passed the assertion might either fail or not if any issues were found.
      *
      * If "sap-skip-rules-issues=true" is set as an URI parameter, assertion result will be always positive.
      *
      * @returns Promise.
      */
    def noRuleFailures(): js.Promise[ActualExpected] = js.native
    def noRuleFailures(/**
      * The options used to configure an analysis.
      */
    options: ExecutionScope): js.Promise[ActualExpected] = js.native
  }
  
  @js.native
  trait RuleEngineOpaExtension
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      *
      * @returns Object with the methods which will enhance the OPA assertions.
      */
    def getAssertions(): RuleEngineOpaAssertions = js.native
  }
}
