package typings.openui5.sap.ui.test

import typings.openui5.sap.ui.base.ManagedObject
import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.test.actions")
@js.native
object actions extends js.Object {
  
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
