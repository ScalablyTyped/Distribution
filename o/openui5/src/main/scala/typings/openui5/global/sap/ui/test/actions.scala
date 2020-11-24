package typings.openui5.global.sap.ui.test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.test.actions")
@js.native
object actions extends js.Object {
  
  @js.native
  /**
    * Accepts an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
    * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
    * general description of the syntax of the settings object.
    */
  abstract class Action ()
    extends typings.openui5.sap.ui.test.actions.Action
  
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
