package typings.openlayers.openlayersMod.format.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "format.filter.like")
@js.native
object like extends js.Object {
  /**
    * Represents a `<PropertyIsLike>` comparison operator that matches a string property
    * value against a text pattern.
    *
    * @param propertyName Name of the context property to compare.
    * @param pattern Text pattern.
    * @param opt_wildCard Pattern character which matches any sequence of
    *    zero or more string characters. Default is '*'.
    * @param opt_singleChar pattern character which matches any single
    *    string character. Default is '.'.
    * @param opt_escapeChar Escape character which can be used to escape
    *    the pattern characters. Default is '!'.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsLike>` operator.
    * @api
    */
  def apply(propertyName: String, pattern: String): IsLike = js.native
  def apply(propertyName: String, pattern: String, opt_wildCard: String): IsLike = js.native
  def apply(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): IsLike = js.native
  def apply(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): IsLike = js.native
  def apply(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = js.native
}

