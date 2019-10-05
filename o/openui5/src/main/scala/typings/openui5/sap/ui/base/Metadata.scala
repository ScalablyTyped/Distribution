package typings.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.base.Metadata")
@js.native
class Metadata protected () extends js.Object {
  /**
    * Creates a new metadata object from the given static infos.Note: throughout this class documentation,
    * the described subclass of Objectis referenced as <i>the described class</i>.
    * @param sClassName fully qualified name of the described class
    * @param oClassInfo info to construct the class and its metadata from
    */
  def this(sClassName: String, oClassInfo: js.Any) = this()
  /**
    * Returns an array with the names of all public methods declared by the described classand its
    * ancestors.
    * @returns array with names of all public methods provided by the described class and its ancestors
    */
  def getAllPublicMethods(): js.Array[String] = js.native
  /**
    * Returns the fully qualified name of the described class
    * @returns name of the described class
    */
  def getName(): String = js.native
  /**
    * Returns the metadata object of the base class of the described classor null if the class has no
    * (documented) base class.
    * @returns metadata of the base class
    */
  def getParent(): Metadata = js.native
  /**
    * Returns an array with the names of the public methods declared by the described class.
    * @returns array with names of public methods declared by the described class
    */
  def getPublicMethods(): js.Array[String] = js.native
  /**
    * Returns whether the described class is abstract
    * @returns whether the class is abstract
    */
  def isAbstract(): Boolean = js.native
  /**
    * Whether the described class is deprecated and should not be used any more
    * @since 1.26.4
    * @returns whether the class is considered deprecated
    */
  def isDeprecated(): Boolean = js.native
  /**
    * Returns whether the described class is final
    * @returns whether the class is final
    */
  def isFinal(): Boolean = js.native
  /**
    * Checks whether the described class or one of its ancestor classes implements the given interface.
    * @param sInterface name of the interface to test for (in dot notation)
    * @returns whether this class implements the interface
    */
  def isInstanceOf(sInterface: String): Boolean = js.native
}

