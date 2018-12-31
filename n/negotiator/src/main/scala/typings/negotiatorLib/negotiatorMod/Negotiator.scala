package typings
package negotiatorLib.negotiatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Negotiator extends js.Object {
  /**
    * Returns the most preferred charset from the client.
    *
    * @param [availableCharsets] When provided, returns the most preferred charset
    * from a list of available charsets.
    */
  def charset(): js.UndefOr[java.lang.String] = js.native
  def charset(availableCharsets: js.Array[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  /**
    * Returns an array of preferred charsets ordered by the client preference.
    *
    * @param [availableCharsets] When provided, returns an array of preferred charsets
    * ordered by priority from a list of available charsets.
    */
  def charsets(): js.Array[java.lang.String] = js.native
  def charsets(availableCharsets: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
    * Returns the most preferred encoding from the client.
    *
    * @param [availableEncodings] When provided, returns the most preferred encoding
    * from a list of available encodings.
    */
  def encoding(): js.UndefOr[java.lang.String] = js.native
  def encoding(availableEncodings: js.Array[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  /**
    * Returns an array of preferred encodings ordered by the client preference.
    *
    * @param [availableEncodings] When provided, returns an array of preferred encodings
    * ordered by priority from a list of available encodings.
    */
  def encodings(): js.Array[java.lang.String] = js.native
  def encodings(availableEncodings: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
    * Returns the most preferred language from the client.
    *
    * @param [availableLanguages] When provided, returns the most preferred language
    * from a list of available languages.
    */
  def language(): js.UndefOr[java.lang.String] = js.native
  def language(availableLanguages: js.Array[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  /**
    * Returns an array of preferred languages ordered by the client preference.
    *
    * @param [availableLanguages] When provided, returns an array of preferred languages
    * ordered by priority from a list of available languages.
    */
  def languages(): js.Array[java.lang.String] = js.native
  def languages(availableLanguages: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  /**
    * Returns the most preferred media type from the client.
    *
    * @param [availableMediaTypes] When provided, returns the most preferred media type
    * from a list of available media types.
    */
  def mediaType(): js.UndefOr[java.lang.String] = js.native
  def mediaType(availableMediaTypes: js.Array[java.lang.String]): js.UndefOr[java.lang.String] = js.native
  /**
    * Returns an array of preferred media types ordered by the client preference
    *
    * @param [availableMediaTypes] When provided, returns an array of preferred media
    * types ordered by priority from a list of available media types.
    */
  def mediaTypes(): js.Array[java.lang.String] = js.native
  def mediaTypes(availableMediaTypes: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
}

