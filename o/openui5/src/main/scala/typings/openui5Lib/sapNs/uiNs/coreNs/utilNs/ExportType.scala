package typings
package openui5Lib.sapNs.uiNs.coreNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.util.ExportType")
@js.native
class ExportType protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.ManagedObject {
  /**
    * Constructor for a new ExportType.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Handles the generation process of the file.<br>
    * @param oExport export instance
    * @returns content
    */
  def _generate(oExport: Export): java.lang.String = js.native
  /**
    * Creates a cell "generator" (inspired by ES6 Generators)
    * @returns generator
    */
  def cellGenerator(): js.Any = js.native
  /**
    * Creates a column "generator" (inspired by ES6 Generators)
    * @returns generator
    */
  def columnGenerator(): js.Any = js.native
  /**
    * Generates the file content.<br>Should be implemented by the individual types!
    * @returns content
    */
  def generate(): java.lang.String = js.native
  /**
    * Gets current value of property <code>charset</code>.Charset.
    * @returns Value of property <code>charset</code>
    */
  def getCharset(): java.lang.String = js.native
  /**
    * Returns the number of columns.
    * @returns count
    */
  def getColumnCount(): scala.Double = js.native
  /**
    * Gets current value of property <code>fileExtension</code>.File extension.
    * @returns Value of property <code>fileExtension</code>
    */
  def getFileExtension(): java.lang.String = js.native
  /**
    * Gets current value of property <code>mimeType</code>.MIME type.
    * @returns Value of property <code>mimeType</code>
    */
  def getMimeType(): java.lang.String = js.native
  /**
    * Returns the number of rows.
    * @returns count
    */
  def getRowCount(): scala.Double = js.native
  /**
    * Creates a row "generator" (inspired by ES6 Generators)
    * @returns generator
    */
  def rowGenerator(): js.Any = js.native
  /**
    * Sets a new value for property <code>charset</code>.Charset.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sCharset New value for property <code>charset</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCharset(sCharset: java.lang.String): ExportType = js.native
  /**
    * Sets a new value for property <code>fileExtension</code>.File extension.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sFileExtension New value for property <code>fileExtension</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFileExtension(sFileExtension: java.lang.String): ExportType = js.native
  /**
    * Sets a new value for property <code>mimeType</code>.MIME type.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sMimeType New value for property <code>mimeType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMimeType(sMimeType: java.lang.String): ExportType = js.native
}

