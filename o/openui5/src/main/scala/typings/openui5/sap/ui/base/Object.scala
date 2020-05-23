package typings.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /**
    * Creates metadata for a given class and attaches it to the constructor and prototype of that
    * class.After creation, metadata can be retrieved with getMetadata().The static info can at least
    * contain the following entries:<ul><li>baseType: {string} fully qualified name of a base class or
    * empty<li>publicMethods: {string} an array of method names that will be visible in the interface
    * proxy returned by {@link #getInterface}</ul>
    * @param sClassName name of an (already declared) constructor function
    * @param oStaticInfo static info used to create the metadata object
    * @param FNMetaImpl constructor function for the metadata object. If not given, it defaults to
    * sap.ui.base.Metadata.
    * @returns the created metadata object
    */
  def defineClass(sClassName: String, oStaticInfo: js.Any): Metadata = js.native
  def defineClass(sClassName: String, oStaticInfo: js.Any, FNMetaImpl: js.Any): Metadata = js.native
  /**
    * Destructor method for objects
    */
  def destroy(bSuppressInvalidate: Boolean): Unit = js.native
  /**
    * Returns the public interface of the object.
    * @returns the public interface of the object
    */
  def getInterface(): Interface = js.native
  /**
    * Returns the metadata for the class that this object belongs to.This method is only defined when
    * metadata has been declared by using {@link sap.ui.base.Object.defineClass}or {@link
    * sap.ui.base.Object.extend}.
    */
  def getMetadata(): Unit = js.native
}

