package typings.openui5.global.sap.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  @JSGlobal("sap.ui.test.Opa")
  @js.native
  class Opa protected ()
    extends typings.openui5.sap.ui.test.Opa {
    /**
      * This class will help you write acceptance tests in one page or single page applications.You can wait
      * for certain conditions to be met.
      * @param extensionObject An object containing properties and functions. The newly created Opa will be
      * extended by these properties and functions using jQuery.extend.
      */
    def this(extensionObject: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.test.Opa5")
  @js.native
  /**
    * Helps you when writing tests for UI5 applications.Provides convenience to wait and retrieve for UI5
    * controls without relying on global IDs.Makes it easy to wait until your UI is in the state you need
    * for testing, e.g.: waiting for backend data.
    */
  class Opa5 ()
    extends typings.openui5.sap.ui.test.Opa5
  
  @JSGlobal("sap.ui.test.OpaPlugin")
  @js.native
  class OpaPlugin ()
    extends typings.openui5.sap.ui.test.OpaPlugin
  
  @JSGlobal("sap.ui.test.PageObjectFactory")
  @js.native
  class PageObjectFactory ()
    extends typings.openui5.sap.ui.test.PageObjectFactory
  
  object actions {
    
    @JSGlobal("sap.ui.test.actions.Action")
    @js.native
    /**
      * Accepts an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
      * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
      * general description of the syntax of the settings object.
      */
    abstract class Action ()
      extends typings.openui5.sap.ui.test.actions.Action
    
    @JSGlobal("sap.ui.test.actions.EnterText")
    @js.native
    /**
      * The EnterText action is used to simulate a user entering texts to inputs.EnterText will be executed
      * on a control's focus dom ref.Supported controls are (for other controls this action still might
      * work):<ul>    <li>sap.m.Input</li>    <li>sap.m.SearchField</li>   
      * <li>sap.m.TextArea</li></ul>Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      */
    class EnterText ()
      extends typings.openui5.sap.ui.test.actions.EnterText
    
    @JSGlobal("sap.ui.test.actions.Press")
    @js.native
    /**
      * The Press action is used to simulate a press interaction on a Control's dom ref.This will work out
      * of the box for most of the controls (even custom controls).Here is a List of supported controls
      * (some controls will trigger the press on a specific region):<ul>    <li>sap.m.Button</li>   
      * <li>sap.m.Link</li>    <li>sap.m.StandardListItem</li>    <li>sap.m.IconTabFilter</li>   
      * <li>sap.m.SearchField - Search Button</li>    <li>sap.m.Page - Back Button</li>   
      * <li>sap.m.semantic.FullscreenPage - Back Button</li>    <li>sap.m.semantic.DetailPage - Back
      * Button</li>    <li>sap.m.List - More Button</li>    <li>sap.m.Table - More Button</li>   
      * <li>sap.m.StandardTile</li></ul>
      */
    class Press ()
      extends typings.openui5.sap.ui.test.actions.Press
  }
  
  object gherkin {
    
    @JSGlobal("sap.ui.test.gherkin.StepDefinitions")
    @js.native
    /**
      * A Gherkin feature file is human-readable, and the computer does not know how to execute its steps.
      * ThisStepDefinitions class provides the interface between human and machine. It defines what each
      * step in the Gherkinfeature file will actually do when it is executed.Meant to be
      * implemented/overridden by a child object. Specifically, the functions 'init' and
      * 'closeApplication'need to be overridden.
      */
    abstract class StepDefinitions ()
      extends typings.openui5.sap.ui.test.gherkin.StepDefinitions
    
    object dataTableUtils {
      
      object normalization {
        
        /**
          * e.g. "First Name" -> "firstName"
          * @param sString the string to normalize
          * @returns the input string with all words after the first capitalized and all spaces removed
          */
        @JSGlobal("sap.ui.test.gherkin.dataTableUtils.normalization.camelCase")
        @js.native
        def camelCase(sString: String): String = js.native
        
        /**
          * e.g. "First Name" -> "first-name"
          * @param sString the string to normalize
          * @returns the input string trimmed, changed to lower case and with space between words               
          *   replaced by a hyphen ('-')
          */
        @JSGlobal("sap.ui.test.gherkin.dataTableUtils.normalization.hyphenated")
        @js.native
        def hyphenated(sString: String): String = js.native
        
        /**
          * e.g. "First Name" -> "First Name"
          * @param sString the string to normalize
          * @returns the original unchanged input string
          */
        @JSGlobal("sap.ui.test.gherkin.dataTableUtils.normalization.none")
        @js.native
        def none(sString: String): String = js.native
        
        /**
          * e.g. "first name" -> "FirstName"
          * @param sString the string to normalize
          * @returns the input string with all words capitalized and all spaces removed
          */
        @JSGlobal("sap.ui.test.gherkin.dataTableUtils.normalization.pascalCase")
        @js.native
        def pascalCase(sString: String): String = js.native
        
        /**
          * e.g. "first name" -> "First Name"
          * @param sString the string to normalize
          * @returns the input string trimmed and with all words capitalized
          */
        @JSGlobal("sap.ui.test.gherkin.dataTableUtils.normalization.titleCase")
        @js.native
        def titleCase(sString: String): String = js.native
      }
      
      /**
        * Takes the inputed 2D list 'aData' and returns an equivalent object. Each row of data is expected
        * tobe a property-value pair. To create nested objects, add extra columns to the data. E.g.<pre> [  
        * ['Name', 'Alice'],   ['Mass', '135 lbs'],   ['Telephone Number', 'Home', '123-456-7890'],  
        * ['Telephone Number', 'Work', '123-456-0987'] ]</pre>For each data row, the right-most element
        * becomes a property value, and everything else is a propertyname. The property names get normalized
        * according to the strategy defined by the parameter 'oNorm'.E.g. using camelCase strategy<pre>  {   
        * name: 'Alice',    mass: '135 lbs',    telephoneNumber: {      home: '123-456-7890',      work:
        * '123-456-0987'    }  }</pre>
        * @param aData the input data to be converted
        * @param oNorm the normalization function to use to normalize property                                
        *             names. Can also be a string with values 'titleCase', 'pascalCase',                      
        *                       'camelCase', 'hyphenated' or 'none'.
        * @returns - an object equivalent to the input data, with property names normalized
        */
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils.toObject")
      @js.native
      def toObject(aData: js.Array[js.Array[String]]): js.Any = js.native
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils.toObject")
      @js.native
      def toObject(aData: js.Array[js.Array[String]], oNorm: String): js.Any = js.native
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils.toObject")
      @js.native
      def toObject(aData: js.Array[js.Array[String]], oNorm: js.Any): js.Any = js.native
      
      /**
        * Takes the inputed 2D list 'aData' and returns an equivalent list of objects. The data is expected
        * tohave a header row, with each subsequent row being an entity, and each column being a property of
        * thatentity. E.g.<pre>  [    ["Their Name",  "Their Age"],    ["Alice",       "16"],    ["Bob",      
        *   "22"]  ]</pre>The data's column headers become the returned objects' property names. The property
        * names get normalizedaccording to the strategy defined by the parameter 'oNorm'. E.g. using
        * hyphenation strategy this is returned:<pre>  [    {their-name: "Alice", their-age: "16"},   
        * {their-name: "Bob", their-age: "22"}  ]</pre>
        * @param aData the input data to be converted, with a header row
        * @param oNorm the normalization function to use to normalize property                                
        *             names. Can also be a String with values 'titleCase', 'pascalCase',                      
        *                       'camelCase', 'hyphenated' or 'none'.
        * @returns - a list of objects equivalent to the input data, with property names normalized
        */
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils.toTable")
      @js.native
      def toTable(aData: js.Array[js.Array[String]]): js.Array[_] = js.native
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils.toTable")
      @js.native
      def toTable(aData: js.Array[js.Array[String]], oNorm: String): js.Array[_] = js.native
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils.toTable")
      @js.native
      def toTable(aData: js.Array[js.Array[String]], oNorm: js.Any): js.Array[_] = js.native
    }
    
    object opa5TestHarness {
      
      /**
        * Dynamically generates Opa5 testsIf a test step is missing and args.generateMissingSteps is true then
        * the  Gherkin step will be converted into OpaPage Object code and executed. The text will be
        * converted to camelCase and have any non-alphanumeric characterremoved. Here are two pertinent
        * examples:(1) The simple step "Given I start my app" will be converted into the call
        * "Given.iStartMyApp();"(2) The step "Then on page 1: I should see the page 1 text" will become the
        * call    "Then.onPage1.iShouldSeeThePage1Text();"Chaining function calls, such as
        * "Then.iStartMyApp().and.iCloseMyApp()" is not possible at this time.
        * @param args the arguments to the function
        */
      @JSGlobal("sap.ui.test.gherkin.opa5TestHarness.test")
      @js.native
      def test(args: js.Any): Unit = js.native
    }
    
    object qUnitTestHarness {
      
      /**
        * Dynamically generates and executes QUnit tests
        * @param args the arguments to the function
        */
      @JSGlobal("sap.ui.test.gherkin.qUnitTestHarness.test")
      @js.native
      def test(args: js.Any): Unit = js.native
    }
  }
  
  object matchers {
    
    @JSGlobal("sap.ui.test.matchers.AggregationContainsPropertyEqual")
    @js.native
    class AggregationContainsPropertyEqual protected ()
      extends typings.openui5.sap.ui.test.matchers.AggregationContainsPropertyEqual {
      /**
        * AggregationContainsPropertyEqual - checks if an aggregation contains at least one item that has a
        * Property set to a certain value.Accepts an object literal <code>mSettings</code> that defines
        * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
        * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
        * object.
        * @param mSettings optional map/JSON-object with initial settings for the new
        * AggregationContainsPropertyEqualMatcher
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.AggregationFilled")
    @js.native
    class AggregationFilled protected ()
      extends typings.openui5.sap.ui.test.matchers.AggregationFilled {
      /**
        * AggregationFilled - checks if an aggregation contains at least one entry.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param mSettings optional map/JSON-object with initial settings for the new AggregationFilledMatcher
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.AggregationLengthEquals")
    @js.native
    class AggregationLengthEquals protected ()
      extends typings.openui5.sap.ui.test.matchers.AggregationLengthEquals {
      /**
        * AggregationLengthEquals - checks if an aggregation contains at least one entry.Accepts an object
        * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
        * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
        * description of the syntax of the settings object.
        * @param mSettings optional map/JSON-object with initial settings for the new
        * AggregationLengthEqualsMatcher
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.Ancestor")
    @js.native
    class Ancestor protected ()
      extends typings.openui5.sap.ui.test.matchers.Ancestor {
      def this(oAncestorControl: js.Any) = this()
      def this(oAncestorControl: js.Any, bDirect: Boolean) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.BindingPath")
    @js.native
    class BindingPath protected ()
      extends typings.openui5.sap.ui.test.matchers.BindingPath {
      /**
        * BindingPath - checks if a control has a binding context with the exact same binding path.Accepts an
        * object literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
        * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
        * description of the syntax of the settings object.
        * @param mSettings Map/JSON-object with initial settings for the new BindingPath.
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.Interactable")
    @js.native
    class Interactable ()
      extends typings.openui5.sap.ui.test.matchers.Interactable
    
    @JSGlobal("sap.ui.test.matchers.Matcher")
    @js.native
    abstract class Matcher ()
      extends typings.openui5.sap.ui.test.matchers.Matcher
    
    @JSGlobal("sap.ui.test.matchers.Properties")
    @js.native
    class Properties protected ()
      extends typings.openui5.sap.ui.test.matchers.Properties {
      def this(oProperties: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.PropertyStrictEquals")
    @js.native
    class PropertyStrictEquals protected ()
      extends typings.openui5.sap.ui.test.matchers.PropertyStrictEquals {
      /**
        * PropertyStrictEquals - checks if a property has the exact same value.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param mSettings optional map/JSON-object with initial settings for the new PropertyStrictEquals
        */
      def this(mSettings: js.Any) = this()
    }
  }
}
