package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestGherkinStepDefinitionsMod {
  
  @JSImport("sap/ui/test/gherkin/StepDefinitions", JSImport.Default)
  @js.native
  /**
    * Meant to be implemented/overridden by a child object. Specifically, the functions "init" and "closeApplication"
    * need to be overridden.
    */
  open class default () extends StepDefinitions
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/gherkin/StepDefinitions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.test.gherkin.StepDefinitions with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, StepDefinitions]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, StepDefinitions],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.test.gherkin.StepDefinitions.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait StepDefinitions
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Closes the application and cleans up any mess made by the tests. To avoid erroneous exceptions during
      * test execution, make sure that it is safe to run this method even if the application was never started.
      */
    def closeApplication(): Unit = js.native
    
    /**
      * Registers the step definitions by calling the method "register".
      * See:
      * 	#register
      */
    def init(): Unit = js.native
    
    /**
      * Registers a step definition.
      */
    def register(
      /**
      * the regular expression that matches the feature file step (with leading "Given", "When", "Then", "But"
      * or "*" removed). E.g. if the feature file has the step "Then I should be served a coffee" it will be
      * truncated to "I should be served a coffee" and tested against "rRegex" to check for a match. The simple
      * regular expression /^I should be served a coffee$/i would match this text. The regular expression can
      * specify capturing groups, which will be passed as parameters to "fnFunc".
      */
    rRegex: js.RegExp,
      /**
      * the function to execute in the event that the regular expression matches. Receives regular expression
      * capturing groups as parameters in the same order that they are specified in the regular expression. If
      * a data table is specified for the step, it will be passed as an additional final parameter. At execution
      * time, all functions within a particular scenario will execute within the same "this" context.
      */
    fnFunc: js.Function
    ): Unit = js.native
  }
}
