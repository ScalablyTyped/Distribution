package typings.openui5.sap.ui

import typings.jquery.JQueryStatic
import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.base.Metadata
import typings.openui5.sap.ui.base.Object
import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.Element
import typings.openui5.sap.ui.core.mvc.View
import typings.openui5.sap.ui.core.routing.HashChanger
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  @js.native
  trait Opa extends StObject {
    
    /**
      * the global configuration of Opa.All of the global values can be overwritten in an individual waitFor
      * call.The default values are:<ul>        <li>arrangements: A new Opa instance</li>        <li>actions: A new Opa
      * instance</li>        <li>assertions: A new Opa instance</li>        <li>timeout : 15 seconds, is increased to 5
      * minutes if running in debug mode e.g. with URL parameter sap-ui-debug=true</li>    
      * <li>pollingInterval: 400 milliseconds</li></ul>You can either directly manipulate the config, or
      * extend it using {@link sap.ui.test.Opa#.extendConfig}
      */
    var config: js.Any = js.native
    
    /**
      * Waits until all waitFor calls are done.
      * @returns If the waiting was successful, the promise will be resolved. If not it will be rejected
      */
    def emptyQueue(): js.Any = js.native
    
    /**
      * Calls the static extendConfig function in the Opa namespace {@link sap.ui.test.Opa#.extendConfig}
      */
    def extendConfig(): Unit = js.native
    /**
      * Extends and overwrites default values of the {@link sap.ui.test.Opa#.config}.Sample usage:<pre>   
      * <code>        var oOpa = new Opa();        // this statement will  will time out after 15 seconds
      * and poll every 400ms.        // those two values come from the defaults of {@link
      * sap.ui.test.Opa#.config}.        oOpa.waitFor({        });        // All wait for statements added
      * after this will take other defaults        Opa.extendConfig({            timeout: 10,           
      * pollingInterval: 100        });        // this statement will time out after 10 seconds and poll
      * every 100 ms        oOpa.waitFor({        });        // this statement will time out after 20
      * seconds and poll every 100 ms        oOpa.waitFor({            timeout: 20;        });   
      * </code></pre>
      * @since 1.40
      * @param options The values to be added to the existing config
      */
    def extendConfig(options: js.Any): Unit = js.native
    
    /**
      * Gives access to a singleton object you can save values in.Same as {@link sap.ui.test.Opa#getContext}
      * @since 1.29.0
      * @returns the context object
      */
    def getContext(): js.Any = js.native
    
    /**
      * Reset Opa.config to its default values.All of the global values can be overwritten in an individual
      * waitFor call.The default values are:<ul>        <li>arrangements: A new Opa instance</li>        <li>actions: A
      * new Opa instance</li>        <li>assertions: A new Opa instance</li>        <li>timeout : 15 seconds, is
      * increased to 5 minutes if running in debug mode e.g. with URL parameter sap-ui-debug=true</li>    
      * <li>pollingInterval: 400 milliseconds</li></ul>
      * @since 1.25
      */
    def resetConfig(): Unit = js.native
    
    /**
      * Clears the queue and stops running tests so that new tests can be run.This means all waitFor
      * statements registered by {@link sap.ui.test.Opa#waitFor} will not be invoked anymore andthe promise
      * returned by {@link sap.ui.test.Opa#.emptyQueue}will be rejected or resolved depending on the
      * failTest parameter.When its called inside of a check in {@link sap.ui.test.Opa#waitFor}the success
      * function of this waitFor will not be called.
      * @since 1.40.1
      * @param boolean failTest If true is passed or the parameter is omited,the promise of {@link
      * sap.ui.test.Opa#.emptyQueue} is rejected. If false is passed the promis is resolved.
      */
    def stopQueue(boolean: js.Any): Unit = js.native
    
    /**
      * Queues up a waitFor command for Opa.The Queue will not be emptied until {@link
      * sap.ui.test.Opa#.emptyQueue} is called.If you are using {@link sap.ui.test.opaQunit}, emptyQueue
      * will be called by the wrapped tests.If you are using Opa5, waitFor takes additional parameters.They
      * can be found here: {@link sap.ui.test.Opa5#waitFor}.Waits for a check condition to return true, in
      * which case a success function will be called.If the timeout is reached before the check returns
      * true, an error function will be called.
      * @param options These contain check, success and error functions
      * @returns A promise that gets resolved on success
      */
    def waitFor(options: js.Any): js.Any = js.native
  }
  
  @js.native
  trait Opa5 extends Object {
    
    /**
      * Create a page object configured as arrangement, action and assertion to the Opa.config.Use it to
      * structure your arrangement, action and assertion based on parts of the screen to avoid name clashes
      * and help to structure your tests.
      * @since 1.25
      * @param mPageObjects undefined
      * @returns mPageObject The created page object. It will look like this:<pre><code> { 
      * &lt;your-page-object-name&gt; : {      actions: // an instance of baseClass or Opa5 with all the
      * actions defined above      assertions: // an instance of baseClass or Opa5 with all the assertions
      * defined above  } }</code></pre>
      */
    def createPageObjects(mPageObjects: js.Any): js.Any = js.native
    
    /**
      * Waits until all waitFor calls are doneSee {@link sap.ui.test.Opa#.emptyQueue} for the description
      * @returns If the waiting was successful, the promise will be resolved. If not it will be rejected
      */
    def emptyQueue(): js.Any = js.native
    
    /**
      * Extends and overwrites default values of the {@link sap.ui.test.Opa#.config}.Most frequent
      * usecase:<pre>    <code>        // Every waitFor will append this namespace in front of your viewName
      *        Opa5.extendConfig({           viewNamespace: "namespace.of.my.views."        });        var
      * oOpa = new Opa5();        // Looks for a control with the id "myButton" in a View with the name
      * "namespace.of.my.views.Detail"        oOpa.waitFor({             id: "myButton",            
      * viewName: "Detail"        });        // Looks for a control with the id "myList" in a View with the
      * name "namespace.of.my.views.Master"        oOpa.waitFor({             id: "myList",            
      * viewName: "Master"        });    </code></pre>Sample usage:<pre>    <code>        var oOpa = new
      * Opa5();        // this statement will  will time out after 15 seconds and poll every 400ms.       
      * // those two values come from the defaults of {@link sap.ui.test.Opa#.config}.        oOpa.waitFor({
      *        });        // All wait for statements added after this will take other defaults       
      * Opa5.extendConfig({            timeout: 10,            pollingInterval: 100        });        //
      * this statement will time out after 10 seconds and poll every 100 ms        oOpa.waitFor({        });
      *        // this statement will time out after 20 seconds and poll every 100 ms        oOpa.waitFor({ 
      *           timeout: 20;        });    </code></pre>
      * @since 1.40
      * @param options The values to be added to the existing config
      */
    def extendConfig(options: js.Any): Unit = js.native
    
    /**
      * Gives access to a singleton object you can save values in.See {@link sap.ui.test.Opa#.getContext}
      * for the description
      * @since 1.29.0
      * @returns the context object
      */
    def getContext(): js.Any = js.native
    
    /**
      * Returns HashChanger object of the IFrame. If the IFrame is not loaded it will return null.
      * @returns The HashChanger instance
      */
    def getHashChanger(): HashChanger = js.native
    
    /**
      * Returns the jQuery object of the IFrame. If the IFrame is not loaded it will return null.
      * @returns The jQuery object
      */
    def getJQuery(): JQueryStatic = js.native
    
    /**
      * Returns the Opa plugin used for retrieving controls. If an IFrame is used it will return the
      * iFrame's plugin.
      * @returns The plugin instance
      */
    def getPlugin(): OpaPlugin = js.native
    
    /**
      * Returns QUnit utils object of the IFrame. If the IFrame is not loaded it will return null.
      * @returns The QUnit utils
      */
    def getUtils(): js.Any = js.native
    
    /**
      * Returns the window object of the IFrame or the current window. If the IFrame is not loaded it will
      * return null.
      * @returns The window of the IFrame
      */
    def getWindow(): js.Any = js.native
    
    /**
      * Starts an app in an IFrame. Only works reliably if running on the same server.
      * @param sSource The source of the IFrame
      * @param iTimeout The timeout for loading the IFrame in seconds - default is 80
      * @returns A promise that gets resolved on success
      */
    def iStartMyAppInAFrame(sSource: String): js.Any = js.native
    def iStartMyAppInAFrame(sSource: String, iTimeout: Double): js.Any = js.native
    
    /**
      * Starts a UIComponent.
      * @param oOptions An Object that contains the configuration for starting up a UIComponent.
      * @returns A promise that gets resolved on success.
      */
    def iStartMyUIComponent(oOptions: js.Any): js.Any = js.native
    
    /**
      * Removes the IFrame from the DOM and removes all the references to its objects
      * @returns A promise that gets resolved on success
      */
    def iTeardownMyAppFrame(): js.Any = js.native
    
    /**
      * Destroys the UIComponent and removes the div from the dom like all the references on its objects
      * @returns a promise that gets resolved on success.
      */
    def iTeardownMyUIComponent(): js.Any = js.native
    
    /**
      * Resets Opa.config to its default values.See {@link sap.ui.test.Opa5#waitFor} for the
      * descriptionDefault values for OPA5 are:<ul>    <li>viewNamespace: empty string</li>    <li>arrangements:
      * instance of OPA5</li>    <li>actions: instance of OPA5</li>    <li>assertions: instance of OPA5</li>
      * <li>visible: true</li>    <li>timeout : 15 seconds, is increased to 5 minutes if running in debug mode
      * e.g. with URL parameter sap-ui-debug=true</li>    <li>pollingInterval: 400 milliseconds</li></ul>
      * @since 1.25
      */
    def resetConfig(): Unit = js.native
    
    /**
      * Clears the queue and stops running tests so that new tests can be run.This means all waitFor
      * statements registered by {@link sap.ui.test.Opa5#waitFor} will not be invoked anymore andthe promise
      * returned by {@link sap.ui.test.Opa5#.emptyQueue} will be rejected.When its called inside of a check
      * in {@link sap.ui.test.Opa5#waitFor}the success function of this waitFor will not be called.
      */
    def stopQueue(): Unit = js.native
    
    /**
      * Takes the same parameters as {@link sap.ui.test.Opa#waitFor}. Also allows you to specify additional
      * parameters:
      * @param oOptions An Object containing conditions for waiting and callbacks
      * @returns A promise that gets resolved on success
      */
    def waitFor(oOptions: js.Any): js.Any = js.native
  }
  
  @js.native
  trait OpaPlugin extends StObject {
    
    /**
      * Gets all the controls of a certain type that are currently instantiated.If the control type is
      * omitted, nothing is returned.
      * @param fnConstructorType the control type, e.g: sap.m.CheckBox
      * @returns an array of the found controls (can be empty)
      */
    def getAllControls(fnConstructorType: js.Any): js.Array[_] = js.native
    
    /**
      * Returns a control by its idaccepts an object with an ID property the ID can bewill check a control
      * type also, if defined<ul>    <li>a single string - function will return the control instance or
      * undefined</li>    <li>an array of strings - function will return an array of found controls or an empty
      * array</li>    <li>a regexp - function will return an array of found controls or an empty
      * array</li></ul>
      * @param oOptions should contain an ID property. It can be of the type string or regex. If contains
      * controlType property, will check it as well
      * @returns all controls matched by the regex or the control matched by the string or null
      */
    def getControlByGlobalId(oOptions: js.Any): js.Array[Element] = js.native
    
    /**
      * Gets the constructor function of a certain controlType
      * @param sControlType the name of the type eg: "sap.m.Button"
      * @returns When the type is loaded, the contstructor is returned, if it is a lazy stub or not yet
      * loaded, null will be returned and there will be a log entry.
      */
    def getControlConstructor(sControlType: String): js.Any = js.native
    
    /**
      * Gets a control inside of the view (same as calling oView.byId)If no ID is provided, it will return
      * all the controls inside of a view (also nested views and their children).<br/>eg : { id : "foo" }
      * will search globally for a control with the ID foo<br/>eg : { id : "foo" , viewName : "bar" } will
      * search for a control with the ID foo inside the view with the name bar<br/>eg : { viewName : "bar" }
      * will return all the controls inside the view with the name bar<br/>eg : { viewName : "bar",
      * controlType : sap.m.Button } will return all the Buttons inside a view with the name bar<br/>eg : {
      * viewName : "bar", viewNamespace : "baz." } will return all the Controls in the view with the name
      * baz.bar<br/>
      * @param oOptions that may contain a viewName, id, viewNamespace and controlType properties.
      * @returns If the passed id is a string it returns the found control or null.Else an array of matching
      * controls, if the view is not found or no control is found for multiple ids an empty array is
      * returned.
      */
    def getControlInView(oOptions: js.Any): Element | js.Array[Element] | js.Any = js.native
    
    /**
      * Tries to find a control depending on the options provided.
      * @param oOptions a map of options used to describe the control you are looking for.
      * @returns <ul>    <li>an array of found Controls depending on the options</li>    <li>an empty array
      * if no id was given</li>    <li>the found control/element when an id as a string is specified</li>   
      * <li>null if an id as string was specified</li></ul>
      */
    def getMatchingControls(oOptions: js.Any): Element | js.Array[Element] | js.Any = js.native
    
    /**
      * Returns a metadata object for class sap.ui.test.OpaPlugin.
      * @returns Metadata object describing this class
      */
    def getMetadata(): Metadata = js.native
    
    /**
      * Returns the view with a specific name - if there are multiple views with that name only the first
      * one is returned.
      * @param sViewName the name of the view
      * @returns or undefined
      */
    def getView(sViewName: String): View = js.native
  }
  object OpaPlugin {
    
    @scala.inline
    def apply(
      getAllControls: js.Any => js.Array[_],
      getControlByGlobalId: js.Any => js.Array[Element],
      getControlConstructor: String => js.Any,
      getControlInView: js.Any => Element | js.Array[Element] | js.Any,
      getMatchingControls: js.Any => Element | js.Array[Element] | js.Any,
      getMetadata: () => Metadata,
      getView: String => View
    ): OpaPlugin = {
      val __obj = js.Dynamic.literal(getAllControls = js.Any.fromFunction1(getAllControls), getControlByGlobalId = js.Any.fromFunction1(getControlByGlobalId), getControlConstructor = js.Any.fromFunction1(getControlConstructor), getControlInView = js.Any.fromFunction1(getControlInView), getMatchingControls = js.Any.fromFunction1(getMatchingControls), getMetadata = js.Any.fromFunction0(getMetadata), getView = js.Any.fromFunction1(getView))
      __obj.asInstanceOf[OpaPlugin]
    }
    
    @scala.inline
    implicit class OpaPluginMutableBuilder[Self <: OpaPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAllControls(value: js.Any => js.Array[_]): Self = StObject.set(x, "getAllControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetControlByGlobalId(value: js.Any => js.Array[Element]): Self = StObject.set(x, "getControlByGlobalId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetControlConstructor(value: String => js.Any): Self = StObject.set(x, "getControlConstructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetControlInView(value: js.Any => Element | js.Array[Element] | js.Any): Self = StObject.set(x, "getControlInView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMatchingControls(value: js.Any => Element | js.Array[Element] | js.Any): Self = StObject.set(x, "getMatchingControls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMetadata(value: () => Metadata): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetView(value: String => View): Self = StObject.set(x, "getView", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PageObjectFactory extends Object {
    
    /**
      * Create a page object configured as arrangement, action and assertion to the Opa.config.Use it to
      * structure your arrangement, action and assertion based on parts of the screen to avoid name clashes
      * and help structuring your tests.
      */
    def create(): Unit = js.native
  }
  
  object actions {
    
    @js.native
    trait Action extends ManagedObject {
      
      /**
        * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameterShould be
        * overwritten by subclasses
        * @param element the {@link sap.ui.core.Element} or a control (extends element) the action will be
        * executed on
        */
      def executeOn(element: Control): Unit = js.native
      
      /**
        * Gets current value of property <code>idSuffix</code>.
        * @since 1.38
        * @returns Value of property <code>idSuffix</code>
        */
      def getIdSuffix(): String = js.native
      
      /**
        * Sets a new value for property <code>idSuffix</code>.When called with a value of <code>null</code> or
        * <code>undefined</code>, the default value of the property will be restored.
        * @since 1.38
        * @param sIdSuffix New value for property <code>idSuffix</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setIdSuffix(sIdSuffix: String): Action = js.native
    }
    
    @js.native
    trait EnterText extends Action {
      
      /**
        * Gets current value of property <code>clearTextFirst</code>.Default value is <code>true</code>.
        * @since 1.38.0
        * @returns Value of property <code>clearTextFirst</code>
        */
      def getClearTextFirst(): Boolean = js.native
      
      /**
        * Gets current value of property <code>text</code>.The Text that is going to be typed to the control.
        * If you are entering an empty string, the value will be cleared.
        * @returns Value of property <code>text</code>
        */
      def getText(): String = js.native
      
      /**
        * Sets a new value for property <code>clearTextFirst</code>.When called with a value of
        * <code>null</code> or <code>undefined</code>, the default value of the property will be
        * restored.Default value is <code>true</code>.
        * @since 1.38.0
        * @param bClearTextFirst New value for property <code>clearTextFirst</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setClearTextFirst(bClearTextFirst: Boolean): EnterText = js.native
      
      /**
        * Sets a new value for property <code>text</code>.The Text that is going to be typed to the control.
        * If you are entering an empty string, the value will be cleared.When called with a value of
        * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
        * @param sText New value for property <code>text</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setText(sText: String): EnterText = js.native
    }
    
    @js.native
    trait Press extends Action {
      
      /**
        * A map that contains the id suffixes for certain controls of the library.When you extended a UI5
        * controls the adapter of the control will be taken.If you need an adapter for your own control you
        * can add it here. For example:You wrote a control with the namespace my.Control it renders two
        * buttons and you want the press action to press the second one by default.<pre><code>    new
        * my.Control("myId");</code></pre>It contains two button tags in its dom.When you render your control
        * it creates the following dom:<pre><code>    <div id="myId">        <button id="myId-firstButton"/>  
        *      <button id="myId-secondButton"/>    </div></code></pre>Then you may add a control adapter like
        * this<pre><code>    Press.controlAdapters["my.control"] = "secondButton" //This can be used by
        * setting the Target Property of an action    // Example usage    new Press(); // executes on second
        * Button since it is set as default    new Press({ idSuffix: "firstButton"}); // executes on the first
        * button has to be the same as the last part of the id in the dom</code></pre>
        */
      var controlAdapters: js.Any = js.native
    }
  }
  
  object gherkin {
    
    @js.native
    trait StepDefinitions extends Object {
      
      /**
        * Closes the application and cleans up any mess made by the tests. To avoid erroneous exceptions
        * during testexecution, make sure that it is safe to run this method even if the application was never
        * started.
        */
      def closeApplication(): Unit = js.native
      
      /**
        * Registers the step definitions by calling the method 'register'. The order of the register calls is
        * important.The first step definition whose regular expression matches the step text is the one that
        * will be executed,however, the step definitions are checked in REVERSE ORDER (i.e. the last one you
        * wrote is checked first).
        */
      def init(): Unit = js.native
      
      /**
        * Registers a step definition.
        * @param rRegex the regular expression that matches the feature file step (with leading 'Given',
        * 'When',                         'Then' or 'But' removed). E.g. if the feature file has the step     
        *                    "Then I should be served a coffee" it will truncated to "I should be served a
        * coffee"                         and tested against 'rRegex' to check for a match. The simple regular
        * expression                         /^I should be served a coffee$/i would match this text. The
        * regular                         expression can specify capturing groups, which will be passed as
        * parameters to 'fnFunc'.
        * @param fnFunc the function to execute in the event that the regular expression matches. Receives    
        *                       regular expression capturing groups as parameters in the same order that they
        * are                           specified in the regular expression. If a data table is specified for
        * the step, it                           will be passed as an additional final parameter. At execution
        * time, all functions                           within a particular scenario will execute within the
        * same 'this' context.
        */
      def register(rRegex: RegExp, fnFunc: js.Any): Unit = js.native
    }
  }
  
  object matchers {
    
    @js.native
    trait AggregationContainsPropertyEqual extends Matcher {
      
      /**
        * Gets current value of property <code>aggregationName</code>.The Name of the aggregation that is used
        * for matching.
        * @returns Value of property <code>aggregationName</code>
        */
      def getAggregationName(): String = js.native
      
      /**
        * Gets current value of property <code>propertyName</code>.The Name of the property that is used for
        * matching.
        * @returns Value of property <code>propertyName</code>
        */
      def getPropertyName(): String = js.native
      
      /**
        * Gets current value of property <code>propertyValue</code>.The value of the Property that is used for
        * matching.
        * @returns Value of property <code>propertyValue</code>
        */
      def getPropertyValue(): js.Any = js.native
      
      /**
        * Sets a new value for property <code>aggregationName</code>.The Name of the aggregation that is used
        * for matching.When called with a value of <code>null</code> or <code>undefined</code>, the default
        * value of the property will be restored.
        * @param sAggregationName New value for property <code>aggregationName</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setAggregationName(sAggregationName: String): AggregationContainsPropertyEqual = js.native
      
      /**
        * Sets a new value for property <code>propertyName</code>.The Name of the property that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param sPropertyName New value for property <code>propertyName</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setPropertyName(sPropertyName: String): AggregationContainsPropertyEqual = js.native
      
      /**
        * Sets a new value for property <code>propertyValue</code>.The value of the Property that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param oPropertyValue New value for property <code>propertyValue</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setPropertyValue(oPropertyValue: js.Any): AggregationContainsPropertyEqual = js.native
    }
    
    @js.native
    trait AggregationFilled extends Matcher {
      
      /**
        * Gets current value of property <code>name</code>.The name of the aggregation that is used for
        * matching.
        * @returns Value of property <code>name</code>
        */
      def getName(): String = js.native
      
      /**
        * Sets a new value for property <code>name</code>.The name of the aggregation that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param sName New value for property <code>name</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setName(sName: String): AggregationFilled = js.native
    }
    
    @js.native
    trait AggregationLengthEquals extends Matcher {
      
      /**
        * Gets current value of property <code>length</code>.The length that aggregation <code>name</code>
        * should have.
        * @returns Value of property <code>length</code>
        */
      def getLength(): Double = js.native
      
      /**
        * Gets current value of property <code>name</code>.The name of the aggregation that is used for
        * matching.
        * @returns Value of property <code>name</code>
        */
      def getName(): String = js.native
      
      /**
        * Sets a new value for property <code>length</code>.The length that aggregation <code>name</code>
        * should have.When called with a value of <code>null</code> or <code>undefined</code>, the default
        * value of the property will be restored.
        * @param iLength New value for property <code>length</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setLength(iLength: Double): AggregationLengthEquals = js.native
      
      /**
        * Sets a new value for property <code>name</code>.The name of the aggregation that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param sName New value for property <code>name</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setName(sName: String): AggregationLengthEquals = js.native
    }
    
    @js.native
    trait Ancestor extends StObject
    
    @js.native
    trait BindingPath extends Matcher {
      
      /**
        * Gets current value of property <code>modelName</code>.The name of the binding model that is used for
        * matching.
        * @returns Value of property <code>modelName</code>
        */
      def getModelName(): String = js.native
      
      /**
        * Gets current value of property <code>path</code>.The value of the binding path that is used for
        * matching.
        * @returns Value of property <code>path</code>
        */
      def getPath(): String = js.native
      
      /**
        * Sets a new value for property <code>modelName</code>.The name of the binding model that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param sModelName New value for property <code>modelName</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setModelName(sModelName: String): BindingPath = js.native
      
      /**
        * Sets a new value for property <code>path</code>.The value of the binding path that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param sPath New value for property <code>path</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setPath(sPath: String): BindingPath = js.native
    }
    
    @js.native
    trait Interactable extends Matcher
    
    @js.native
    trait Matcher extends ManagedObject {
      
      /**
        * Checks if the matcher is matching - will get an instance of sap.ui.Control as parameter.Should be
        * overwritten by subclasses
        * @param oControl the control that is checked by the matcher
        * @returns true if the Control is matching the condition of the matcher
        */
      def isMatching(oControl: Control): Boolean = js.native
    }
    
    @js.native
    trait Properties extends StObject
    
    @js.native
    trait PropertyStrictEquals extends Matcher {
      
      /**
        * Gets current value of property <code>name</code>.The Name of the property that is used for matching.
        * @returns Value of property <code>name</code>
        */
      def getName(): String = js.native
      
      /**
        * Gets current value of property <code>value</code>.The value of the property that is used for
        * matching.
        * @returns Value of property <code>value</code>
        */
      def getValue(): js.Any = js.native
      
      /**
        * Sets a new value for property <code>name</code>.The Name of the property that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param sName New value for property <code>name</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setName(sName: String): PropertyStrictEquals = js.native
      
      /**
        * Sets a new value for property <code>value</code>.The value of the property that is used for
        * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
        * of the property will be restored.
        * @param oValue New value for property <code>value</code>
        * @returns Reference to <code>this</code> in order to allow method chaining
        */
      def setValue(oValue: js.Any): PropertyStrictEquals = js.native
    }
  }
}
