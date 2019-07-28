package typings.openui5.sapNs.uiNs.testNs.actionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class Press () extends Action {
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

