package typings.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  /**
    * Returns an array with the names of all public methods declared by the described classand its
    * ancestors.
    * @returns array with names of all public methods provided by the described class and its ancestors
    */
  def getAllPublicMethods(): js.Array[String]
  /**
    * Returns the fully qualified name of the described class
    * @returns name of the described class
    */
  def getName(): String
  /**
    * Returns the metadata object of the base class of the described classor null if the class has no
    * (documented) base class.
    * @returns metadata of the base class
    */
  def getParent(): Metadata
  /**
    * Returns an array with the names of the public methods declared by the described class.
    * @returns array with names of public methods declared by the described class
    */
  def getPublicMethods(): js.Array[String]
  /**
    * Returns whether the described class is abstract
    * @returns whether the class is abstract
    */
  def isAbstract(): Boolean
  /**
    * Whether the described class is deprecated and should not be used any more
    * @since 1.26.4
    * @returns whether the class is considered deprecated
    */
  def isDeprecated(): Boolean
  /**
    * Returns whether the described class is final
    * @returns whether the class is final
    */
  def isFinal(): Boolean
  /**
    * Checks whether the described class or one of its ancestor classes implements the given interface.
    * @param sInterface name of the interface to test for (in dot notation)
    * @returns whether this class implements the interface
    */
  def isInstanceOf(sInterface: String): Boolean
}

object Metadata {
  @scala.inline
  def apply(
    getAllPublicMethods: () => js.Array[String],
    getName: () => String,
    getParent: () => Metadata,
    getPublicMethods: () => js.Array[String],
    isAbstract: () => Boolean,
    isDeprecated: () => Boolean,
    isFinal: () => Boolean,
    isInstanceOf: String => Boolean
  ): Metadata = {
    val __obj = js.Dynamic.literal(getAllPublicMethods = js.Any.fromFunction0(getAllPublicMethods), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getPublicMethods = js.Any.fromFunction0(getPublicMethods), isAbstract = js.Any.fromFunction0(isAbstract), isDeprecated = js.Any.fromFunction0(isDeprecated), isFinal = js.Any.fromFunction0(isFinal), isInstanceOf = js.Any.fromFunction1(isInstanceOf))
    __obj.asInstanceOf[Metadata]
  }
}

