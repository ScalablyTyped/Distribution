package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitApp extends SplitContainer {
  
  /**
    * Fires the orientationChange event after SplitApp has reacted to the browser orientationChange event.
    */
  def _onOrientationChange(): Unit = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>orientationChange</code> event of this
    * <code>sap.m.SplitApp</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.SplitApp</code> itself.Fires when orientation (portrait/landscape) is changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SplitApp</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachOrientationChange(oData: js.Any, fnFunction: js.Any): SplitApp = js.native
  def attachOrientationChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SplitApp = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>orientationChange</code> event of this
    * <code>sap.m.SplitApp</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachOrientationChange(fnFunction: js.Any, oListener: js.Any): SplitApp = js.native
  
  /**
    * Fires event <code>orientationChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>landscape</code> of type <code>boolean</code>Returns true if the device is
    * in landscape mode.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireOrientationChange(mArguments: js.Any): SplitApp = js.native
  
  /**
    * Gets current value of property <code>homeIcon</code>.Represents the icon to be displayed on the home
    * screen of iOS devices after the user does "add to home screen".Note that only the first attempt to
    * set the homeIcon is executed, subsequent settings are ignored.The icon must be in PNG format. The
    * property can either store the URL of one single icon or an object holding icon URLs for the
    * different required sizes.Note that if single icon is used for all devices, when scaled, its quality
    * can regress.A desktop icon (used for bookmarks and overriding the favicon) can also be configured.
    * This requires an object to be given and the "icon" property of this object then defines the desktop
    * bookmark icon.For this icon, PNG is not supported by Internet Explorer. The ICO format is supported
    * by all browsers. ICO is also preferred for this desktop icon setting as the file can contain
    * different images for different resolutions.One example
    * one-retina.png','tablet':'tablet-icon.png','tablet@2':'tablet-retina.png','icon':'desktop.ico'});The
    * image size is 57/114 px for the phone and 72/144 px for the tablet.If an object is given but one of
    * the sizes is not given, the largest given icon will be used for this size.On Android, these icons
    * may or may not be used by the device. Chances can be improved by adding glare effect, rounded
    * corners, setting the file name to end with "-precomposed.png", and setting the homeIconPrecomposed
    * property to true.
    * @returns Value of property <code>homeIcon</code>
    */
  def getHomeIcon(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>homeIcon</code>.Represents the icon to be displayed on the home
    * screen of iOS devices after the user does "add to home screen".Note that only the first attempt to
    * set the homeIcon is executed, subsequent settings are ignored.The icon must be in PNG format. The
    * property can either store the URL of one single icon or an object holding icon URLs for the
    * different required sizes.Note that if single icon is used for all devices, when scaled, its quality
    * can regress.A desktop icon (used for bookmarks and overriding the favicon) can also be configured.
    * This requires an object to be given and the "icon" property of this object then defines the desktop
    * bookmark icon.For this icon, PNG is not supported by Internet Explorer. The ICO format is supported
    * by all browsers. ICO is also preferred for this desktop icon setting as the file can contain
    * different images for different resolutions.One example
    * one-retina.png','tablet':'tablet-icon.png','tablet@2':'tablet-retina.png','icon':'desktop.ico'});The
    * image size is 57/114 px for the phone and 72/144 px for the tablet.If an object is given but one of
    * the sizes is not given, the largest given icon will be used for this size.On Android, these icons
    * may or may not be used by the device. Chances can be improved by adding glare effect, rounded
    * corners, setting the file name to end with "-precomposed.png", and setting the homeIconPrecomposed
    * property to true.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param oHomeIcon New value for property <code>homeIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHomeIcon(oHomeIcon: js.Any): SplitApp = js.native
}
