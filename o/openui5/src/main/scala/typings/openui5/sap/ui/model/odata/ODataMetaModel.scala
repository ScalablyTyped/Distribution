package typings.openui5.sap.ui.model.odata

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.model.Context
import typings.openui5.sap.ui.model.MetaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataMetaModel extends MetaModel {
  
  /**
    * Returns the OData meta model context corresponding to the given OData model path.
    * @param sPath an absolute path pointing to an entity or property, e.g. 
    * "/ProductSet(1)/ToSupplier/BusinessPartnerID"; this equals the  <a
    * href="http://www.odata.org/documentation/odata-version-2-0/uri-conventions#ResourcePath">  resource
    * path</a> component of a URI according to OData V2 URI conventions
    * @returns the context for the corresponding meta data object, i.e. an entity type or its property, 
    * or <code>null</code> in case no path is given
    */
  def getMetaContext(sPath: String): Context = js.native
  
  /**
    * Returns the OData association end corresponding to the given entity type's navigationproperty of
    * given name.
    * @param oEntityType an entity type as returned by {@link #getODataEntityType getODataEntityType}
    * @param sName the name of a navigation property within this entity type
    * @returns the OData association end or <code>null</code> if no such association end is found
    */
  def getODataAssociationEnd(oEntityType: js.Any, sName: String): js.Any = js.native
  
  /**
    * Returns the OData association <em>set</em> end corresponding to the given entity type'snavigation
    * property of given name.
    * @param oEntityType an entity type as returned by {@link #getODataEntityType getODataEntityType}
    * @param sName the name of a navigation property within this entity type
    * @returns the OData association set end or <code>null</code> if no such association set end is found
    */
  def getODataAssociationSetEnd(oEntityType: js.Any, sName: String): js.Any = js.native
  
  /**
    * Returns the OData complex type with the given qualified name, either as a path or as anobject, as
    * indicated.
    * @param sQualifiedName a qualified name, e.g. "ACME.Address"
    * @param bAsPath determines whether the complex type is returned as a path or as an object
    * @returns (the path to) the complex type with the given qualified name; <code>undefined</code> (for 
    * a path) or <code>null</code> (for an object) if no such type is found
    */
  def getODataComplexType(sQualifiedName: String): js.Any | String = js.native
  def getODataComplexType(sQualifiedName: String, bAsPath: Boolean): js.Any | String = js.native
  
  /**
    * Returns the OData default entity container.
    * @param bAsPath determines whether the entity container is returned as a path or as an object
    * @returns (the path to) the default entity container; <code>undefined</code> (for a path) or 
    * <code>null</code> (for an object) if no such container is found
    */
  def getODataEntityContainer(bAsPath: Boolean): js.Any | String = js.native
  
  /**
    * Returns the OData entity set with the given simple name from the default entity container.
    * @param sName a simple name, e.g. "ProductSet"
    * @param bAsPath determines whether the entity set is returned as a path or as an object
    * @returns (the path to) the entity set with the given simple name; <code>undefined</code> (for a 
    * path) or <code>null</code> (for an object) if no such set is found
    */
  def getODataEntitySet(sName: String): js.Any | String = js.native
  def getODataEntitySet(sName: String, bAsPath: Boolean): js.Any | String = js.native
  
  /**
    * Returns the OData entity type with the given qualified name, either as a path or as anobject, as
    * indicated.
    * @param sQualifiedName a qualified name, e.g. "ACME.Product"
    * @param bAsPath determines whether the entity type is returned as a path or as an object
    * @returns (the path to) the entity type with the given qualified name; <code>undefined</code> (for a 
    * path) or <code>null</code> (for an object) if no such type is found
    */
  def getODataEntityType(sQualifiedName: String): js.Any | String = js.native
  def getODataEntityType(sQualifiedName: String, bAsPath: Boolean): js.Any | String = js.native
  
  /**
    * Returns the OData function import with the given simple or qualified name from the defaultentity
    * container or the respective entity container specified in the qualified name.
    * @since 1.29.0
    * @param sName a simple or qualified name, e.g. "Save" or "MyService.Entities/Save"
    * @param bAsPath determines whether the function import is returned as a path or as an object
    * @returns (the path to) the function import with the given simple name; <code>undefined</code> (for 
    * a path) or <code>null</code> (for an object) if no such function import is found
    */
  def getODataFunctionImport(sName: String): js.Any | String = js.native
  def getODataFunctionImport(sName: String, bAsPath: Boolean): js.Any | String = js.native
  
  /**
    * Returns the given OData type's property (not navigation property!) of given name.If an array is
    * given instead of a single name, it is consumed (via<code>Array.prototype.shift</code>) piece by
    * piece. Each element is interpreted as aproperty name of the current type, and the current type is
    * replaced by that property's type.This is repeated until an element is encountered which cannot be
    * resolved as a property nameof the current type anymore; in this case, the last property found is
    * returned and<code>vName</code> contains only the remaining names, with <code>vName[0]</code> being
    * theone which was not found.Examples:<ul><li> Get address property of business partner:<pre>var
    * oEntityType = oMetaModel.getODataEntityType("GWSAMPLE_BASIC.BusinessPartner"),    oAddressProperty =
    * oMetaModel.getODataProperty(oEntityType, "Address");oAddressProperty.name ===
    * "Address";oAddressProperty.type === "GWSAMPLE_BASIC.CT_Address";</pre></li><li> Get street property
    * of address type:<pre>var oComplexType = oMetaModel.getODataComplexType("GWSAMPLE_BASIC.CT_Address"),
    *    oStreetProperty = oMetaModel.getODataProperty(oComplexType, "Street");oStreetProperty.name ===
    * "Street";oStreetProperty.type === "Edm.String";</pre></li><li> Get address' street property directly
    * from business partner:<pre>var aParts = ["Address",
    * "Street"];oMetaModel.getODataProperty(oEntityType, aParts) === oStreetProperty;aParts.length ===
    * 0;</pre></li><li> Trying to get address' foo property directly from business partner:<pre>aParts =
    * ["Address", "foo"];oMetaModel.getODataProperty(oEntityType, aParts) ===
    * oAddressProperty;aParts.length === 1;aParts[0] === "foo";</pre></li></ul>
    * @param oType a complex type as returned by {@link #getODataComplexType getODataComplexType}, or  an
    * entity type as returned by {@link #getODataEntityType getODataEntityType}
    * @param vName the name of a property within this type (e.g. "Address"), or an array of such names
    * (e.g.  <code>["Address", "Street"]</code>) in order to drill-down into complex types;  <b>BEWARE</b>
    * that this array is modified by removing each part which is understood!
    * @param bAsPath determines whether the property is returned as a path or as an object
    * @returns (the path to) the last OData property found; <code>undefined</code> (for a path) or 
    * <code>null</code> (for an object) if no property was found at all
    */
  def getODataProperty(oType: js.Any, vName: String): js.Any | String = js.native
  def getODataProperty(oType: js.Any, vName: String, bAsPath: Boolean): js.Any | String = js.native
  def getODataProperty(oType: js.Any, vName: js.Array[String]): js.Any | String = js.native
  def getODataProperty(oType: js.Any, vName: js.Array[String], bAsPath: Boolean): js.Any | String = js.native
  
  /**
    * Returns a <code>Promise</code> which is resolved with a map representing
    * the<code>com.sap.vocabularies.Common.v1.ValueList</code> annotations of the given property
    * orrejected with an error.The key in the map provided on successful resolution is the qualifier of
    * the annotation orthe empty string if no qualifier is defined. The value in the map is the JSON
    * object forthe annotation. The map is empty if the property has
    * no<code>com.sap.vocabularies.Common.v1.ValueList</code> annotations.
    * @since 1.29.1
    * @param oPropertyContext a model context for a structural property of an entity type or a complex
    * type, as  returned by {@link #getMetaContext getMetaContext}
    * @returns a Promise that gets resolved as soon as the value lists as well as the required model 
    * elements have been loaded
    */
  def getODataValueLists(oPropertyContext: Context): JQueryPromise[_] = js.native
  
  /**
    * Returns a promise which is fulfilled once the meta model data is loaded and can be used.
    * @returns a Promise
    */
  def loaded(): JQueryPromise[_] = js.native
  
  /**
    * Refresh not supported by OData meta model!
    */
  def refresh(): Unit = js.native
}
