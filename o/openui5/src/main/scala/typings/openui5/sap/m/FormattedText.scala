package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.FormattedText")
@js.native
class FormattedText protected () extends Control {
  /**
    * Constructor for a new FormattedText.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>height</code>.Optional height of the control in CSS units.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>htmlText</code>.Text in HTML format.The following tags are
    * supported:<ul>	<li><code>a</code></li>	<li><code>abbr</code></li>	<li><code>blockquote</code></li>
    * <li><code>br</code></li>	<li><code>cite</code></li>	<li><code>code</code></li>
    * <li><code>em</code></li>	<li><code>h1</code></li>	<li><code>h2</code></li>	<li><code>h3</code></li>
    * <li><code>h4</code></li>	<li><code>h5</code></li>	<li><code>h6</code></li>	<li><code>p</code></li>
    * <li><code>pre</code></li>	<li><code>strong</code></li>	<li><code>span</code></li>
    * <li><code>u</code></li>	<li><code>dl</code></li>	<li><code>dt</code></li>	<li><code>dl</code></li>
    * <li><code>ul</code></li>	<li><code>ol</code></li>	<li><code>li</code></li></ul><p><code>class,
    * style,</code> and <code>target</code> attributes are allowed.If <code>target</code> is not set,
    * links open in a new window by default.<p>Only safe <code>href</code> attributes can be used. See
    * {@link jQuery.sap.validateUrl}.Default value is <code></code>.
    * @returns Value of property <code>htmlText</code>
    */
  def getHtmlText(): String = js.native
  /**
    * Gets current value of property <code>width</code>.Optional width of the control in CSS units.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Sets a new value for property <code>height</code>.Optional height of the control in CSS units.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): FormattedText = js.native
  /**
    * Defines the HTML text to be displayed.
    * @param sText HTML text as a string
    * @returns this for chaining
    */
  def setHtmlText(sText: String): FormattedText = js.native
  /**
    * Sets a new value for property <code>width</code>.Optional width of the control in CSS units.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): FormattedText = js.native
}

