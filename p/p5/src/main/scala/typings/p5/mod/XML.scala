package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XML extends js.Object {
  /**
    *   Appends a new child to the element. The child can
    *   be specified with either a String, which will be
    *   used as the new tag's name, or as a reference to
    *   an existing p5.XML object. A reference to the
    *   newly created child is returned as an p5.XML
    *   object.
    *   @param node a p5.XML Object which will be the
    *   child to be added
    */
  def addChild(node: XML): Unit = js.native
  /**
    *   Counts the specified element's number of
    *   attributes, returned as an Number.
    */
  def getAttributeCount(): Double = js.native
  /**
    *   Returns the first of the element's children that
    *   matches the name parameter or the child of the
    *   given index.It returns undefined if no matching
    *   child is found.
    *   @param name element name or index
    */
  def getChild(name: String): XML = js.native
  def getChild(name: Double): XML = js.native
  /**
    *   Returns all of the element's children as an array
    *   of p5.XML objects. When the name parameter is
    *   specified, then it will return all children that
    *   match that name.
    *   @param [name] element name
    *   @return children of the element
    */
  def getChildren(): js.Array[XML] = js.native
  def getChildren(name: String): js.Array[XML] = js.native
  /**
    *   Returns the content of an element. If there is no
    *   such content, defaultValue is returned if
    *   specified, otherwise null is returned.
    *   @param [defaultValue] value returned if no content
    *   is found
    */
  def getContent(): String = js.native
  def getContent(defaultValue: String): String = js.native
  /**
    *   Gets the element's full name, which is returned as
    *   a String.
    *   @return the name of the node
    */
  def getName(): String = js.native
  /**
    *   Returns an attribute value of the element as an
    *   Number. If the defaultValue parameter is specified
    *   and the attribute doesn't exist, then defaultValue
    *   is returned. If no defaultValue is specified and
    *   the attribute doesn't exist, the value 0 is
    *   returned.
    *   @param name the non-null full name of the
    *   attribute
    *   @param [defaultValue] the default value of the
    *   attribute
    */
  def getNum(name: String): Double = js.native
  def getNum(name: String, defaultValue: Double): Double = js.native
  /**
    *   Gets a copy of the element's parent. Returns the
    *   parent as another p5.XML object.
    *   @return element parent
    */
  def getParent(): XML = js.native
  /**
    *   Returns an attribute value of the element as an
    *   String. If the defaultValue parameter is specified
    *   and the attribute doesn't exist, then defaultValue
    *   is returned. If no defaultValue is specified and
    *   the attribute doesn't exist, null is returned.
    *   @param name the non-null full name of the
    *   attribute
    *   @param [defaultValue] the default value of the
    *   attribute
    */
  def getString(name: String): String = js.native
  def getString(name: String, defaultValue: Double): String = js.native
  /**
    *   Checks whether or not an element has the specified
    *   attribute.
    *   @param the attribute to be checked
    *   @return true if attribute found else false
    */
  def hasAttribute(the: String): Boolean = js.native
  /**
    *   Checks whether or not the element has any
    *   children, and returns the result as a boolean.
    */
  def hasChildren(): Boolean = js.native
  /**
    *   Gets all of the specified element's attributes,
    *   and returns them as an array of Strings.
    *   @return an array of strings containing the names
    *   of attributes
    */
  def listAttributes(): js.Array[String] = js.native
  /**
    *   Get the names of all of the element's children,
    *   and returns the names as an array of Strings. This
    *   is the same as looping through and calling
    *   getName() on each child element individually.
    *   @return names of the children of the element
    */
  def listChildren(): js.Array[String] = js.native
  /**
    *   Removes the element specified by name or index.
    *   @param name element name or index
    */
  def removeChild(name: String): Unit = js.native
  def removeChild(name: Double): Unit = js.native
  /**
    *   Serializes the element into a string. This
    *   function is useful for preparing the content to be
    *   sent over a http request or saved to file.
    *   @return Serialized string of the element
    */
  def serialize(): String = js.native
  def setAttribute(name: String, value: String): Unit = js.native
  def setAttribute(name: String, value: Boolean): Unit = js.native
  /**
    *   Sets the content of an element's attribute. The
    *   first parameter specifies the attribute name,
    *   while the second specifies the new content.
    *   @param name the full name of the attribute
    *   @param value the value of the attribute
    */
  def setAttribute(name: String, value: Double): Unit = js.native
  /**
    *   Sets the element's content.
    *   @param text the new content
    */
  def setContent(text: String): Unit = js.native
  /**
    *   Sets the element's name, which is specified as a
    *   String.
    *   @param the new name of the node
    */
  def setName(the: String): Unit = js.native
}

