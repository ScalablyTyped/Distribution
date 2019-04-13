package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- natsDashHemeraLib.natsDashHemeraMod.Schema because Already inherited */ @js.native
trait DateSchema extends AnySchema {
  /**
    * Specifies the allowed date format:
    * @param format - string or array of strings that follow the moment.js format.
    */
  def format(format: java.lang.String): this.type = js.native
  def format(format: js.Array[java.lang.String]): this.type = js.native
  /**
    * Requires the string value to be in valid ISO 8601 date format.
    */
  def iso(): this.type = js.native
  def max(date: java.lang.String): this.type = js.native
  def max(date: Reference): this.type = js.native
  def max(date: scala.Double): this.type = js.native
  /**
    * Specifies the latest date allowed.
    * Notes: 'now' can be passed in lieu of date so as to always compare relatively to the current date,
    * allowing to explicitly ensure a date is either in the past or in the future.
    * It can also be a reference to another field.
    */
  def max(date: stdLib.Date): this.type = js.native
  def min(date: java.lang.String): this.type = js.native
  def min(date: Reference): this.type = js.native
  def min(date: scala.Double): this.type = js.native
  /**
    * Specifies the oldest date allowed.
    * Notes: 'now' can be passed in lieu of date so as to always compare relatively to the current date,
    * allowing to explicitly ensure a date is either in the past or in the future.
    * It can also be a reference to another field.
    */
  def min(date: stdLib.Date): this.type = js.native
  /**
    * Requires the value to be a timestamp interval from Unix Time.
    * @param type - the type of timestamp (allowed values are unix or javascript [default])
    */
  def timestamp(): this.type = js.native
  @JSName("timestamp")
  def timestamp_javascript(`type`: natsDashHemeraLib.natsDashHemeraLibStrings.javascript): this.type = js.native
  @JSName("timestamp")
  def timestamp_unix(`type`: natsDashHemeraLib.natsDashHemeraLibStrings.unix): this.type = js.native
}

