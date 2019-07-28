package typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v4.Context")
@js.native
class Context protected ()
  extends typings.openui5.sapNs.uiNs.modelNs.Context {
  /**
    * Do <strong>NOT</strong> call this private constructor for a new <code>Context</code>. In theOData V4
    * model you cannot create contexts at will: retrieve them from a binding or a viewelement instead.
    * @param oModel The model
    * @param oBinding A binding that belongs to the model
    * @param sPath An absolute path without trailing slash
    * @param iIndex Index of item (within the collection addressed by <code>sPath</code>) represented  by
    * this context; used by list bindings, not context bindings
    */
  def this(
    oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel,
    oBinding: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataContextBinding,
    sPath: String
  ) = this()
  def this(
    oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel,
    oBinding: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataListBinding,
    sPath: String
  ) = this()
  def this(
    oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel,
    oBinding: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataContextBinding,
    sPath: String,
    iIndex: Double
  ) = this()
  def this(
    oModel: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataModel,
    oBinding: typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataListBinding,
    sPath: String,
    iIndex: Double
  ) = this()
  /**
    * Returns the "canonical path" of the entity for this context.According to "4.3.1 Canonical URL" of
    * the specification "OData Version 4.0 Part 2: URLConventions", this is the "name of the entity set
    * associated with the entity followed by thekey predicate identifying the entity within the
    * collection".Use the canonical path in {@link sap.ui.core.Element#bindElement} to create an
    * elementbinding.
    * @since 1.39.0
    */
  var getCanonicalPath: js.Any = js.native
  /**
    * Returns a promise for the "canonical path" of the entity for this context.According to "4.3.1
    * Canonical URL" of the specification "OData Version 4.0 Part 2: URLConventions", this is the "name of
    * the entity set associated with the entity followed by thekey predicate identifying the entity within
    * the collection".Use the canonical path in {@link sap.ui.core.Element#bindElement} to create an
    * elementbinding.
    * @since 1.39.0
    */
  var requestCanonicalPath: js.Any = js.native
  /**
    * Returns the binding this context belongs to.
    * @since 1.39.0
    * @returns The context's binding
    */
  def getBinding(): typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataContextBinding | typings.openui5.sapNs.uiNs.modelNs.odataNs.v4Ns.ODataListBinding = js.native
  /**
    * Returns the context's index within the binding's collection.
    * @since 1.39.0
    * @returns The context's index within the binding's collection or <code>undefined</code> if the 
    * context does not belong to a list binding.
    */
  def getIndex(): Double = js.native
  def getProperty(sPath: String, bExternalFormat: Boolean): js.Any = js.native
  /**
    * Returns a promise on the value for the given path relative to this context. The functionallows
    * access to the complete data the context points to (when <code>sPath</code> is "") orany part
    * thereof. The data is a JSON structure as described in<a
    * href="http://docs.oasis-open.org/odata/odata-json-format/v4.0/odata-json-format-v4.0.html">"OData
    * JSON Format Version 4.0"</a>.Note that the function clones the result. Modify values via{@link
    * sap.ui.model.odata.v4.ODataPropertyBinding#setValue}.
    * @since 1.39.0
    * @param sPath A relative path within the JSON structure
    * @returns A promise on the requested value
    */
  def requestObject(sPath: String): JQueryPromise[_] = js.native
  /**
    * Returns a promise on the property value for the given path relative to this context. The pathis
    * expected to point to a structural property with primitive type.
    * @since 1.39.0
    * @param sPath A relative path within the JSON structure
    * @param bExternalFormat If <code>true</code>, the value is returned in external format using a UI5
    * type for the  given property path that formats corresponding to the property's EDM type and
    * constraints.
    * @returns A promise on the requested value; it is rejected if the value is not primitive
    */
  def requestProperty(sPath: String): JQueryPromise[_] = js.native
  def requestProperty(sPath: String, bExternalFormat: Boolean): JQueryPromise[_] = js.native
}

