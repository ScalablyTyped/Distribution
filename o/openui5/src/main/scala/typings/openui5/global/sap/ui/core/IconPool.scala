package typings.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.IconPool")
@js.native
object IconPool extends js.Object {
  /**
    * Register an additional icon to the sap.ui.core.IconPool.
    * @param iconName the name of the icon.
    * @param collectionName the name of icon collection. The built in icons are with empty collectionName,
    * so if additional icons need to be registered in IconPool, the collectionName can't be empty.
    * @param iconInfo the icon info which contains the following properties:
    * @returns the info object of the registered icon which has the name, collection, uri, fontFamily,
    * content and suppressMirroring properties.
    */
  def addIcon(iconName: String, collectionName: String, iconInfo: js.Any): js.Any = js.native
  /**
    * Creates an instance of {@link sap.ui.core.Icon} if the given URI is an icon URI, otherwise the given
    * constructor is called.The given URI is set to the src property of the control.
    * @param setting contains the properties which will be used to instantiate the returned control. It
    * should contain at least a property named src. If it's given with a string type, it will be taken as
    * the value of src property.
    * @param constructor the constructor function which is called when the given URI isn't an icon URI
    * @returns either an instance of sap.ui.core.Icon or instance created by calling the given constructor
    */
  def createControlByURI(setting: String, constructor: js.Any): typings.openui5.sap.ui.core.Control = js.native
  def createControlByURI(setting: js.Any, constructor: js.Any): typings.openui5.sap.ui.core.Control = js.native
  /**
    * Returns all names of registered collections in IconPool
    * @returns An array contains all of the registered collections' names.
    */
  def getIconCollectionNames(): js.Array[_] = js.native
  /**
    * Returns the icon url based on the given mime type
    * @since 1.25.0
    * @param sMimeType the mime type of a file (e.g. "application/zip")
    * @returns the icon url (e.g. "sap-icon://attachment-zip-file")
    */
  def getIconForMimeType(sMimeType: String): String = js.native
  /**
    * Returns an info object for the icon with the given <code>iconName</code> and
    * <code>collectionName</code>.Instead of giving name and collection, a complete icon-URI can be
    * provided as <code>iconName</code>.The method will determine name and collection from the URI, see
    * {@link #.isIconURI IconPool.isIconURI}for details.The returned info object has the following
    * properties:<ul><li><code>string: name</code> Name of the icon</li><li><code>string:
    * collection</code> Name of the collection that contains the icon or <code>undefined</code> in case of
    * the default collection</li><li><code>string: uri</code> Icon URI that identifies the
    * icon</li><li><code>string: fontFamily</code> CSS font family to use for this
    * icon</li><li><code>string: content</code> Character sequence that represents the icon in the icon
    * font</li><li><code>string: text</code> Alternative text describing the icon (optional, might be
    * empty)</li><li><code>boolean: suppressMirroring</code> Whether the icon needs no mirroring in
    * right-to-left mode</li></ul>
    * @param iconName Name of the icon, must not be empty
    * @param collectionName Name of the icon collection; to access built-in icons, omit the collection
    * name
    * @returns Info object for the icon or <code>undefined</code> when the icon can't be found.
    */
  def getIconInfo(iconName: String): js.Any = js.native
  def getIconInfo(iconName: String, collectionName: String): js.Any = js.native
  /**
    * Returns all name of icons that are registerd under the given collection.
    * @param collectionName the name of collection where icon names are retrieved.
    * @returns An array contains all of the registered icon names under the given collection.
    */
  def getIconNames(collectionName: String): js.Array[_] = js.native
  /**
    * Returns the URI of the icon in the pool which has the given <code>iconName</code> and
    * <code>collectionName</code>.
    * @param iconName Name of the icon, must not be empty
    * @param collectionName Name of the icon collection; to access built-in icons, omit the collection
    * name
    * @returns URI of the icon or <code>undefined</code> if the icon can't be found in the IconPool
    */
  def getIconURI(iconName: String): String = js.native
  def getIconURI(iconName: String, collectionName: String): String = js.native
  /**
    * Returns whether the given <code>uri</code> is an icon URI.A string is an icon URI when it can be
    * parsed as an URI and when it has one of the two
    * forms<ul><li>sap-icon://collectionName/iconName</li><li>sap-icon://iconName</li></ul>where
    * collectionName and iconName must be non-empty.
    * @param uri The URI to check
    * @returns Whether the URI matches the icon URI format
    */
  def isIconURI(uri: String): Boolean = js.native
}

